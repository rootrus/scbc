package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class Futures {
    private Futures() {
    }

    public static <V> UninterruptibleFuture<V> makeUninterruptible(final Future<V> future) {
        Preconditions.checkNotNull(future);
        if (future instanceof UninterruptibleFuture) {
            return (UninterruptibleFuture) future;
        }
        return new UninterruptibleFuture<V>() {
            public final boolean cancel(boolean z) {
                return future.cancel(z);
            }

            public final boolean isCancelled() {
                return future.isCancelled();
            }

            public final boolean isDone() {
                return future.isDone();
            }

            public final V get(long j, TimeUnit timeUnit) throws TimeoutException, ExecutionException {
                boolean z = false;
                try {
                    long nanoTime = System.nanoTime();
                    long nanos = timeUnit.toNanos(j);
                    while (true) {
                        try {
                            break;
                        } catch (InterruptedException unused) {
                            z = true;
                        }
                    }
                    return future.get((nanoTime + nanos) - System.nanoTime(), TimeUnit.NANOSECONDS);
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }

            public final V get() throws ExecutionException {
                V v;
                boolean z = false;
                while (true) {
                    try {
                        v = future.get();
                        break;
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
                return v;
            }
        };
    }

    public static <V> ListenableFuture<V> makeListenable(Future<V> future) {
        if (future instanceof ListenableFuture) {
            return (ListenableFuture) future;
        }
        return new ListenableFutureAdapter(future);
    }

    static <V> ListenableFuture<V> makeListenable(Future<V> future, Executor executor) {
        Preconditions.checkNotNull(executor);
        if (future instanceof ListenableFuture) {
            return (ListenableFuture) future;
        }
        return new ListenableFutureAdapter(future, executor);
    }

    public static <V, X extends Exception> CheckedFuture<V, X> makeChecked(Future<V> future, Function<Exception, X> function) {
        return new MappingCheckedFuture(makeListenable(future), function);
    }

    public static <V, X extends Exception> CheckedFuture<V, X> makeChecked(ListenableFuture<V> listenableFuture, Function<Exception, X> function) {
        return new MappingCheckedFuture((ListenableFuture) Preconditions.checkNotNull(listenableFuture), function);
    }

    public static <V> ListenableFuture<V> immediateFuture(V v) {
        SettableFuture create = SettableFuture.create();
        create.set(v);
        return create;
    }

    public static <V, X extends Exception> CheckedFuture<V, X> immediateCheckedFuture(V v) {
        SettableFuture create = SettableFuture.create();
        create.set(v);
        return makeChecked(create, new Function<Exception, X>() {
            public final X apply(Exception exc) {
                throw new AssertionError("impossible");
            }
        });
    }

    public static <V> ListenableFuture<V> immediateFailedFuture(Throwable th) {
        Preconditions.checkNotNull(th);
        SettableFuture create = SettableFuture.create();
        create.setException(th);
        return create;
    }

    public static <V, X extends Exception> CheckedFuture<V, X> immediateFailedCheckedFuture(final X x) {
        Preconditions.checkNotNull(x);
        return makeChecked(immediateFailedFuture(x), new Function<Exception, X>() {
            public final X apply(Exception exc) {
                return x;
            }
        });
    }

    public static <I, O> ListenableFuture<O> chain(ListenableFuture<I> listenableFuture, Function<? super I, ? extends ListenableFuture<? extends O>> function) {
        return chain(listenableFuture, function, MoreExecutors.sameThreadExecutor());
    }

    public static <I, O> ListenableFuture<O> chain(ListenableFuture<I> listenableFuture, Function<? super I, ? extends ListenableFuture<? extends O>> function, Executor executor) {
        ChainingListenableFuture chainingListenableFuture = new ChainingListenableFuture(function, listenableFuture);
        listenableFuture.addListener(chainingListenableFuture, executor);
        return chainingListenableFuture;
    }

    public static <I, O> ListenableFuture<O> transform(ListenableFuture<I> listenableFuture, Function<? super I, ? extends O> function) {
        return transform(listenableFuture, function, MoreExecutors.sameThreadExecutor());
    }

    public static <I, O> ListenableFuture<O> transform(ListenableFuture<I> listenableFuture, final Function<? super I, ? extends O> function, Executor executor) {
        Preconditions.checkNotNull(function);
        return chain(listenableFuture, new Function<I, ListenableFuture<O>>() {
            public final ListenableFuture<O> apply(I i) {
                return Futures.immediateFuture(function.apply(i));
            }
        }, executor);
    }

    public static <I, O> Future<O> transform(final Future<I> future, final Function<? super I, ? extends O> function) {
        if (future instanceof ListenableFuture) {
            return transform((ListenableFuture) future, function);
        }
        Preconditions.checkNotNull(future);
        Preconditions.checkNotNull(function);
        return new Future<O>() {
            private ExecutionException exception = null;
            private final Object lock = new Object();
            private boolean set = false;
            private O value = null;

            public final O get() throws InterruptedException, ExecutionException {
                return apply(future.get());
            }

            public final O get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
                return apply(future.get(j, timeUnit));
            }

            private O apply(I i) throws ExecutionException {
                O o;
                synchronized (this.lock) {
                    if (!this.set) {
                        try {
                            this.value = function.apply(i);
                        } catch (RuntimeException e) {
                            this.exception = new ExecutionException(e);
                        } catch (Error e2) {
                            this.exception = new ExecutionException(e2);
                        }
                        this.set = true;
                    }
                    if (this.exception == null) {
                        o = this.value;
                    } else {
                        throw this.exception;
                    }
                }
                return o;
            }

            public final boolean cancel(boolean z) {
                return future.cancel(z);
            }

            public final boolean isCancelled() {
                return future.isCancelled();
            }

            public final boolean isDone() {
                return future.isDone();
            }
        };
    }

    static class ChainingListenableFuture<I, O> extends AbstractListenableFuture<O> implements Runnable {
        private Function<? super I, ? extends ListenableFuture<? extends O>> function;
        private ListenableFuture<? extends I> inputFuture;
        private final BlockingQueue<Boolean> mayInterruptIfRunningChannel;
        private final CountDownLatch outputCreated;
        /* access modifiers changed from: private */
        public volatile ListenableFuture<? extends O> outputFuture;

        private ChainingListenableFuture(Function<? super I, ? extends ListenableFuture<? extends O>> function2, ListenableFuture<? extends I> listenableFuture) {
            this.mayInterruptIfRunningChannel = new LinkedBlockingQueue(1);
            this.outputCreated = new CountDownLatch(1);
            this.function = (Function) Preconditions.checkNotNull(function2);
            this.inputFuture = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
        }

        public O get() throws InterruptedException, ExecutionException {
            if (!isDone()) {
                ListenableFuture<? extends I> listenableFuture = this.inputFuture;
                if (listenableFuture != null) {
                    listenableFuture.get();
                }
                this.outputCreated.await();
                ListenableFuture<? extends O> listenableFuture2 = this.outputFuture;
                if (listenableFuture2 != null) {
                    listenableFuture2.get();
                }
            }
            return super.get();
        }

        public O get(long j, TimeUnit timeUnit) throws TimeoutException, ExecutionException, InterruptedException {
            if (!isDone()) {
                if (timeUnit != TimeUnit.NANOSECONDS) {
                    j = TimeUnit.NANOSECONDS.convert(j, timeUnit);
                    timeUnit = TimeUnit.NANOSECONDS;
                }
                ListenableFuture<? extends I> listenableFuture = this.inputFuture;
                if (listenableFuture != null) {
                    long nanoTime = System.nanoTime();
                    listenableFuture.get(j, timeUnit);
                    j -= Math.max(0, System.nanoTime() - nanoTime);
                }
                long nanoTime2 = System.nanoTime();
                if (this.outputCreated.await(j, timeUnit)) {
                    j -= Math.max(0, System.nanoTime() - nanoTime2);
                    ListenableFuture<? extends O> listenableFuture2 = this.outputFuture;
                    if (listenableFuture2 != null) {
                        listenableFuture2.get(j, timeUnit);
                    }
                } else {
                    throw new TimeoutException();
                }
            }
            return super.get(j, timeUnit);
        }

        public boolean cancel(boolean z) {
            if (!cancel()) {
                return false;
            }
            try {
                this.mayInterruptIfRunningChannel.put(Boolean.valueOf(z));
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            cancel(this.inputFuture, z);
            cancel(this.outputFuture, z);
            return true;
        }

        private void cancel(Future<?> future, boolean z) {
            if (future != null) {
                future.cancel(z);
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|8|9|10) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                r0 = 0
                com.google.common.util.concurrent.ListenableFuture<? extends I> r1 = r4.inputFuture     // Catch:{ CancellationException -> 0x0053, ExecutionException -> 0x004a }
                com.google.common.util.concurrent.UninterruptibleFuture r1 = com.google.common.util.concurrent.Futures.makeUninterruptible(r1)     // Catch:{ CancellationException -> 0x0053, ExecutionException -> 0x004a }
                java.lang.Object r1 = r1.get()     // Catch:{ CancellationException -> 0x0053, ExecutionException -> 0x004a }
                com.google.common.base.Function<? super I, ? extends com.google.common.util.concurrent.ListenableFuture<? extends O>> r2 = r4.function     // Catch:{ UndeclaredThrowableException -> 0x0048, RuntimeException -> 0x0046, Error -> 0x0044 }
                java.lang.Object r1 = r2.apply(r1)     // Catch:{ UndeclaredThrowableException -> 0x0048, RuntimeException -> 0x0046, Error -> 0x0044 }
                com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1     // Catch:{ UndeclaredThrowableException -> 0x0048, RuntimeException -> 0x0046, Error -> 0x0044 }
                r4.outputFuture = r1     // Catch:{ UndeclaredThrowableException -> 0x0048, RuntimeException -> 0x0046, Error -> 0x0044 }
                boolean r2 = r4.isCancelled()     // Catch:{ UndeclaredThrowableException -> 0x0048, RuntimeException -> 0x0046, Error -> 0x0044 }
                if (r2 == 0) goto L_0x0035
                java.util.concurrent.BlockingQueue<java.lang.Boolean> r2 = r4.mayInterruptIfRunningChannel     // Catch:{ InterruptedException -> 0x002b }
                java.lang.Object r2 = r2.take()     // Catch:{ InterruptedException -> 0x002b }
                java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ InterruptedException -> 0x002b }
                boolean r2 = r2.booleanValue()     // Catch:{ InterruptedException -> 0x002b }
                r1.cancel(r2)     // Catch:{ InterruptedException -> 0x002b }
                goto L_0x0032
            L_0x002b:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ UndeclaredThrowableException -> 0x0048, RuntimeException -> 0x0046, Error -> 0x0044 }
                r1.interrupt()     // Catch:{ UndeclaredThrowableException -> 0x0048, RuntimeException -> 0x0046, Error -> 0x0044 }
            L_0x0032:
                r4.outputFuture = r0     // Catch:{ UndeclaredThrowableException -> 0x0048, RuntimeException -> 0x0046, Error -> 0x0044 }
                goto L_0x0056
            L_0x0035:
                com.google.common.util.concurrent.Futures$ChainingListenableFuture$1 r2 = new com.google.common.util.concurrent.Futures$ChainingListenableFuture$1     // Catch:{ UndeclaredThrowableException -> 0x0048, RuntimeException -> 0x0046, Error -> 0x0044 }
                r2.<init>(r1)     // Catch:{ UndeclaredThrowableException -> 0x0048, RuntimeException -> 0x0046, Error -> 0x0044 }
                java.util.concurrent.ExecutorService r3 = com.google.common.util.concurrent.MoreExecutors.sameThreadExecutor()     // Catch:{ UndeclaredThrowableException -> 0x0048, RuntimeException -> 0x0046, Error -> 0x0044 }
                r1.addListener(r2, r3)     // Catch:{ UndeclaredThrowableException -> 0x0048, RuntimeException -> 0x0046, Error -> 0x0044 }
                goto L_0x0056
            L_0x0042:
                r1 = move-exception
                goto L_0x0070
            L_0x0044:
                r1 = move-exception
                goto L_0x0060
            L_0x0046:
                r1 = move-exception
                goto L_0x0064
            L_0x0048:
                r1 = move-exception
                goto L_0x0068
            L_0x004a:
                r1 = move-exception
                java.lang.Throwable r1 = r1.getCause()     // Catch:{ UndeclaredThrowableException -> 0x0048, RuntimeException -> 0x0046, Error -> 0x0044 }
                r4.setException(r1)     // Catch:{ UndeclaredThrowableException -> 0x0048, RuntimeException -> 0x0046, Error -> 0x0044 }
                goto L_0x0056
            L_0x0053:
                r4.cancel()     // Catch:{ UndeclaredThrowableException -> 0x0048, RuntimeException -> 0x0046, Error -> 0x0044 }
            L_0x0056:
                r4.function = r0
                r4.inputFuture = r0
                java.util.concurrent.CountDownLatch r0 = r4.outputCreated
                r0.countDown()
                return
            L_0x0060:
                r4.setException(r1)     // Catch:{ all -> 0x0042 }
                goto L_0x0056
            L_0x0064:
                r4.setException(r1)     // Catch:{ all -> 0x0042 }
                goto L_0x0056
            L_0x0068:
                java.lang.Throwable r1 = r1.getCause()     // Catch:{ all -> 0x0042 }
                r4.setException(r1)     // Catch:{ all -> 0x0042 }
                goto L_0x0056
            L_0x0070:
                r4.function = r0
                r4.inputFuture = r0
                java.util.concurrent.CountDownLatch r0 = r4.outputCreated
                r0.countDown()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.Futures.ChainingListenableFuture.run():void");
        }
    }

    static class MappingCheckedFuture<V, X extends Exception> extends AbstractCheckedFuture<V, X> {
        final Function<Exception, X> mapper;

        MappingCheckedFuture(ListenableFuture<V> listenableFuture, Function<Exception, X> function) {
            super(listenableFuture);
            this.mapper = (Function) Preconditions.checkNotNull(function);
        }

        /* access modifiers changed from: protected */
        public X mapException(Exception exc) {
            return (Exception) this.mapper.apply(exc);
        }
    }

    static class ListenableFutureAdapter<V> extends ForwardingFuture<V> implements ListenableFuture<V> {
        private static final Executor defaultAdapterExecutor;
        private static final ThreadFactory threadFactory;
        private final Executor adapterExecutor;
        /* access modifiers changed from: private */
        public final Future<V> delegate;
        /* access modifiers changed from: private */
        public final ExecutionList executionList;
        private final AtomicBoolean hasListeners;

        static {
            ThreadFactory build = new ThreadFactoryBuilder().setNameFormat("ListenableFutureAdapter-thread-%d").build();
            threadFactory = build;
            defaultAdapterExecutor = Executors.newCachedThreadPool(build);
        }

        ListenableFutureAdapter(Future<V> future) {
            this(future, defaultAdapterExecutor);
        }

        ListenableFutureAdapter(Future<V> future, Executor executor) {
            this.executionList = new ExecutionList();
            this.hasListeners = new AtomicBoolean(false);
            this.delegate = (Future) Preconditions.checkNotNull(future);
            this.adapterExecutor = (Executor) Preconditions.checkNotNull(executor);
        }

        /* access modifiers changed from: protected */
        public Future<V> delegate() {
            return this.delegate;
        }

        public void addListener(Runnable runnable, Executor executor) {
            this.executionList.add(runnable, executor);
            if (!this.hasListeners.compareAndSet(false, true)) {
                return;
            }
            if (this.delegate.isDone()) {
                this.executionList.run();
            } else {
                this.adapterExecutor.execute(new Runnable() {
                    public void run() {
                        try {
                            ListenableFutureAdapter.this.delegate.get();
                        } catch (Error e) {
                            throw e;
                        } catch (InterruptedException e2) {
                            Thread.currentThread().interrupt();
                            throw new IllegalStateException("Adapter thread interrupted!", e2);
                        } catch (Throwable unused) {
                        }
                        ListenableFutureAdapter.this.executionList.run();
                    }
                });
            }
        }
    }
}
