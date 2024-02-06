package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.forEachAdd */
public final class forEachAdd extends ZTBSV {
    public static final Parcelable.Creator<forEachAdd> CREATOR = new Parcelable.Creator<forEachAdd>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new forEachAdd(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new forEachAdd[i];
        }
    };

    public forEachAdd() {
    }

    public forEachAdd(Parcel parcel) {
        super(parcel);
    }
}
