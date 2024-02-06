package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.AbstractMultimap;

/* renamed from: o.infoForAnyChild */
public final class infoForAnyChild implements OPRStatusRewardsLandingActivity_ViewBinding<findValueIteratorAndKey> {
    private final RepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<AbstractMultimap.write> write;

    private infoForAnyChild(RepositoryModule repositoryModule, HmlReviewDocumentActivity<AbstractMultimap.write> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = repositoryModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static infoForAnyChild MediaBrowserCompat$ItemReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<AbstractMultimap.write> hmlReviewDocumentActivity) {
        return new infoForAnyChild(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        findValueIteratorAndKey write2 = this.MediaBrowserCompat$ItemReceiver.write(this.write.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
