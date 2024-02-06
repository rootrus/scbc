package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.GoogleMap;

/* renamed from: o.GoogleMap$OnCameraIdleListener$MediaBrowserCompat$ItemReceiver */
public final class GoogleMap$OnCameraIdleListener$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator<GoogleMap.OnCameraIdleListener> {
    private GoogleMap$OnCameraIdleListener$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ GoogleMap$OnCameraIdleListener$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new GoogleMap.OnCameraIdleListener(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoogleMap.OnCameraIdleListener[i];
    }
}
