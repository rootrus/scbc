package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.CurrentTimeProvider */
public final class CurrentTimeProvider extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<CurrentTimeProvider> CREATOR = new Parcelable.Creator<CurrentTimeProvider>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CurrentTimeProvider(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CurrentTimeProvider[i];
        }
    };
    public String MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$ItemReceiver;
    public String read;

    public final int describeContents() {
        return 0;
    }

    protected CurrentTimeProvider(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.read = parcel.readString();
    }

    private CurrentTimeProvider() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
    }
}
