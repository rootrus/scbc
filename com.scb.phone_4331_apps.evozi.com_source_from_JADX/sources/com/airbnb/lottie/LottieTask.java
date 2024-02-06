package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import com.airbnb.lottie.utils.Logger;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class LottieTask<T> {
    public static Executor EXECUTOR = Executors.newCachedThreadPool();
    private final Set<LottieListener<Throwable>> failureListeners;
    private final Handler handler;
    /* access modifiers changed from: private */
    public volatile LottieResult<T> result;
    private final Set<LottieListener<T>> successListeners;

    public LottieTask(Callable<LottieResult<T>> callable) {
        this(callable, false);
    }

    LottieTask(Callable<LottieResult<T>> callable, boolean z) {
        this.successListeners = new LinkedHashSet(1);
        this.failureListeners = new LinkedHashSet(1);
        this.handler = new Handler(Looper.getMainLooper());
        this.result = null;
        if (z) {
            try {
                setResult(callable.call());
            } catch (Throwable th) {
                setResult(new LottieResult(th));
            }
        } else {
            EXECUTOR.execute(new LottieFutureTask(callable));
        }
    }

    /* access modifiers changed from: private */
    public void setResult(LottieResult<T> lottieResult) {
        if (this.result == null) {
            this.result = lottieResult;
            notifyListeners();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public LottieTask<T> addListener(LottieListener<T> lottieListener) {
        synchronized (this) {
            if (!(this.result == null || this.result.getValue() == null)) {
                lottieListener.onResult(this.result.getValue());
            }
            this.successListeners.add(lottieListener);
        }
        return this;
    }

    public LottieTask<T> removeListener(LottieListener<T> lottieListener) {
        synchronized (this) {
            this.successListeners.remove(lottieListener);
        }
        return this;
    }

    public LottieTask<T> addFailureListener(LottieListener<Throwable> lottieListener) {
        synchronized (this) {
            if (!(this.result == null || this.result.getException() == null)) {
                lottieListener.onResult(this.result.getException());
            }
            this.failureListeners.add(lottieListener);
        }
        return this;
    }

    public LottieTask<T> removeFailureListener(LottieListener<Throwable> lottieListener) {
        synchronized (this) {
            this.failureListeners.remove(lottieListener);
        }
        return this;
    }

    private void notifyListeners() {
        this.handler.post(new Runnable() {
            public void run() {
                if (LottieTask.this.result != null) {
                    LottieResult access$000 = LottieTask.this.result;
                    if (access$000.getValue() != null) {
                        LottieTask.this.notifySuccessListeners(access$000.getValue());
                    } else {
                        LottieTask.this.notifyFailureListeners(access$000.getException());
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void notifySuccessListeners(T t) {
        synchronized (this) {
            for (LottieListener onResult : new ArrayList(this.successListeners)) {
                onResult.onResult(t);
            }
        }
    }

    /* access modifiers changed from: private */
    public void notifyFailureListeners(Throwable th) {
        synchronized (this) {
            ArrayList<LottieListener> arrayList = new ArrayList<>(this.failureListeners);
            if (arrayList.isEmpty()) {
                Logger.warning("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            for (LottieListener onResult : arrayList) {
                onResult.onResult(th);
            }
        }
    }

    class LottieFutureTask extends FutureTask<LottieResult<T>> {
        LottieFutureTask(Callable<LottieResult<T>> callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public void done() {
            if (!isCancelled()) {
                try {
                    LottieTask.this.setResult((LottieResult) get());
                } catch (InterruptedException | ExecutionException e) {
                    LottieTask.this.setResult(new LottieResult(e));
                }
            }
        }
    }
}
