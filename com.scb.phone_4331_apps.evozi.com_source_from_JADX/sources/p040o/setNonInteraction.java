package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.DeepLinkEntry;
import p040o.expireAfterAccess;

/* renamed from: o.setNonInteraction */
public final class setNonInteraction extends FragmentBuilder_BindSummaryFragment {
    public final onStreetViewPanoramaLongClick IconCompatParcelizer(DeepLinkEntry.Type type) {
        onStreetViewPanoramaLongClick write = onStreetViewPanoramaLongClick.write();
        write.MediaBrowserCompat$SearchResultReceiver = type.MediaMetadataCompat;
        setOnCameraMoveStartedListener setoncameramovestartedlistener = null;
        write.f5555x50fd9e4a = FragmentBuilder_BindSummaryFragment.write(type.RatingCompat, (OffsetDateTime) null);
        write.ParcelableVolumeInfo = type.f2541x50fd9e4a;
        write.MediaBrowserCompat$MediaItem = type.MediaSessionCompat$QueueItem;
        write.MediaBrowserCompat$CustomActionResultReceiver = type.MediaDescriptionCompat;
        boolean z = true;
        if (type.write == null || type.write.intValue() != 1) {
            z = false;
        }
        write.RatingCompat = z;
        write.MediaBrowserCompat$ItemReceiver = type.MediaBrowserCompat$ItemReceiver;
        write.MediaDescriptionCompat = type.MediaBrowserCompat$MediaItem;
        write.read = type.MediaBrowserCompat$CustomActionResultReceiver;
        write.MediaSessionCompat$Token = type.ParcelableVolumeInfo;
        write.MediaSessionCompat$ResultReceiverWrapper = type.MediaSessionCompat$ResultReceiverWrapper;
        write.MediaSessionCompat$QueueItem = type.MediaSessionCompat$Token;
        write.MediaMetadataCompat = type.MediaBrowserCompat$SearchResultReceiver;
        addPoints addpoints = type.read;
        if (addpoints != null) {
            setoncameramovestartedlistener = new setOnCameraMoveStartedListener(write(addpoints.MediaBrowserCompat$CustomActionResultReceiver, new expireAfterAccess.write(this)));
        }
        write.write = setoncameramovestartedlistener;
        return write;
    }
}
