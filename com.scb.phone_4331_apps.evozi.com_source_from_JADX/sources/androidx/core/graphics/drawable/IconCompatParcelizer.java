package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import androidx.versionedparcelable.VersionedParcel;

public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.MediaMetadataCompat = versionedParcel.read(iconCompat.MediaMetadataCompat, 1);
        iconCompat.MediaBrowserCompat$CustomActionResultReceiver = versionedParcel.read(iconCompat.MediaBrowserCompat$CustomActionResultReceiver);
        iconCompat.MediaDescriptionCompat = versionedParcel.write(iconCompat.MediaDescriptionCompat, 3);
        iconCompat.read = versionedParcel.read(iconCompat.read, 4);
        iconCompat.MediaBrowserCompat$ItemReceiver = versionedParcel.read(iconCompat.MediaBrowserCompat$ItemReceiver, 5);
        iconCompat.RatingCompat = (ColorStateList) versionedParcel.write(iconCompat.RatingCompat, 6);
        iconCompat.MediaBrowserCompat$SearchResultReceiver = versionedParcel.read(iconCompat.MediaBrowserCompat$SearchResultReceiver);
        iconCompat.MediaBrowserCompat$ItemReceiver();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        iconCompat.write(false);
        versionedParcel.write(iconCompat.MediaMetadataCompat, 1);
        versionedParcel.IconCompatParcelizer(iconCompat.MediaBrowserCompat$CustomActionResultReceiver);
        versionedParcel.IconCompatParcelizer(iconCompat.MediaDescriptionCompat, 3);
        versionedParcel.write(iconCompat.read, 4);
        versionedParcel.write(iconCompat.MediaBrowserCompat$ItemReceiver, 5);
        versionedParcel.IconCompatParcelizer(iconCompat.RatingCompat, 6);
        versionedParcel.MediaBrowserCompat$ItemReceiver(iconCompat.MediaBrowserCompat$SearchResultReceiver);
    }
}
