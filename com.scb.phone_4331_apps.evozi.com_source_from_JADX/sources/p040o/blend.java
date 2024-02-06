package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.blend */
public final class blend extends ZTBSV {
    public static final Parcelable.Creator<blend> CREATOR = new Parcelable.Creator<blend>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new blend(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new blend[i];
        }
    };

    public blend() {
    }

    public blend(Parcel parcel) {
        super(parcel);
    }
}
