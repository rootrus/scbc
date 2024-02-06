package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.onMarkerClick$MediaBrowserCompat$CustomActionResultReceiver */
public final class onMarkerClick$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator<onMarkerClick> {
    private onMarkerClick$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ onMarkerClick$MediaBrowserCompat$CustomActionResultReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new onMarkerClick(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new onMarkerClick[i];
    }
}
