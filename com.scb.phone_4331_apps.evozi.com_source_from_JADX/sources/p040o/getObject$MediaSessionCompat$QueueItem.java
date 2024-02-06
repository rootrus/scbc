package p040o;

/* renamed from: o.getObject$MediaSessionCompat$QueueItem */
final /* synthetic */ class getObject$MediaSessionCompat$QueueItem extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    getObject$MediaSessionCompat$QueueItem(getObject getobject) {
        super(1, getobject);
    }

    public final String getName() {
        return "onVerifiedMethodFail";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(getObject.class);
    }

    public final String getSignature() {
        return "onVerifiedMethodFail(Ljava/lang/Throwable;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "p1");
        getObject.read((getObject) this.receiver, th);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
