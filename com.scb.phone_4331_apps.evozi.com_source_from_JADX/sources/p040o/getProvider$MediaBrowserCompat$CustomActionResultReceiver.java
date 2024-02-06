package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getProvider$MediaBrowserCompat$CustomActionResultReceiver */
public final class getProvider$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator<getProvider> {
    private getProvider$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ getProvider$MediaBrowserCompat$CustomActionResultReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new getProvider(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new getProvider[i];
    }
}
