package p040o;

/* renamed from: o.FieldNamingStrategy$MediaBrowserCompat$SearchResultReceiver */
final /* synthetic */ class FieldNamingStrategy$MediaBrowserCompat$SearchResultReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<IdCaptureActivity, HmlVerifyPhoneValidateOtpActivity> {
    public static final FieldNamingStrategy$MediaBrowserCompat$SearchResultReceiver MediaBrowserCompat$CustomActionResultReceiver = new FieldNamingStrategy$MediaBrowserCompat$SearchResultReceiver();

    FieldNamingStrategy$MediaBrowserCompat$SearchResultReceiver() {
        super(1);
    }

    public final String getName() {
        return "showProductListInlineLoader";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(IdCaptureActivity.class);
    }

    public final String getSignature() {
        return "showProductListInlineLoader()V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        IdCaptureActivity idCaptureActivity = (IdCaptureActivity) obj;
        onGetStartedClick.write((Object) idCaptureActivity, "p1");
        idCaptureActivity.mo36400x50fd9e4a();
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
