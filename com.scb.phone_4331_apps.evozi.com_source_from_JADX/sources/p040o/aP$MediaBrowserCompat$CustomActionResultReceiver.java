package p040o;

import p040o.access$2300;

/* renamed from: o.aP$MediaBrowserCompat$CustomActionResultReceiver */
public final class aP$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ C3978aP IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aP$MediaBrowserCompat$CustomActionResultReceiver(C3978aP aPVar) {
        super(1);
        this.IconCompatParcelizer = aPVar;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "it");
        if (!this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(th)) {
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
