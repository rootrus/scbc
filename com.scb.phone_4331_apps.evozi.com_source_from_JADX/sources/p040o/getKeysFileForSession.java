package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: o.getKeysFileForSession */
public final class getKeysFileForSession implements Parcelable {
    public static final getKeysFileForSession$MediaBrowserCompat$ItemReceiver CREATOR = new getKeysFileForSession$MediaBrowserCompat$ItemReceiver((byte) 0);
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getKeysFileForSession)) {
            return false;
        }
        getKeysFileForSession getkeysfileforsession = (getKeysFileForSession) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getkeysfileforsession.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getkeysfileforsession.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getkeysfileforsession.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductDetailItemDisplay(label=");
        sb.append(this.write);
        sb.append(", value=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", type=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getKeysFileForSession(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "label");
        onGetStartedClick.write((Object) str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        onGetStartedClick.write((Object) str3, "type");
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public getKeysFileForSession(android.os.Parcel r5) {
        /*
            r4 = this;
            java.lang.String r0 = "parcel"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
            java.lang.String r0 = "$this$readStringNonNull"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
            java.lang.String r1 = r5.readString()
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x0013
            r1 = r2
        L_0x0013:
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
            java.lang.String r3 = r5.readString()
            if (r3 != 0) goto L_0x001d
            r3 = r2
        L_0x001d:
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
            java.lang.String r5 = r5.readString()
            if (r5 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r2 = r5
        L_0x0028:
            r4.<init>(r1, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getKeysFileForSession.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
