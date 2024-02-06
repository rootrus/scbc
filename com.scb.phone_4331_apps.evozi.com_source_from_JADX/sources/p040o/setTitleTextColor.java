package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p040o.setTitleMarginEnd;

/* renamed from: o.setTitleTextColor */
final class setTitleTextColor implements Parcelable {
    public static final Parcelable.Creator<setTitleTextColor> CREATOR = new Parcelable.Creator<setTitleTextColor>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new setTitleTextColor(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setTitleTextColor[i];
        }
    };
    final int IconCompatParcelizer;
    final CharSequence MediaBrowserCompat$CustomActionResultReceiver;
    final CharSequence MediaBrowserCompat$ItemReceiver;
    final int[] MediaBrowserCompat$MediaItem;
    final String MediaBrowserCompat$SearchResultReceiver;
    final ArrayList<String> MediaDescriptionCompat;
    final ArrayList<String> MediaMetadataCompat;
    final int MediaSessionCompat$QueueItem;
    final int ParcelableVolumeInfo;
    final boolean RatingCompat;
    final int read;
    final int write;

    public final int describeContents() {
        return 0;
    }

    public setTitleTextColor(setTitleMarginEnd settitlemarginend) {
        int size = settitlemarginend.ParcelableVolumeInfo.size();
        this.MediaBrowserCompat$MediaItem = new int[(size * 6)];
        if (settitlemarginend.IconCompatParcelizer) {
            int i = 0;
            int i2 = 0;
            while (i < size) {
                setTitleMarginEnd.write write2 = settitlemarginend.ParcelableVolumeInfo.get(i);
                int i3 = i2 + 1;
                this.MediaBrowserCompat$MediaItem[i2] = write2.read;
                int i4 = i3 + 1;
                this.MediaBrowserCompat$MediaItem[i3] = write2.MediaBrowserCompat$CustomActionResultReceiver != null ? write2.MediaBrowserCompat$CustomActionResultReceiver.mIndex : -1;
                int i5 = i4 + 1;
                this.MediaBrowserCompat$MediaItem[i4] = write2.MediaBrowserCompat$ItemReceiver;
                int i6 = i5 + 1;
                this.MediaBrowserCompat$MediaItem[i5] = write2.IconCompatParcelizer;
                int i7 = i6 + 1;
                this.MediaBrowserCompat$MediaItem[i6] = write2.write;
                this.MediaBrowserCompat$MediaItem[i7] = write2.MediaMetadataCompat;
                i++;
                i2 = i7 + 1;
            }
            this.ParcelableVolumeInfo = settitlemarginend.Keep;
            this.MediaSessionCompat$QueueItem = settitlemarginend.PlaybackStateCompat;
            this.MediaBrowserCompat$SearchResultReceiver = settitlemarginend.MediaBrowserCompat$MediaItem;
            this.IconCompatParcelizer = settitlemarginend.MediaDescriptionCompat;
            this.write = settitlemarginend.MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$ItemReceiver = settitlemarginend.write;
            this.read = settitlemarginend.MediaBrowserCompat$ItemReceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = settitlemarginend.read;
            this.MediaDescriptionCompat = settitlemarginend.MediaSessionCompat$Token;
            this.MediaMetadataCompat = settitlemarginend.PlaybackStateCompat$CustomAction;
            this.RatingCompat = settitlemarginend.MediaSessionCompat$QueueItem;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public setTitleTextColor(Parcel parcel) {
        this.MediaBrowserCompat$MediaItem = parcel.createIntArray();
        this.ParcelableVolumeInfo = parcel.readInt();
        this.MediaSessionCompat$QueueItem = parcel.readInt();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readInt();
        this.write = parcel.readInt();
        this.MediaBrowserCompat$ItemReceiver = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.read = parcel.readInt();
        this.MediaBrowserCompat$CustomActionResultReceiver = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.MediaDescriptionCompat = parcel.createStringArrayList();
        this.MediaMetadataCompat = parcel.createStringArrayList();
        this.RatingCompat = parcel.readInt() != 0;
    }

    public final setTitleMarginEnd MediaBrowserCompat$ItemReceiver(setLayoutResource setlayoutresource) {
        setTitleMarginEnd settitlemarginend = new setTitleMarginEnd(setlayoutresource);
        int i = 0;
        while (i < this.MediaBrowserCompat$MediaItem.length) {
            setTitleMarginEnd.write write2 = new setTitleMarginEnd.write();
            int i2 = i + 1;
            write2.read = this.MediaBrowserCompat$MediaItem[i];
            boolean z = setLayoutResource.IconCompatParcelizer;
            int i3 = i2 + 1;
            int i4 = this.MediaBrowserCompat$MediaItem[i2];
            if (i4 >= 0) {
                write2.MediaBrowserCompat$CustomActionResultReceiver = setlayoutresource.mActive.get(i4);
            } else {
                write2.MediaBrowserCompat$CustomActionResultReceiver = null;
            }
            int i5 = i3 + 1;
            write2.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$MediaItem[i3];
            int i6 = i5 + 1;
            write2.IconCompatParcelizer = this.MediaBrowserCompat$MediaItem[i5];
            int i7 = i6 + 1;
            write2.write = this.MediaBrowserCompat$MediaItem[i6];
            write2.MediaMetadataCompat = this.MediaBrowserCompat$MediaItem[i7];
            settitlemarginend.MediaBrowserCompat$SearchResultReceiver = write2.MediaBrowserCompat$ItemReceiver;
            settitlemarginend.RatingCompat = write2.IconCompatParcelizer;
            settitlemarginend.f2646x50fd9e4a = write2.write;
            settitlemarginend.MediaSessionCompat$ResultReceiverWrapper = write2.MediaMetadataCompat;
            settitlemarginend.read(write2);
            i = i7 + 1;
        }
        settitlemarginend.Keep = this.ParcelableVolumeInfo;
        settitlemarginend.PlaybackStateCompat = this.MediaSessionCompat$QueueItem;
        settitlemarginend.MediaBrowserCompat$MediaItem = this.MediaBrowserCompat$SearchResultReceiver;
        settitlemarginend.MediaDescriptionCompat = this.IconCompatParcelizer;
        settitlemarginend.IconCompatParcelizer = true;
        settitlemarginend.MediaBrowserCompat$CustomActionResultReceiver = this.write;
        settitlemarginend.write = this.MediaBrowserCompat$ItemReceiver;
        settitlemarginend.MediaBrowserCompat$ItemReceiver = this.read;
        settitlemarginend.read = this.MediaBrowserCompat$CustomActionResultReceiver;
        settitlemarginend.MediaSessionCompat$Token = this.MediaDescriptionCompat;
        settitlemarginend.PlaybackStateCompat$CustomAction = this.MediaMetadataCompat;
        settitlemarginend.MediaSessionCompat$QueueItem = this.RatingCompat;
        settitlemarginend.MediaBrowserCompat$CustomActionResultReceiver(1);
        return settitlemarginend;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.MediaBrowserCompat$MediaItem);
        parcel.writeInt(this.ParcelableVolumeInfo);
        parcel.writeInt(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeInt(this.IconCompatParcelizer);
        parcel.writeInt(this.write);
        TextUtils.writeToParcel(this.MediaBrowserCompat$ItemReceiver, parcel, 0);
        parcel.writeInt(this.read);
        TextUtils.writeToParcel(this.MediaBrowserCompat$CustomActionResultReceiver, parcel, 0);
        parcel.writeStringList(this.MediaDescriptionCompat);
        parcel.writeStringList(this.MediaMetadataCompat);
        parcel.writeInt(this.RatingCompat ? 1 : 0);
    }
}
