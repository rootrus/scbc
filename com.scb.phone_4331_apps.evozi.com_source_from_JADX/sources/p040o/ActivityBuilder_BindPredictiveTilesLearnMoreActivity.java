package p040o;

import com.scb.phone.view.fragment.investment.purchase.FundPurchaseLandingFragment;

/* renamed from: o.ActivityBuilder_BindPredictiveTilesLearnMoreActivity */
public final /* synthetic */ class ActivityBuilder_BindPredictiveTilesLearnMoreActivity implements Runnable {
    private final /* synthetic */ FundPurchaseLandingFragment write;

    public /* synthetic */ ActivityBuilder_BindPredictiveTilesLearnMoreActivity(FundPurchaseLandingFragment fundPurchaseLandingFragment) {
        this.write = fundPurchaseLandingFragment;
    }

    public final void run() {
        this.write.clientNoLayout.requestFocus();
    }
}
