package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import p040o.ScriptIntrinsicBLAS;

/* renamed from: o.ZTRSM */
public final class ZTRSM extends ZTBSV {
    public static final Parcelable.Creator<ScriptIntrinsicBLAS.Diag> CREATOR = new Parcelable.Creator<ScriptIntrinsicBLAS.Diag>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ScriptIntrinsicBLAS.Diag(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ScriptIntrinsicBLAS.Diag[i];
        }
    };

    public final Collection<ZSYR2K> write() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.values();
    }
}
