package p040o;

import android.view.View;
import p040o.HmlVerifyIdentifyActivity;

/* renamed from: o.PrepaidCashOutCaseModule$MediaBrowserCompat$CustomActionResultReceiver */
final class C7002xc5ee29b5 implements Runnable {
    private /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver = true;
    private /* synthetic */ View read;
    private /* synthetic */ MailingAddressReviewOTPActivity write;

    C7002xc5ee29b5(MailingAddressReviewOTPActivity mailingAddressReviewOTPActivity, View view, boolean z) {
        this.write = mailingAddressReviewOTPActivity;
        this.read = view;
    }

    public final void run() {
        E2EEEncryptionException e2EEEncryptionException;
        try {
            if (this.MediaBrowserCompat$CustomActionResultReceiver) {
                e2EEEncryptionException = new E2EEEncryptionException(this.read.getMeasuredHeight(), this.read.getMeasuredWidth());
            } else {
                e2EEEncryptionException = new E2EEEncryptionException(this.read.getHeight(), this.read.getWidth());
            }
            if (this.write.IconCompatParcelizer()) {
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                this.write.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(e2EEEncryptionException));
            }
        } catch (Throwable th) {
            if (this.write.IconCompatParcelizer()) {
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                onGetStartedClick.write((Object) th, "exception");
                this.write.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th)));
            }
        }
    }
}
