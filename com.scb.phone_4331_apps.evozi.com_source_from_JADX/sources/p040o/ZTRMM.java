package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ZTRMM */
public final class ZTRMM extends ZTBSV {
    public static final write CREATOR = new write((byte) 0);

    public final int describeContents() {
        return 0;
    }

    public ZTRMM() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ZTRMM(Parcel parcel) {
        this();
        onGetStartedClick.write((Object) parcel, "parcel");
        IconCompatParcelizer(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        super.writeToParcel(parcel, i);
    }

    /* renamed from: o.ZTRMM$write */
    public static final class write implements Parcelable.Creator<ZTRMM> {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new ZTRMM(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ZTRMM[i];
        }
    }
}
