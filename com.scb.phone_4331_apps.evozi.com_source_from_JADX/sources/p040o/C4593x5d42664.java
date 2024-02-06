package p040o;

/* renamed from: o.getIsDocumentClassIndexFieldString$MediaBrowserCompat$SearchResultReceiver */
public final /* synthetic */ class C4593x5d42664 extends InvestmentFundDetailsActivity implements FundFactSheetActivity<didPreviousInitializationFail, HmlVerifyPhoneValidateOtpActivity> {
    public C4593x5d42664(getIsDocumentClassIndexFieldString getisdocumentclassindexfieldstring) {
        super(1, getisdocumentclassindexfieldstring);
    }

    public final String getName() {
        return "onGetPortfolioSummarySuccess";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(getIsDocumentClassIndexFieldString.class);
    }

    public final String getSignature() {
        return "onGetPortfolioSummarySuccess(Lcom/scb/phone/presentation/model/display/insurance/PortfolioSummaryDisplay;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        didPreviousInitializationFail didpreviousinitializationfail = (didPreviousInitializationFail) obj;
        onGetStartedClick.write((Object) didpreviousinitializationfail, "p1");
        getIsDocumentClassIndexFieldString.MediaBrowserCompat$CustomActionResultReceiver((getIsDocumentClassIndexFieldString) this.receiver, didpreviousinitializationfail);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
