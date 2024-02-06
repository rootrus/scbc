package p040o;

import p040o.access$2300;

/* renamed from: o.initializeNetworkSettings$MediaBrowserCompat$ItemReceiver */
public final class initializeNetworkSettings$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ initializeNetworkSettings write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public initializeNetworkSettings$MediaBrowserCompat$ItemReceiver(initializeNetworkSettings initializenetworksettings) {
        super(1);
        this.write = initializenetworksettings;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "it");
        this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
