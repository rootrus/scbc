package p040o;

/* renamed from: o.MwOnboardInfoActivity */
public final class MwOnboardInfoActivity extends MailingAddressDetailsActivity {
    private final NdidIdpShareSuccessActivity read;

    public MwOnboardInfoActivity(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity) {
        onGetStartedClick.write((Object) ndidIdpShareSuccessActivity, "node");
        this.read = ndidIdpShareSuccessActivity;
    }

    public final void read(Throwable th) {
        this.read.aU_();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemoveOnCancel[");
        sb.append(this.read);
        sb.append(']');
        return sb.toString();
    }

    public final /* synthetic */ Object invoke(Object obj) {
        this.read.aU_();
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
