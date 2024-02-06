package p040o;

import android.os.Handler;
import android.os.Looper;

/* renamed from: o.moveCameraToCurrentLocation */
public final class moveCameraToCurrentLocation extends MwPinShopLocationActivity_ViewBinding {
    private final String IconCompatParcelizer;
    private final boolean MediaBrowserCompat$ItemReceiver;
    private volatile moveCameraToCurrentLocation _immediate;
    /* access modifiers changed from: private */
    public final Handler read;

    /* renamed from: o.moveCameraToCurrentLocation$write */
    public static final class write implements Runnable {
        private /* synthetic */ MailingAddressReviewOTPActivity MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ moveCameraToCurrentLocation write;

        public write(moveCameraToCurrentLocation movecameratocurrentlocation, MailingAddressReviewOTPActivity mailingAddressReviewOTPActivity) {
            this.write = movecameratocurrentlocation;
            this.MediaBrowserCompat$CustomActionResultReceiver = mailingAddressReviewOTPActivity;
        }

        public final void run() {
            this.MediaBrowserCompat$CustomActionResultReceiver.read(this.write, HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver);
        }
    }

    private moveCameraToCurrentLocation(Handler handler, String str, boolean z) {
        super((byte) 0);
        this.read = handler;
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = z;
        this._immediate = z ? this : null;
        if (this._immediate == null) {
            this._immediate = new moveCameraToCurrentLocation(this.read, this.IconCompatParcelizer, true);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public moveCameraToCurrentLocation(Handler handler, String str) {
        this(handler, str, false);
        onGetStartedClick.write((Object) handler, "handler");
    }

    public final boolean write(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        return !this.MediaBrowserCompat$ItemReceiver || (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) Looper.myLooper(), (Object) this.read.getLooper()) ^ true);
    }

    public final void IconCompatParcelizer(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, Runnable runnable) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        onGetStartedClick.write((Object) runnable, "block");
        this.read.post(runnable);
    }

    public final MwCurrentUserEwalletActivity MediaBrowserCompat$ItemReceiver(long j, Runnable runnable) {
        onGetStartedClick.write((Object) runnable, "block");
        Handler handler = this.read;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        handler.postDelayed(runnable, j);
        return new moveCameraToCurrentLocation$MediaBrowserCompat$ItemReceiver(this, runnable);
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        if (str == null) {
            String obj = this.read.toString();
            onGetStartedClick.IconCompatParcelizer((Object) obj, "handler.toString()");
            return obj;
        } else if (!this.MediaBrowserCompat$ItemReceiver) {
            return str;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.IconCompatParcelizer);
            sb.append(" [immediate]");
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof moveCameraToCurrentLocation) && ((moveCameraToCurrentLocation) obj).read == this.read;
    }

    public final int hashCode() {
        return System.identityHashCode(this.read);
    }

    public final void write(long j, MailingAddressReviewOTPActivity<? super HmlVerifyPhoneValidateOtpActivity> mailingAddressReviewOTPActivity) {
        onGetStartedClick.write((Object) mailingAddressReviewOTPActivity, "continuation");
        Runnable write2 = new write(this, mailingAddressReviewOTPActivity);
        Handler handler = this.read;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        handler.postDelayed(write2, j);
        mailingAddressReviewOTPActivity.IconCompatParcelizer((FundFactSheetActivity<? super Throwable, HmlVerifyPhoneValidateOtpActivity>) new C7260x71e4e6a(this, write2));
    }
}
