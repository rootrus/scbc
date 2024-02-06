package p040o;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

/* renamed from: o.HmlNTBRepaymentAboutActivity */
public final class HmlNTBRepaymentAboutActivity extends ThreadPoolExecutor {
    private static final int read;
    private ReentrantLock IconCompatParcelizer;

    public static HmlNTBRepaymentAboutActivity MediaBrowserCompat$CustomActionResultReceiver() {
        int i = read;
        return new HmlNTBRepaymentAboutActivity(i, i);
    }

    private static int write(String str, String str2) {
        final Pattern compile = Pattern.compile(str2);
        try {
            File[] listFiles = new File(str).listFiles(new FileFilter() {
                public final boolean accept(File file) {
                    return compile.matcher(file.getName()).matches();
                }
            });
            if (listFiles != null) {
                return listFiles.length;
            }
        } catch (SecurityException unused) {
        }
        return 0;
    }

    private HmlNTBRepaymentAboutActivity(int i, int i2) {
        super(i, i2, 0, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100));
        ReentrantLock reentrantLock = new ReentrantLock();
        this.IconCompatParcelizer = reentrantLock;
        reentrantLock.newCondition();
    }

    /* access modifiers changed from: protected */
    public final void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        this.IconCompatParcelizer.lock();
        this.IconCompatParcelizer.unlock();
    }

    static {
        int write = write("/sys/devices/system/cpu/", "cpu[0-9]+");
        if (write <= 0) {
            write = Runtime.getRuntime().availableProcessors();
        }
        int i = 1;
        if (write > 0) {
            i = 1 + (write << 1);
        }
        read = i;
    }
}
