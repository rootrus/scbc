package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.getState */
public final /* synthetic */ class getState implements DirectDebitDeepLinkActivity {
    public /* synthetic */ getState(LifecycleCallback lifecycleCallback) {
    }

    public final Object write(Object obj) {
        zza zza = (zza) ((SingleDataEntity) obj).getData();
        setTiltGesturesEnabled write = setTiltGesturesEnabled.write();
        write.MediaBrowserCompat$CustomActionResultReceiver = zza.read;
        write.write = zza.MediaBrowserCompat$ItemReceiver;
        write.MediaDescriptionCompat = zza.IconCompatParcelizer;
        write.MediaBrowserCompat$SearchResultReceiver = zza.MediaDescriptionCompat;
        write.RatingCompat = zza.MediaMetadataCompat;
        write.MediaBrowserCompat$ItemReceiver = zza.MediaBrowserCompat$CustomActionResultReceiver;
        write.read = zza.write;
        write.MediaBrowserCompat$MediaItem = zza.RatingCompat;
        write.MediaMetadataCompat = zza.MediaBrowserCompat$SearchResultReceiver;
        return write;
    }
}
