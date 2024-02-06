package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.parseDevice */
public class parseDevice implements Parcelable {
    public static final Parcelable.Creator<parseDevice> CREATOR = new Parcelable.Creator<parseDevice>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new parseDevice(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new parseDevice[i];
        }
    };
    private static String MediaBrowserCompat$ItemReceiver = "QR_PURCHASE_VISA_SOURCE";
    private static String write = "QR_PURCHASE_MC_SOURCE";
    public String IconCompatParcelizer;

    public /* synthetic */ parseDevice() {
    }

    public int describeContents() {
        return 0;
    }

    public parseDevice(String str) {
        this.IconCompatParcelizer = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.IconCompatParcelizer;
        String str2 = ((parseDevice) obj).IconCompatParcelizer;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.IconCompatParcelizer;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.IconCompatParcelizer);
    }

    protected parseDevice(Parcel parcel) {
        this.IconCompatParcelizer = parcel.readString();
    }
}
