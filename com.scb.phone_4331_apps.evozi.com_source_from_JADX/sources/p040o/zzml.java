package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.zzml */
public final class zzml implements OPRStatusRewardsLandingActivity_ViewBinding<snippet> {
    private final UseCaseModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<setCvv> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<C10887sdkVersion> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<keys> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzml(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C10887sdkVersion> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<setCvv> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<keys> hmlReviewDocumentActivity6) {
        this.IconCompatParcelizer = useCaseModule;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity4;
        this.read = hmlReviewDocumentActivity5;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity6;
    }

    public static zzml MediaBrowserCompat$CustomActionResultReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C10887sdkVersion> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<setCvv> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<keys> hmlReviewDocumentActivity6) {
        return new zzml(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6);
    }

    public final /* synthetic */ Object get() {
        snippet MediaBrowserCompat$ItemReceiver2 = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$SearchResultReceiver.get(), this.write.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.read.get(), this.MediaBrowserCompat$MediaItem.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
