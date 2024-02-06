package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.removeDependent */
public class removeDependent implements Parcelable {
    public static final Parcelable.Creator<removeDependent> CREATOR = new Parcelable.Creator<removeDependent>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new removeDependent((byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new removeDependent[i];
        }
    };

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public removeDependent() {
    }

    public removeDependent(byte b) {
    }
}
