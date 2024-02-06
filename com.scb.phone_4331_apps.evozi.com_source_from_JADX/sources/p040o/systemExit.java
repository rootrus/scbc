package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.systemExit */
public final class systemExit implements Parcelable {
    public static final Parcelable.Creator CREATOR = new write();
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$SearchResultReceiver;
    public Double MediaMetadataCompat;
    public String read;
    public String write;

    /* renamed from: o.systemExit$write */
    public static final class write implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new systemExit(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new systemExit[i];
        }
    }

    public systemExit() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof systemExit)) {
            return false;
        }
        systemExit systemexit = (systemExit) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) systemexit.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) systemexit.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) systemexit.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) systemexit.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) systemexit.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) systemexit.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) systemexit.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        Double d = this.MediaMetadataCompat;
        int hashCode3 = d != null ? d.hashCode() : 0;
        String str3 = this.write;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.IconCompatParcelizer;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CardTransactionDisplay(merchantName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", transactionDate=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", transactionAmt=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", postDate=");
        sb.append(this.write);
        sb.append(", refNo=");
        sb.append(this.read);
        sb.append(", cycleNo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", sequenceNo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        Double d = this.MediaMetadataCompat;
        if (d != null) {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.write);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
    }

    public systemExit(String str, String str2, Double d, String str3, String str4, String str5, String str6) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$SearchResultReceiver = str2;
        this.MediaMetadataCompat = d;
        this.write = str3;
        this.read = str4;
        this.MediaBrowserCompat$ItemReceiver = str5;
        this.IconCompatParcelizer = str6;
    }

    public /* synthetic */ systemExit(byte b) {
        this("", "", Double.valueOf(0.0d), "", "", "", "");
    }
}
