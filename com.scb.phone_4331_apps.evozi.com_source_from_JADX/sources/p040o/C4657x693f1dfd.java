package p040o;

/* renamed from: o.getSettings$AppCompatDialogFragment$MediaBrowserCompat$CustomActionResultReceiver */
final /* synthetic */ class C4657x693f1dfd extends InvestmentFundDetailsActivity implements FundFactSheetActivity<gePayeeName, HmlVerifyPhoneValidateOtpActivity> {
    public static final C4657x693f1dfd write = new C4657x693f1dfd();

    C4657x693f1dfd() {
        super(1);
    }

    public final String getName() {
        return "navigateToContactInformation";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(gePayeeName.class);
    }

    public final String getSignature() {
        return "navigateToContactInformation()V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        gePayeeName gepayeename = (gePayeeName) obj;
        onGetStartedClick.write((Object) gepayeename, "p1");
        gepayeename.write();
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
