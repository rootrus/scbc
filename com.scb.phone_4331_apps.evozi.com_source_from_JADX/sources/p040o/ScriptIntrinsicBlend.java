package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ScriptIntrinsicBlend */
public final class ScriptIntrinsicBlend extends ZTBSV {
    public static final Parcelable.Creator<ScriptIntrinsicBlend> CREATOR = new Parcelable.Creator<ScriptIntrinsicBlend>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ScriptIntrinsicBlend(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ScriptIntrinsicBlend[i];
        }
    };

    public ScriptIntrinsicBlend() {
    }

    public ScriptIntrinsicBlend(Parcel parcel) {
        super(parcel);
    }
}
