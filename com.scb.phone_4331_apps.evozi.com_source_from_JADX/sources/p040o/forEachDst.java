package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.forEachDst */
public final class forEachDst extends ZTBSV {
    public static final Parcelable.Creator<forEachDst> CREATOR = new Parcelable.Creator<forEachDst>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new forEachDst(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new forEachDst[i];
        }
    };

    public final int describeContents() {
        return 0;
    }

    public forEachDst() {
    }

    protected forEachDst(Parcel parcel) {
        super(parcel);
    }
}
