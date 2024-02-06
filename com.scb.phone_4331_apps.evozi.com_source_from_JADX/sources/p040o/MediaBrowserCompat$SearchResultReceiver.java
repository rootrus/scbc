package p040o;

import android.media.MediaMetadata;
import android.os.Parcel;

/* renamed from: o.MediaBrowserCompat$SearchResultReceiver */
public class MediaBrowserCompat$SearchResultReceiver {
    public static void IconCompatParcelizer(Object obj, Parcel parcel, int i) {
        ((MediaMetadata) obj).writeToParcel(parcel, i);
    }
}
