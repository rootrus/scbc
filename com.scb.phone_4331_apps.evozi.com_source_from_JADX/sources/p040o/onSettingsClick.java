package p040o;

import kotlinx.coroutines.channels.ClosedSendChannelException;
import p040o.HmlVerifyIdentifyActivity;
import p040o.NdidIdpShareSuccessActivity;

/* renamed from: o.onSettingsClick */
public final class onSettingsClick extends MwTermsAndConditionsActivity {
    private MailingAddressReviewOTPActivity<HmlVerifyPhoneValidateOtpActivity> IconCompatParcelizer;
    private final Object write;

    public final Object MediaBrowserCompat$CustomActionResultReceiver() {
        return this.write;
    }

    public onSettingsClick(Object obj, MailingAddressReviewOTPActivity<? super HmlVerifyPhoneValidateOtpActivity> mailingAddressReviewOTPActivity) {
        onGetStartedClick.write((Object) mailingAddressReviewOTPActivity, "cont");
        this.write = obj;
        this.IconCompatParcelizer = mailingAddressReviewOTPActivity;
    }

    public final EkycOtpActivity IconCompatParcelizer(NdidIdpShareSuccessActivity.write write2) {
        Object IconCompatParcelizer2 = this.IconCompatParcelizer.IconCompatParcelizer(HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver, write2 != null ? write2.MediaBrowserCompat$CustomActionResultReceiver : null);
        if (IconCompatParcelizer2 == null) {
            return null;
        }
        if (MwChangeCasaSuccessActivity.write()) {
            if (!(IconCompatParcelizer2 == MailingAddressLandingActivity.write)) {
                throw new AssertionError();
            }
        }
        if (write2 != null) {
            write2.MediaBrowserCompat$CustomActionResultReceiver.read(write2);
        }
        return MailingAddressLandingActivity.write;
    }

    public final void write() {
        this.IconCompatParcelizer.IconCompatParcelizer((Object) MailingAddressLandingActivity.write);
    }

    public final void MediaBrowserCompat$ItemReceiver(MwShopAddressActivity<?> mwShopAddressActivity) {
        onGetStartedClick.write((Object) mwShopAddressActivity, "closed");
        HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity = this.IconCompatParcelizer;
        Throwable th = mwShopAddressActivity.read;
        if (th == null) {
            th = new ClosedSendChannelException("Channel was closed");
        }
        HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) th, "exception");
        hmlNTBPromptPayNotFoundActivity.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SendElement@");
        onGetStartedClick.write((Object) this, "$this$hexAddress");
        String hexString = Integer.toHexString(System.identityHashCode(this));
        onGetStartedClick.IconCompatParcelizer((Object) hexString, "Integer.toHexString(System.identityHashCode(this))");
        sb.append(hexString);
        sb.append('(');
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
