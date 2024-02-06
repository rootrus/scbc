package com.google.android.datatransport.runtime;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p040o.HmlSetNTBPinActivity;
import p040o.RSDriverException;

public abstract class ExecutionModule {
    ExecutionModule() {
    }

    @HmlSetNTBPinActivity
    public static Executor IconCompatParcelizer() {
        return new RSDriverException(Executors.newSingleThreadExecutor());
    }
}
