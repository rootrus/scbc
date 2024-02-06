package p040o;

import com.scb.phone.data.network.service.common.SlipPlatformService;
import com.scb.phone.data.p033di.RepositoryModule;
import p040o.AbstractMultimap;

/* renamed from: o.getScaleX */
public final class getScaleX implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMultimap.SortedAsMap> {
    private final HmlReviewDocumentActivity<SlipPlatformService> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<AccountChangeEventsResponse> MediaBrowserCompat$CustomActionResultReceiver;
    private final RepositoryModule read;

    private getScaleX(RepositoryModule repositoryModule, HmlReviewDocumentActivity<SlipPlatformService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<AccountChangeEventsResponse> hmlReviewDocumentActivity2) {
        this.read = repositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
    }

    public static getScaleX read(RepositoryModule repositoryModule, HmlReviewDocumentActivity<SlipPlatformService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<AccountChangeEventsResponse> hmlReviewDocumentActivity2) {
        return new getScaleX(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        AbstractMultimap.SortedAsMap IconCompatParcelizer2 = this.read.IconCompatParcelizer(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
