package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getApplicationId */
public final class getApplicationId implements Parcelable {
    public static final getApplicationId$MediaBrowserCompat$CustomActionResultReceiver CREATOR = new getApplicationId$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public getApplicationId() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public getApplicationId(Parcel parcel) {
        this();
        onGetStartedClick.write((Object) parcel, "parcel");
        this.read = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.write = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.read);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.write);
    }
}
