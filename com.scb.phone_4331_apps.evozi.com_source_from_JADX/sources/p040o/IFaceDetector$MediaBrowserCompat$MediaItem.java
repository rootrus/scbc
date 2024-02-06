package p040o;

/* renamed from: o.IFaceDetector$MediaBrowserCompat$MediaItem */
public final class IFaceDetector$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ IFaceDetector read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IFaceDetector$MediaBrowserCompat$MediaItem(IFaceDetector iFaceDetector) {
        super(1);
        this.read = iFaceDetector;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "throwable");
        IFaceDetector.IconCompatParcelizer(this.read, th);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
