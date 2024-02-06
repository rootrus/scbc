package p040o;

/* renamed from: o.dD$MediaBrowserCompat$ItemReceiver */
public final /* synthetic */ class dD$MediaBrowserCompat$ItemReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    public dD$MediaBrowserCompat$ItemReceiver(C4235dD dDVar) {
        super(1, dDVar);
    }

    public final String getName() {
        return "showGenericError";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(C4235dD.class);
    }

    public final String getSignature() {
        return "showGenericError(Ljava/lang/Throwable;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        ((C4235dD) this.receiver).MediaDescriptionCompat((Throwable) obj);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
