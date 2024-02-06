package p040o;

import p040o.access$2300;

/* renamed from: o.setCertificateError$MediaBrowserCompat$MediaItem */
public final class setCertificateError$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ setCertificateError MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setCertificateError$MediaBrowserCompat$MediaItem(setCertificateError setcertificateerror) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = setcertificateerror;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "throwable");
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
