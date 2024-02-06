package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.serializeEvent */
public final class serializeEvent extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<serializeEvent> CREATOR = new Parcelable.Creator<serializeEvent>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new serializeEvent(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new serializeEvent[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String RatingCompat;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ serializeEvent(serializeEvent$MediaBrowserCompat$CustomActionResultReceiver serializeevent_mediabrowsercompat_customactionresultreceiver, byte b) {
        this(serializeevent_mediabrowsercompat_customactionresultreceiver);
    }

    private serializeEvent(serializeEvent$MediaBrowserCompat$CustomActionResultReceiver serializeevent_mediabrowsercompat_customactionresultreceiver) {
        this.write = false;
        this.RatingCompat = serializeevent_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
        this.IconCompatParcelizer = serializeevent_mediabrowsercompat_customactionresultreceiver.write;
        this.read = serializeevent_mediabrowsercompat_customactionresultreceiver.read;
        this.MediaBrowserCompat$CustomActionResultReceiver = serializeevent_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$ItemReceiver = null;
    }

    protected serializeEvent(Parcel parcel) {
        this.RatingCompat = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }
}
