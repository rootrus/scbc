package p040o;

/* renamed from: o.isTargetRectangleFilled$MediaBrowserCompat$CustomActionResultReceiver */
public final /* synthetic */ class C4831x9c0e34e3 extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    public C4831x9c0e34e3(isTargetRectangleFilled istargetrectanglefilled) {
        super(1, istargetrectanglefilled);
    }

    public final String getName() {
        return "onLoadFail";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(isTargetRectangleFilled.class);
    }

    public final String getSignature() {
        return "onLoadFail(Ljava/lang/Throwable;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "p1");
        isTargetRectangleFilled.read((isTargetRectangleFilled) this.receiver, th);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
