package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.setTvRemark;

/* renamed from: o.zzbr */
public final /* synthetic */ class zzbr implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ Tracker MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ zzbr(Tracker tracker) {
        this.MediaBrowserCompat$CustomActionResultReceiver = tracker;
    }

    public final Object write(Object obj) {
        Tracker tracker = this.MediaBrowserCompat$CustomActionResultReceiver;
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        pathSize pathsize = (pathSize) singleDataEntity.getData();
        setTvRemark.read read = new setTvRemark.read();
        read.RatingCompat = singleDataEntity.getStatus().MediaBrowserCompat$ItemReceiver();
        read.read = singleDataEntity.getStatus().write();
        read.IconCompatParcelizer = "9004".equalsIgnoreCase(singleDataEntity.getStatus().write());
        read.MediaBrowserCompat$CustomActionResultReceiver = singleDataEntity.getStatus().IconCompatParcelizer();
        read.MediaBrowserCompat$ItemReceiver = pathsize.write;
        read.MediaDescriptionCompat = pathsize.read;
        read.MediaMetadataCompat = pathsize.MediaBrowserCompat$CustomActionResultReceiver;
        read.write = pathsize.MediaBrowserCompat$ItemReceiver;
        String str = pathsize.MediaMetadataCompat;
        read.f3178x50fd9e4a = Double.valueOf(str != null ? Double.valueOf(str).doubleValue() : 0.0d);
        read.MediaSessionCompat$ResultReceiverWrapper = pathsize.MediaDescriptionCompat;
        read.ParcelableVolumeInfo = pathsize.MediaBrowserCompat$MediaItem;
        read.MediaBrowserCompat$MediaItem = tracker.MediaBrowserCompat$CustomActionResultReceiver(pathsize.IconCompatParcelizer);
        read.MediaBrowserCompat$SearchResultReceiver = tracker.MediaBrowserCompat$CustomActionResultReceiver(pathsize.MediaBrowserCompat$SearchResultReceiver);
        read.MediaSessionCompat$QueueItem = tracker.MediaBrowserCompat$CustomActionResultReceiver(pathsize.RatingCompat);
        return read;
    }
}
