package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getLogString$MediaBrowserCompat$ItemReceiver */
public final class getLogString$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator<getLogString> {
    getLogString$MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "source");
        return new getLogString(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new getLogString[i];
    }
}
