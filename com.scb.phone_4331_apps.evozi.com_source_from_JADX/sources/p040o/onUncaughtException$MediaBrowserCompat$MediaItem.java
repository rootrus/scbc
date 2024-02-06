package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.onUncaughtException$MediaBrowserCompat$MediaItem */
public final class onUncaughtException$MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C5106x9ff5daef();
    public final boolean write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof onUncaughtException$MediaBrowserCompat$MediaItem) && this.write == ((onUncaughtException$MediaBrowserCompat$MediaItem) obj).write;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.write;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TcInfo(isAccepted=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(this.write ? 1 : 0);
    }

    public onUncaughtException$MediaBrowserCompat$MediaItem(boolean z) {
        this.write = z;
    }
}
