package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.access$lambda$5 */
public enum access$lambda$5 implements Parcelable {
    BILLERID,
    EWALLETID,
    NATID,
    MSISDN;
    
    public static final Parcelable.Creator CREATOR = null;

    /* renamed from: o.access$lambda$5$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return (access$lambda$5) Enum.valueOf(access$lambda$5.class, parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new access$lambda$5[i];
        }
    }

    static {
        CREATOR = new IconCompatParcelizer();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(name());
    }
}
