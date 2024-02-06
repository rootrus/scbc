package p040o;

import android.os.SystemClock;

/* renamed from: o.onAccountResolutionComplete */
public final /* synthetic */ class onAccountResolutionComplete implements DirectDebitDeepLinkActivity {
    public /* synthetic */ onAccountResolutionComplete(setDefaultNotificationChannelId setdefaultnotificationchannelid) {
    }

    public final Object write(Object obj) {
        NetworkFetcher networkFetcher = ((fetchSync) obj).write;
        PlaceBuffer placeBuffer = new PlaceBuffer();
        placeBuffer.MediaBrowserCompat$ItemReceiver = SystemClock.elapsedRealtime();
        placeBuffer.read = networkFetcher.IconCompatParcelizer;
        placeBuffer.write = networkFetcher.MediaBrowserCompat$CustomActionResultReceiver;
        placeBuffer.MediaBrowserCompat$MediaItem = networkFetcher.MediaMetadataCompat;
        placeBuffer.MediaDescriptionCompat = networkFetcher.MediaDescriptionCompat;
        placeBuffer.MediaBrowserCompat$SearchResultReceiver = networkFetcher.MediaBrowserCompat$MediaItem;
        placeBuffer.MediaMetadataCompat = networkFetcher.RatingCompat;
        placeBuffer.IconCompatParcelizer = networkFetcher.read;
        placeBuffer.RatingCompat = networkFetcher.MediaBrowserCompat$SearchResultReceiver;
        placeBuffer.MediaBrowserCompat$CustomActionResultReceiver = networkFetcher.write;
        return placeBuffer;
    }
}
