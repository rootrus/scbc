package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.readElement */
public final class readElement implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IconCompatParcelizer();
    public final String MediaBrowserCompat$ItemReceiver;
    public final String write;

    /* renamed from: o.readElement$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new readElement(parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new readElement[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof readElement)) {
            return false;
        }
        readElement readelement = (readElement) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) readelement.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) readelement.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressConfirmationDisplay(requestDatetime=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", requestID=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.write);
    }

    public readElement(String str, String str2) {
        onGetStartedClick.write((Object) str, "requestDatetime");
        onGetStartedClick.write((Object) str2, "requestID");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
    }
}
