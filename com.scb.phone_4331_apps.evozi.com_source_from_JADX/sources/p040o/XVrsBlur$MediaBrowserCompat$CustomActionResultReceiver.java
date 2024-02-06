package p040o;

/* renamed from: o.XVrsBlur$MediaBrowserCompat$CustomActionResultReceiver */
public final /* synthetic */ class XVrsBlur$MediaBrowserCompat$CustomActionResultReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<CheckCaptureModule_GetICheckDeserializerRttiFactory, HmlVerifyPhoneValidateOtpActivity> {
    public static final XVrsBlur$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer = new XVrsBlur$MediaBrowserCompat$CustomActionResultReceiver();

    XVrsBlur$MediaBrowserCompat$CustomActionResultReceiver() {
        super(1);
    }

    public final String getName() {
        return "showFullScreenLoading";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(CheckCaptureModule_GetICheckDeserializerRttiFactory.class);
    }

    public final String getSignature() {
        return "showFullScreenLoading()V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        CheckCaptureModule_GetICheckDeserializerRttiFactory checkCaptureModule_GetICheckDeserializerRttiFactory = (CheckCaptureModule_GetICheckDeserializerRttiFactory) obj;
        onGetStartedClick.write((Object) checkCaptureModule_GetICheckDeserializerRttiFactory, "p1");
        checkCaptureModule_GetICheckDeserializerRttiFactory.AlertController$RecycleListView();
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
