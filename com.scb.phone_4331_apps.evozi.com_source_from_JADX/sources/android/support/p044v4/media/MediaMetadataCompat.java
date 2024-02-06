package android.support.p044v4.media;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p044v4.media.session.MediaSessionCompat;
import p040o.MediaBrowserCompat$SearchResultReceiver;
import p040o.setTextAppearance;

/* renamed from: android.support.v4.media.MediaMetadataCompat */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new Parcelable.Creator<MediaMetadataCompat>() {
        /* renamed from: read */
        public final MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        /* renamed from: read */
        public final MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    };
    private static final String[] IconCompatParcelizer = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
    static final setTextAppearance<String, Integer> MediaBrowserCompat$CustomActionResultReceiver;
    private static final String[] MediaBrowserCompat$ItemReceiver = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
    private static final String[] read = {"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
    private Object RatingCompat;
    final Bundle write;

    public final int describeContents() {
        return 0;
    }

    static {
        setTextAppearance<String, Integer> settextappearance = new setTextAppearance<>();
        MediaBrowserCompat$CustomActionResultReceiver = settextappearance;
        settextappearance.put("android.media.metadata.TITLE", 1);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.ARTIST", 1);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.DURATION", 0);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.ALBUM", 1);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.AUTHOR", 1);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.WRITER", 1);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.COMPOSER", 1);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.COMPILATION", 1);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.DATE", 1);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.YEAR", 0);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.GENRE", 1);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.TRACK_NUMBER", 0);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.NUM_TRACKS", 0);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.DISC_NUMBER", 0);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.ALBUM_ARTIST", 1);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.ART", 2);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.ART_URI", 1);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.ALBUM_ART", 2);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.ALBUM_ART_URI", 1);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.USER_RATING", 3);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.RATING", 3);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.DISPLAY_TITLE", 1);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.DISPLAY_ICON", 2);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.MEDIA_ID", 1);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.MEDIA_URI", 1);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.ADVERTISEMENT", 0);
        MediaBrowserCompat$CustomActionResultReceiver.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    MediaMetadataCompat(Parcel parcel) {
        this.write = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.write);
    }

    public static MediaMetadataCompat MediaBrowserCompat$ItemReceiver(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.RatingCompat = obj;
        return createFromParcel;
    }
}
