package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ZSYMM */
public final class ZSYMM extends ZTBSV {
    public static final read CREATOR = new read((byte) 0);

    public ZSYMM() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ZSYMM(Parcel parcel) {
        this();
        onGetStartedClick.write((Object) parcel, "parcel");
        IconCompatParcelizer(parcel);
    }

    /* renamed from: o.ZSYMM$read */
    public static final class read implements Parcelable.Creator<ZSYMM> {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new ZSYMM(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ZSYMM[i];
        }
    }
}
