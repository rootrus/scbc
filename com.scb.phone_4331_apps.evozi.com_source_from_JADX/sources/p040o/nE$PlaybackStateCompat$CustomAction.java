package p040o;

/* renamed from: o.nE$PlaybackStateCompat$CustomAction */
public final /* synthetic */ class nE$PlaybackStateCompat$CustomAction extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    public nE$PlaybackStateCompat$CustomAction(C5000nE nEVar) {
        super(1, nEVar);
    }

    public final String getName() {
        return "onValidationFail";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(C5000nE.class);
    }

    public final String getSignature() {
        return "onValidationFail(Ljava/lang/Throwable;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "p1");
        C5000nE.MediaBrowserCompat$ItemReceiver((C5000nE) this.receiver, th);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
