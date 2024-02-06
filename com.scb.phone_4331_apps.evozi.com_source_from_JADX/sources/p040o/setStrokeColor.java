package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.C4093bd;
import p040o.Logger;

/* renamed from: o.setStrokeColor */
public final class setStrokeColor implements OPRStatusRewardsLandingActivity_ViewBinding<onBackImageProcessed> {
    private final HmlReviewDocumentActivity<warn> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<C4093bd.write> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<StandardExceptionParser> MediaBrowserCompat$ItemReceiver;
    private final RepositoryModule MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<Tracker> RatingCompat;
    private final HmlReviewDocumentActivity<Logger.LogLevel> read;
    private final HmlReviewDocumentActivity<setTax> write;

    private setStrokeColor(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C4093bd.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Logger.LogLevel> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<warn> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<Tracker> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<setTax> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<StandardExceptionParser> hmlReviewDocumentActivity6) {
        this.MediaDescriptionCompat = repositoryModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
        this.RatingCompat = hmlReviewDocumentActivity4;
        this.write = hmlReviewDocumentActivity5;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity6;
    }

    public static setStrokeColor write(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C4093bd.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Logger.LogLevel> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<warn> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<Tracker> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<setTax> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<StandardExceptionParser> hmlReviewDocumentActivity6) {
        return new setStrokeColor(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6);
    }

    public final /* synthetic */ Object get() {
        onBackImageProcessed IconCompatParcelizer2 = this.MediaDescriptionCompat.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.read.get(), this.IconCompatParcelizer.get(), this.RatingCompat.get(), this.write.get(), this.MediaBrowserCompat$ItemReceiver.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
