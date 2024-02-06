package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getKernelIDDstAtop */
public final class getKernelIDDstAtop extends ZTBSV {
    public static final write CREATOR = new write((byte) 0);

    public final int describeContents() {
        return 0;
    }

    public getKernelIDDstAtop() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public getKernelIDDstAtop(Parcel parcel) {
        this();
        onGetStartedClick.write((Object) parcel, "parcel");
        IconCompatParcelizer(parcel);
    }

    /* renamed from: o.getKernelIDDstAtop$write */
    public static final class write implements Parcelable.Creator<getKernelIDDstAtop> {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new getKernelIDDstAtop(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getKernelIDDstAtop[i];
        }
    }
}
