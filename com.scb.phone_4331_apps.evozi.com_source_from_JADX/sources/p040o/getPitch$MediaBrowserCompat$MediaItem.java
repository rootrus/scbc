package p040o;

/* renamed from: o.getPitch$MediaBrowserCompat$MediaItem */
public final /* synthetic */ class getPitch$MediaBrowserCompat$MediaItem extends InvestmentFundDetailsActivity implements FundFactSheetActivity<PassportParameters, HmlVerifyPhoneValidateOtpActivity> {
    public static final getPitch$MediaBrowserCompat$MediaItem MediaBrowserCompat$ItemReceiver = new getPitch$MediaBrowserCompat$MediaItem();

    getPitch$MediaBrowserCompat$MediaItem() {
        super(1);
    }

    public final String getName() {
        return "showSCBSOpenAccount";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(PassportParameters.class);
    }

    public final String getSignature() {
        return "showSCBSOpenAccount()V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        PassportParameters passportParameters = (PassportParameters) obj;
        onGetStartedClick.write((Object) passportParameters, "p1");
        passportParameters.MediaBrowserCompat$ItemReceiver();
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
