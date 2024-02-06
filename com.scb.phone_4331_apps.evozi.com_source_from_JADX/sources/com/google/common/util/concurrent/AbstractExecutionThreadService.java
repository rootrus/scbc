package com.google.common.util.concurrent;

import com.google.common.util.concurrent.Service;
import java.util.concurrent.Executor;

public abstract class AbstractExecutionThreadService implements Service {
    private final Service delegate = new AbstractService() {
        /* access modifiers changed from: protected */
        public final void doStart() {
            AbstractExecutionThreadService.this.executor().execute(new Runnable() {
                /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
                /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0024 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r2 = this;
                        com.google.common.util.concurrent.AbstractExecutionThreadService$1 r0 = com.google.common.util.concurrent.AbstractExecutionThreadService.C78191.this     // Catch:{ all -> 0x0032 }
                        com.google.common.util.concurrent.AbstractExecutionThreadService r0 = com.google.common.util.concurrent.AbstractExecutionThreadService.this     // Catch:{ all -> 0x0032 }
                        r0.startUp()     // Catch:{ all -> 0x0032 }
                        com.google.common.util.concurrent.AbstractExecutionThreadService$1 r0 = com.google.common.util.concurrent.AbstractExecutionThreadService.C78191.this     // Catch:{ all -> 0x0032 }
                        r0.notifyStarted()     // Catch:{ all -> 0x0032 }
                        com.google.common.util.concurrent.AbstractExecutionThreadService$1 r0 = com.google.common.util.concurrent.AbstractExecutionThreadService.C78191.this     // Catch:{ all -> 0x0032 }
                        boolean r0 = r0.isRunning()     // Catch:{ all -> 0x0032 }
                        if (r0 == 0) goto L_0x0025
                        com.google.common.util.concurrent.AbstractExecutionThreadService$1 r0 = com.google.common.util.concurrent.AbstractExecutionThreadService.C78191.this     // Catch:{ all -> 0x001c }
                        com.google.common.util.concurrent.AbstractExecutionThreadService r0 = com.google.common.util.concurrent.AbstractExecutionThreadService.this     // Catch:{ all -> 0x001c }
                        r0.run()     // Catch:{ all -> 0x001c }
                        goto L_0x0025
                    L_0x001c:
                        r0 = move-exception
                        com.google.common.util.concurrent.AbstractExecutionThreadService$1 r1 = com.google.common.util.concurrent.AbstractExecutionThreadService.C78191.this     // Catch:{ Exception -> 0x0024 }
                        com.google.common.util.concurrent.AbstractExecutionThreadService r1 = com.google.common.util.concurrent.AbstractExecutionThreadService.this     // Catch:{ Exception -> 0x0024 }
                        r1.shutDown()     // Catch:{ Exception -> 0x0024 }
                    L_0x0024:
                        throw r0     // Catch:{ all -> 0x0032 }
                    L_0x0025:
                        com.google.common.util.concurrent.AbstractExecutionThreadService$1 r0 = com.google.common.util.concurrent.AbstractExecutionThreadService.C78191.this     // Catch:{ all -> 0x0032 }
                        com.google.common.util.concurrent.AbstractExecutionThreadService r0 = com.google.common.util.concurrent.AbstractExecutionThreadService.this     // Catch:{ all -> 0x0032 }
                        r0.shutDown()     // Catch:{ all -> 0x0032 }
                        com.google.common.util.concurrent.AbstractExecutionThreadService$1 r0 = com.google.common.util.concurrent.AbstractExecutionThreadService.C78191.this     // Catch:{ all -> 0x0032 }
                        r0.notifyStopped()     // Catch:{ all -> 0x0032 }
                        return
                    L_0x0032:
                        r0 = move-exception
                        com.google.common.util.concurrent.AbstractExecutionThreadService$1 r1 = com.google.common.util.concurrent.AbstractExecutionThreadService.C78191.this
                        r1.notifyFailed(r0)
                        java.lang.RuntimeException r0 = com.google.common.base.Throwables.propagate(r0)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractExecutionThreadService.C78191.C78201.run():void");
                }
            });
        }

        /* access modifiers changed from: protected */
        public void doStop() {
            AbstractExecutionThreadService.this.triggerShutdown();
        }
    };

    /* access modifiers changed from: protected */
    public abstract void run() throws Exception;

    /* access modifiers changed from: protected */
    public void shutDown() throws Exception {
    }

    /* access modifiers changed from: protected */
    public void startUp() throws Exception {
    }

    /* access modifiers changed from: protected */
    public void triggerShutdown() {
    }

    /* access modifiers changed from: protected */
    public Executor executor() {
        return new Executor() {
            public void execute(Runnable runnable) {
                new Thread(runnable, AbstractExecutionThreadService.this.getServiceName()).start();
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
