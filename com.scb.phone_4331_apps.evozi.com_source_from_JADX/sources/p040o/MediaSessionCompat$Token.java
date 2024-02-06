package p040o;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: o.MediaSessionCompat$Token */
public class MediaSessionCompat$Token {
    public static int MediaBrowserCompat$MediaItem(Object obj) {
        return ((PlaybackState) obj).getState();
    }

    public static long MediaMetadataCompat(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }

    public static long MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    public static float MediaBrowserCompat$SearchResultReceiver(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    public static long write(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    public static CharSequence MediaBrowserCompat$ItemReceiver(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }

    public static long MediaDescriptionCompat(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    public static List<Object> IconCompatParcelizer(Object obj) {
        return ((PlaybackState) obj).getCustomActions();
    }

    public static long read(Object obj) {
        return ((PlaybackState) obj).getActiveQueueItemId();
    }

    /* renamed from: o.MediaSessionCompat$Token$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public static String read(Object obj) {
            return ((PlaybackState.CustomAction) obj).getAction();
        }

        public static CharSequence MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
            return ((PlaybackState.CustomAction) obj).getName();
        }

        public static int MediaBrowserCompat$ItemReceiver(Object obj) {
            return ((PlaybackState.CustomAction) obj).getIcon();
        }

        public static Bundle write(Object obj) {
            return ((PlaybackState.CustomAction) obj).getExtras();
        }
    }
}
