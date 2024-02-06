package p040o;

import com.scb.phone.data.network.service.easycash.EasycashEligibilityService;
import com.scb.phone.data.p033di.easycash.EasycashEligibilityRepositoryModule;

/* renamed from: o.onMeasure */
public final class onMeasure implements OPRStatusRewardsLandingActivity_ViewBinding<subMap> {
    private final EasycashEligibilityRepositoryModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<EasycashEligibilityService> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<String> write;

    private onMeasure(EasycashEligibilityRepositoryModule easycashEligibilityRepositoryModule, HmlReviewDocumentActivity<EasycashEligibilityService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity2) {
        this.IconCompatParcelizer = easycashEligibilityRepositoryModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
    }

    public static onMeasure IconCompatParcelizer(EasycashEligibilityRepositoryModule easycashEligibilityRepositoryModule, HmlReviewDocumentActivity<EasycashEligibilityService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity2) {
        return new onMeasure(easycashEligibilityRepositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        subMap MediaBrowserCompat$CustomActionResultReceiver2 = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
