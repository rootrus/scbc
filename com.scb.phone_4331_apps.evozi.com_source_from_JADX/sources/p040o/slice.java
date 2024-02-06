package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: o.slice */
public final class slice extends constrainedListMultimap {
    @HmlPinActivity
    public slice(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public final getFiles read(moveCamera movecamera) {
        String str;
        getFiles MediaBrowserCompat$CustomActionResultReceiver = getFiles.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = movecamera.write;
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(movecamera.MediaBrowserCompat$ItemReceiver, false);
        MediaBrowserCompat$CustomActionResultReceiver.read = movecamera.IconCompatParcelizer;
        if (movecamera.MediaBrowserCompat$SearchResultReceiver == null) {
            str = "";
        } else {
            str = IconCompatParcelizer("dd MMM yyyy - HH:mm", movecamera.MediaBrowserCompat$SearchResultReceiver);
        }
        MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = str;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = TextUtils.isEmpty(movecamera.MediaBrowserCompat$MediaItem) ? DiskLruCache.VERSION_1 : movecamera.MediaBrowserCompat$MediaItem;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = movecamera.read;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem = movecamera.MediaMetadataCompat;
        return MediaBrowserCompat$CustomActionResultReceiver;
    }

    public static String MediaBrowserCompat$MediaItem(String str) {
        return read(str);
    }
}
