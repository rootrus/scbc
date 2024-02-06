package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.getTotalRamInBytes */
public final class getTotalRamInBytes extends canTryConnection implements Parcelable {
    public static final Parcelable.Creator<getTotalRamInBytes> CREATOR = new Parcelable.Creator<getTotalRamInBytes>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getTotalRamInBytes(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getTotalRamInBytes[i];
        }
    };
    public List<getResourcePackageName> MediaBrowserCompat$MediaItem;
    public String MediaDescriptionCompat;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ getTotalRamInBytes(getTotalRamInBytes$MediaBrowserCompat$CustomActionResultReceiver gettotalraminbytes_mediabrowsercompat_customactionresultreceiver, byte b) {
        this(gettotalraminbytes_mediabrowsercompat_customactionresultreceiver);
    }

    private getTotalRamInBytes(getTotalRamInBytes$MediaBrowserCompat$CustomActionResultReceiver gettotalraminbytes_mediabrowsercompat_customactionresultreceiver) {
        super((canTryConnection$MediaBrowserCompat$ItemReceiver<?>) gettotalraminbytes_mediabrowsercompat_customactionresultreceiver);
        this.MediaBrowserCompat$MediaItem = gettotalraminbytes_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver;
        this.MediaDescriptionCompat = gettotalraminbytes_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$MediaItem;
    }

    public static getTotalRamInBytes$MediaBrowserCompat$CustomActionResultReceiver read() {
        return new getTotalRamInBytes$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    }

    protected getTotalRamInBytes(Parcel parcel) {
        super(parcel);
        this.MediaBrowserCompat$MediaItem = parcel.createTypedArrayList(getResourcePackageName.CREATOR);
        this.MediaDescriptionCompat = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaDescriptionCompat);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getTotalRamInBytes gettotalraminbytes = (getTotalRamInBytes) obj;
        List<getResourcePackageName> list = this.MediaBrowserCompat$MediaItem;
        if (list == null ? gettotalraminbytes.MediaBrowserCompat$MediaItem != null : !list.equals(gettotalraminbytes.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str = this.MediaDescriptionCompat;
        String str2 = gettotalraminbytes.MediaDescriptionCompat;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List<getResourcePackageName> list = this.MediaBrowserCompat$MediaItem;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        String str = this.MediaDescriptionCompat;
        if (str != null) {
            i = str.hashCode();
        }
        return (hashCode * 31) + i;
    }
}
