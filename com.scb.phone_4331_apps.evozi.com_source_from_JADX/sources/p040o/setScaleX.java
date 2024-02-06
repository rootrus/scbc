package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import com.scb.phone.view.fragment.easycash.EasycashBaseReviewFragment$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.setScaleX */
public final class setScaleX implements OPRStatusRewardsLandingActivity_ViewBinding<getBundleVersion> {
    private final HmlReviewDocumentActivity<EasycashBaseReviewFragment$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$ItemReceiver;
    private final RepositoryModule write;

    private setScaleX(RepositoryModule repositoryModule, HmlReviewDocumentActivity<EasycashBaseReviewFragment$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity) {
        this.write = repositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static setScaleX MediaBrowserCompat$ItemReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<EasycashBaseReviewFragment$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity) {
        return new setScaleX(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        getBundleVersion IconCompatParcelizer = this.write.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.get());
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
