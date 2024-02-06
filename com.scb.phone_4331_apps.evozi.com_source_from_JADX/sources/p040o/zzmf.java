package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.zzmf */
public final class zzmf implements OPRStatusRewardsLandingActivity_ViewBinding<icon> {
    private final UseCaseModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<LocalProjectProvider> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<findValueIteratorAndKey> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzmf(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<findValueIteratorAndKey> hmlReviewDocumentActivity4) {
        this.IconCompatParcelizer = useCaseModule;
        this.write = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
        this.read = hmlReviewDocumentActivity4;
    }

    public static zzmf IconCompatParcelizer(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<findValueIteratorAndKey> hmlReviewDocumentActivity4) {
        return new zzmf(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        icon MediaBrowserCompat$CustomActionResultReceiver2 = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.write.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.read.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
