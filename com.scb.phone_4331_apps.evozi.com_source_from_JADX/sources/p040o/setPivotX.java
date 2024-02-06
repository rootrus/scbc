package p040o;

import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.setPivotX */
public final class setPivotX implements OPRStatusRewardsLandingActivity_ViewBinding<firstKey> {
    private final HmlReviewDocumentActivity<zzgt> MediaBrowserCompat$ItemReceiver;
    private final RepositoryModule write;

    private setPivotX(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzgt> hmlReviewDocumentActivity) {
        this.write = repositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static setPivotX read(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzgt> hmlReviewDocumentActivity) {
        return new setPivotX(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        firstKey IconCompatParcelizer = this.write.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.get());
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
