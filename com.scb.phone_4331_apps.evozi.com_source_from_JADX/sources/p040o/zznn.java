package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.zznn */
public final class zznn implements OPRStatusRewardsLandingActivity_ViewBinding<setTimestampMillis> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final UseCaseModule write;

    private zznn(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity3) {
        this.write = useCaseModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
    }

    public static zznn read(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity3) {
        return new zznn(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        setTimestampMillis MediaBrowserCompat$MediaItem = this.write.MediaBrowserCompat$MediaItem(this.IconCompatParcelizer.get(), this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (MediaBrowserCompat$MediaItem != null) {
            return MediaBrowserCompat$MediaItem;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
