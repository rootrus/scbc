package p040o;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: o.MediaBrowserCompat$CustomActionResultReceiver */
public class MediaBrowserCompat$CustomActionResultReceiver {
    public static String MediaBrowserCompat$ItemReceiver(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    public static CharSequence MediaBrowserCompat$SearchResultReceiver(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }

    public static CharSequence MediaMetadataCompat(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    public static CharSequence IconCompatParcelizer(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    public static Bitmap read(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    public static Uri write(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    public static Bundle MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Object obj, Parcel parcel, int i) {
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }

    public static Object MediaBrowserCompat$CustomActionResultReceiver(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: o.MediaBrowserCompat$CustomActionResultReceiver$read */
    public static class read {
        public static Object read() {
            return new MediaDescription.Builder();
        }

        public static void MediaBrowserCompat$CustomActionResultReceiver(Object obj, String str) {
            ((MediaDescription.Builder) obj).setMediaId(str);
        }

        public static void IconCompatParcelizer(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setTitle(charSequence);
        }

        public static void MediaBrowserCompat$ItemReceiver(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setSubtitle(charSequence);
        }

        public static void read(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setDescription(charSequence);
        }

        public static void MediaBrowserCompat$ItemReceiver(Object obj, Bitmap bitmap) {
            ((MediaDescription.Builder) obj).setIconBitmap(bitmap);
        }

        public static void write(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setIconUri(uri);
        }

        public static void write(Object obj, Bundle bundle) {
            ((MediaDescription.Builder) obj).setExtras(bundle);
        }

        public static Object read(Object obj) {
            return ((MediaDescription.Builder) obj).build();
        }
    }
}
