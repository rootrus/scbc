package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.construct$MediaBrowserCompat$ItemReceiver */
public final class construct$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator<construct> {
    construct$MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "source");
        return new construct(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new construct[i];
    }
}
