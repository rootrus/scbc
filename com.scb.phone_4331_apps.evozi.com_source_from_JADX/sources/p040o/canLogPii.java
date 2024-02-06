package p040o;

import com.scb.phone.data.network.p034di.easycash.EasycashServiceModule;
import com.scb.phone.data.network.service.search.SequentialSearchService;

/* renamed from: o.canLogPii */
public final class canLogPii implements OPRStatusRewardsLandingActivity_ViewBinding<SequentialSearchService> {
    private final HmlReviewDocumentActivity<zaaa> IconCompatParcelizer;
    private final EasycashServiceModule MediaBrowserCompat$CustomActionResultReceiver;

    private canLogPii(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = easycashServiceModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static canLogPii IconCompatParcelizer(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new canLogPii(easycashServiceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        SequentialSearchService MediaSessionCompat$ResultReceiverWrapper = this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper(this.IconCompatParcelizer.get());
        if (MediaSessionCompat$ResultReceiverWrapper != null) {
            return MediaSessionCompat$ResultReceiverWrapper;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
