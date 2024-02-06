package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getIdentifierUtf8Bytes */
public final class getIdentifierUtf8Bytes implements Parcelable {
    public static final IconCompatParcelizer CREATOR = new IconCompatParcelizer((byte) 0);
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String read;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getIdentifierUtf8Bytes)) {
            return false;
        }
        getIdentifierUtf8Bytes getidentifierutf8bytes = (getIdentifierUtf8Bytes) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getidentifierutf8bytes.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getidentifierutf8bytes.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TierPricingInstallmentDisplay(title=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", value=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public getIdentifierUtf8Bytes(String str, String str2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public getIdentifierUtf8Bytes(Parcel parcel) {
        this(parcel.readString(), parcel.readString());
        onGetStartedClick.write((Object) parcel, "parcel");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
    }

    /* renamed from: o.getIdentifierUtf8Bytes$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator<getIdentifierUtf8Bytes> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new getIdentifierUtf8Bytes(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getIdentifierUtf8Bytes[i];
        }
    }
}
