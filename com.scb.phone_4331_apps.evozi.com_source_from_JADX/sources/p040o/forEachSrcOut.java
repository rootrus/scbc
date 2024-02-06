package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.forEachSrcOut */
public final class forEachSrcOut extends ZTBSV {
    public static final Parcelable.Creator<forEachDstIn> CREATOR = new write();

    /* renamed from: o.forEachSrcOut$write */
    public static final class write implements Parcelable.Creator<forEachDstIn> {
        write() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new forEachDstIn(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new forEachDstIn[i];
        }
    }
}
