package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.common.util.concurrent.Service;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;

public abstract class AbstractService implements Service {
    private final ReentrantLock lock = new ReentrantLock();
    private final Transition shutdown = new Transition();
    private boolean shutdownWhenStartupFinishes = false;
    private final Transition startup = new Transition();
    private Service.State state = Service.State.NEW;

    /* access modifiers changed from: protected */
    public abstract void doStart();

    /* access modifiers changed from: protected */
    public abstract void doStop();

    public final ListenableFuture<Service.State> start() {
        this.lock.lock();
        try {
            if (this.state == Service.State.NEW) {
                this.state = Service.State.STARTING;
                doStart();
            }
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
        this.lock.unlock();
        return this.startup;
    }

    public final ListenableFuture<Service.State> stop() {
        this.lock.lock();
        try {
            if (this.state == Service.State.NEW) {
                this.state = Service.State.TERMINATED;
                this.startup.set(Service.State.TERMINATED);
                this.shutdown.set(Service.State.TERMINATED);
            } else if (this.state == Service.State.STARTING) {
                this.shutdownWhenStartupFinishes = true;
                this.startup.set(Service.State.STOPPING);
            } else if (this.state == Service.State.RUNNING) {
                this.state = Service.State.STOPPING;
                doStop();
            }
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
        this.lock.unlock();
        return this.shutdown;
    }

    public Service.State startAndWait() {
        try {
            return Futures.makeUninterruptible(start()).get();
        } catch (ExecutionException e) {
            throw Throwables.propagate(e.getCause());
        }
    }

    public Service.State stopAndWait() {
        try {
            return Futures.makeUninterruptible(stop()).get();
        } catch (ExecutionException e) {
            throw Throwables.propagate(e.getCause());
        }
    }

    /* access modifiers changed from: protected */
    public final void notifyStarted() {
        this.lock.lock();
        try {
            if (this.state == Service.State.STARTING) {
                this.state = Service.State.RUNNING;
                if (this.shutdownWhenStartupFinishes) {
                    stop();
                } else {
                    this.startup.set(Service.State.RUNNING);
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot notifyStarted() when the service is ");
            sb.append(this.state);
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            notifyFailed(illegalStateException);
            throw illegalStateException;
        } finally {
            this.lock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public final void notifyStopped() {
        this.lock.lock();
        try {
            if (this.state != Service.State.STOPPING) {
                if (this.state != Service.State.RUNNING) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cannot notifyStopped() when the service is ");
                    sb.append(this.state);
                    IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
                    notifyFailed(illegalStateException);
                    throw illegalStateException;
                }
            }
            this.state = Service.State.TERMINATED;
            this.shutdown.set(Service.State.TERMINATED);
        } finally {
            this.lock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public final void notifyFailed(Throwable th) {
        Preconditions.checkNotNull(th);
        this.lock.lock();
        try {
            if (this.state == Service.State.STARTING) {
                this.startup.setException(th);
                this.shutdown.setException(new Exception("Service failed to start.", th));
            } else if (this.state == Service.State.STOPPING) {
                this.shutdown.setException(th);
            }
            this.state = Service.State.FAILED;
        } finally {
            this.lock.unlock();
        }
    }

    public final boolean isRunning() {
        return state() == Service.State.RUNNING;
    }

    public final Service.State state() {
        Service.State state2;
        this.lock.lock();
        try {
            if (!this.shutdownWhenStartupFinishes || this.state != Service.State.STARTING) {
                state2 = this.state;
            } else {
                state2 = Service.State.STOPPING;
            }
            return state2;
        } finally {
            this.lock.unlock();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(state());
        sb.append("]");
        return sb.toString();
    }

    class Transition extends AbstractListenableFuture<Service.State> {
        private Transition() {
        }

        public Service.State get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
            try {
                return (Service.State) super.get(j, timeUnit);
            } catch (TimeoutException unused) {
                throw new TimeoutException(AbstractService.this.toString());
            }
        }
    }
}
