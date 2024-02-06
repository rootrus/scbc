package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.CrashlyticsNativeComponent */
public final class CrashlyticsNativeComponent implements Parcelable {
    public static final Parcelable.Creator<CrashlyticsNativeComponent> CREATOR = new Parcelable.Creator<CrashlyticsNativeComponent>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CrashlyticsNativeComponent(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CrashlyticsNativeComponent[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public boolean read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public CrashlyticsNativeComponent(String str, String str2, String str3, String str4, boolean z) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.write = str3;
        this.IconCompatParcelizer = str4;
        this.read = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeByte(this.read ? (byte) 1 : 0);
    }

    protected CrashlyticsNativeComponent(Parcel parcel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.write = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.read = parcel.readByte() != 1 ? false : true;
    }
}
