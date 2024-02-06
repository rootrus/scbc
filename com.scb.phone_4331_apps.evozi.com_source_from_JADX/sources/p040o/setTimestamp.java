package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setTimestamp */
public final class setTimestamp implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IconCompatParcelizer();
    public final boolean IconCompatParcelizer;
    public final String write;

    /* renamed from: o.setTimestamp$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new setTimestamp(parcel.readString(), parcel.readInt() != 0);
        }

        public final Object[] newArray(int i) {
            return new setTimestamp[i];
        }
    }

    public setTimestamp() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setTimestamp)) {
            return false;
        }
        setTimestamp settimestamp = (setTimestamp) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) settimestamp.write) && this.IconCompatParcelizer == settimestamp.IconCompatParcelizer;
    }

    public final int hashCode() {
        String str = this.write;
        int hashCode = str != null ? str.hashCode() : 0;
        boolean z = this.IconCompatParcelizer;
        if (z) {
            z = true;
        }
        return (hashCode * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SecuritiesWithStatusDisplay(error=");
        sb.append(this.write);
        sb.append(", securitiesUnregistered=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.write);
        parcel.writeInt(this.IconCompatParcelizer ? 1 : 0);
    }

    public setTimestamp(String str, boolean z) {
        this.write = str;
        this.IconCompatParcelizer = z;
    }

    private /* synthetic */ setTimestamp(byte b) {
        this((String) null, false);
    }
}
