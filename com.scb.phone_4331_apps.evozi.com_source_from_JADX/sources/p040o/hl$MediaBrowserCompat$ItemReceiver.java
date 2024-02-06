package p040o;

import p040o.access$2300;

/* renamed from: o.hl$MediaBrowserCompat$ItemReceiver */
public final class hl$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ C4773hl MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hl$MediaBrowserCompat$ItemReceiver(C4773hl hlVar) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = hlVar;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "throwable");
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
