package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ZTRSV */
public final class ZTRSV extends ZTBSV {
    public static final read CREATOR = new read((byte) 0);

    public final int describeContents() {
        return 0;
    }

    public ZTRSV() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ZTRSV(Parcel parcel) {
        this();
        onGetStartedClick.write((Object) parcel, "parcel");
    }

    /* renamed from: o.ZTRSV$read */
    public static final class read implements Parcelable.Creator<ZTRSV> {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new ZTRSV(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ZTRSV[i];
        }
    }
}
