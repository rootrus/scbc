package okhttp3;

import com.google.android.gms.common.api.Api;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.RealCall;
import okhttp3.internal.Util;
import p040o.HmlBusinessOwnerDocumentSubmissionActivity;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;

public final class Dispatcher {
    private ExecutorService executorServiceOrNull;
    private Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;
    private final ArrayDeque<RealCall.AsyncCall> readyAsyncCalls;
    private final ArrayDeque<RealCall.AsyncCall> runningAsyncCalls;
    private final ArrayDeque<RealCall> runningSyncCalls;

    public Dispatcher() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque<>();
        this.runningAsyncCalls = new ArrayDeque<>();
        this.runningSyncCalls = new ArrayDeque<>();
    }

    public final int getMaxRequests() {
        int i;
        synchronized (this) {
            i = this.maxRequests;
        }
        return i;
    }

    public final void setMaxRequests(int i) {
        if (i > 0) {
            synchronized (this) {
                this.maxRequests = i;
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
            promoteAndExecute();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("max < 1: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final int getMaxRequestsPerHost() {
        int i;
        synchronized (this) {
            i = this.maxRequestsPerHost;
        }
        return i;
    }

    public final void setMaxRequestsPerHost(int i) {
        if (i > 0) {
            synchronized (this) {
                this.maxRequestsPerHost = i;
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
            promoteAndExecute();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("max < 1: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final Runnable getIdleCallback() {
        Runnable runnable;
        synchronized (this) {
            runnable = this.idleCallback;
        }
        return runnable;
    }

    public final void setIdleCallback(Runnable runnable) {
        synchronized (this) {
            this.idleCallback = runnable;
        }
    }

    public final ExecutorService executorService() {
        ExecutorService executorService;
        synchronized (this) {
            if (this.executorServiceOrNull == null) {
                this.executorServiceOrNull = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Dispatcher", false));
            }
            executorService = this.executorServiceOrNull;
            if (executorService == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
        }
        return executorService;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Dispatcher(ExecutorService executorService) {
        this();
        onGetStartedClick.write((Object) executorService, "executorService");
        this.executorServiceOrNull = executorService;
    }

    public final void enqueue$okhttp(RealCall.AsyncCall asyncCall) {
        RealCall.AsyncCall findExistingCallWithHost;
        onGetStartedClick.write((Object) asyncCall, "call");
        synchronized (this) {
            this.readyAsyncCalls.add(asyncCall);
            if (!asyncCall.get().getForWebSocket() && (findExistingCallWithHost = findExistingCallWithHost(asyncCall.host())) != null) {
                asyncCall.reuseCallsPerHostFrom(findExistingCallWithHost);
            }
            HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
        promoteAndExecute();
    }

    private final RealCall.AsyncCall findExistingCallWithHost(String str) {
        Iterator<RealCall.AsyncCall> it = this.runningAsyncCalls.iterator();
        while (it.hasNext()) {
            RealCall.AsyncCall next = it.next();
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) next.host(), (Object) str)) {
                return next;
            }
        }
        Iterator<RealCall.AsyncCall> it2 = this.readyAsyncCalls.iterator();
        while (it2.hasNext()) {
            RealCall.AsyncCall next2 = it2.next();
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) next2.host(), (Object) str)) {
                return next2;
            }
        }
        return null;
    }

    public final void cancelAll() {
        synchronized (this) {
            Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
            while (it.hasNext()) {
                it.next().get().cancel();
            }
            Iterator<RealCall.AsyncCall> it2 = this.runningAsyncCalls.iterator();
            while (it2.hasNext()) {
                it2.next().get().cancel();
            }
            Iterator<RealCall> it3 = this.runningSyncCalls.iterator();
            while (it3.hasNext()) {
                it3.next().cancel();
            }
        }
    }

    private final boolean promoteAndExecute() {
        int i;
        boolean holdsLock = Thread.holdsLock(this);
        boolean z = true;
        if (!HmlBusinessOwnerDocumentSubmissionActivity.write || (!holdsLock)) {
            List arrayList = new ArrayList();
            synchronized (this) {
                Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
                onGetStartedClick.IconCompatParcelizer((Object) it, "readyAsyncCalls.iterator()");
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    RealCall.AsyncCall next = it.next();
                    if (this.runningAsyncCalls.size() >= this.maxRequests) {
                        break;
                    } else if (next.callsPerHost().get() < this.maxRequestsPerHost) {
                        it.remove();
                        next.callsPerHost().incrementAndGet();
                        onGetStartedClick.IconCompatParcelizer((Object) next, "asyncCall");
                        arrayList.add(next);
                        this.runningAsyncCalls.add(next);
                    }
                }
                if (runningCallsCount() <= 0) {
                    z = false;
                }
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
            int size = arrayList.size();
            for (i = 0; i < size; i++) {
                ((RealCall.AsyncCall) arrayList.get(i)).executeOn(executorService());
            }
            return z;
        }
        throw new AssertionError("Assertion failed");
    }

    public final void executed$okhttp(RealCall realCall) {
        synchronized (this) {
            onGetStartedClick.write((Object) realCall, "call");
            this.runningSyncCalls.add(realCall);
        }
    }

    public final void finished$okhttp(RealCall.AsyncCall asyncCall) {
        onGetStartedClick.write((Object) asyncCall, "call");
        asyncCall.callsPerHost().decrementAndGet();
        finished(this.runningAsyncCalls, asyncCall);
    }

    public final void finished$okhttp(RealCall realCall) {
        onGetStartedClick.write((Object) realCall, "call");
        finished(this.runningSyncCalls, realCall);
    }

    private final <T> void finished(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.idleCallback;
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!promoteAndExecute() && runnable != null) {
            runnable.run();
        }
    }

    public final List<Call> queuedCalls() {
        List<Call> unmodifiableList;
        synchronized (this) {
            Iterable<RealCall.AsyncCall> iterable = this.readyAsyncCalls;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (RealCall.AsyncCall asyncCall : iterable) {
                arrayList.add(asyncCall.get());
            }
            unmodifiableList = Collections.unmodifiableList((List) arrayList);
            onGetStartedClick.IconCompatParcelizer((Object) unmodifiableList, "Collections.unmodifiable…ncCalls.map { it.get() })");
        }
        return unmodifiableList;
    }

    public final List<Call> runningCalls() {
        List<Call> unmodifiableList;
        synchronized (this) {
            Collection collection = this.runningSyncCalls;
            Iterable<RealCall.AsyncCall> iterable = this.runningAsyncCalls;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (RealCall.AsyncCall asyncCall : iterable) {
                arrayList.add(asyncCall.get());
            }
            unmodifiableList = Collections.unmodifiableList(HmlNTBBusinessURLInformationActivity.write(collection, (List) arrayList));
            onGetStartedClick.IconCompatParcelizer((Object) unmodifiableList, "Collections.unmodifiable…ncCalls.map { it.get() })");
        }
        return unmodifiableList;
    }

    public final int queuedCallsCount() {
        int size;
        synchronized (this) {
            size = this.readyAsyncCalls.size();
        }
        return size;
    }

    public final int runningCallsCount() {
        int size;
        int size2;
        synchronized (this) {
            size = this.runningAsyncCalls.size();
            size2 = this.runningSyncCalls.size();
        }
        return size + size2;
    }

    /* renamed from: -deprecated_executorService  reason: not valid java name */
    public final ExecutorService m6360deprecated_executorService() {
        return executorService();
    }
}
