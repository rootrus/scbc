package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ZSYR2K */
public class ZSYR2K implements Parcelable {
    public static final Parcelable.Creator<ZSYR2K> CREATOR = new Parcelable.Creator<ZSYR2K>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ZSYR2K(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ZSYR2K[i];
        }
    };
    final String read;
    final String write;

    public int describeContents() {
        return 0;
    }

    public ZSYR2K(String str, String str2) {
        this.read = str;
        this.write = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ZSYR2K zsyr2k = (ZSYR2K) obj;
        String str = this.read;
        if (str == null ? zsyr2k.read != null : !str.equals(zsyr2k.read)) {
            return false;
        }
        String str2 = this.write;
        String str3 = zsyr2k.write;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeString(this.write);
    }

    protected ZSYR2K(Parcel parcel) {
        this.read = parcel.readString();
        this.write = parcel.readString();
    }
}
