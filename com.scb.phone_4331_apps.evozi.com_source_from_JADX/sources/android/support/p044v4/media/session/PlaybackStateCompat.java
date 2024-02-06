package android.support.p044v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p040o.MediaSessionCompat$ResultReceiverWrapper;
import p040o.MediaSessionCompat$Token;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator<PlaybackStateCompat>() {
        /* renamed from: write */
        public final PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: MediaBrowserCompat$ItemReceiver */
        public final PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    };
    final long IconCompatParcelizer;
    List<CustomAction> MediaBrowserCompat$CustomActionResultReceiver;
    final long MediaBrowserCompat$ItemReceiver;
    final Bundle MediaBrowserCompat$MediaItem;
    final float MediaBrowserCompat$SearchResultReceiver;
    final int MediaDescriptionCompat;
    final CharSequence MediaMetadataCompat;
    private Object MediaSessionCompat$Token;
    final long ParcelableVolumeInfo;
    final long RatingCompat;
    final int read;
    final long write;

    public final int describeContents() {
        return 0;
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.MediaDescriptionCompat = i;
        this.RatingCompat = j;
        this.IconCompatParcelizer = j2;
        this.MediaBrowserCompat$SearchResultReceiver = f;
        this.MediaBrowserCompat$ItemReceiver = j3;
        this.read = i2;
        this.MediaMetadataCompat = charSequence;
        this.ParcelableVolumeInfo = j4;
        this.MediaBrowserCompat$CustomActionResultReceiver = new ArrayList(list);
        this.write = j5;
        this.MediaBrowserCompat$MediaItem = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.MediaDescriptionCompat = parcel.readInt();
        this.RatingCompat = parcel.readLong();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readFloat();
        this.ParcelableVolumeInfo = parcel.readLong();
        this.IconCompatParcelizer = parcel.readLong();
        this.MediaBrowserCompat$ItemReceiver = parcel.readLong();
        this.MediaMetadataCompat = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.write = parcel.readLong();
        this.MediaBrowserCompat$MediaItem = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.read = parcel.readInt();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", position=");
        sb.append(this.RatingCompat);
        sb.append(", buffered position=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", speed=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", updated=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", actions=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", error code=");
        sb.append(this.read);
        sb.append(", error message=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", custom actions=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", active item id=");
        sb.append(this.write);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.MediaDescriptionCompat);
        parcel.writeLong(this.RatingCompat);
        parcel.writeFloat(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeLong(this.ParcelableVolumeInfo);
        parcel.writeLong(this.IconCompatParcelizer);
        parcel.writeLong(this.MediaBrowserCompat$ItemReceiver);
        TextUtils.writeToParcel(this.MediaMetadataCompat, parcel, i);
        parcel.writeTypedList(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeLong(this.write);
        parcel.writeBundle(this.MediaBrowserCompat$MediaItem);
        parcel.writeInt(this.read);
    }

    public static PlaybackStateCompat read(Object obj) {
        ArrayList arrayList;
        Object obj2 = obj;
        Bundle bundle = null;
        if (obj2 == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> IconCompatParcelizer2 = MediaSessionCompat$Token.IconCompatParcelizer(obj);
        if (IconCompatParcelizer2 != null) {
            ArrayList arrayList2 = new ArrayList(IconCompatParcelizer2.size());
            for (Object write2 : IconCompatParcelizer2) {
                arrayList2.add(CustomAction.write(write2));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(MediaSessionCompat$Token.MediaBrowserCompat$MediaItem(obj), MediaSessionCompat$Token.MediaMetadataCompat(obj), MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver(obj), MediaSessionCompat$Token.MediaBrowserCompat$SearchResultReceiver(obj), MediaSessionCompat$Token.write(obj), 0, MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver(obj), MediaSessionCompat$Token.MediaDescriptionCompat(obj), arrayList, MediaSessionCompat$Token.read(obj), bundle);
        playbackStateCompat.MediaSessionCompat$Token = obj2;
        return playbackStateCompat;
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator<CustomAction>() {
            /* renamed from: read */
            public final CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: MediaBrowserCompat$CustomActionResultReceiver */
            public final CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        };
        private Object IconCompatParcelizer;
        private final CharSequence MediaBrowserCompat$CustomActionResultReceiver;
        private final int MediaBrowserCompat$ItemReceiver;
        private final Bundle read;
        private final String write;

        public final int describeContents() {
            return 0;
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.write = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = charSequence;
            this.MediaBrowserCompat$ItemReceiver = i;
            this.read = bundle;
        }

        CustomAction(Parcel parcel) {
            this.write = parcel.readString();
            this.MediaBrowserCompat$CustomActionResultReceiver = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.MediaBrowserCompat$ItemReceiver = parcel.readInt();
            this.read = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.write);
            TextUtils.writeToParcel(this.MediaBrowserCompat$CustomActionResultReceiver, parcel, i);
            parcel.writeInt(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeBundle(this.read);
        }

        public static CustomAction write(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(MediaSessionCompat$Token.IconCompatParcelizer.read(obj), MediaSessionCompat$Token.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(obj), MediaSessionCompat$Token.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(obj), MediaSessionCompat$Token.IconCompatParcelizer.write(obj));
            customAction.IconCompatParcelizer = obj;
            return customAction;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Action:mName='");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", mIcon=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", mExtras=");
            sb.append(this.read);
            return sb.toString();
        }
    }
}
