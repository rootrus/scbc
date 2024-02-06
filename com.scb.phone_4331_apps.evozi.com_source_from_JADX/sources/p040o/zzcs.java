package p040o;

import android.os.SystemClock;

/* renamed from: o.zzcs */
public final /* synthetic */ class zzcs implements DirectDebitDeepLinkActivity {
    public /* synthetic */ zzcs(setDefaultNotificationChannelId setdefaultnotificationchannelid) {
    }

    public final Object write(Object obj) {
        NetworkFetcher networkFetcher = (NetworkFetcher) obj;
        PlaceBuffer placeBuffer = new PlaceBuffer();
        placeBuffer.MediaBrowserCompat$ItemReceiver = SystemClock.elapsedRealtime();
        placeBuffer.read = networkFetcher.IconCompatParcelizer;
        placeBuffer.MediaBrowserCompat$MediaItem = networkFetcher.MediaMetadataCompat;
        placeBuffer.MediaDescriptionCompat = networkFetcher.MediaDescriptionCompat;
        placeBuffer.MediaBrowserCompat$SearchResultReceiver = networkFetcher.MediaBrowserCompat$MediaItem;
        return placeBuffer;
    }
}
