package p040o;

/* renamed from: o.requestScopes */
public final class requestScopes extends FragmentBuilder_BindSummaryFragment {
    public static GeofencingRequest read(isInverted isinverted) {
        String str;
        String str2;
        GeofencingRequest geofencingRequest = new GeofencingRequest();
        geofencingRequest.MediaSessionCompat$QueueItem = isinverted.MediaSessionCompat$QueueItem;
        geofencingRequest.f2714x50fd9e4a = isinverted.MediaDescriptionCompat;
        geofencingRequest.MediaSessionCompat$ResultReceiverWrapper = isinverted.f2876x50fd9e4a;
        geofencingRequest.ParcelableVolumeInfo = IconCompatParcelizer(Double.valueOf(isinverted.MediaDescriptionCompat));
        geofencingRequest.AlertController$RecycleListView = isinverted.ParcelableVolumeInfo;
        geofencingRequest.MediaSessionCompat$Token = isinverted.MediaSessionCompat$ResultReceiverWrapper;
        geofencingRequest.MediaBrowserCompat$ItemReceiver = isinverted.IconCompatParcelizer.IconCompatParcelizer();
        geofencingRequest.MediaBrowserCompat$CustomActionResultReceiver = isinverted.MediaBrowserCompat$CustomActionResultReceiver;
        geofencingRequest.IconCompatParcelizer = isinverted.write;
        String str3 = null;
        if (isinverted.IconCompatParcelizer != null) {
            str = isinverted.IconCompatParcelizer.write();
        } else {
            str = null;
        }
        geofencingRequest.MediaMetadataCompat = str;
        if (isinverted.read != null) {
            str3 = isinverted.read;
        }
        geofencingRequest.write = str3;
        geofencingRequest.MediaBrowserCompat$MediaItem = isinverted.RatingCompat;
        geofencingRequest.RatingCompat = isinverted.MediaMetadataCompat;
        geofencingRequest.read = isinverted.MediaBrowserCompat$ItemReceiver;
        if (isinverted.MediaBrowserCompat$MediaItem != null) {
            str2 = isinverted.MediaBrowserCompat$MediaItem;
        } else {
            str2 = "";
        }
        geofencingRequest.MediaBrowserCompat$SearchResultReceiver = str2;
        geofencingRequest.MediaDescriptionCompat = isinverted.MediaBrowserCompat$SearchResultReceiver;
        return geofencingRequest;
    }
}
