package p040o;

/* renamed from: o.getEnvLanguage$MediaBrowserCompat$ItemReceiver */
public final /* synthetic */ class getEnvLanguage$MediaBrowserCompat$ItemReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<readElement, HmlVerifyPhoneValidateOtpActivity> {
    public getEnvLanguage$MediaBrowserCompat$ItemReceiver(getEnvLanguage getenvlanguage) {
        super(1, getenvlanguage);
    }

    public final String getName() {
        return "postAddressConfirmationSuccess";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(getEnvLanguage.class);
    }

    public final String getSignature() {
        return "postAddressConfirmationSuccess(Lcom/scb/phone/presentation/model/display/mailingaddress/MailingAddressConfirmationDisplay;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        readElement readelement = (readElement) obj;
        onGetStartedClick.write((Object) readelement, "p1");
        getEnvLanguage.MediaBrowserCompat$ItemReceiver((getEnvLanguage) this.receiver, readelement);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
