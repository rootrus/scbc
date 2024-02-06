package p040o;

import android.media.session.PlaybackState;
import android.os.Bundle;

/* renamed from: o.MediaSessionCompat$ResultReceiverWrapper */
public class MediaSessionCompat$ResultReceiverWrapper {
    public static Bundle MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        return ((PlaybackState) obj).getExtras();
    }
}
