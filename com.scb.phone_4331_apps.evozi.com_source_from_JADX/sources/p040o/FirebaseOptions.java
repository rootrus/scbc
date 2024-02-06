package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.FirebaseOptions */
public final class FirebaseOptions extends FirebaseTooManyRequestsException implements Parcelable {
    public static final FirebaseOptions$MediaBrowserCompat$CustomActionResultReceiver CREATOR = new FirebaseOptions$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;
    public Double write;

    public FirebaseOptions() {
        this.MediaBrowserCompat$ItemReceiver = "";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseOptions(Parcel parcel) {
        super(parcel);
        onGetStartedClick.write((Object) parcel, "parcel");
        String str = "";
        this.MediaBrowserCompat$ItemReceiver = str;
        onGetStartedClick.write((Object) parcel, "$this$readStringNonNull");
        String readString = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = readString != null ? readString : str;
        Object readValue = parcel.readValue(Double.TYPE.getClassLoader());
        this.write = (Double) (!(readValue instanceof Double) ? null : readValue);
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.read = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeValue(this.write);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
    }
}
