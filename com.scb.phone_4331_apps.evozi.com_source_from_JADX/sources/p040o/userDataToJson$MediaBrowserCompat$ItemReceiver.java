package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.userDataToJson$MediaBrowserCompat$ItemReceiver */
public final class userDataToJson$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator<userDataToJson> {
    private userDataToJson$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ userDataToJson$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new userDataToJson(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new userDataToJson[i];
    }
}
