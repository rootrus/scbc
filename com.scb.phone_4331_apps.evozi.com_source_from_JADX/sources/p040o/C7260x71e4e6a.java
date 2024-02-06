package p040o;

/* renamed from: o.moveCameraToCurrentLocation$MediaBrowserCompat$CustomActionResultReceiver */
final class C7260x71e4e6a extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ Runnable IconCompatParcelizer;
    private /* synthetic */ moveCameraToCurrentLocation write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7260x71e4e6a(moveCameraToCurrentLocation movecameratocurrentlocation, Runnable runnable) {
        super(1);
        this.write = movecameratocurrentlocation;
        this.IconCompatParcelizer = runnable;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        this.write.read.removeCallbacks(this.IconCompatParcelizer);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
