package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class ExecutionList implements Runnable {
    /* access modifiers changed from: private */
    public static final Logger log = Logger.getLogger(ExecutionList.class.getName());
    private boolean executed = false;
    private final Queue<RunnableExecutorPair> runnables = Lists.newLinkedList();

    public final void add(Runnable runnable, Executor executor) {
        boolean z;
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        synchronized (this.runnables) {
            if (!this.executed) {
                this.runnables.add(new RunnableExecutorPair(runnable, executor));
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            executor.execute(runnable);
        }
    }

    public final void run() {
        synchronized (this.runnables) {
            this.executed = true;
        }
        while (!this.runnables.isEmpty()) {
            this.runnables.poll().execute();
        }
    }

    static class RunnableExecutorPair {
        final Executor executor;
        final Runnable runnable;

        RunnableExecutorPair(Runnable runnable2, Executor executor2) {
            this.runnable = runnable2;
            this.executor = executor2;
        }

        /* access modifiers changed from: package-private */
        public void execute() {
            try {
                this.executor.execute(this.runnable);
            } catch (RuntimeException e) {
                Logger access$000 = ExecutionList.log;
                Level level = Level.SEVERE;
                StringBuilder sb = new StringBuilder();
                sb.append("RuntimeException while executing runnable ");
                sb.append(this.runnable);
                sb.append(" with executor ");
                sb.append(this.executor);
                access$000.log(level, sb.toString(), e);
            }
        }
    }
}
