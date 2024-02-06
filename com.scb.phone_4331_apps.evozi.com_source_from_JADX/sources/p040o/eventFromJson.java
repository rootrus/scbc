package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.eventFromJson */
public final class eventFromJson extends parseSession implements Parcelable {
    public static final Parcelable.Creator<eventFromJson> CREATOR = new Parcelable.Creator<eventFromJson>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new eventFromJson(parcel, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new eventFromJson[i];
        }
    };
    public String MediaBrowserCompat$ItemReceiver;
    public animateCameraWithCallback MediaBrowserCompat$MediaItem;

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ eventFromJson(Parcel parcel, byte b) {
        this(parcel);
    }

    public eventFromJson() {
    }

    private eventFromJson(Parcel parcel) {
        super(parcel);
        animateCameraWithCallback animatecamerawithcallback;
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            animatecamerawithcallback = null;
        } else {
            animatecamerawithcallback = animateCameraWithCallback.values()[readInt];
        }
        this.MediaBrowserCompat$MediaItem = animatecamerawithcallback;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        animateCameraWithCallback animatecamerawithcallback = this.MediaBrowserCompat$MediaItem;
        parcel.writeInt(animatecamerawithcallback == null ? -1 : animatecamerawithcallback.ordinal());
    }
}
