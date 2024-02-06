package p040o;

import p040o.access$2300;

/* renamed from: o.executeKMSSoapCall$MediaBrowserCompat$CustomActionResultReceiver */
final class executeKMSSoapCall$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ executeKMSSoapCall read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    executeKMSSoapCall$MediaBrowserCompat$CustomActionResultReceiver(executeKMSSoapCall executekmssoapcall) {
        super(1);
        this.read = executekmssoapcall;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "it");
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
