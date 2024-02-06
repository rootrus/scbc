package p040o;

import com.scb.phone.data.network.service.easycash.EasycashNcbConsentService;
import com.scb.phone.view.activity.investment.discover.BaseDiscoverFundFilterActivity;

/* renamed from: o.DataBufferIterator */
public final class DataBufferIterator implements OPRStatusRewardsLandingActivity_ViewBinding<BaseDiscoverFundFilterActivity.write> {
    private final HmlReviewDocumentActivity<EasycashNcbConsentService> IconCompatParcelizer;

    private DataBufferIterator(HmlReviewDocumentActivity<EasycashNcbConsentService> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static DataBufferIterator IconCompatParcelizer(HmlReviewDocumentActivity<EasycashNcbConsentService> hmlReviewDocumentActivity) {
        return new DataBufferIterator(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new BaseDiscoverFundFilterActivity.write(this.IconCompatParcelizer.get());
    }
}
