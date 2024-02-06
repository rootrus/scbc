package p040o;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.closeActivity */
public final class closeActivity extends MwCurrentUserEwalletActivity_ViewBinding {
    private static final int MediaBrowserCompat$CustomActionResultReceiver;
    public static final closeActivity MediaBrowserCompat$ItemReceiver = new closeActivity();
    private static volatile Executor pool;

    public final String toString() {
        return "CommonPool";
    }

    static {
        String str;
        int i;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str != null) {
            onGetStartedClick.write((Object) str, "$this$toIntOrNull");
            Integer write = GoodToKnowActivity.write(str);
            if (write == null || write.intValue() <= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected positive number in kotlinx.coroutines.default.parallelism, but has ");
                sb.append(str);
                throw new IllegalStateException(sb.toString().toString());
            }
            i = write.intValue();
        } else {
            i = -1;
        }
        MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    private closeActivity() {
    }

    private static int IconCompatParcelizer() {
        Integer valueOf = Integer.valueOf(MediaBrowserCompat$CustomActionResultReceiver);
        int i = 1;
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        int availableProcessors = Runtime.getRuntime().availableProcessors() - 1;
        if (availableProcessors > 0) {
            i = availableProcessors;
        }
        return i;
    }

    private final ExecutorService write() {
        Class<?> cls;
        ExecutorService executorService;
        if (System.getSecurityManager() != null) {
            return read();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return read();
        }
        if (MediaBrowserCompat$CustomActionResultReceiver < 0) {
            try {
                Method method = cls.getMethod("commonPool", new Class[0]);
                Object invoke = method != null ? method.invoke((Object) null, new Object[0]) : null;
                if (!(invoke instanceof ExecutorService)) {
                    invoke = null;
                }
                executorService = (ExecutorService) invoke;
            } catch (Throwable unused2) {
                executorService = null;
            }
            if (executorService != null) {
                if (!read(cls, executorService)) {
                    executorService = null;
                }
                if (executorService != null) {
                    return executorService;
                }
            }
        }
        try {
            Object newInstance = cls.getConstructor(new Class[]{Integer.TYPE}).newInstance(new Object[]{Integer.valueOf(IconCompatParcelizer())});
            if (!(newInstance instanceof ExecutorService)) {
                newInstance = null;
            }
            executorService2 = (ExecutorService) newInstance;
        } catch (Throwable unused3) {
        }
        if (executorService2 != null) {
            return executorService2;
        }
        return read();
    }

    private static boolean read(Class<?> cls, ExecutorService executorService) {
        onGetStartedClick.write((Object) cls, "fjpClass");
        onGetStartedClick.write((Object) executorService, "executor");
        executorService.submit(closeActivity$MediaBrowserCompat$ItemReceiver.write);
        Integer num = null;
        try {
            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (!(invoke instanceof Integer)) {
                invoke = null;
            }
            num = (Integer) invoke;
        } catch (Throwable unused) {
        }
        if (num == null || num.intValue() <= 0) {
            return false;
        }
        return true;
    }

    private static ExecutorService read() {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(IconCompatParcelizer(), new IconCompatParcelizer(new AtomicInteger()));
        onGetStartedClick.IconCompatParcelizer((Object) newFixedThreadPool, "Executors.newFixedThread…Daemon = true }\n        }");
        return newFixedThreadPool;
    }

    /* renamed from: o.closeActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer implements ThreadFactory {
        private /* synthetic */ AtomicInteger write;

        IconCompatParcelizer(AtomicInteger atomicInteger) {
            this.write = atomicInteger;
        }

        public final Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("CommonPool-worker-");
            sb.append(this.write.incrementAndGet());
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    private final Executor MediaBrowserCompat$CustomActionResultReceiver() {
        Executor executor;
        synchronized (this) {
            executor = pool;
            if (executor == null) {
                ExecutorService write = write();
                pool = write;
                executor = write;
            }
        }
        return executor;
    }

    public final void IconCompatParcelizer(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, Runnable runnable) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        onGetStartedClick.write((Object) runnable, "block");
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = MediaBrowserCompat$CustomActionResultReceiver();
            }
            executor.execute(runnable);
        } catch (RejectedExecutionException unused) {
            lambda$onCreate$0$MwCoachMarkActivity.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(runnable);
        }
    }

    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }
}
