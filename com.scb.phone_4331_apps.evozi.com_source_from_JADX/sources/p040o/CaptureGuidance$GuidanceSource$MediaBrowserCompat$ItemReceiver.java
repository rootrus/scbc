package p040o;

import p040o.CaptureGuidance;

/* renamed from: o.CaptureGuidance$GuidanceSource$MediaBrowserCompat$ItemReceiver */
public final /* synthetic */ class CaptureGuidance$GuidanceSource$MediaBrowserCompat$ItemReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<createFromAttributes, HmlVerifyPhoneValidateOtpActivity> {
    public CaptureGuidance$GuidanceSource$MediaBrowserCompat$ItemReceiver(CaptureGuidance.GuidanceSource guidanceSource) {
        super(1, guidanceSource);
    }

    public final String getName() {
        return "onPurchasePaymentIdLoaded";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(CaptureGuidance.GuidanceSource.class);
    }

    public final String getSignature() {
        return "onPurchasePaymentIdLoaded(Lcom/scb/phone/domain/entity/purchase/PurchaseSourceOfFund;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        createFromAttributes createfromattributes = (createFromAttributes) obj;
        onGetStartedClick.write((Object) createfromattributes, "p1");
        CaptureGuidance.GuidanceSource.read((CaptureGuidance.GuidanceSource) this.receiver, createfromattributes);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
