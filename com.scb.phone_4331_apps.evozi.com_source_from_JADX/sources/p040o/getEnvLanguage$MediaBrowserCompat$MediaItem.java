package p040o;

/* renamed from: o.getEnvLanguage$MediaBrowserCompat$MediaItem */
public final /* synthetic */ class getEnvLanguage$MediaBrowserCompat$MediaItem extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    public getEnvLanguage$MediaBrowserCompat$MediaItem(getEnvLanguage getenvlanguage) {
        super(1, getenvlanguage);
    }

    public final String getName() {
        return "getAddressConfirmationError";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(getEnvLanguage.class);
    }

    public final String getSignature() {
        return "getAddressConfirmationError(Ljava/lang/Throwable;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "p1");
        getEnvLanguage.read((getEnvLanguage) this.receiver, th);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
