package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.gzipInputStream$MediaBrowserCompat$ItemReceiver */
public final class gzipInputStream$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator<gzipInputStream> {
    private gzipInputStream$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ gzipInputStream$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new gzipInputStream(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new gzipInputStream[i];
    }
}
