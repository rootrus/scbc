package p040o;

/* renamed from: o.MapConstraints$MediaBrowserCompat$ItemReceiver */
public final class MapConstraints$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ FundActionsSuccessActivity write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapConstraints$MediaBrowserCompat$ItemReceiver(FundActionsSuccessActivity fundActionsSuccessActivity) {
        super(0);
        this.write = fundActionsSuccessActivity;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        this.write.invoke();
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
