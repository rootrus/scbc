package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.HitBuilders;
import p040o.TaskRunner;

/* renamed from: o.setStrokeWidth */
public final class setStrokeWidth implements OPRStatusRewardsLandingActivity_ViewBinding<IIdExtractionResult> {
    private final HmlReviewDocumentActivity<setCurrencyCode> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<HitBuilders.TransactionBuilder> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<setTarget> MediaBrowserCompat$ItemReceiver;
    private final RepositoryModule MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<setRevenue> MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<String> RatingCompat;
    private final HmlReviewDocumentActivity<setTransactionId> read;
    private final HmlReviewDocumentActivity<TaskRunner.TaskCompletedListener.IconCompatParcelizer> write;

    private setStrokeWidth(RepositoryModule repositoryModule, HmlReviewDocumentActivity<TaskRunner.TaskCompletedListener.IconCompatParcelizer> hmlReviewDocumentActivity, HmlReviewDocumentActivity<HitBuilders.TransactionBuilder> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<setRevenue> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<setCurrencyCode> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<setTransactionId> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<setTarget> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity7) {
        this.MediaBrowserCompat$SearchResultReceiver = repositoryModule;
        this.write = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.MediaDescriptionCompat = hmlReviewDocumentActivity3;
        this.IconCompatParcelizer = hmlReviewDocumentActivity4;
        this.read = hmlReviewDocumentActivity5;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity6;
        this.RatingCompat = hmlReviewDocumentActivity7;
    }

    public static setStrokeWidth MediaBrowserCompat$ItemReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<TaskRunner.TaskCompletedListener.IconCompatParcelizer> hmlReviewDocumentActivity, HmlReviewDocumentActivity<HitBuilders.TransactionBuilder> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<setRevenue> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<setCurrencyCode> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<setTransactionId> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<setTarget> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity7) {
        return new setStrokeWidth(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7);
    }

    public final /* synthetic */ Object get() {
        IIdExtractionResult IconCompatParcelizer2 = this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaDescriptionCompat.get(), this.IconCompatParcelizer.get(), this.read.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.RatingCompat.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
