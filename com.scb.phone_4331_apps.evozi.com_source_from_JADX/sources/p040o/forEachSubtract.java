package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.forEachSubtract */
public class forEachSubtract extends ZTBSV {
    public static final Parcelable.Creator<forEachSubtract> CREATOR = new Parcelable.Creator<forEachSubtract>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new forEachSubtract(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new forEachSubtract[i];
        }
    };

    @HmlPinActivity
    public forEachSubtract() {
    }

    public forEachSubtract(Parcel parcel) {
        super(parcel);
    }
}
