package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getWorkingFileForSession$MediaBrowserCompat$ItemReceiver */
public final class getWorkingFileForSession$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator<getWorkingFileForSession> {
    getWorkingFileForSession$MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "source");
        return new getWorkingFileForSession(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new getWorkingFileForSession[i];
    }
}
