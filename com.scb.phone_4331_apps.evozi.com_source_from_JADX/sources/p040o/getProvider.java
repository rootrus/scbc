package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getProvider */
public final class getProvider implements Parcelable {
    public static final getProvider$MediaBrowserCompat$CustomActionResultReceiver CREATOR = new getProvider$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    private final String RatingCompat;
    public final String read;
    public final Double write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getProvider)) {
            return false;
        }
        getProvider getprovider = (getProvider) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getprovider.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getprovider.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) getprovider.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getprovider.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getprovider.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getprovider.read);
    }

    public final int hashCode() {
        Double d = this.write;
        int i = 0;
        int hashCode = d != null ? d.hashCode() : 0;
        String str = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.RatingCompat;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BillPaymentDisplay(paymentAmount=");
        sb.append(this.write);
        sb.append(", accountTo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountFrom=");
        sb.append(this.RatingCompat);
        sb.append(", ref1=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", ref2=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", ref3=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public getProvider(Double d, String str, String str2, String str3, String str4, String str5) {
        this.write = d;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.RatingCompat = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.IconCompatParcelizer = str4;
        this.read = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public getProvider(android.os.Parcel r9) {
        /*
            r8 = this;
            java.lang.String r0 = "parcel"
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r0)
            java.lang.Class r0 = java.lang.Double.TYPE
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r9.readValue(r0)
            boolean r1 = r0 instanceof java.lang.Double
            if (r1 != 0) goto L_0x0014
            r0 = 0
        L_0x0014:
            r2 = r0
            java.lang.Double r2 = (java.lang.Double) r2
            java.lang.String r3 = r9.readString()
            java.lang.String r4 = r9.readString()
            java.lang.String r5 = r9.readString()
            java.lang.String r6 = r9.readString()
            java.lang.String r7 = r9.readString()
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getProvider.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeValue(this.write);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
    }
}
