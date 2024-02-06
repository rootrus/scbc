package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.doWriteToLog$MediaBrowserCompat$CustomActionResultReceiver */
public final class doWriteToLog$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator<doWriteToLog> {
    private doWriteToLog$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ doWriteToLog$MediaBrowserCompat$CustomActionResultReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new doWriteToLog(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new doWriteToLog[i];
    }
}
