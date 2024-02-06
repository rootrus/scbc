package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.forEachDstOver */
public final class forEachDstOver extends ZTBSV {
    public static final Parcelable.Creator<forEachDstOver> CREATOR = new Parcelable.Creator<forEachDstOver>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new forEachDstOver(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new forEachDstOver[i];
        }
    };

    public forEachDstOver() {
    }

    public forEachDstOver(Parcel parcel) {
        super(parcel);
    }
}
