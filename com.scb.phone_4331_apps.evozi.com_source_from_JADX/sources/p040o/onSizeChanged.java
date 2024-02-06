package p040o;

import com.scb.phone.data.p033di.easycash.EasycashNcbRepositoryModule;
import com.scb.phone.view.activity.investment.discover.BaseDiscoverFundFilterActivity;

/* renamed from: o.onSizeChanged */
public final class onSizeChanged implements OPRStatusRewardsLandingActivity_ViewBinding<subSet> {
    private final HmlReviewDocumentActivity<BaseDiscoverFundFilterActivity.write> IconCompatParcelizer;
    private final EasycashNcbRepositoryModule MediaBrowserCompat$CustomActionResultReceiver;

    private onSizeChanged(EasycashNcbRepositoryModule easycashNcbRepositoryModule, HmlReviewDocumentActivity<BaseDiscoverFundFilterActivity.write> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = easycashNcbRepositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static onSizeChanged MediaBrowserCompat$ItemReceiver(EasycashNcbRepositoryModule easycashNcbRepositoryModule, HmlReviewDocumentActivity<BaseDiscoverFundFilterActivity.write> hmlReviewDocumentActivity) {
        return new onSizeChanged(easycashNcbRepositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        subSet MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.get());
        if (MediaBrowserCompat$ItemReceiver != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
