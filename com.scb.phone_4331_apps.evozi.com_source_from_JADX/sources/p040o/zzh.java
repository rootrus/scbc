package p040o;

import okhttp3.internal.cache.DiskLruCache;

/* renamed from: o.zzh */
public final class zzh extends RegistrationMethods {
    public static setAllGesturesEnabled write(port port) {
        if (port == null) {
            return null;
        }
        setAllGesturesEnabled setallgesturesenabled = new setAllGesturesEnabled();
        setallgesturesenabled.IconCompatParcelizer = port.write;
        setallgesturesenabled.MediaBrowserCompat$ItemReceiver = port.IconCompatParcelizer;
        setallgesturesenabled.MediaDescriptionCompat = port.MediaMetadataCompat;
        setallgesturesenabled.MediaBrowserCompat$CustomActionResultReceiver = port.RatingCompat;
        setallgesturesenabled.read = DiskLruCache.VERSION_1.equals(port.read);
        setallgesturesenabled.write = port.MediaBrowserCompat$CustomActionResultReceiver;
        return setallgesturesenabled;
    }
}
