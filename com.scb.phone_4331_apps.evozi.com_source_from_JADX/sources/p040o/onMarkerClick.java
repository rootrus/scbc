package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.onMarkerClick */
public final class onMarkerClick implements Parcelable {
    public static final onMarkerClick$MediaBrowserCompat$CustomActionResultReceiver CREATOR = new onMarkerClick$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    public final boolean IconCompatParcelizer;
    public final boolean write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onMarkerClick)) {
            return false;
        }
        onMarkerClick onmarkerclick = (onMarkerClick) obj;
        return this.write == onmarkerclick.write && this.IconCompatParcelizer == onmarkerclick.IconCompatParcelizer;
    }

    public final int hashCode() {
        boolean z = this.write;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        boolean z3 = this.IconCompatParcelizer;
        if (!z3) {
            z2 = z3;
        }
        return ((z ? 1 : 0) * true) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VerifiedMethod(card=");
        sb.append(this.write);
        sb.append(", facial=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public onMarkerClick(boolean z, boolean z2) {
        this.write = z;
        this.IconCompatParcelizer = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public onMarkerClick(Parcel parcel) {
        this(parcel.readByte() != 0, parcel.readByte() == 0 ? false : true);
        onGetStartedClick.write((Object) parcel, "parcel");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeByte(this.write ? (byte) 1 : 0);
        parcel.writeByte(this.IconCompatParcelizer ? (byte) 1 : 0);
    }
}
