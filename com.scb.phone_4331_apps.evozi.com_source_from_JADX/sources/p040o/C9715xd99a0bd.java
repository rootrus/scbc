package p040o;

/* renamed from: o.DocumentCaptureExperienceCriteriaHolder$MediaBrowserCompat$MediaItem */
public final class C9715xd99a0bd extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ DocumentCaptureExperienceCriteriaHolder MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9715xd99a0bd(DocumentCaptureExperienceCriteriaHolder documentCaptureExperienceCriteriaHolder) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = documentCaptureExperienceCriteriaHolder;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "throwable");
        DocumentCaptureExperienceCriteriaHolder.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, th);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
