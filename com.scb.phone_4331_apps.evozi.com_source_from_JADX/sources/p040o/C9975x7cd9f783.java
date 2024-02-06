package p040o;

/* renamed from: o.getIsDocumentClassIndexFieldString$MediaBrowserCompat$CustomActionResultReceiver */
public final /* synthetic */ class C9975x7cd9f783 extends InvestmentFundDetailsActivity implements FundFactSheetActivity<getCompleteSessionFiles, HmlVerifyPhoneValidateOtpActivity> {
    public C9975x7cd9f783(getIsDocumentClassIndexFieldString getisdocumentclassindexfieldstring) {
        super(1, getisdocumentclassindexfieldstring);
    }

    public final String getName() {
        return "onInitiatePaymentSuccess";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(getIsDocumentClassIndexFieldString.class);
    }

    public final String getSignature() {
        return "onInitiatePaymentSuccess(Lcom/scb/phone/presentation/model/display/insurance/InitiatePaymentDisplay;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        getCompleteSessionFiles getcompletesessionfiles = (getCompleteSessionFiles) obj;
        onGetStartedClick.write((Object) getcompletesessionfiles, "p1");
        getIsDocumentClassIndexFieldString.MediaBrowserCompat$ItemReceiver((getIsDocumentClassIndexFieldString) this.receiver, getcompletesessionfiles);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
