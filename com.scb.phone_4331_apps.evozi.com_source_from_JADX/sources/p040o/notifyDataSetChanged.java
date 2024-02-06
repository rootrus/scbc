package p040o;

import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.notifyDataSetChanged */
public final class notifyDataSetChanged implements OPRStatusRewardsLandingActivity_ViewBinding<tailSet> {
    private final HmlReviewDocumentActivity<zzha> IconCompatParcelizer;
    private final RepositoryModule write;

    private notifyDataSetChanged(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzha> hmlReviewDocumentActivity) {
        this.write = repositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static notifyDataSetChanged IconCompatParcelizer(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzha> hmlReviewDocumentActivity) {
        return new notifyDataSetChanged(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        tailSet MediaBrowserCompat$ItemReceiver = this.write.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.get());
        if (MediaBrowserCompat$ItemReceiver != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
