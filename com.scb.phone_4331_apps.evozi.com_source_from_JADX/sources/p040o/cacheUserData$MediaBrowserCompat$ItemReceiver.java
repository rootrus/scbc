package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.cacheUserData$MediaBrowserCompat$ItemReceiver */
public final class cacheUserData$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator<cacheUserData> {
    private cacheUserData$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ cacheUserData$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new cacheUserData(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new cacheUserData[i];
    }
}
