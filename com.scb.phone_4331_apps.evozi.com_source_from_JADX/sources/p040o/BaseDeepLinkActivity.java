package p040o;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.BaseDeepLinkActivity */
public abstract class BaseDeepLinkActivity implements BulkTransferDeepLinkActivity {
    private final AtomicBoolean IconCompatParcelizer = new AtomicBoolean();

    /* access modifiers changed from: protected */
    public abstract void write();

    public final boolean isDisposed() {
        return this.IconCompatParcelizer.get();
    }

    public final void dispose() {
        if (!this.IconCompatParcelizer.compareAndSet(false, true)) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            write();
        } else {
            BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$CustomActionResultReceiver(new Runnable() {
                public final void run() {
                    BaseDeepLinkActivity.this.write();
                }
            });
        }
    }
}
