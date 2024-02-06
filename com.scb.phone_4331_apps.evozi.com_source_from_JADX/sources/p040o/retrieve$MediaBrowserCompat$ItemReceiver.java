package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.retrieve$MediaBrowserCompat$ItemReceiver */
public final class retrieve$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator<retrieve> {
    private retrieve$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ retrieve$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new retrieve(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new retrieve[i];
    }
}
