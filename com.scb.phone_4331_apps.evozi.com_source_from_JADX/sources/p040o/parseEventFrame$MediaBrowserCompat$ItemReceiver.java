package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.parseEventFrame$MediaBrowserCompat$ItemReceiver */
public final class parseEventFrame$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator<parseEventFrame> {
    private parseEventFrame$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ parseEventFrame$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new parseEventFrame(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new parseEventFrame[i];
    }
}
