package p040o;

import com.scb.phone.data.network.service.InvestmentService;
import com.scb.phone.data.network.service.MutualFundsService;
import com.scb.phone.data.p033di.DataModule;
import p040o.C4997nB;

/* renamed from: o.setAnimationListener */
public final class setAnimationListener implements OPRStatusRewardsLandingActivity_ViewBinding<C4997nB.read> {
    private final DataModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<MutualFundsService> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<InvestmentService> read;

    private setAnimationListener(DataModule dataModule, HmlReviewDocumentActivity<MutualFundsService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<InvestmentService> hmlReviewDocumentActivity2) {
        this.IconCompatParcelizer = dataModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
    }

    public static setAnimationListener MediaBrowserCompat$ItemReceiver(DataModule dataModule, HmlReviewDocumentActivity<MutualFundsService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<InvestmentService> hmlReviewDocumentActivity2) {
        return new setAnimationListener(dataModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        C4997nB.read MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.read.get());
        if (MediaBrowserCompat$ItemReceiver != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
