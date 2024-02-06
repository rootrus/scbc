package p040o;

import p040o.access$2300;

/* renamed from: o.setSheetID$MediaBrowserCompat$MediaItem */
public final class setSheetID$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ setSheetID MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setSheetID$MediaBrowserCompat$MediaItem(setSheetID setsheetid) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = setsheetid;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "e");
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = true;
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
