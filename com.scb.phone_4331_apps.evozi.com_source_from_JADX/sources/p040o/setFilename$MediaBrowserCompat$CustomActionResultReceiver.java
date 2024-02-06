package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setFilename$MediaBrowserCompat$CustomActionResultReceiver */
public final class setFilename$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator<setFilename> {
    private setFilename$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ setFilename$MediaBrowserCompat$CustomActionResultReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new setFilename(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new setFilename[i];
    }
}
