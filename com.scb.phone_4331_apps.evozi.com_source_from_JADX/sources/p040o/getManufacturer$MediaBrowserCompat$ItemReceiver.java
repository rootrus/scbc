package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getManufacturer$MediaBrowserCompat$ItemReceiver */
public final class getManufacturer$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator<getManufacturer> {
    getManufacturer$MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "source");
        return new getManufacturer(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new getManufacturer[i];
    }
}
