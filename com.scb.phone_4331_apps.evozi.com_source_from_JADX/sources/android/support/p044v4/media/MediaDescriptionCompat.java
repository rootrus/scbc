package android.support.p044v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p040o.MediaBrowserCompat$CustomActionResultReceiver;
import p040o.MediaDescriptionCompat;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() {
        /* renamed from: IconCompatParcelizer */
        public final MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(parcel));
        }

        /* renamed from: read */
        public final MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    };
    private final Bitmap IconCompatParcelizer;
    private Object MediaBrowserCompat$CustomActionResultReceiver;
    private final CharSequence MediaBrowserCompat$ItemReceiver;
    private final Uri MediaBrowserCompat$MediaItem;
    private final CharSequence MediaBrowserCompat$SearchResultReceiver;
    private final CharSequence MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final Bundle read;
    private final Uri write;

    public final int describeContents() {
        return 0;
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.MediaMetadataCompat = str;
        this.MediaBrowserCompat$SearchResultReceiver = charSequence;
        this.MediaDescriptionCompat = charSequence2;
        this.MediaBrowserCompat$ItemReceiver = charSequence3;
        this.IconCompatParcelizer = bitmap;
        this.write = uri;
        this.read = bundle;
        this.MediaBrowserCompat$MediaItem = uri2;
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.MediaMetadataCompat = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.MediaDescriptionCompat = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.MediaBrowserCompat$ItemReceiver = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = getClass().getClassLoader();
        this.IconCompatParcelizer = (Bitmap) parcel.readParcelable(classLoader);
        this.write = (Uri) parcel.readParcelable(classLoader);
        this.read = parcel.readBundle(classLoader);
        this.MediaBrowserCompat$MediaItem = (Uri) parcel.readParcelable(classLoader);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.MediaMetadataCompat);
            TextUtils.writeToParcel(this.MediaBrowserCompat$SearchResultReceiver, parcel, i);
            TextUtils.writeToParcel(this.MediaDescriptionCompat, parcel, i);
            TextUtils.writeToParcel(this.MediaBrowserCompat$ItemReceiver, parcel, i);
            parcel.writeParcelable(this.IconCompatParcelizer, i);
            parcel.writeParcelable(this.write, i);
            parcel.writeBundle(this.read);
            parcel.writeParcelable(this.MediaBrowserCompat$MediaItem, i);
            return;
        }
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(read(), parcel, i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", ");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", ");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        return sb.toString();
    }

    public final Object read() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null || Build.VERSION.SDK_INT < 21) {
            return this.MediaBrowserCompat$CustomActionResultReceiver;
        }
        Object read2 = MediaBrowserCompat$CustomActionResultReceiver.read.read();
        MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$CustomActionResultReceiver(read2, this.MediaMetadataCompat);
        MediaBrowserCompat$CustomActionResultReceiver.read.IconCompatParcelizer(read2, this.MediaBrowserCompat$SearchResultReceiver);
        MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$ItemReceiver(read2, this.MediaDescriptionCompat);
        MediaBrowserCompat$CustomActionResultReceiver.read.read(read2, this.MediaBrowserCompat$ItemReceiver);
        MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$ItemReceiver(read2, this.IconCompatParcelizer);
        MediaBrowserCompat$CustomActionResultReceiver.read.write(read2, this.write);
        Bundle bundle = this.read;
        if (Build.VERSION.SDK_INT < 23 && this.MediaBrowserCompat$MediaItem != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.MediaBrowserCompat$MediaItem);
        }
        MediaBrowserCompat$CustomActionResultReceiver.read.write(read2, bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            MediaDescriptionCompat.read.MediaBrowserCompat$CustomActionResultReceiver(read2, this.MediaBrowserCompat$MediaItem);
        }
        Object read3 = MediaBrowserCompat$CustomActionResultReceiver.read.read(read2);
        this.MediaBrowserCompat$CustomActionResultReceiver = read3;
        return read3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p044v4.media.MediaDescriptionCompat MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x007f
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x007f
            android.support.v4.media.MediaDescriptionCompat$MediaBrowserCompat$CustomActionResultReceiver r1 = new android.support.v4.media.MediaDescriptionCompat$MediaBrowserCompat$CustomActionResultReceiver
            r1.<init>()
            java.lang.String r2 = p040o.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(r8)
            r1.write(r2)
            java.lang.CharSequence r2 = p040o.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver(r8)
            r1.MediaBrowserCompat$ItemReceiver(r2)
            java.lang.CharSequence r2 = p040o.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat(r8)
            r1.IconCompatParcelizer(r2)
            java.lang.CharSequence r2 = p040o.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(r8)
            r1.read((java.lang.CharSequence) r2)
            android.graphics.Bitmap r2 = p040o.MediaBrowserCompat$CustomActionResultReceiver.read(r8)
            r1.read((android.graphics.Bitmap) r2)
            android.net.Uri r2 = p040o.MediaBrowserCompat$CustomActionResultReceiver.write(r8)
            r1.MediaBrowserCompat$CustomActionResultReceiver((android.net.Uri) r2)
            android.os.Bundle r2 = p040o.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver((java.lang.Object) r8)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x004a
            android.support.p044v4.media.session.MediaSessionCompat.write(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x004b
        L_0x004a:
            r4 = r0
        L_0x004b:
            if (r4 == 0) goto L_0x0062
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x005c
            int r6 = r2.size()
            r7 = 2
            if (r6 == r7) goto L_0x0063
        L_0x005c:
            r2.remove(r3)
            r2.remove(r5)
        L_0x0062:
            r0 = r2
        L_0x0063:
            r1.MediaBrowserCompat$CustomActionResultReceiver((android.os.Bundle) r0)
            if (r4 == 0) goto L_0x006c
            r1.read((android.net.Uri) r4)
            goto L_0x0079
        L_0x006c:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L_0x0079
            android.net.Uri r0 = p040o.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(r8)
            r1.read((android.net.Uri) r0)
        L_0x0079:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.read()
            r0.MediaBrowserCompat$CustomActionResultReceiver = r8
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p044v4.media.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }
}
