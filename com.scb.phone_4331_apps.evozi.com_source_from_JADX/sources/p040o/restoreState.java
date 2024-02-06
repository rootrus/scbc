package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.AbstractMultimap;

/* renamed from: o.restoreState */
public final class restoreState implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMultimap.WrappedCollection> {
    private final HmlReviewDocumentActivity<zzjy> MediaBrowserCompat$ItemReceiver;
    private final RepositoryModule read;

    private restoreState(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzjy> hmlReviewDocumentActivity) {
        this.read = repositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static restoreState read(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzjy> hmlReviewDocumentActivity) {
        return new restoreState(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        AbstractMultimap.WrappedCollection read2 = this.read.read(this.MediaBrowserCompat$ItemReceiver.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
