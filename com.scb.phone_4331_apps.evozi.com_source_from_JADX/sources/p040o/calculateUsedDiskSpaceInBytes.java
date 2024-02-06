package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.calculateUsedDiskSpaceInBytes */
public final class calculateUsedDiskSpaceInBytes implements Parcelable {
    public static final Parcelable.Creator<calculateUsedDiskSpaceInBytes> CREATOR = new Parcelable.Creator<calculateUsedDiskSpaceInBytes>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new calculateUsedDiskSpaceInBytes(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new calculateUsedDiskSpaceInBytes[i];
        }
    };
    private int IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public calculateUsedDiskSpaceInBytes(String str, int i, String str2, String str3, String str4) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = i;
        this.read = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.write = str4;
    }

    protected calculateUsedDiskSpaceInBytes(Parcel parcel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readInt();
        this.read = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.write = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeInt(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.write);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof calculateUsedDiskSpaceInBytes)) {
            return false;
        }
        calculateUsedDiskSpaceInBytes calculateuseddiskspaceinbytes = (calculateUsedDiskSpaceInBytes) obj;
        if (this.IconCompatParcelizer != calculateuseddiskspaceinbytes.IconCompatParcelizer) {
            return false;
        }
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null ? calculateuseddiskspaceinbytes.MediaBrowserCompat$CustomActionResultReceiver != null : !str.equals(calculateuseddiskspaceinbytes.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str2 = this.read;
        if (str2 == null ? calculateuseddiskspaceinbytes.read != null : !str2.equals(calculateuseddiskspaceinbytes.read)) {
            return false;
        }
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 == null ? calculateuseddiskspaceinbytes.MediaBrowserCompat$ItemReceiver != null : !str3.equals(calculateuseddiskspaceinbytes.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str4 = this.write;
        if (str4 != null) {
            return str4.equals(calculateuseddiskspaceinbytes.write);
        }
        if (calculateuseddiskspaceinbytes.write != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = this.IconCompatParcelizer;
        String str2 = this.read;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        String str4 = this.write;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return (((((((i * 31) + i5) * 31) + i2) * 31) + i3) * 31) + i4;
    }
}
