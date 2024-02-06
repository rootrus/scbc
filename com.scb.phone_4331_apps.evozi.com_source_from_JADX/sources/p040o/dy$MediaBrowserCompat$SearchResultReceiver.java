package p040o;

/* renamed from: o.dy$MediaBrowserCompat$SearchResultReceiver */
final /* synthetic */ class dy$MediaBrowserCompat$SearchResultReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<ListOfException, HmlVerifyPhoneValidateOtpActivity> {
    public static final dy$MediaBrowserCompat$SearchResultReceiver MediaBrowserCompat$CustomActionResultReceiver = new dy$MediaBrowserCompat$SearchResultReceiver();

    dy$MediaBrowserCompat$SearchResultReceiver() {
        super(1);
    }

    public final String getName() {
        return "navigateToMutualFundsOnboarding";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(ListOfException.class);
    }

    public final String getSignature() {
        return "navigateToMutualFundsOnboarding()V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        ListOfException listOfException = (ListOfException) obj;
        onGetStartedClick.write((Object) listOfException, "p1");
        listOfException.MediaBrowserCompat$CustomActionResultReceiver();
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
