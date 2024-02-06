package p040o;

/* renamed from: o.dy$AlertController$RecycleListView */
public final /* synthetic */ class dy$AlertController$RecycleListView extends InvestmentFundDetailsActivity implements FundFactSheetActivity<ListOfException, HmlVerifyPhoneValidateOtpActivity> {
    public static final dy$AlertController$RecycleListView MediaBrowserCompat$ItemReceiver = new dy$AlertController$RecycleListView();

    dy$AlertController$RecycleListView() {
        super(1);
    }

    public final String getName() {
        return "navigateToPinLogin";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(ListOfException.class);
    }

    public final String getSignature() {
        return "navigateToPinLogin()V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        ListOfException listOfException = (ListOfException) obj;
        onGetStartedClick.write((Object) listOfException, "p1");
        listOfException.read();
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
