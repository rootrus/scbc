package p040o;

import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.getPivotX */
public final class getPivotX implements OPRStatusRewardsLandingActivity_ViewBinding<onFrontImageProcessed> {
    private final HmlReviewDocumentActivity<zzk> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<getCause> MediaBrowserCompat$CustomActionResultReceiver;
    private final RepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<String> RatingCompat;
    private final HmlReviewDocumentActivity<dq$MediaBrowserCompat$ItemReceiver> read;
    private final HmlReviewDocumentActivity<zzh> write;

    private getPivotX(RepositoryModule repositoryModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<dq$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<zzk> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<zzh> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getCause> hmlReviewDocumentActivity5) {
        this.MediaBrowserCompat$ItemReceiver = repositoryModule;
        this.RatingCompat = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
        this.write = hmlReviewDocumentActivity4;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity5;
    }

    public static getPivotX IconCompatParcelizer(RepositoryModule repositoryModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<dq$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<zzk> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<zzh> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getCause> hmlReviewDocumentActivity5) {
        return new getPivotX(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final /* synthetic */ Object get() {
        onFrontImageProcessed MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat.get(), this.read.get(), this.IconCompatParcelizer.get(), this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
