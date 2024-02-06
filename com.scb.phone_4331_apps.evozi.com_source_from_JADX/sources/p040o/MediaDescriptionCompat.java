package p040o;

import android.media.MediaDescription;
import android.net.Uri;

/* renamed from: o.MediaDescriptionCompat */
public class MediaDescriptionCompat {
    public static Uri MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }

    /* renamed from: o.MediaDescriptionCompat$read */
    public static class read {
        public static void MediaBrowserCompat$CustomActionResultReceiver(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }
}
