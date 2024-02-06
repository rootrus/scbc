package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.makeChecked */
public enum makeChecked implements Parcelable {
    IMAGE,
    TEXT,
    VERTICAL_TEXT;
    
    public static final Parcelable.Creator CREATOR = null;

    /* renamed from: o.makeChecked$write */
    public static final class write implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return (makeChecked) Enum.valueOf(makeChecked.class, parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new makeChecked[i];
        }
    }

    static {
        CREATOR = new write();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(name());
    }
}
