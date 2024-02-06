package p040o;

/* renamed from: o.getObject$MediaBrowserCompat$SearchResultReceiver */
public final /* synthetic */ class getObject$MediaBrowserCompat$SearchResultReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    public getObject$MediaBrowserCompat$SearchResultReceiver(getObject getobject) {
        super(1, getobject);
    }

    public final String getName() {
        return "onFaceStatusFail";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(getObject.class);
    }

    public final String getSignature() {
        return "onFaceStatusFail(Ljava/lang/Throwable;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "p1");
        getObject.write((getObject) this.receiver, th);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
