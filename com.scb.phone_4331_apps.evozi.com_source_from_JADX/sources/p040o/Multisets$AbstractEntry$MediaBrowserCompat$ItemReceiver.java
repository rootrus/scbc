package p040o;

import p040o.Multisets;

/* renamed from: o.Multisets$AbstractEntry$MediaBrowserCompat$ItemReceiver */
final /* synthetic */ class Multisets$AbstractEntry$MediaBrowserCompat$ItemReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<setCurrentScreen, padWithZerosToMaxIntWidth> {
    Multisets$AbstractEntry$MediaBrowserCompat$ItemReceiver(Multisets.AbstractEntry abstractEntry) {
        super(1, abstractEntry);
    }

    public final String getName() {
        return "transformSingleRepaymentOption";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(Multisets.AbstractEntry.class);
    }

    public final String getSignature() {
        return "transformSingleRepaymentOption(Lcom/scb/phone/domain/entity/easycash/offers/EasycashRepaymentOptions;)Lcom/scb/phone/presentation/model/display/easycash/landing/EasycashRepaymentOptionsDisplay;";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        return Multisets.AbstractEntry.write((setCurrentScreen) obj);
    }
}
