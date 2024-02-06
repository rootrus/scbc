package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.forEachXor */
public final class forEachXor extends ZTBSV {
    public static final Parcelable.Creator<forEachXor> CREATOR = new Parcelable.Creator<forEachXor>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new forEachXor(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new forEachXor[i];
        }
    };

    public forEachXor() {
    }

    public forEachXor(Parcel parcel) {
        super(parcel);
    }
}
