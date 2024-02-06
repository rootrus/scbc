package p040o;

import android.os.Build;
import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.ZGEMV */
public final class ZGEMV {
    private static final AtomicInteger write = new AtomicInteger(1);

    public static int MediaBrowserCompat$ItemReceiver() {
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            i = write.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!write.compareAndSet(i, i2));
        return i;
    }
}
