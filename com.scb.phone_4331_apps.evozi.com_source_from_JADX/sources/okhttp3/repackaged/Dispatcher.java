package okhttp3.repackaged;

import com.google.android.gms.common.api.Api;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.repackaged.C10217a;
import okhttp3.repackaged.internal.Util;

public final class Dispatcher {
    private final Deque<C10217a> ahA = new ArrayDeque();
    private int ahv = 64;
    private int ahw = 5;
    private ExecutorService ahx;
    private final Deque<C10217a.C10220b> ahy = new ArrayDeque();
    private final Deque<C10217a.C10220b> ahz = new ArrayDeque();

    public Dispatcher(ExecutorService executorService) {
        this.ahx = executorService;
    }

    public Dispatcher() {
    }

    public final ExecutorService executorService() {
        ExecutorService executorService;
        synchronized (this) {
            if (this.ahx == null) {
                this.ahx = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Dispatcher", false));
            }
            executorService = this.ahx;
        }
        return executorService;
    }

    public final void setMaxRequests(int i) {
        synchronized (this) {
            if (i > 0) {
                this.ahv = i;
                m5827un();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("max < 1: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    public final int getMaxRequests() {
        int i;
        synchronized (this) {
            i = this.ahv;
        }
        return i;
    }

    public final void setMaxRequestsPerHost(int i) {
        synchronized (this) {
            if (i > 0) {
                this.ahw = i;
                m5827un();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("max < 1: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    public final int getMaxRequestsPerHost() {
        int i;
        synchronized (this) {
            i = this.ahw;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58329a(C10217a.C10220b bVar) {
        synchronized (this) {
            if (this.ahz.size() >= this.ahv || m5826c(bVar) >= this.ahw) {
                this.ahy.add(bVar);
            } else {
                this.ahz.add(bVar);
                executorService().execute(bVar);
            }
        }
    }

    public final void cancelAll() {
        synchronized (this) {
            for (C10217a.C10220b cancel : this.ahy) {
                cancel.cancel();
            }
            for (C10217a.C10220b cancel2 : this.ahz) {
                cancel2.cancel();
            }
            for (C10217a cancel3 : this.ahA) {
                cancel3.cancel();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo58331b(C10217a.C10220b bVar) {
        synchronized (this) {
            if (this.ahz.remove(bVar)) {
                m5827un();
            } else {
                throw new AssertionError("AsyncCall wasn't running!");
            }
        }
    }

    /* renamed from: un */
    private void m5827un() {
        if (this.ahz.size() < this.ahv && !this.ahy.isEmpty()) {
            Iterator<C10217a.C10220b> it = this.ahy.iterator();
            while (it.hasNext()) {
                C10217a.C10220b next = it.next();
                if (m5826c(next) < this.ahw) {
                    it.remove();
                    this.ahz.add(next);
                    executorService().execute(next);
                }
                if (this.ahz.size() >= this.ahv) {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    private int m5826c(C10217a.C10220b bVar) {
        int i = 0;
        for (C10217a.C10220b host : this.ahz) {
            if (host.host().equals(bVar.host())) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58330a(C10217a aVar) {
        synchronized (this) {
            this.ahA.add(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58328a(Call call) {
        synchronized (this) {
            if (!this.ahA.remove(call)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
    }

    public final List<Call> queuedCalls() {
        List<Call> unmodifiableList;
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            for (C10217a.C10220b us : this.ahy) {
                arrayList.add(us.mo58621us());
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    public final List<Call> runningCalls() {
        List<Call> unmodifiableList;
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.ahA);
            for (C10217a.C10220b us : this.ahz) {
                arrayList.add(us.mo58621us());
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    public final int queuedCallsCount() {
        int size;
        synchronized (this) {
            size = this.ahy.size();
        }
        return size;
    }

    public final int runningCallsCount() {
        int size;
        int size2;
        synchronized (this) {
            size = this.ahz.size();
            size2 = this.ahA.size();
        }
        return size + size2;
    }
}
