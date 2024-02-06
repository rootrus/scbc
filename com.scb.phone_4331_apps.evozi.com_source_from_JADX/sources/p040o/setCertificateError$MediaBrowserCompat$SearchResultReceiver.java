package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setCertificateError$MediaBrowserCompat$SearchResultReceiver */
public final class setCertificateError$MediaBrowserCompat$SearchResultReceiver extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ setCertificateError MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setCertificateError$MediaBrowserCompat$SearchResultReceiver(setCertificateError setcertificateerror) {
        super(0);
        this.MediaBrowserCompat$ItemReceiver = setcertificateerror;
    }

    public final /* synthetic */ Object invoke() {
        setCertificateError.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
        setCertificateError setcertificateerror = this.MediaBrowserCompat$ItemReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C101431.write;
        if (setcertificateerror.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(setcertificateerror.RatingCompat);
        }
        this.MediaBrowserCompat$ItemReceiver.write = true;
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
