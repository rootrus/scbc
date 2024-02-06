package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.forEachSrcIn */
public final class forEachSrcIn extends ZTBSV {
    public static final read CREATOR = new read((byte) 0);

    public forEachSrcIn() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public forEachSrcIn(Parcel parcel) {
        super(parcel);
        onGetStartedClick.write((Object) parcel, "parcel");
    }

    /* renamed from: o.forEachSrcIn$read */
    public static final class read implements Parcelable.Creator<forEachSrcIn> {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new forEachSrcIn(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new forEachSrcIn[i];
        }
    }
}
