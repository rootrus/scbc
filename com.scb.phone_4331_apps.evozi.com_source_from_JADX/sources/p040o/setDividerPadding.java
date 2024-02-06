package p040o;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;

/* renamed from: o.setDividerPadding */
public final class setDividerPadding {
    private final Context MediaBrowserCompat$ItemReceiver;

    public static setDividerPadding MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        return new setDividerPadding(context);
    }

    private setDividerPadding(Context context) {
        this.MediaBrowserCompat$ItemReceiver = context;
    }

    public final boolean read() {
        FingerprintManager write;
        if (Build.VERSION.SDK_INT < 23 || (write = write(this.MediaBrowserCompat$ItemReceiver)) == null || !write.hasEnrolledFingerprints()) {
            return false;
        }
        return true;
    }

    private static FingerprintManager write(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }
}
