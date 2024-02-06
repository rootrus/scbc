package p040o;

/* renamed from: o.getPitch$MediaBrowserCompat$SearchResultReceiver */
public final /* synthetic */ class getPitch$MediaBrowserCompat$SearchResultReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<PassportParameters, HmlVerifyPhoneValidateOtpActivity> {
    public static final getPitch$MediaBrowserCompat$SearchResultReceiver read = new getPitch$MediaBrowserCompat$SearchResultReceiver();

    getPitch$MediaBrowserCompat$SearchResultReceiver() {
        super(1);
    }

    public final String getName() {
        return "showRoboAdvisorOpenAccount";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(PassportParameters.class);
    }

    public final String getSignature() {
        return "showRoboAdvisorOpenAccount()V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        PassportParameters passportParameters = (PassportParameters) obj;
        onGetStartedClick.write((Object) passportParameters, "p1");
        passportParameters.read();
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
