package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import com.scb.phone.view.fragment.hml.C5985x82597580;
import p040o.LocalProjectProvider;

/* renamed from: o.setRootAlpha */
public final class setRootAlpha implements OPRStatusRewardsLandingActivity_ViewBinding<LocalProjectProvider.C69353> {
    private final RepositoryModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<C5985x82597580> MediaBrowserCompat$ItemReceiver;

    private setRootAlpha(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C5985x82597580> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = repositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static setRootAlpha read(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C5985x82597580> hmlReviewDocumentActivity) {
        return new setRootAlpha(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        LocalProjectProvider.C69353 IconCompatParcelizer2 = this.IconCompatParcelizer.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
