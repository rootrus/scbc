package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.MissingNativeComponent$MediaBrowserCompat$ItemReceiver */
public final class MissingNativeComponent$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator<MissingNativeComponent> {
    MissingNativeComponent$MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "source");
        return new MissingNativeComponent(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MissingNativeComponent[i];
    }
}
