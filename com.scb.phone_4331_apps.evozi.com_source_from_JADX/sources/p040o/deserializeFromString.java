package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.ActivityBuilder_ContributeECouponRedemptionDetailActivity;

/* renamed from: o.deserializeFromString */
public final /* synthetic */ class deserializeFromString implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ ActivityBuilder_ContributeECouponRedemptionDetailActivity.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ deserializeFromString(ActivityBuilder_ContributeECouponRedemptionDetailActivity.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public final Object write(Object obj) {
        GreedyContent greedyContent = (GreedyContent) ((SingleDataEntity) obj).getData();
        setStreetNamesEnabled setstreetnamesenabled = new setStreetNamesEnabled();
        setstreetnamesenabled.f5560x50fd9e4a = greedyContent.ParcelableVolumeInfo;
        setstreetnamesenabled.MediaSessionCompat$QueueItem = greedyContent.MediaSessionCompat$Token;
        setstreetnamesenabled.MediaSessionCompat$ResultReceiverWrapper = greedyContent.MediaSessionCompat$ResultReceiverWrapper;
        setstreetnamesenabled.MediaSessionCompat$Token = greedyContent.MediaSessionCompat$QueueItem;
        setstreetnamesenabled.PlaybackStateCompat = greedyContent.PlaybackStateCompat$CustomAction;
        setstreetnamesenabled.AlertController$RecycleListView = greedyContent.AlertController$RecycleListView;
        setstreetnamesenabled.MediaBrowserCompat$ItemReceiver = greedyContent.IconCompatParcelizer;
        setstreetnamesenabled.write = greedyContent.MediaBrowserCompat$CustomActionResultReceiver;
        setstreetnamesenabled.IconCompatParcelizer = greedyContent.write;
        setstreetnamesenabled.read = greedyContent.MediaBrowserCompat$ItemReceiver;
        setstreetnamesenabled.MediaBrowserCompat$CustomActionResultReceiver = greedyContent.read;
        setstreetnamesenabled.MediaDescriptionCompat = greedyContent.MediaBrowserCompat$SearchResultReceiver;
        setstreetnamesenabled.MediaBrowserCompat$SearchResultReceiver = greedyContent.RatingCompat;
        setstreetnamesenabled.MediaBrowserCompat$MediaItem = greedyContent.MediaMetadataCompat;
        setstreetnamesenabled.MediaMetadataCompat = greedyContent.MediaBrowserCompat$MediaItem;
        setstreetnamesenabled.RatingCompat = greedyContent.MediaDescriptionCompat;
        setstreetnamesenabled.ParcelableVolumeInfo = greedyContent.f5513x50fd9e4a;
        setstreetnamesenabled.Keep = greedyContent.setHasDecor;
        setstreetnamesenabled.setHasDecor = greedyContent.Keep;
        return setstreetnamesenabled;
    }
}
