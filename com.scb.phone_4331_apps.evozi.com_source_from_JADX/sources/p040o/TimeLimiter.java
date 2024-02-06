package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.TimeLimiter */
public final class TimeLimiter implements Parcelable {
    public static final Parcelable.Creator<TimeLimiter> CREATOR = new Parcelable.Creator<TimeLimiter>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new TimeLimiter(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new TimeLimiter[i];
        }
    };
    public String MediaBrowserCompat$ItemReceiver;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public TimeLimiter(String str, String str2) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = str2;
    }

    protected TimeLimiter(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.read = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
    }
}
