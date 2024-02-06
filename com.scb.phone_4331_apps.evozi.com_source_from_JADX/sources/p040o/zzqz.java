package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.AbstractMultimap;
import p040o.AppMeasurementSdk;

/* renamed from: o.zzqz */
public final class zzqz implements OPRStatusRewardsLandingActivity_ViewBinding<AppMeasurementSdk.OnEventListener> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<C7515tZ> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<AbstractMultimap.MultisetEntry> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<findValueIteratorAndKey> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> read;
    private final UseCaseModule write;

    private zzqz(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.MultisetEntry> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C7515tZ> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<findValueIteratorAndKey> hmlReviewDocumentActivity6) {
        this.write = useCaseModule;
        this.MediaMetadataCompat = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity4;
        this.read = hmlReviewDocumentActivity5;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity6;
    }

    public static zzqz MediaBrowserCompat$ItemReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.MultisetEntry> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C7515tZ> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<findValueIteratorAndKey> hmlReviewDocumentActivity6) {
        return new zzqz(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6);
    }

    public final /* synthetic */ Object get() {
        AppMeasurementSdk.OnEventListener MediaBrowserCompat$ItemReceiver2 = this.write.MediaBrowserCompat$ItemReceiver(this.MediaMetadataCompat.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.read.get(), this.MediaBrowserCompat$MediaItem.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
