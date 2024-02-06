package p040o;

import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.getTrimPathEnd */
public final class getTrimPathEnd implements OPRStatusRewardsLandingActivity_ViewBinding<classification> {
    private final RepositoryModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zzga> write;

    private getTrimPathEnd(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzga> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = repositoryModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static getTrimPathEnd MediaBrowserCompat$ItemReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzga> hmlReviewDocumentActivity) {
        return new getTrimPathEnd(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        classification MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.write.get());
        if (MediaBrowserCompat$ItemReceiver != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
