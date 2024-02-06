package p040o;

/* renamed from: o.IFaceDetector$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
public final class C3449x3b9e8dd2 extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ IFaceDetector read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3449x3b9e8dd2(IFaceDetector iFaceDetector) {
        super(1);
        this.read = iFaceDetector;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "throwable");
        IFaceDetector.MediaBrowserCompat$CustomActionResultReceiver(this.read, th);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
