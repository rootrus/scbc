package p040o;

import android.os.SystemClock;

/* renamed from: o.zzeo */
public final /* synthetic */ class zzeo implements DirectDebitDeepLinkActivity {
    public /* synthetic */ zzeo(makeGooglePlayServicesAvailable makegoogleplayservicesavailable) {
    }

    public final Object write(Object obj) {
        writeTempCacheFile writetempcachefile = (writeTempCacheFile) obj;
        getCachedFile getcachedfile = writetempcachefile.MediaBrowserCompat$ItemReceiver;
        if (getcachedfile == null) {
            getcachedfile = writetempcachefile.MediaBrowserCompat$CustomActionResultReceiver;
        }
        PlaceBuffer placeBuffer = new PlaceBuffer();
        placeBuffer.MediaBrowserCompat$ItemReceiver = SystemClock.elapsedRealtime();
        placeBuffer.read = getcachedfile.MediaBrowserCompat$ItemReceiver;
        placeBuffer.MediaBrowserCompat$MediaItem = getcachedfile.write;
        placeBuffer.MediaDescriptionCompat = getcachedfile.read;
        placeBuffer.MediaBrowserCompat$SearchResultReceiver = getcachedfile.MediaBrowserCompat$CustomActionResultReceiver;
        return placeBuffer;
    }
}
