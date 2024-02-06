package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.Enums;

/* renamed from: o.readBytes */
public final class readBytes extends constrainedListMultimap {
    @HmlPinActivity
    public readBytes(Resources resources, SharedPreferences sharedPreferences, Enums.C33301 r3) {
        super(resources, sharedPreferences);
    }

    public final setKey MediaBrowserCompat$ItemReceiver(getMinZoomLevel getminzoomlevel) {
        if (getminzoomlevel == null) {
            return null;
        }
        setKey write = setKey.write();
        write.MediaBrowserCompat$CustomActionResultReceiver = getminzoomlevel.write;
        write.MediaSessionCompat$QueueItem = null;
        write.MediaMetadataCompat = getminzoomlevel.MediaMetadataCompat;
        write.read = getminzoomlevel.IconCompatParcelizer;
        write.MediaSessionCompat$ResultReceiverWrapper = null;
        write.MediaBrowserCompat$SearchResultReceiver = getminzoomlevel.MediaDescriptionCompat;
        write.MediaDescriptionCompat = getminzoomlevel.write;
        write.MediaSessionCompat$Token = null;
        write.MediaBrowserCompat$MediaItem = getminzoomlevel.MediaMetadataCompat;
        write.MediaBrowserCompat$ItemReceiver = removeIfFromRandomAccessList.read(getminzoomlevel.MediaBrowserCompat$ItemReceiver, "[^0-9]", "X-XXXX-XXXXX-XX-X");
        write.IconCompatParcelizer = IconCompatParcelizer("dd MMM yyyy", getminzoomlevel.read);
        write.RatingCompat = getminzoomlevel.MediaBrowserCompat$CustomActionResultReceiver;
        return write;
    }
}
