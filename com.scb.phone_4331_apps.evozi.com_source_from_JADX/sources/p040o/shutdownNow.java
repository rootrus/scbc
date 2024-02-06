package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* renamed from: o.shutdownNow */
public final class shutdownNow implements Parcelable {
    public static final Parcelable.Creator<shutdownNow> CREATOR = new IconCompatParcelizer();
    @SerializedName("remainingLimit")
    public final String IconCompatParcelizer;
    @SerializedName("validDuration")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("qrCode")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("expiryDateTime")
    public final String read;
    @SerializedName("function")
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shutdownNow)) {
            return false;
        }
        shutdownNow shutdownnow = (shutdownNow) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) shutdownnow.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) shutdownnow.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) shutdownnow.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) shutdownnow.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) shutdownnow.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BScanCEntryPointDisplay(function=");
        sb.append(this.write);
        sb.append(", expiryDateTime=");
        sb.append(this.read);
        sb.append(", validDuration=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", qrCode=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", remainingLimit=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public shutdownNow(String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "function");
        onGetStartedClick.write((Object) str2, "expiryDateTime");
        onGetStartedClick.write((Object) str3, "validDuration");
        onGetStartedClick.write((Object) str4, "qrCode");
        onGetStartedClick.write((Object) str5, "remainingLimit");
        this.write = str;
        this.read = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
        this.IconCompatParcelizer = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public shutdownNow(android.os.Parcel r10) {
        /*
            r9 = this;
            java.lang.String r0 = "source"
            p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r0)
            java.lang.String r0 = "$this$readStringNonNull"
            p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r0)
            java.lang.String r1 = r10.readString()
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x0014
            r4 = r2
            goto L_0x0015
        L_0x0014:
            r4 = r1
        L_0x0015:
            p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r0)
            java.lang.String r1 = r10.readString()
            if (r1 != 0) goto L_0x0020
            r5 = r2
            goto L_0x0021
        L_0x0020:
            r5 = r1
        L_0x0021:
            p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r0)
            java.lang.String r1 = r10.readString()
            if (r1 != 0) goto L_0x002c
            r6 = r2
            goto L_0x002d
        L_0x002c:
            r6 = r1
        L_0x002d:
            p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r0)
            java.lang.String r1 = r10.readString()
            if (r1 != 0) goto L_0x0038
            r7 = r2
            goto L_0x0039
        L_0x0038:
            r7 = r1
        L_0x0039:
            p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r0)
            java.lang.String r10 = r10.readString()
            if (r10 != 0) goto L_0x0044
            r8 = r2
            goto L_0x0045
        L_0x0044:
            r8 = r10
        L_0x0045:
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.shutdownNow.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
        parcel.writeString(this.write);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
    }

    /* renamed from: o.shutdownNow$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator<shutdownNow> {
        IconCompatParcelizer() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "source");
            return new shutdownNow(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new shutdownNow[i];
        }
    }
}
