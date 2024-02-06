package p040o;

/* renamed from: o.DirectDebitOtpActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver */
final class C6432x376cb260 implements Runnable {
    private /* synthetic */ DirectDebitOtpActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private final Throwable MediaBrowserCompat$ItemReceiver;

    C6432x376cb260(DirectDebitOtpActivity$MediaBrowserCompat$ItemReceiver directDebitOtpActivity$MediaBrowserCompat$ItemReceiver, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = directDebitOtpActivity$MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void run() {
        try {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.onError(this.MediaBrowserCompat$ItemReceiver);
        } finally {
            this.MediaBrowserCompat$CustomActionResultReceiver.write.dispose();
        }
    }
}
