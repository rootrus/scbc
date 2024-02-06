package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.finalizeSession */
public final class finalizeSession extends writeSessionApp implements Parcelable {
    public static final Parcelable.Creator<finalizeSession> CREATOR = new Parcelable.Creator<finalizeSession>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new finalizeSession(parcel, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new finalizeSession[i];
        }
    };
    public String MediaBrowserCompat$ItemReceiver;

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ finalizeSession(Parcel parcel, byte b) {
        this(parcel);
    }

    public finalizeSession() {
    }

    public static finalizeSession MediaBrowserCompat$CustomActionResultReceiver() {
        return new finalizeSession();
    }

    private finalizeSession(Parcel parcel) {
        super(parcel);
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }
}
