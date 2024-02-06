package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.AbstractMultimap;

/* renamed from: o.zzpb */
public final class zzpb implements OPRStatusRewardsLandingActivity_ViewBinding<StreetViewPanoramaOrientation> {
    private final HmlReviewDocumentActivity<inject_extractorProvider> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<OnDeviceIdExtractor> MediaBrowserCompat$CustomActionResultReceiver;
    private final UseCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<HmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<AbstractMultimap.EntryIterator> MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<AbstractMultimap.AsMap.AsMapIterator> MediaSessionCompat$ResultReceiverWrapper;
    private final HmlReviewDocumentActivity<findValueIteratorAndKey> ParcelableVolumeInfo;
    private final HmlReviewDocumentActivity<C6372x3d677cbb> RatingCompat;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<getRegionName> write;

    private zzpb(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C6372x3d677cbb> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<OnDeviceIdExtractor> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<AbstractMultimap.AsMap.AsMapIterator> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<findValueIteratorAndKey> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<AbstractMultimap.EntryIterator> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<inject_extractorProvider> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<HmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity10, HmlReviewDocumentActivity<getRegionName> hmlReviewDocumentActivity11) {
        this.MediaBrowserCompat$ItemReceiver = useCaseModule;
        this.MediaMetadataCompat = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.RatingCompat = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity4;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity5;
        this.MediaSessionCompat$ResultReceiverWrapper = hmlReviewDocumentActivity6;
        this.ParcelableVolumeInfo = hmlReviewDocumentActivity7;
        this.MediaDescriptionCompat = hmlReviewDocumentActivity8;
        this.IconCompatParcelizer = hmlReviewDocumentActivity9;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity10;
        this.write = hmlReviewDocumentActivity11;
    }

    public static zzpb write(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C6372x3d677cbb> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<OnDeviceIdExtractor> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<AbstractMultimap.AsMap.AsMapIterator> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<findValueIteratorAndKey> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<AbstractMultimap.EntryIterator> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<inject_extractorProvider> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<HmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity10, HmlReviewDocumentActivity<getRegionName> hmlReviewDocumentActivity11) {
        return new zzpb(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8, hmlReviewDocumentActivity9, hmlReviewDocumentActivity10, hmlReviewDocumentActivity11);
    }

    public final /* synthetic */ Object get() {
        StreetViewPanoramaOrientation read2 = this.MediaBrowserCompat$ItemReceiver.read(this.MediaMetadataCompat.get(), this.read.get(), this.RatingCompat.get(), this.MediaBrowserCompat$SearchResultReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaSessionCompat$ResultReceiverWrapper.get(), this.ParcelableVolumeInfo.get(), this.MediaDescriptionCompat.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$MediaItem.get(), this.write.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
