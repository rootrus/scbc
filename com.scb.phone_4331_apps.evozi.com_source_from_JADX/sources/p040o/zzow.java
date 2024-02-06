package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.AbstractMultimap;
import p040o.ServerProjectProvider;
import p040o.StreetViewPanoramaOrientation;

/* renamed from: o.zzow */
public final class zzow implements OPRStatusRewardsLandingActivity_ViewBinding<StreetViewPanoramaOrientation.Builder> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final UseCaseModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<ServerProjectProvider.C70673> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<AbstractMultimap.EntrySet> MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<findValueIteratorAndKey> MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<getFrontException> read;
    private final HmlReviewDocumentActivity<LocalProjectProvider> write;

    private zzow(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<findValueIteratorAndKey> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<ServerProjectProvider.C70673> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<LocalProjectProvider> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<AbstractMultimap.EntrySet> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<getFrontException> hmlReviewDocumentActivity8) {
        this.MediaBrowserCompat$CustomActionResultReceiver = useCaseModule;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.MediaDescriptionCompat = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity4;
        this.write = hmlReviewDocumentActivity5;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity6;
        this.MediaMetadataCompat = hmlReviewDocumentActivity7;
        this.read = hmlReviewDocumentActivity8;
    }

    public static zzow MediaBrowserCompat$ItemReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<findValueIteratorAndKey> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<ServerProjectProvider.C70673> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<LocalProjectProvider> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<AbstractMultimap.EntrySet> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<getFrontException> hmlReviewDocumentActivity8) {
        return new zzow(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
    }

    public final /* synthetic */ Object get() {
        StreetViewPanoramaOrientation.Builder write2 = this.MediaBrowserCompat$CustomActionResultReceiver.write(this.MediaBrowserCompat$MediaItem.get(), this.IconCompatParcelizer.get(), this.MediaDescriptionCompat.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.write.get(), this.MediaBrowserCompat$SearchResultReceiver.get(), this.MediaMetadataCompat.get(), this.read.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
