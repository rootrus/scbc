package p040o;

import com.scb.phone.data.network.service.easycash.EasycashMHMCDetailService;
import com.scb.phone.view.activity.investment.discover.BaseDiscoverDisclaimerActivity;

/* renamed from: o.AbstractDataBuffer */
public final class AbstractDataBuffer implements OPRStatusRewardsLandingActivity_ViewBinding<BaseDiscoverDisclaimerActivity.write> {
    private final HmlReviewDocumentActivity<EasycashMHMCDetailService> MediaBrowserCompat$ItemReceiver;

    private AbstractDataBuffer(HmlReviewDocumentActivity<EasycashMHMCDetailService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static AbstractDataBuffer MediaBrowserCompat$ItemReceiver(HmlReviewDocumentActivity<EasycashMHMCDetailService> hmlReviewDocumentActivity) {
        return new AbstractDataBuffer(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new BaseDiscoverDisclaimerActivity.write(this.MediaBrowserCompat$ItemReceiver.get());
    }
}
