package p040o;

import com.scb.phone.data.network.service.PurchaseService;
import com.scb.phone.view.activity.deeplink.C5585x106633ac;

/* renamed from: o.zai */
public final class zai extends FragmentBuilder_BindSummaryFragment {

    /* renamed from: o.zai$zaa */
    public final class zaa implements OPRStatusRewardsLandingActivity_ViewBinding<C5585x106633ac> {
        private final HmlReviewDocumentActivity<PurchaseService> MediaBrowserCompat$ItemReceiver;

        private zaa(HmlReviewDocumentActivity<PurchaseService> hmlReviewDocumentActivity) {
            this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        }

        public static zaa read(HmlReviewDocumentActivity<PurchaseService> hmlReviewDocumentActivity) {
            return new zaa(hmlReviewDocumentActivity);
        }

        public final /* synthetic */ Object get() {
            return new C5585x106633ac(this.MediaBrowserCompat$ItemReceiver.get());
        }
    }

    public final fromIntent MediaBrowserCompat$ItemReceiver(getCapType getcaptype) {
        getCapType getcaptype2 = getcaptype;
        onGetStartedClick.write((Object) getcaptype2, "entity");
        return new fromIntent(getcaptype2.MediaBrowserCompat$SearchResultReceiver, getcaptype2.f2827x50fd9e4a, getcaptype2.MediaSessionCompat$QueueItem, getcaptype2.AppCompatDelegateImpl$ListMenuDecorView, getcaptype2.ParcelableVolumeInfo, IconCompatParcelizer(getcaptype2.MediaBrowserCompat$MediaItem), IconCompatParcelizer(getcaptype2.RatingCompat), getcaptype2.MediaSessionCompat$Token, getcaptype2.MediaBrowserCompat$CustomActionResultReceiver, getcaptype2.read, GeofencingClient.valueOf(getcaptype2.MediaSessionCompat$ResultReceiverWrapper), getcaptype2.PlaybackStateCompat$CustomAction, getcaptype2.setHasDecor, getcaptype2.MediaBrowserCompat$ItemReceiver, IconCompatParcelizer(getcaptype2.IconCompatParcelizer), getcaptype2.write, getcaptype2.Keep, getcaptype2.AlertController$RecycleListView, getcaptype2.PlaybackStateCompat, getcaptype2.MediaMetadataCompat, getcaptype2.MediaDescriptionCompat);
    }
}
