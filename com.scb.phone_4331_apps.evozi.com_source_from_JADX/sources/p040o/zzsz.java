package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.Suppliers;

/* renamed from: o.zzsz */
public final class zzsz implements OPRStatusRewardsLandingActivity_ViewBinding<Suppliers.SupplierFunction> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<setCvv> MediaBrowserCompat$CustomActionResultReceiver;
    private final UseCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<C7514tY> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<C6548x820c5aab> MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<String> MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<newOnDeviceIdExtractor> read;
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> write;

    private zzsz(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7514tY> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C6548x820c5aab> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<setCvv> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<newOnDeviceIdExtractor> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity8) {
        this.MediaBrowserCompat$ItemReceiver = useCaseModule;
        this.MediaMetadataCompat = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity4;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity5;
        this.write = hmlReviewDocumentActivity6;
        this.read = hmlReviewDocumentActivity7;
        this.MediaDescriptionCompat = hmlReviewDocumentActivity8;
    }

    public static zzsz write(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7514tY> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C6548x820c5aab> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<setCvv> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<newOnDeviceIdExtractor> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity8) {
        return new zzsz(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
    }

    public final /* synthetic */ Object get() {
        Suppliers.SupplierFunction MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaMetadataCompat.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$MediaItem.get(), this.MediaBrowserCompat$SearchResultReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get(), this.read.get(), this.MediaDescriptionCompat.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
