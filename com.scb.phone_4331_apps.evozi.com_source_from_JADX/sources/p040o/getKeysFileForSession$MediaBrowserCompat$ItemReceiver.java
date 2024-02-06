package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getKeysFileForSession$MediaBrowserCompat$ItemReceiver */
public final class getKeysFileForSession$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator<getKeysFileForSession> {
    private getKeysFileForSession$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ getKeysFileForSession$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new getKeysFileForSession(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new getKeysFileForSession[i];
    }
}
