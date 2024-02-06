package p040o;

/* renamed from: o.dy$MediaSessionCompat$ResultReceiverWrapper */
final /* synthetic */ class dy$MediaSessionCompat$ResultReceiverWrapper extends InvestmentFundDetailsActivity implements FundFactSheetActivity<ListOfException, HmlVerifyPhoneValidateOtpActivity> {
    public static final dy$MediaSessionCompat$ResultReceiverWrapper write = new dy$MediaSessionCompat$ResultReceiverWrapper();

    dy$MediaSessionCompat$ResultReceiverWrapper() {
        super(1);
    }

    public final String getName() {
        return "navigateToRoboAdvisorLanding";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(ListOfException.class);
    }

    public final String getSignature() {
        return "navigateToRoboAdvisorLanding()V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        ListOfException listOfException = (ListOfException) obj;
        onGetStartedClick.write((Object) listOfException, "p1");
        listOfException.MediaBrowserCompat$MediaItem();
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
