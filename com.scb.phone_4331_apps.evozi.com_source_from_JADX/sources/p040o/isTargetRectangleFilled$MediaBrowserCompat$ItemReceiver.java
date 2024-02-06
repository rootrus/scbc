package p040o;

/* renamed from: o.isTargetRectangleFilled$MediaBrowserCompat$ItemReceiver */
public final /* synthetic */ class isTargetRectangleFilled$MediaBrowserCompat$ItemReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<zOrderOnTop, HmlVerifyPhoneValidateOtpActivity> {
    public isTargetRectangleFilled$MediaBrowserCompat$ItemReceiver(isTargetRectangleFilled istargetrectanglefilled) {
        super(1, istargetrectanglefilled);
    }

    public final String getName() {
        return "onLoadSuccess";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(isTargetRectangleFilled.class);
    }

    public final String getSignature() {
        return "onLoadSuccess(Lcom/scb/phone/domain/entity/remittance/RemittanceRetryResponse;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        zOrderOnTop zorderontop = (zOrderOnTop) obj;
        onGetStartedClick.write((Object) zorderontop, "p1");
        isTargetRectangleFilled.MediaBrowserCompat$CustomActionResultReceiver((isTargetRectangleFilled) this.receiver, zorderontop);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
