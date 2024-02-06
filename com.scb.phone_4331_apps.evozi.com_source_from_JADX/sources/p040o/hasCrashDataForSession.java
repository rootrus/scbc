package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.hasCrashDataForSession */
public final class hasCrashDataForSession extends getSessionFileProvider implements Parcelable {
    public static final Parcelable.Creator<hasCrashDataForSession> CREATOR = new Parcelable.Creator<hasCrashDataForSession>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new hasCrashDataForSession(parcel, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hasCrashDataForSession[i];
        }
    };
    public String IconCompatParcelizer;
    public List<writeSessionDevice> MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ hasCrashDataForSession(Parcel parcel, byte b) {
        this(parcel);
    }

    public hasCrashDataForSession() {
    }

    public static hasCrashDataForSession read() {
        return new hasCrashDataForSession();
    }

    private hasCrashDataForSession(Parcel parcel) {
        super(parcel);
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.createTypedArrayList(writeSessionDevice.CREATOR);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
        parcel.writeTypedList(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
