package com.kofax.kmc.kut.utilities.async;

import android.os.Handler;
import android.os.Looper;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.mobile.sdk._internal.C0767k;
import java.util.EventObject;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TaskRunner {
    /* access modifiers changed from: private */
    public static final String TAG = TaskRunner.class.getSimpleName();

    /* renamed from: ss */
    private static final int f1005ss = 50;

    /* renamed from: sA */
    private long f1006sA = (UUID.randomUUID().getLeastSignificantBits() >>> 1);

    /* renamed from: st */
    private int f1007st = 1;

    /* renamed from: su */
    private ExecutorService f1008su = null;
    /* access modifiers changed from: private */

    /* renamed from: sv */
    public Map<Callable<?>, CopyOnWriteArrayList<TaskCompletedListener>> f1009sv = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: sw */
    public CopyOnWriteArrayList<TaskCompletedListener> f1010sw = new CopyOnWriteArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: sx */
    public Map<Long, Callable<?>> f1011sx = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: sy */
    public Map<Callable<?>, Long> f1012sy = new ConcurrentHashMap();

    /* renamed from: sz */
    private long f1013sz = (UUID.randomUUID().getLeastSignificantBits() >>> 1);

    public interface TaskCompletedListener {
        void onTaskCompleted(TaskCompletedEvent taskCompletedEvent);
    }

    public class TaskCompletedEvent extends EventObject {
        private static final long serialVersionUID = 1;

        /* renamed from: bb */
        private long f1014bb;

        /* renamed from: sB */
        private Object f1015sB;

        /* renamed from: sC */
        private ErrorInfo f1016sC;

        public TaskCompletedEvent(Object obj, long j, Object obj2, ErrorInfo errorInfo) {
            super(obj);
            this.f1014bb = j;
            this.f1016sC = errorInfo;
            this.f1015sB = obj2;
        }

        public final long getTaskID() {
            return this.f1014bb;
        }

        public final Object getTaskReturnValue() {
            return this.f1015sB;
        }

        public final ErrorInfo getTaskError() {
            return this.f1016sC;
        }
    }

    /* renamed from: com.kofax.kmc.kut.utilities.async.TaskRunner$a */
    class C0491a {

        /* renamed from: sA */
        public long f1018sA;

        /* renamed from: sE */
        public Future<?> f1020sE;

        C0491a(Future<?> future, long j) {
            this.f1020sE = future;
            this.f1018sA = j;
        }
    }

    public TaskRunner(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("threads parameter on constructor must be > 0");
        } else if (i <= 50) {
            int i2 = i << 1;
            this.f1007st = i2;
            this.f1008su = Executors.newFixedThreadPool(i2);
        } else {
            throw new IllegalArgumentException("threads parameter on constructor is > max thread pool size: 50");
        }
    }

    public final void addOnTaskCompletedListener(TaskCompletedListener taskCompletedListener, Callable<?> callable, boolean z) {
        synchronized (this) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f1009sv.get(callable);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
                this.f1009sv.put(callable, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.addIfAbsent(taskCompletedListener);
            if (z) {
                this.f1010sw.addIfAbsent(taskCompletedListener);
            }
        }
    }

    public final void removeOnTaskCompletedListener(TaskCompletedListener taskCompletedListener, Callable<?> callable) {
        synchronized (this) {
            List list = this.f1009sv.get(callable);
            if (list != null) {
                list.remove(taskCompletedListener);
                if (list.isEmpty()) {
                    this.f1009sv.remove(callable);
                }
            }
            this.f1010sw.remove(taskCompletedListener);
        }
    }

    public long submit(Callable<?> callable) {
        long j;
        synchronized (this) {
            if (callable == null) {
                throw new NullPointerException("'Callable<?> task' parameter passed to submit is null");
            } else if (this.f1008su == null) {
                throw new IllegalThreadStateException("submit failure: threadpool has not been created");
            } else if (this.f1009sv.containsKey(callable)) {
                if (this.f1008su.isShutdown()) {
                    this.f1008su = Executors.newFixedThreadPool(this.f1007st);
                    this.f1009sv.clear();
                    this.f1011sx.clear();
                    this.f1012sy.clear();
                    this.f1010sw.clear();
                }
                Future<T> submit = this.f1008su.submit(callable);
                long j2 = this.f1006sA;
                this.f1006sA = j2 + 1;
                C0491a aVar = new C0491a(submit, j2);
                this.f1012sy.put(callable, Long.valueOf(this.f1013sz));
                this.f1011sx.put(Long.valueOf(aVar.f1018sA), callable);
                this.f1008su.execute(new C0492b(aVar));
                j = this.f1013sz;
                this.f1013sz = 1 + j;
            } else {
                throw new UnsupportedOperationException("submit failure: no Image Captured Listeners have been registered -> addOnImageCapturedListener()");
            }
        }
        return j;
    }

    public void shutdown() {
        synchronized (this) {
            if (this.f1008su != null) {
                this.f1008su.shutdown();
            }
        }
    }

    public List<Runnable> shutdownNow() {
        List<Runnable> shutdownNow;
        synchronized (this) {
            shutdownNow = this.f1008su != null ? this.f1008su.shutdownNow() : null;
        }
        return shutdownNow;
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        boolean awaitTermination;
        synchronized (this) {
            awaitTermination = this.f1008su != null ? this.f1008su.awaitTermination(j, timeUnit) : true;
        }
        return awaitTermination;
    }

    public boolean isTerminated() {
        boolean z;
        synchronized (this) {
            z = this.f1008su == null || this.f1008su.isTerminated();
        }
        return z;
    }

    /* renamed from: com.kofax.kmc.kut.utilities.async.TaskRunner$b */
    class C0492b implements Runnable {
        private Handler handler = new Handler(Looper.getMainLooper());
        /* access modifiers changed from: private */

        /* renamed from: sB */
        public Object f1021sB = null;
        /* access modifiers changed from: private */

        /* renamed from: sC */
        public ErrorInfo f1022sC = ErrorInfo.KMC_SUCCESS;

        /* renamed from: sF */
        private C0491a f1024sF = null;
        /* access modifiers changed from: private */

        /* renamed from: sG */
        public TaskCompletedListener f1025sG = null;

        C0492b(C0491a aVar) {
            this.f1024sF = aVar;
        }

        /* renamed from: a */
        private void m597a(CopyOnWriteArrayList<TaskCompletedListener> copyOnWriteArrayList, final Long l) {
            String aO = TaskRunner.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("TaskWaiter(): Call the TaskCompleted handler on thread id: ");
            sb.append(Thread.currentThread().getId());
            C0767k.m1807c(aO, sb.toString());
            Iterator<TaskCompletedListener> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                this.f1025sG = it.next();
                if (!TaskRunner.this.f1010sw.contains(this.f1025sG)) {
                    this.f1025sG.onTaskCompleted(new TaskCompletedEvent(this, l.longValue(), this.f1021sB, this.f1022sC));
                } else {
                    this.handler.post(new Runnable() {
                        public void run() {
                            C0492b.this.f1025sG.onTaskCompleted(new TaskCompletedEvent(this, l.longValue(), C0492b.this.f1021sB, C0492b.this.f1022sC));
                        }
                    });
                }
            }
        }

        public void run() {
            Callable callable;
            CopyOnWriteArrayList copyOnWriteArrayList;
            Long l;
            try {
                this.f1021sB = this.f1024sF.f1020sE.get();
                callable = (Callable) TaskRunner.this.f1011sx.get(Long.valueOf(this.f1024sF.f1018sA));
                if (callable != null) {
                    copyOnWriteArrayList = (CopyOnWriteArrayList) TaskRunner.this.f1009sv.get(callable);
                    if (copyOnWriteArrayList != null) {
                        l = (Long) TaskRunner.this.f1012sy.get(callable);
                        if (l == null) {
                            throw new IllegalThreadStateException("TaskWaiter unable to retrieve taskID from taskSubmitted Map");
                        }
                        TaskRunner.this.f1011sx.remove(Long.valueOf(this.f1024sF.f1018sA));
                        TaskRunner.this.f1012sy.remove(callable);
                        m597a(copyOnWriteArrayList, l);
                        return;
                    }
                    throw new IllegalThreadStateException("TaskWaiter unable to retrieve listeners List from taskCompletedListeners Map");
                }
                throw new IllegalThreadStateException("TaskWaiter unable to retrieve task from taskCompletedFutures Map");
            } catch (InterruptedException e) {
                ErrorInfo errorInfo = ErrorInfo.KMC_GN_UNKNOWN_ERROR;
                this.f1022sC = errorInfo;
                errorInfo.setErrCause(e.getCause().getMessage());
                e.printStackTrace();
                callable = (Callable) TaskRunner.this.f1011sx.get(Long.valueOf(this.f1024sF.f1018sA));
                if (callable != null) {
                    copyOnWriteArrayList = (CopyOnWriteArrayList) TaskRunner.this.f1009sv.get(callable);
                    if (copyOnWriteArrayList != null) {
                        l = (Long) TaskRunner.this.f1012sy.get(callable);
                        if (l == null) {
                            throw new IllegalThreadStateException("TaskWaiter unable to retrieve taskID from taskSubmitted Map");
                        }
                    } else {
                        throw new IllegalThreadStateException("TaskWaiter unable to retrieve listeners List from taskCompletedListeners Map");
                    }
                } else {
                    throw new IllegalThreadStateException("TaskWaiter unable to retrieve task from taskCompletedFutures Map");
                }
            } catch (ExecutionException e2) {
                ErrorInfo errorInfo2 = ErrorInfo.KMC_GN_UNKNOWN_ERROR;
                this.f1022sC = errorInfo2;
                errorInfo2.setErrCause(e2.getCause().getMessage());
                e2.printStackTrace();
                callable = (Callable) TaskRunner.this.f1011sx.get(Long.valueOf(this.f1024sF.f1018sA));
                if (callable != null) {
                    copyOnWriteArrayList = (CopyOnWriteArrayList) TaskRunner.this.f1009sv.get(callable);
                    if (copyOnWriteArrayList != null) {
                        l = (Long) TaskRunner.this.f1012sy.get(callable);
                        if (l == null) {
                            throw new IllegalThreadStateException("TaskWaiter unable to retrieve taskID from taskSubmitted Map");
                        }
                    } else {
                        throw new IllegalThreadStateException("TaskWaiter unable to retrieve listeners List from taskCompletedListeners Map");
                    }
                } else {
                    throw new IllegalThreadStateException("TaskWaiter unable to retrieve task from taskCompletedFutures Map");
                }
            } catch (Throwable th) {
                Callable callable2 = (Callable) TaskRunner.this.f1011sx.get(Long.valueOf(this.f1024sF.f1018sA));
                if (callable2 != null) {
                    CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) TaskRunner.this.f1009sv.get(callable2);
                    if (copyOnWriteArrayList2 != null) {
                        Long l2 = (Long) TaskRunner.this.f1012sy.get(callable2);
                        if (l2 == null) {
                            throw new IllegalThreadStateException("TaskWaiter unable to retrieve taskID from taskSubmitted Map");
                        }
                        TaskRunner.this.f1011sx.remove(Long.valueOf(this.f1024sF.f1018sA));
                        TaskRunner.this.f1012sy.remove(callable2);
                        m597a(copyOnWriteArrayList2, l2);
                        throw th;
                    }
                    throw new IllegalThreadStateException("TaskWaiter unable to retrieve listeners List from taskCompletedListeners Map");
                }
                throw new IllegalThreadStateException("TaskWaiter unable to retrieve task from taskCompletedFutures Map");
            }
        }
    }
}
