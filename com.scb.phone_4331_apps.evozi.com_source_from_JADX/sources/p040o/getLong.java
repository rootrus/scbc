package p040o;

import com.scb.phone.data.network.service.easycash.EasycashFeatureAccountService;
import com.scb.phone.view.activity.hml.businessowner.HmlNTBOperatingBankActivity;

/* renamed from: o.getLong */
public final class getLong implements OPRStatusRewardsLandingActivity_ViewBinding<HmlNTBOperatingBankActivity.write> {
    private final HmlReviewDocumentActivity<EasycashFeatureAccountService> MediaBrowserCompat$ItemReceiver;

    private getLong(HmlReviewDocumentActivity<EasycashFeatureAccountService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static getLong MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<EasycashFeatureAccountService> hmlReviewDocumentActivity) {
        return new getLong(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new HmlNTBOperatingBankActivity.write(this.MediaBrowserCompat$ItemReceiver.get());
    }
}
