package p040o;

/* renamed from: o.nK$MediaSessionCompat$ResultReceiverWrapper */
public final /* synthetic */ class nK$MediaSessionCompat$ResultReceiverWrapper extends InvestmentFundDetailsActivity implements FundFactSheetActivity<tiltGesturesEnabled, HmlVerifyPhoneValidateOtpActivity> {
    public nK$MediaSessionCompat$ResultReceiverWrapper(C5010nK nKVar) {
        super(1, nKVar);
    }

    public final String getName() {
        return "onVerificationSuccess";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(C5010nK.class);
    }

    public final String getSignature() {
        return "onVerificationSuccess(Lcom/scb/phone/domain/entity/remittance/RemittanceVerificationResponse;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        tiltGesturesEnabled tiltgesturesenabled = (tiltGesturesEnabled) obj;
        onGetStartedClick.write((Object) tiltgesturesenabled, "p1");
        C5010nK.read((C5010nK) this.receiver, tiltgesturesenabled);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
