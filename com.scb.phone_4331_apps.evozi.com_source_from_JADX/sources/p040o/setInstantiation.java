package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setInstantiation */
public final class setInstantiation implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IconCompatParcelizer();
    private final boolean IconCompatParcelizer;
    private final int MediaBrowserCompat$CustomActionResultReceiver;
    public final boolean MediaBrowserCompat$ItemReceiver;
    public final int read;

    /* renamed from: o.setInstantiation$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new setInstantiation(readInt, readInt2, z2, z);
        }

        public final Object[] newArray(int i) {
            return new setInstantiation[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setInstantiation)) {
            return false;
        }
        setInstantiation setinstantiation = (setInstantiation) obj;
        return this.read == setinstantiation.read && this.MediaBrowserCompat$CustomActionResultReceiver == setinstantiation.MediaBrowserCompat$CustomActionResultReceiver && this.MediaBrowserCompat$ItemReceiver == setinstantiation.MediaBrowserCompat$ItemReceiver && this.IconCompatParcelizer == setinstantiation.IconCompatParcelizer;
    }

    public final int hashCode() {
        int i = this.read;
        int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        boolean z3 = this.IconCompatParcelizer;
        if (!z3) {
            z2 = z3;
        }
        return (((((i * 31) + i2) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ECouponTransactionPaginateDisplay(currentPage=");
        sb.append(this.read);
        sb.append(", pageSize=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", hasNextPage=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", hasPreviousPage=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(this.read);
        parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver ? 1 : 0);
        parcel.writeInt(this.IconCompatParcelizer ? 1 : 0);
    }

    public setInstantiation(int i, int i2, boolean z, boolean z2) {
        this.read = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = i2;
        this.MediaBrowserCompat$ItemReceiver = z;
        this.IconCompatParcelizer = z2;
    }
}
