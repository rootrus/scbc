package p040o;

import p040o.QueueFileLogStore;

/* renamed from: o.columnComparator$MediaBrowserCompat$CustomActionResultReceiver */
final /* synthetic */ class columnComparator$MediaBrowserCompat$CustomActionResultReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<CameraUpdateFactory, QueueFileLogStore.LogBytes> {
    columnComparator$MediaBrowserCompat$CustomActionResultReceiver(columnComparator columncomparator) {
        super(1, columncomparator);
    }

    public final String getName() {
        return "transform";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(columnComparator.class);
    }

    public final String getSignature() {
        return "transform(Lcom/scb/phone/domain/entity/merchant/MerchantWalletSweepTransactionItem;)Lcom/scb/phone/presentation/model/display/merchant/MerchantWalletSweepTransactionItemDisplay;";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        return ((columnComparator) this.receiver).read((CameraUpdateFactory) obj);
    }
}
