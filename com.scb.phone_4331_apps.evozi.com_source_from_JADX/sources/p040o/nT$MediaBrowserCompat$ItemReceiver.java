package p040o;

import p040o.access$2300;

/* renamed from: o.nT$MediaBrowserCompat$ItemReceiver */
public final class nT$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ C5021nT IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nT$MediaBrowserCompat$ItemReceiver(C5021nT nTVar) {
        super(1);
        this.IconCompatParcelizer = nTVar;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "it");
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
