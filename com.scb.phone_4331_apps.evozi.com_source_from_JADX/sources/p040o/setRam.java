package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setRam */
public final class setRam implements Parcelable {
    public static final Parcelable.Creator CREATOR = new read();
    public final boolean IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final boolean read;
    public final String write;

    /* renamed from: o.setRam$read */
    public static final class read implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new setRam(z2, z, parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new setRam[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setRam)) {
            return false;
        }
        setRam setram = (setRam) obj;
        return this.IconCompatParcelizer == setram.IconCompatParcelizer && this.read == setram.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setram.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setram.write);
    }

    public final int hashCode() {
        boolean z = this.IconCompatParcelizer;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        boolean z3 = this.read;
        if (!z3) {
            z2 = z3;
        }
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((z ? 1 : 0) * true) + (z2 ? 1 : 0)) * 31) + hashCode) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidCashOutLandingToAccountDisplay(shouldDisplayLogo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", shouldDisplayClose=");
        sb.append(this.read);
        sb.append(", accountNumber=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", accountName=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(this.IconCompatParcelizer ? 1 : 0);
        parcel.writeInt(this.read ? 1 : 0);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.write);
    }

    public setRam(boolean z, boolean z2, String str, String str2) {
        onGetStartedClick.write((Object) str, "accountNumber");
        onGetStartedClick.write((Object) str2, "accountName");
        this.IconCompatParcelizer = z;
        this.read = z2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = str2;
    }
}
