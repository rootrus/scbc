package p040o;

import p040o.access$2300;

/* renamed from: o.du$MediaBrowserCompat$CustomActionResultReceiver */
public final class du$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ C4301du MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public du$MediaBrowserCompat$CustomActionResultReceiver(C4301du duVar) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = duVar;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "throwable");
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
