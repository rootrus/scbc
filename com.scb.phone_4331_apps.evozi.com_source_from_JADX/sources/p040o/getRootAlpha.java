package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.AbstractMultimap;

/* renamed from: o.getRootAlpha */
public final class getRootAlpha implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMultimap.MultisetKeyIterator> {
    private final HmlReviewDocumentActivity<zzgj> IconCompatParcelizer;
    private final RepositoryModule write;

    private getRootAlpha(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzgj> hmlReviewDocumentActivity) {
        this.write = repositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static getRootAlpha MediaBrowserCompat$ItemReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzgj> hmlReviewDocumentActivity) {
        return new getRootAlpha(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        AbstractMultimap.MultisetKeyIterator read = this.write.read(this.IconCompatParcelizer.get());
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
