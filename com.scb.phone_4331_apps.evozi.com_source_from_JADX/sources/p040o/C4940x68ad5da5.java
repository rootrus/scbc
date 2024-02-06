package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.listCompleteSessionFiles$MediaBrowserCompat$CustomActionResultReceiver */
public final class C4940x68ad5da5 implements Parcelable.Creator<listCompleteSessionFiles> {
    private C4940x68ad5da5() {
    }

    public /* synthetic */ C4940x68ad5da5(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new listCompleteSessionFiles(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new listCompleteSessionFiles[i];
    }
}
