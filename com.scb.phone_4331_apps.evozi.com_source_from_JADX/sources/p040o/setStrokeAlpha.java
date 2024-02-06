package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import com.scb.phone.view.activity.hml.HmlBaseConsentActivity;
import p040o.AbstractMultimap;

/* renamed from: o.setStrokeAlpha */
public final class setStrokeAlpha implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMultimap.KeySet> {
    private final RepositoryModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<HmlBaseConsentActivity.read> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<setAccountName> read;

    private setStrokeAlpha(RepositoryModule repositoryModule, HmlReviewDocumentActivity<HmlBaseConsentActivity.read> hmlReviewDocumentActivity, HmlReviewDocumentActivity<setAccountName> hmlReviewDocumentActivity2) {
        this.IconCompatParcelizer = repositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
    }

    public static setStrokeAlpha MediaBrowserCompat$ItemReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<HmlBaseConsentActivity.read> hmlReviewDocumentActivity, HmlReviewDocumentActivity<setAccountName> hmlReviewDocumentActivity2) {
        return new setStrokeAlpha(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        AbstractMultimap.KeySet MediaBrowserCompat$ItemReceiver2 = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.get(), this.read.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
