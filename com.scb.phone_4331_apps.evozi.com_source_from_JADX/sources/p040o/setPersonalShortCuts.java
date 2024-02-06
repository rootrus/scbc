package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setPersonalShortCuts */
public enum setPersonalShortCuts implements Parcelable {
    SUBMISSION,
    RESUBMISSION;
    
    public static final read CREATOR = null;

    static {
        CREATOR = new read((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(ordinal());
    }

    /* renamed from: o.setPersonalShortCuts$read */
    public static final class read implements Parcelable.Creator<setPersonalShortCuts> {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return setPersonalShortCuts.values()[parcel.readInt()];
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setPersonalShortCuts[i];
        }
    }
}
