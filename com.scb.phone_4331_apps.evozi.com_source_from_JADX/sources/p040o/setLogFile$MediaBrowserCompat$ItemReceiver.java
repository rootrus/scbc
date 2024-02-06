package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setLogFile$MediaBrowserCompat$ItemReceiver */
public final class setLogFile$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator<setLogFile> {
    setLogFile$MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "source");
        return new setLogFile(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new setLogFile[i];
    }
}
