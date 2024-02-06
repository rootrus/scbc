package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ensureReceiverRegistered */
public final class ensureReceiverRegistered extends FirebaseTooManyRequestsException implements Parcelable {
    public static final C4379xfa14e0fc CREATOR = new C4379xfa14e0fc((byte) 0);
    public boolean IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String RatingCompat;
    public String read;
    public String write;

    public ensureReceiverRegistered() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ensureReceiverRegistered(Parcel parcel) {
        super(parcel);
        onGetStartedClick.write((Object) parcel, "parcel");
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.write = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.read = parcel.readString();
        this.IconCompatParcelizer = parcel.readInt() != 1 ? false : true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.read);
        parcel.writeInt(this.IconCompatParcelizer ? 1 : 0);
    }
}
