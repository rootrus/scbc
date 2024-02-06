package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.AbstractMultimap;

/* renamed from: o.zzsv */
public final class zzsv implements OPRStatusRewardsLandingActivity_ViewBinding<getCausalChain> {
    private final UseCaseModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<keys> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<AbstractMultimap.Entries> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<C6548x820c5aab> read;
    private final HmlReviewDocumentActivity<C7514tY> write;

    private zzsv(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<keys> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C7514tY> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C6548x820c5aab> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<AbstractMultimap.Entries> hmlReviewDocumentActivity6) {
        this.IconCompatParcelizer = useCaseModule;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
        this.write = hmlReviewDocumentActivity4;
        this.read = hmlReviewDocumentActivity5;
        this.MediaMetadataCompat = hmlReviewDocumentActivity6;
    }

    public static zzsv read(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<keys> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C7514tY> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C6548x820c5aab> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<AbstractMultimap.Entries> hmlReviewDocumentActivity6) {
        return new zzsv(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6);
    }

    public final /* synthetic */ Object get() {
        getCausalChain MediaBrowserCompat$ItemReceiver2 = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.write.get(), this.read.get(), this.MediaMetadataCompat.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
