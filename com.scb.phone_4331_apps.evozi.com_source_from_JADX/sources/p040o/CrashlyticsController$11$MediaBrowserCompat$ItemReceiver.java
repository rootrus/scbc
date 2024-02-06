package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.CrashlyticsController;

/* renamed from: o.CrashlyticsController$11$MediaBrowserCompat$ItemReceiver */
public final class CrashlyticsController$11$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator<CrashlyticsController.C321911> {
    private CrashlyticsController$11$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ CrashlyticsController$11$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new CrashlyticsController.C321911(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CrashlyticsController.C321911[i];
    }
}
