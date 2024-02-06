package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setProximityOn */
public class setProximityOn extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<setProximityOn> CREATOR = new Parcelable.Creator<setProximityOn>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setProximityOn[0];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new setProximityOn(parcel);
        }
    };
    public String IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$ItemReceiver;
    private String read;

    public int describeContents() {
        return 0;
    }

    public setProximityOn(Parcel parcel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.read = parcel.readString();
    }

    public setProximityOn(String str, String str2, String str3, String str4) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.read = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setProximityOn setproximityon = (setProximityOn) obj;
        if (this.IconCompatParcelizer != setproximityon.IconCompatParcelizer) {
            return false;
        }
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null ? setproximityon.MediaBrowserCompat$CustomActionResultReceiver != null : !str.equals(setproximityon.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 == null ? setproximityon.MediaBrowserCompat$ItemReceiver != null : !str2.equals(setproximityon.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str3 = this.read;
        String str4 = setproximityon.read;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
    }
}
