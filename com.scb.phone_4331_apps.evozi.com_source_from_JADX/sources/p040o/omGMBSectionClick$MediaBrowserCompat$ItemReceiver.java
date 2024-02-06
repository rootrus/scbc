package p040o;

import p040o.omGMBSectionClick;

/* renamed from: o.omGMBSectionClick$MediaBrowserCompat$ItemReceiver */
final class omGMBSectionClick$MediaBrowserCompat$ItemReceiver extends omGMBSectionClick.write {
    private final MailingAddressReviewOTPActivity<HmlVerifyPhoneValidateOtpActivity> IconCompatParcelizer;
    private /* synthetic */ omGMBSectionClick write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public omGMBSectionClick$MediaBrowserCompat$ItemReceiver(omGMBSectionClick omgmbsectionclick, long j, MailingAddressReviewOTPActivity<? super HmlVerifyPhoneValidateOtpActivity> mailingAddressReviewOTPActivity) {
        super(j);
        onGetStartedClick.write((Object) mailingAddressReviewOTPActivity, "cont");
        this.write = omgmbsectionclick;
        this.IconCompatParcelizer = mailingAddressReviewOTPActivity;
    }

    public final void run() {
        this.IconCompatParcelizer.read(this.write, HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(this.IconCompatParcelizer.toString());
        return sb.toString();
    }
}
