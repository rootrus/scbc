package p040o;

/* renamed from: o.FieldNamingStrategy$MediaBrowserCompat$CustomActionResultReceiver */
final /* synthetic */ class C3358xeb06cb62 extends InvestmentFundDetailsActivity implements FundFactSheetActivity<IdCaptureActivity, HmlVerifyPhoneValidateOtpActivity> {
    public static final C3358xeb06cb62 MediaBrowserCompat$CustomActionResultReceiver = new C3358xeb06cb62();

    C3358xeb06cb62() {
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
