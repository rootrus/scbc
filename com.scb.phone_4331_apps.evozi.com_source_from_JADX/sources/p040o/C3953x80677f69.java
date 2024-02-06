package p040o;

import p040o.access$2300;

/* renamed from: o.WebServiceCallResult$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3953x80677f69 extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ WebServiceCallResult read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3953x80677f69(WebServiceCallResult webServiceCallResult) {
        super(1);
        this.read = webServiceCallResult;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "e");
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
