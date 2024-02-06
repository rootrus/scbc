package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ZTRMV */
public final class ZTRMV extends ZTBSV {
    public static final Parcelable.Creator<ZTRMV> CREATOR = new Parcelable.Creator<ZTRMV>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ZTRMV(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ZTRMV[i];
        }
    };

    public ZTRMV() {
    }

    public ZTRMV(Parcel parcel) {
        super(parcel);
    }
}
