package com.google.common.util.concurrent;

import com.google.common.base.Throwables;
import com.google.common.collect.ForwardingObject;
import com.google.common.util.concurrent.Service;
import java.util.concurrent.ExecutionException;

public abstract class ForwardingService extends ForwardingObject implements Service {
    /* access modifiers changed from: protected */
    public abstract Service delegate();

    protected ForwardingService() {
    }

    public ListenableFuture<Service.State> start() {
        return delegate().start();
    }

    public Service.State state() {
        return delegate().state();
    }

    public ListenableFuture<Service.State> stop() {
        return delegate().stop();
    }

    public Service.State startAndWait() {
        return delegate().startAndWait();
    }

    public Service.State stopAndWait() {
        return delegate().stopAndWait();
    }

    public boolean isRunning() {
        return delegate().isRunning();
    }

    /* access modifiers changed from: protected */
    public Service.State standardStartAndWait() {
        try {
            return Futures.makeUninterruptible(start()).get();
        } catch (ExecutionException e) {
            throw Throwables.propagate(e.getCause());
        }
    }

    /* access modifiers changed from: protected */
    public Service.State standardStopAndWait() {
        try {
            return Futures.makeUninterruptible(stop()).get();
        } catch (ExecutionException e) {
            throw Throwables.propagate(e.getCause());
        }
    }
}
