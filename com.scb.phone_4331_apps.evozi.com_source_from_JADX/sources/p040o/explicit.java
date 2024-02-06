package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.sha1;

/* renamed from: o.explicit */
public final class explicit extends constrainedSetMultimap<setEventInterceptor, sha1> {
    @HmlPinActivity
    public explicit(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    /* renamed from: MediaBrowserCompat$CustomActionResultReceiver */
    public final sha1 MediaBrowserCompat$ItemReceiver(setEventInterceptor seteventinterceptor) {
        sha1.IconCompatParcelizer read = sha1.read();
        read.read = seteventinterceptor.MediaBrowserCompat$CustomActionResultReceiver;
        read.MediaBrowserCompat$CustomActionResultReceiver = seteventinterceptor.IconCompatParcelizer;
        read.write = seteventinterceptor.read;
        read.MediaBrowserCompat$ItemReceiver = seteventinterceptor.MediaBrowserCompat$ItemReceiver;
        read.MediaBrowserCompat$SearchResultReceiver = seteventinterceptor.MediaBrowserCompat$MediaItem;
        read.MediaMetadataCompat = seteventinterceptor.MediaDescriptionCompat;
        read.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver(seteventinterceptor.write, new removeAllImpl(this));
        return new sha1(read, (byte) 0);
    }
}
