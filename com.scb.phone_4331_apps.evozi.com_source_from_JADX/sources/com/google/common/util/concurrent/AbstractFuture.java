package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public abstract class AbstractFuture<V> implements Future<V> {
    private final Sync<V> sync = new Sync<>();

    public boolean cancel(boolean z) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void done() {
    }

    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        return this.sync.get(timeUnit.toNanos(j));
    }

    public V get() throws InterruptedException, ExecutionException {
        return this.sync.get();
    }

    public boolean isDone() {
        return this.sync.isDone();
    }

    public boolean isCancelled() {
        return this.sync.isCancelled();
    }

    /* access modifiers changed from: protected */
    public boolean set(V v) {
        boolean z = this.sync.set(v);
        if (z) {
            done();
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public boolean setException(Throwable th) {
        boolean exception = this.sync.setException((Throwable) Preconditions.checkNotNull(th));
        if (exception) {
            done();
        }
        if (!(th instanceof Error)) {
            return exception;
        }
        throw ((Error) th);
    }

    /* access modifiers changed from: protected */
    public final boolean cancel() {
        boolean cancel = this.sync.cancel();
        if (cancel) {
            done();
        }
        return cancel;
    }

    static final class Sync<V> extends AbstractQueuedSynchronizer {
        static final int CANCELLED = 4;
        static final int COMPLETED = 2;
        static final int COMPLETING = 1;
        static final int RUNNING = 0;
        private static final long serialVersionUID = 0;
        private Throwable exception;
        private V value;

        Sync() {
        }

        /* access modifiers changed from: protected */
        public final int tryAcquireShared(int i) {
            return isDone() ? 1 : -1;
        }

        /* access modifiers changed from: protected */
        public final boolean tryReleaseShared(int i) {
            setState(i);
            return true;
        }

        /* access modifiers changed from: package-private */
        public final V get(long j) throws TimeoutException, CancellationException, ExecutionException, InterruptedException {
            if (tryAcquireSharedNanos(-1, j)) {
                return getValue();
            }
            throw new TimeoutException("Timeout waiting for task.");
        }

        /* access modifiers changed from: package-private */
        public final V get() throws CancellationException, ExecutionException, InterruptedException {
            acquireSharedInterruptibly(-1);
            return getValue();
        }

        private V getValue() throws CancellationException, ExecutionException {
            int state = getState();
            if (state != 2) {
                if (state != 4) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error, synchronizer in invalid state: ");
                    sb.append(state);
                    throw new IllegalStateException(sb.toString());
                }
                throw new CancellationException("Task was cancelled.");
            } else if (this.exception == null) {
                return this.value;
            } else {
                throw new ExecutionException(this.exception);
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean isDone() {
            return (getState() & 6) != 0;
        }

        /* access modifiers changed from: package-private */
        public final boolean isCancelled() {
            return getState() == 4;
        }

        /* access modifiers changed from: package-private */
        public final boolean set(V v) {
            return complete(v, (Throwable) null, 2);
        }

        /* access modifiers changed from: package-private */
        public final boolean setException(Throwable th) {
            return complete((Object) null, th, 2);
        }

        /* access modifiers changed from: package-private */
        public final boolean cancel() {
            return complete((Object) null, (Throwable) null, 4);
        }

        private boolean complete(V v, Throwable th, int i) {
            if (!compareAndSetState(0, 1)) {
                return false;
            }
            this.value = v;
            this.exception = th;
            releaseShared(i);
            return true;
        }
    }
}
