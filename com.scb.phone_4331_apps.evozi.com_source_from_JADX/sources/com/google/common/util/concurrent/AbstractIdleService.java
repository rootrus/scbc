package com.google.common.util.concurrent;

import com.google.common.base.Throwables;
import com.google.common.util.concurrent.Service;
import java.util.concurrent.Executor;

public abstract class AbstractIdleService implements Service {
    private final Service delegate = new AbstractService() {
        /* access modifiers changed from: protected */
        public final void doStart() {
            AbstractIdleService.this.executor(Service.State.STARTING).execute(new Runnable() {
                public void run() {
                    try {
                        AbstractIdleService.this.startUp();
                        C78221.this.notifyStarted();
                    } catch (Throwable th) {
                        C78221.this.notifyFailed(th);
                        throw Throwables.propagate(th);
                    }
                }
            });
        }

        /* access modifiers changed from: protected */
        public final void doStop() {
            AbstractIdleService.this.executor(Service.State.STOPPING).execute(new Runnable() {
                public void run() {
                    try {
                        AbstractIdleService.this.shutDown();
                        C78221.this.notifyStopped();
                    } catch (Throwable th) {
                        C78221.this.notifyFailed(th);
                        throw Throwables.propagate(th);
                    }
                }
            });
        }
    };

    /* access modifiers changed from: protected */
    public abstract void shutDown() throws Exception;

    /* access modifiers changed from: protected */
    public abstract void startUp() throws Exception;

    /* access modifiers changed from: protected */
    public Executor executor(final Service.State state) {
        return new Executor() {
            public void execute(Runnable runnable) {
                StringBuilder sb = new StringBuilder();
                sb.append(AbstractIdleService.this.getServiceName());
                sb.append(" ");
                sb.append(state);
                new Thread(runnable, sb.toString()).start();
            }
        };
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getServiceName());
        sb.append(" [");
        sb.append(state());
        sb.append("]");
        return sb.toString();
    }

    public final ListenableFuture<Service.State> start() {
        return this.delegate.start();
    }

    public final Service.State startAndWait() {
        return this.delegate.startAndWait();
    }

    public final boolean isRunning() {
        return this.delegate.isRunning();
    }

    public final Service.State state() {
        return this.delegate.state();
    }

    public final ListenableFuture<Service.State> stop() {
        return this.delegate.stop();
    }

    public final Service.State stopAndWait() {
        return this.delegate.stopAndWait();
    }

    /* access modifiers changed from: private */
    public String getServiceName() {
        return getClass().getSimpleName();
    }
}
