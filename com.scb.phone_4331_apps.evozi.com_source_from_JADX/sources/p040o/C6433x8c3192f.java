package p040o;

/* renamed from: o.DirectDebitOtpActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$ItemReceiver */
final class C6433x8c3192f implements Runnable {
    private /* synthetic */ DirectDebitOtpActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;

    C6433x8c3192f(DirectDebitOtpActivity$MediaBrowserCompat$ItemReceiver directDebitOtpActivity$MediaBrowserCompat$ItemReceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = directDebitOtpActivity$MediaBrowserCompat$ItemReceiver;
    }

    public final void run() {
        try {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
        } finally {
            this.MediaBrowserCompat$CustomActionResultReceiver.write.dispose();
        }
    }
}
