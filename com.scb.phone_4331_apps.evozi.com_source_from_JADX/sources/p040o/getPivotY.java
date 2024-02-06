package p040o;

import com.scb.phone.data.network.service.csent.CSentService;
import com.scb.phone.data.p033di.RepositoryModule;
import p040o.AbstractMultimap;

/* renamed from: o.getPivotY */
public final class getPivotY implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMultimap.RandomAccessWrappedList> {
    private final HmlReviewDocumentActivity<CSentService> read;
    private final RepositoryModule write;

    private getPivotY(RepositoryModule repositoryModule, HmlReviewDocumentActivity<CSentService> hmlReviewDocumentActivity) {
        this.write = repositoryModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static getPivotY read(RepositoryModule repositoryModule, HmlReviewDocumentActivity<CSentService> hmlReviewDocumentActivity) {
        return new getPivotY(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        AbstractMultimap.RandomAccessWrappedList MediaBrowserCompat$ItemReceiver = this.write.MediaBrowserCompat$ItemReceiver(this.read.get());
        if (MediaBrowserCompat$ItemReceiver != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
