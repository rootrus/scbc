package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class ExecutorUtils {
    public static ExecutorService buildSingleThreadExecutorService(String str) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(getNamedThreadFactory(str));
        addDelayedShutdownHook(str, newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    public static final ThreadFactory getNamedThreadFactory(final String str) {
        final AtomicLong atomicLong = new AtomicLong(1);
        return new ThreadFactory() {
            public Thread newThread(final Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(new BackgroundPriorityRunnable() {
                    public void onRun() {
                        runnable.run();
                    }
                });
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(atomicLong.getAndIncrement());
                newThread.setName(sb.toString());
                return newThread;
            }
        };
    }

    private static final void addDelayedShutdownHook(String str, ExecutorService executorService) {
        addDelayedShutdownHook(str, executorService, 2, TimeUnit.SECONDS);
    }

    public static final void addDelayedShutdownHook(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        final String str2 = str;
        final ExecutorService executorService2 = executorService;
        final long j2 = j;
        final TimeUnit timeUnit2 = timeUnit;
        C03032 r1 = new BackgroundPriorityRunnable() {
            public void onRun() {
                try {
                    Logger logger = Logger.getLogger();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Executing shutdown hook for ");
                    sb.append(str2);
                    logger.mo8866d(sb.toString());
                    executorService2.shutdown();
                    if (!executorService2.awaitTermination(j2, timeUnit2)) {
                        Logger logger2 = Logger.getLogger();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append(" did not shut down in the allocated time. Requesting immediate shutdown.");
                        logger2.mo8866d(sb2.toString());
                        executorService2.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    Logger.getLogger().mo8866d(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{str2}));
                    executorService2.shutdownNow();
                }
            }
        };
        StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics Shutdown Hook for ");
        sb.append(str);
        runtime.addShutdownHook(new Thread(r1, sb.toString()));
    }
}
