package com.google.common.util.concurrent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class MoreExecutors {
    private MoreExecutors() {
    }

    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor, long j, TimeUnit timeUnit) {
        threadPoolExecutor.setThreadFactory(new ThreadFactoryBuilder().setDaemon(true).setThreadFactory(threadPoolExecutor.getThreadFactory()).build());
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
        addDelayedShutdownHook(unconfigurableExecutorService, j, timeUnit);
        return unconfigurableExecutorService;
    }

    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j, TimeUnit timeUnit) {
        scheduledThreadPoolExecutor.setThreadFactory(new ThreadFactoryBuilder().setDaemon(true).setThreadFactory(scheduledThreadPoolExecutor.getThreadFactory()).build());
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(scheduledThreadPoolExecutor);
        addDelayedShutdownHook(unconfigurableScheduledExecutorService, j, timeUnit);
        return unconfigurableScheduledExecutorService;
    }

    public static void addDelayedShutdownHook(final ExecutorService executorService, final long j, final TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public final void run() {
                try {
                    executorService.shutdown();
                    executorService.awaitTermination(j, timeUnit);
                } catch (InterruptedException unused) {
                }
            }
        }));
    }

    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor) {
        return getExitingExecutorService(threadPoolExecutor, 120, TimeUnit.SECONDS);
    }

    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        return getExitingScheduledExecutorService(scheduledThreadPoolExecutor, 120, TimeUnit.SECONDS);
    }

    public static ExecutorService sameThreadExecutor() {
        return new SameThreadExecutorService();
    }

    static class SameThreadExecutorService extends AbstractExecutorService {
        private final Lock lock;
        private int runningTasks;
        private boolean shutdown;
        private final Condition termination;

        private SameThreadExecutorService() {
            ReentrantLock reentrantLock = new ReentrantLock();
            this.lock = reentrantLock;
            this.termination = reentrantLock.newCondition();
            this.runningTasks = 0;
            this.shutdown = false;
        }

        public void execute(Runnable runnable) {
            startTask();
            try {
                runnable.run();
            } finally {
                endTask();
            }
        }

        public boolean isShutdown() {
            this.lock.lock();
            try {
                return this.shutdown;
            } finally {
                this.lock.unlock();
            }
        }

        public void shutdown() {
            this.lock.lock();
            try {
                this.shutdown = true;
            } finally {
                this.lock.unlock();
            }
        }

        public List<Runnable> shutdownNow() {
            shutdown();
            return Collections.emptyList();
        }

        public boolean isTerminated() {
            this.lock.lock();
            try {
                return this.shutdown && this.runningTasks == 0;
            } finally {
                this.lock.unlock();
            }
        }

        public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            boolean z;
            long nanos = timeUnit.toNanos(j);
            this.lock.lock();
            while (true) {
                try {
                    if (isTerminated()) {
                        z = true;
                        break;
                    } else if (nanos <= 0) {
                        z = false;
                        break;
                    } else {
                        nanos = this.termination.awaitNanos(nanos);
                    }
                } finally {
                    this.lock.unlock();
                }
            }
            return z;
        }

        private void startTask() {
            this.lock.lock();
            try {
                if (!isShutdown()) {
                    this.runningTasks++;
                    return;
                }
                throw new RejectedExecutionException("Executor already shutdown");
            } finally {
                this.lock.unlock();
            }
        }

        private void endTask() {
            this.lock.lock();
            try {
                this.runningTasks--;
                if (isTerminated()) {
                    this.termination.signalAll();
                }
            } finally {
                this.lock.unlock();
            }
        }
    }
}
