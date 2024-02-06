package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.AbstractMultimap;
import p040o.Suppliers;

/* renamed from: o.zzsw */
public final class zzsw implements OPRStatusRewardsLandingActivity_ViewBinding<Suppliers.ThreadSafeSupplier> {
    private final HmlReviewDocumentActivity<C6548x820c5aab> IconCompatParcelizer;
    private final UseCaseModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<C7514tY> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<AbstractMultimap.Entries> MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<keys> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzsw(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<keys> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C7514tY> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C6548x820c5aab> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<AbstractMultimap.Entries> hmlReviewDocumentActivity6) {
        this.MediaBrowserCompat$CustomActionResultReceiver = useCaseModule;
        this.MediaMetadataCompat = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity4;
        this.IconCompatParcelizer = hmlReviewDocumentActivity5;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity6;
    }

    public static zzsw IconCompatParcelizer(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<keys> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C7514tY> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C6548x820c5aab> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<AbstractMultimap.Entries> hmlReviewDocumentActivity6) {
        return new zzsw(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6);
    }

    public final /* synthetic */ Object get() {
        Suppliers.ThreadSafeSupplier MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.MediaMetadataCompat.get(), this.write.get(), this.read.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$SearchResultReceiver.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
