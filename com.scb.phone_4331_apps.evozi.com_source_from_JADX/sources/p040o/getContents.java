package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getContents */
public class getContents implements Parcelable {
    public static final Parcelable.Creator<getContents> CREATOR = new Parcelable.Creator<getContents>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getContents(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getContents[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public boolean read;
    public String write;

    public int describeContents() {
        return 0;
    }

    public static getContents MediaBrowserCompat$ItemReceiver() {
        return new getContents();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeByte(this.read ? (byte) 1 : 0);
    }

    public getContents() {
    }

    protected getContents(Parcel parcel) {
        this.write = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.read = parcel.readByte() != 0;
    }
}
