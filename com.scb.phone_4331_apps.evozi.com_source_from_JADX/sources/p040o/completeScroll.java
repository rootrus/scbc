package p040o;

import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.completeScroll */
public final class completeScroll implements OPRStatusRewardsLandingActivity_ViewBinding<removeIfEmpty> {
    private final HmlReviewDocumentActivity<isPresent> MediaBrowserCompat$ItemReceiver;
    private final RepositoryModule write;

    private completeScroll(RepositoryModule repositoryModule, HmlReviewDocumentActivity<isPresent> hmlReviewDocumentActivity) {
        this.write = repositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static completeScroll MediaBrowserCompat$ItemReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<isPresent> hmlReviewDocumentActivity) {
        return new completeScroll(repositoryModule, hmlReviewDocumentActivity);
    }

    public static removeIfEmpty read(RepositoryModule repositoryModule, isPresent ispresent) {
        removeIfEmpty read = repositoryModule.read(ispresent);
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        removeIfEmpty read = this.write.read(this.MediaBrowserCompat$ItemReceiver.get());
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
