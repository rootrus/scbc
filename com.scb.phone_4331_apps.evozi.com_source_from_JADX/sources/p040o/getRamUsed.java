package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getRamUsed */
public class getRamUsed implements Parcelable {
    public static final Parcelable.Creator<getRamUsed> CREATOR = new Parcelable.Creator<getRamUsed>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getRamUsed(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getRamUsed[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String read;
    public String write;

    public int describeContents() {
        return 0;
    }

    public getRamUsed(String str, String str2, String str3, String str4) {
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.read = str3;
        this.write = str4;
    }

    protected getRamUsed(Parcel parcel) {
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.read = parcel.readString();
        this.write = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.write);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getRamUsed getramused = (getRamUsed) obj;
        if (this.IconCompatParcelizer.equals(getramused.IconCompatParcelizer) && this.MediaBrowserCompat$CustomActionResultReceiver.equals(getramused.MediaBrowserCompat$CustomActionResultReceiver) && this.read.equals(getramused.read)) {
            return this.write.equals(getramused.write);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.IconCompatParcelizer.hashCode();
        return (((((hashCode * 31) + this.MediaBrowserCompat$CustomActionResultReceiver.hashCode()) * 31) + this.read.hashCode()) * 31) + this.write.hashCode();
    }
}
