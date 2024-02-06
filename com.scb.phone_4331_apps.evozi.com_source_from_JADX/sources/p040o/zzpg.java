package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.zzpg */
public final class zzpg implements OPRStatusRewardsLandingActivity_ViewBinding<VisibleRegion> {
    private final UseCaseModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<findValueIteratorAndKey> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<LocalProjectProvider> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzpg(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<findValueIteratorAndKey> hmlReviewDocumentActivity5) {
        this.IconCompatParcelizer = useCaseModule;
        this.write = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity4;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity5;
    }

    public static zzpg IconCompatParcelizer(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<findValueIteratorAndKey> hmlReviewDocumentActivity5) {
        return new zzpg(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final /* synthetic */ Object get() {
        VisibleRegion IconCompatParcelizer2 = this.IconCompatParcelizer.IconCompatParcelizer(this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.read.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$MediaItem.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
