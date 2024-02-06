package p040o;

/* renamed from: o.ExtractActivity$1$MediaBrowserCompat$ItemReceiver */
public final /* synthetic */ class ExtractActivity$1$MediaBrowserCompat$ItemReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<CheckCaptureModule_GetIExceptionResponseDeserializerKtaFactory, HmlVerifyPhoneValidateOtpActivity> {
    public static final ExtractActivity$1$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = new ExtractActivity$1$MediaBrowserCompat$ItemReceiver();

    ExtractActivity$1$MediaBrowserCompat$ItemReceiver() {
        super(1);
    }

    public final String getName() {
        return "showTermsAndConditions";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(CheckCaptureModule_GetIExceptionResponseDeserializerKtaFactory.class);
    }

    public final String getSignature() {
        return "showTermsAndConditions()V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        CheckCaptureModule_GetIExceptionResponseDeserializerKtaFactory checkCaptureModule_GetIExceptionResponseDeserializerKtaFactory = (CheckCaptureModule_GetIExceptionResponseDeserializerKtaFactory) obj;
        onGetStartedClick.write((Object) checkCaptureModule_GetIExceptionResponseDeserializerKtaFactory, "p1");
        checkCaptureModule_GetIExceptionResponseDeserializerKtaFactory.IconCompatParcelizer();
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
