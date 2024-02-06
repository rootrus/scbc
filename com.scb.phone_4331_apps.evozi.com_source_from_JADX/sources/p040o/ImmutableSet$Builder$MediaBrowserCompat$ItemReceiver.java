package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.ImmutableSet$Builder$MediaBrowserCompat$ItemReceiver */
public final class ImmutableSet$Builder$MediaBrowserCompat$ItemReceiver implements findFragmentByWho {
    private final /* synthetic */ Tracker MediaBrowserCompat$CustomActionResultReceiver;

    private ImmutableSet$Builder$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ ImmutableSet$Builder$MediaBrowserCompat$ItemReceiver(Tracker tracker) {
        this.MediaBrowserCompat$CustomActionResultReceiver = tracker;
    }

    public final Object IconCompatParcelizer(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        zzxp MediaBrowserCompat$CustomActionResultReceiver2 = zzxp.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver2.RatingCompat = singleDataEntity.getStatus().write();
        MediaBrowserCompat$CustomActionResultReceiver2.MediaMetadataCompat = singleDataEntity.getStatus().IconCompatParcelizer();
        MediaBrowserCompat$CustomActionResultReceiver2.PlaybackStateCompat = ((password) singleDataEntity.getData()).ParcelableVolumeInfo;
        MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver = ((password) singleDataEntity.getData()).read;
        MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$QueueItem = ((password) singleDataEntity.getData()).MediaSessionCompat$Token;
        MediaBrowserCompat$CustomActionResultReceiver2.ParcelableVolumeInfo = ((password) singleDataEntity.getData()).MediaSessionCompat$ResultReceiverWrapper;
        MediaBrowserCompat$CustomActionResultReceiver2.write = ((password) singleDataEntity.getData()).MediaBrowserCompat$CustomActionResultReceiver;
        MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver = ((password) singleDataEntity.getData()).IconCompatParcelizer;
        MediaBrowserCompat$CustomActionResultReceiver2.read = ((password) singleDataEntity.getData()).write;
        MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$MediaItem = ((password) singleDataEntity.getData()).MediaMetadataCompat;
        MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$SearchResultReceiver = ((password) singleDataEntity.getData()).MediaBrowserCompat$SearchResultReceiver;
        MediaBrowserCompat$CustomActionResultReceiver2.f3007x50fd9e4a = ((password) singleDataEntity.getData()).RatingCompat;
        MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$Token = ((password) singleDataEntity.getData()).MediaDescriptionCompat;
        MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$ResultReceiverWrapper = ((password) singleDataEntity.getData()).f2614x50fd9e4a;
        return MediaBrowserCompat$CustomActionResultReceiver2;
    }
}
