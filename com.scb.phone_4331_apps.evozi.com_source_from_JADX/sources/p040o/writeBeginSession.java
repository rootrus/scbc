package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.writeBeginSession */
public final class writeBeginSession extends writeSessionApp implements Parcelable {
    public static final Parcelable.Creator<writeBeginSession> CREATOR = new Parcelable.Creator<writeBeginSession>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new writeBeginSession(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new writeBeginSession[i];
        }
    };
    public int MediaBrowserCompat$ItemReceiver;

    public final int describeContents() {
        return 0;
    }

    public writeBeginSession() {
    }

    public static writeBeginSession read() {
        return new writeBeginSession();
    }

    protected writeBeginSession(Parcel parcel) {
        super(parcel);
        this.MediaBrowserCompat$ItemReceiver = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver);
    }
}
