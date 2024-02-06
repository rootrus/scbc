package p040o;

import p040o.access$2300;

/* renamed from: o.getUserEmailAddress$MediaBrowserCompat$ItemReceiver */
final class getUserEmailAddress$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ getUserEmailAddress IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    getUserEmailAddress$MediaBrowserCompat$ItemReceiver(getUserEmailAddress getuseremailaddress) {
        super(1);
        this.IconCompatParcelizer = getuseremailaddress;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "it");
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        this.IconCompatParcelizer.write = true;
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
