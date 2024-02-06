package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.access$lambda$4 */
public enum access$lambda$4 implements Parcelable {
    BANKAC,
    DUMMY;
    
    public static final Parcelable.Creator CREATOR = null;

    /* renamed from: o.access$lambda$4$read */
    public static final class read implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return (access$lambda$4) Enum.valueOf(access$lambda$4.class, parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new access$lambda$4[i];
        }
    }

    static {
        CREATOR = new read();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(name());
    }
}
