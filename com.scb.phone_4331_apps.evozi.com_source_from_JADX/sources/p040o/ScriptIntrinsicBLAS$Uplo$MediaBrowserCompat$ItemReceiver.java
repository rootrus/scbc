package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.ScriptIntrinsicBLAS;

/* renamed from: o.ScriptIntrinsicBLAS$Uplo$MediaBrowserCompat$ItemReceiver */
public final class ScriptIntrinsicBLAS$Uplo$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator<ScriptIntrinsicBLAS.Uplo> {
    private ScriptIntrinsicBLAS$Uplo$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ ScriptIntrinsicBLAS$Uplo$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new ScriptIntrinsicBLAS.Uplo(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ScriptIntrinsicBLAS.Uplo[i];
    }
}
