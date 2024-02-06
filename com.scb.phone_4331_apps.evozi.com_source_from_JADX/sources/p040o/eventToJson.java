package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.eventToJson */
public final class eventToJson extends parseSession implements Parcelable {
    public static final Parcelable.Creator<eventToJson> CREATOR = new Parcelable.Creator<eventToJson>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new eventToJson(parcel, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new eventToJson[i];
        }
    };
    public String MediaBrowserCompat$ItemReceiver;

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ eventToJson(Parcel parcel, byte b) {
        this(parcel);
    }

    public eventToJson() {
    }

    private eventToJson(Parcel parcel) {
        super(parcel);
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }
}
