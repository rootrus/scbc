package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.convertMemInfoToBytes */
public final class convertMemInfoToBytes implements Parcelable {
    public static final Parcelable.Creator<convertMemInfoToBytes> CREATOR = new Parcelable.Creator<convertMemInfoToBytes>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new convertMemInfoToBytes(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new convertMemInfoToBytes[i];
        }
    };
    public String IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public convertMemInfoToBytes(int i, String str, String str2, String str3, String str4) {
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.read = str;
        this.write = str2;
        this.IconCompatParcelizer = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
    }

    protected convertMemInfoToBytes(Parcel parcel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readInt();
        this.read = parcel.readString();
        this.write = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof convertMemInfoToBytes)) {
            return false;
        }
        convertMemInfoToBytes convertmeminfotobytes = (convertMemInfoToBytes) obj;
        if (this.MediaBrowserCompat$CustomActionResultReceiver != convertmeminfotobytes.MediaBrowserCompat$CustomActionResultReceiver) {
            return false;
        }
        String str = this.read;
        if (str == null ? convertmeminfotobytes.read != null : !str.equals(convertmeminfotobytes.read)) {
            return false;
        }
        String str2 = this.write;
        if (str2 == null ? convertmeminfotobytes.write != null : !str2.equals(convertmeminfotobytes.write)) {
            return false;
        }
        String str3 = this.IconCompatParcelizer;
        if (str3 == null ? convertmeminfotobytes.IconCompatParcelizer != null : !str3.equals(convertmeminfotobytes.IconCompatParcelizer)) {
            return false;
        }
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        if (str4 != null) {
            return str4.equals(convertmeminfotobytes.MediaBrowserCompat$ItemReceiver);
        }
        if (convertmeminfotobytes.MediaBrowserCompat$ItemReceiver != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str = this.read;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        String str2 = this.write;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        if (str4 != null) {
            i5 = str4.hashCode();
        }
        return (((((((i4 * 31) + i) * 31) + i2) * 31) + i3) * 31) + i5;
    }
}
