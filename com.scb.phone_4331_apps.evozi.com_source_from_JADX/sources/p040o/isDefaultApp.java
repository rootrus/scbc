package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.isDefaultApp */
public final class isDefaultApp implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IconCompatParcelizer();
    public double IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public double MediaBrowserCompat$SearchResultReceiver;
    public String read;
    public String write;

    /* renamed from: o.isDefaultApp$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new isDefaultApp(parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new isDefaultApp[i];
        }
    }

    public isDefaultApp() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isDefaultApp)) {
            return false;
        }
        isDefaultApp isdefaultapp = (isDefaultApp) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) isdefaultapp.read) && Double.compare(this.IconCompatParcelizer, isdefaultapp.IconCompatParcelizer) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) isdefaultapp.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) isdefaultapp.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) isdefaultapp.MediaBrowserCompat$ItemReceiver) && Double.compare(this.MediaBrowserCompat$SearchResultReceiver, isdefaultapp.MediaBrowserCompat$SearchResultReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) isdefaultapp.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.IconCompatParcelizer);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$MediaItem;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        long doubleToLongBits2 = Double.doubleToLongBits(this.MediaBrowserCompat$SearchResultReceiver);
        int i3 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((((((hashCode * 31) + i2) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MerchantPaymentDetail(merchantName=");
        sb.append(this.read);
        sb.append(", totalAmount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", microRef=");
        sb.append(this.write);
        sb.append(", transDate=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", postDate=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", transactionAmount=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", formattedTotalAmount=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.read);
        parcel.writeDouble(this.IconCompatParcelizer);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeDouble(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public isDefaultApp(String str, double d, String str2, String str3, String str4, double d2, String str5) {
        this.read = str;
        this.IconCompatParcelizer = d;
        this.write = str2;
        this.MediaBrowserCompat$MediaItem = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
        this.MediaBrowserCompat$SearchResultReceiver = d2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str5;
    }

    public /* synthetic */ isDefaultApp(byte b) {
        this("", 0.0d, "", "", "", 0.0d, "");
    }
}
