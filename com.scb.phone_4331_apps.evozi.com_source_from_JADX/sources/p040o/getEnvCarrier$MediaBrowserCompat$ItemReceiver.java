package p040o;

/* renamed from: o.getEnvCarrier$MediaBrowserCompat$ItemReceiver */
public final /* synthetic */ class getEnvCarrier$MediaBrowserCompat$ItemReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<readElement, HmlVerifyPhoneValidateOtpActivity> {
    public getEnvCarrier$MediaBrowserCompat$ItemReceiver(getEnvCarrier getenvcarrier) {
        super(1, getenvcarrier);
    }

    public final String getName() {
        return "postAddressConfirmationSuccess";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(getEnvCarrier.class);
    }

    public final String getSignature() {
        return "postAddressConfirmationSuccess(Lcom/scb/phone/presentation/model/display/mailingaddress/MailingAddressConfirmationDisplay;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        readElement readelement = (readElement) obj;
        onGetStartedClick.write((Object) readelement, "p1");
        getEnvCarrier.MediaBrowserCompat$ItemReceiver((getEnvCarrier) this.receiver, readelement);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
