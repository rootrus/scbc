package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getBaseAddress */
public final class getBaseAddress implements Parcelable, Comparable<getBaseAddress> {
    public static final Parcelable.Creator<getBaseAddress> CREATOR = new Parcelable.Creator<getBaseAddress>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getBaseAddress(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getBaseAddress[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        getBaseAddress getbaseaddress = (getBaseAddress) obj;
        String str = this.write;
        if (str == null) {
            return 0;
        }
        long parseLong = Long.parseLong(str);
        String str2 = getbaseaddress.write;
        if (str2 != null) {
            return Long.compare(parseLong, Long.parseLong(str2));
        }
        return 0;
    }

    public getBaseAddress(String str, String str2, String str3, String str4) {
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    protected getBaseAddress(Parcel parcel) {
        this.write = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getBaseAddress getbaseaddress = (getBaseAddress) obj;
        String str = this.write;
        if (str == null ? getbaseaddress.write == null : str.equals(getbaseaddress.write)) {
            String str2 = this.IconCompatParcelizer;
            if (str2 == null ? getbaseaddress.IconCompatParcelizer == null : str2.equals(getbaseaddress.IconCompatParcelizer)) {
                String str3 = this.read;
                if (str3 == null ? getbaseaddress.read == null : str3.equals(getbaseaddress.read)) {
                    String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
                    if (str4 != null) {
                        if (str4.equals(getbaseaddress.MediaBrowserCompat$CustomActionResultReceiver)) {
                            return true;
                        }
                    } else if (getbaseaddress.MediaBrowserCompat$CustomActionResultReceiver == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }
}
