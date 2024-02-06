package p040o;

/* renamed from: o.eA$MediaBrowserCompat$SearchResultReceiver */
public final class eA$MediaBrowserCompat$SearchResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ C4323eA read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eA$MediaBrowserCompat$SearchResultReceiver(C4323eA eAVar) {
        super(1);
        this.read = eAVar;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "throwable");
        C4323eA.IconCompatParcelizer(this.read, th);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
