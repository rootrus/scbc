package p040o;

/* renamed from: o.FieldNamingStrategy$MediaBrowserCompat$MediaItem */
final /* synthetic */ class FieldNamingStrategy$MediaBrowserCompat$MediaItem extends InvestmentFundDetailsActivity implements FundFactSheetActivity<IdCaptureActivity, HmlVerifyPhoneValidateOtpActivity> {
    public static final FieldNamingStrategy$MediaBrowserCompat$MediaItem read = new FieldNamingStrategy$MediaBrowserCompat$MediaItem();

    FieldNamingStrategy$MediaBrowserCompat$MediaItem() {
        super(1);
    }

    public final String getName() {
        return "hideProductListInlineLoader";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(IdCaptureActivity.class);
    }

    public final String getSignature() {
        return "hideProductListInlineLoader()V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        IdCaptureActivity idCaptureActivity = (IdCaptureActivity) obj;
        onGetStartedClick.write((Object) idCaptureActivity, "p1");
        idCaptureActivity.MediaDescriptionCompat();
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
