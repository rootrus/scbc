package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.jsonToUserData$MediaBrowserCompat$ItemReceiver */
public final class jsonToUserData$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator<jsonToUserData> {
    private jsonToUserData$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ jsonToUserData$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new jsonToUserData(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new jsonToUserData[i];
    }
}
