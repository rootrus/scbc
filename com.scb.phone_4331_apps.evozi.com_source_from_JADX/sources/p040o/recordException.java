package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.recordException */
public final class recordException implements Parcelable {
    public static final Parcelable.Creator CREATOR = new read();
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    /* renamed from: o.recordException$read */
    public static final class read implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new recordException(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new recordException[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof recordException)) {
            return false;
        }
        recordException recordexception = (recordException) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) recordexception.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) recordexception.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) recordexception.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) recordexception.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) recordexception.read);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebitCardResetPinDisplay(cardNumber=");
        sb.append(this.write);
        sb.append(", encryptedPIN=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", e2eeSid=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", serverRandom=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", pubKeyIndex=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
    }

    public recordException(String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "cardNumber");
        onGetStartedClick.write((Object) str2, "encryptedPIN");
        onGetStartedClick.write((Object) str3, "e2eeSid");
        onGetStartedClick.write((Object) str4, "serverRandom");
        onGetStartedClick.write((Object) str5, "pubKeyIndex");
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.IconCompatParcelizer = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
        this.read = str5;
    }
}
