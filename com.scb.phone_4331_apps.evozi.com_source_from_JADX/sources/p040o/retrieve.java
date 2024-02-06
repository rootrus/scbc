package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.retrieve */
public final class retrieve implements Parcelable {
    public static final retrieve$MediaBrowserCompat$ItemReceiver CREATOR = new retrieve$MediaBrowserCompat$ItemReceiver((byte) 0);
    public final Double IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof retrieve)) {
            return false;
        }
        retrieve retrieve = (retrieve) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) retrieve.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) retrieve.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) retrieve.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) retrieve.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        Double d = this.IconCompatParcelizer;
        if (d != null) {
            i = d.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreditCardFullAmountDisplay(merchantId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", terminalId=");
        sb.append(this.read);
        sb.append(", orderReference=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", paymentAmount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public retrieve(String str, String str2, String str3, Double d) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.IconCompatParcelizer = d;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public retrieve(android.os.Parcel r5) {
        /*
            r4 = this;
            java.lang.String r0 = "parcel"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
            java.lang.String r0 = r5.readString()
            java.lang.String r1 = r5.readString()
            java.lang.String r2 = r5.readString()
            java.lang.Class r3 = java.lang.Double.TYPE
            java.lang.ClassLoader r3 = r3.getClassLoader()
            java.lang.Object r5 = r5.readValue(r3)
            boolean r3 = r5 instanceof java.lang.Double
            if (r3 != 0) goto L_0x0020
            r5 = 0
        L_0x0020:
            java.lang.Double r5 = (java.lang.Double) r5
            r4.<init>(r0, r1, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.retrieve.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeValue(this.IconCompatParcelizer);
    }
}
