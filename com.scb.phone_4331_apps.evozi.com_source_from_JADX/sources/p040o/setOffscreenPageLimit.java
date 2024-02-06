package p040o;

import com.scb.phone.data.network.service.search.SequentialSearchService;
import com.scb.phone.data.p033di.search.SequentialSearchRepositoryModule;

/* renamed from: o.setOffscreenPageLimit */
public final class setOffscreenPageLimit implements OPRStatusRewardsLandingActivity_ViewBinding<ByFunctionOrdering> {
    private final HmlReviewDocumentActivity<String> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<SequentialSearchService> read;
    private final SequentialSearchRepositoryModule write;

    private setOffscreenPageLimit(SequentialSearchRepositoryModule sequentialSearchRepositoryModule, HmlReviewDocumentActivity<SequentialSearchService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity2) {
        this.write = sequentialSearchRepositoryModule;
        this.read = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
    }

    public static setOffscreenPageLimit MediaBrowserCompat$CustomActionResultReceiver(SequentialSearchRepositoryModule sequentialSearchRepositoryModule, HmlReviewDocumentActivity<SequentialSearchService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity2) {
        return new setOffscreenPageLimit(sequentialSearchRepositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        ByFunctionOrdering read2 = this.write.read(this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
