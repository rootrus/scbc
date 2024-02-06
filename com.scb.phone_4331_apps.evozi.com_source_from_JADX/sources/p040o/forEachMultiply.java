package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.forEachMultiply */
public final class forEachMultiply extends ZTBSV {
    public static final Parcelable.Creator<forEachMultiply> CREATOR = new Parcelable.Creator<forEachMultiply>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new forEachMultiply(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new forEachMultiply[i];
        }
    };
    public String IconCompatParcelizer;

    public final int describeContents() {
        return 0;
    }

    public forEachMultiply() {
    }

    protected forEachMultiply(Parcel parcel) {
        super(parcel);
    }

    public final void write(String str, String str2, String str3) {
        if (!(true ^ (str2 == null || str2.length() == 0))) {
            str2 = str3;
        }
        read("fund", str2);
        read("keyword", str);
    }
}
