package p040o;

import p040o.access$2300;

/* renamed from: o.executeKMSSoapCall$MediaBrowserCompat$ItemReceiver */
final class executeKMSSoapCall$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ executeKMSSoapCall write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    executeKMSSoapCall$MediaBrowserCompat$ItemReceiver(executeKMSSoapCall executekmssoapcall) {
        super(1);
        this.write = executekmssoapcall;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "it");
        this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
