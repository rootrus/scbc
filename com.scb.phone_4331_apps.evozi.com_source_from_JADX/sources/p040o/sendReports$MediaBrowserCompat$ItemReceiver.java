package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.sendReports$MediaBrowserCompat$ItemReceiver */
public final class sendReports$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator<sendReports> {
    private sendReports$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ sendReports$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new sendReports(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new sendReports[i];
    }
}
