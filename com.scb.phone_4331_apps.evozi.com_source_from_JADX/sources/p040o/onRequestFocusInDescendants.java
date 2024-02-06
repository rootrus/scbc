package p040o;

import com.scb.phone.data.p033di.easycash.EasycashMHMCDetailRepositoryModule;
import com.scb.phone.view.activity.investment.discover.BaseDiscoverDisclaimerActivity;
import p040o.AbstractMultimap;

/* renamed from: o.onRequestFocusInDescendants */
public final class onRequestFocusInDescendants implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMultimap.Values> {
    private final HmlReviewDocumentActivity<BaseDiscoverDisclaimerActivity.write> MediaBrowserCompat$ItemReceiver;
    private final EasycashMHMCDetailRepositoryModule read;
    private final HmlReviewDocumentActivity<String> write;

    private onRequestFocusInDescendants(EasycashMHMCDetailRepositoryModule easycashMHMCDetailRepositoryModule, HmlReviewDocumentActivity<BaseDiscoverDisclaimerActivity.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity2) {
        this.read = easycashMHMCDetailRepositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
    }

    public static onRequestFocusInDescendants MediaBrowserCompat$ItemReceiver(EasycashMHMCDetailRepositoryModule easycashMHMCDetailRepositoryModule, HmlReviewDocumentActivity<BaseDiscoverDisclaimerActivity.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity2) {
        return new onRequestFocusInDescendants(easycashMHMCDetailRepositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        AbstractMultimap.Values MediaBrowserCompat$CustomActionResultReceiver = this.read.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.get(), this.write.get());
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
