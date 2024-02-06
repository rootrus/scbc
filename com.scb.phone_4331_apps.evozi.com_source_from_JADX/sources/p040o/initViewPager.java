package p040o;

import com.scb.phone.data.p033di.easycash.EasycashCommercialInfoRepositoryModule;
import com.scb.phone.view.activity.hml.businessowner.HmlNTBBusinessIndustrySelectionActivity;

/* renamed from: o.initViewPager */
public final class initViewPager implements OPRStatusRewardsLandingActivity_ViewBinding<tailMap> {
    private final HmlReviewDocumentActivity<HmlNTBBusinessIndustrySelectionActivity.IconCompatParcelizer> MediaBrowserCompat$CustomActionResultReceiver;
    private final EasycashCommercialInfoRepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<String> write;

    private initViewPager(EasycashCommercialInfoRepositoryModule easycashCommercialInfoRepositoryModule, HmlReviewDocumentActivity<HmlNTBBusinessIndustrySelectionActivity.IconCompatParcelizer> hmlReviewDocumentActivity, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity2) {
        this.MediaBrowserCompat$ItemReceiver = easycashCommercialInfoRepositoryModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
    }

    public static initViewPager write(EasycashCommercialInfoRepositoryModule easycashCommercialInfoRepositoryModule, HmlReviewDocumentActivity<HmlNTBBusinessIndustrySelectionActivity.IconCompatParcelizer> hmlReviewDocumentActivity, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity2) {
        return new initViewPager(easycashCommercialInfoRepositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        tailMap MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
