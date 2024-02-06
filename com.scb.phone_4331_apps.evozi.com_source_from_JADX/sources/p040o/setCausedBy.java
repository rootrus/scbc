package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setCausedBy */
public final class setCausedBy implements Parcelable {
    public static final setCausedBy$MediaBrowserCompat$CustomActionResultReceiver CREATOR = new setCausedBy$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    public final String IconCompatParcelizer;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setCausedBy)) {
            return false;
        }
        setCausedBy setcausedby = (setCausedBy) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setcausedby.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setcausedby.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CountryDisplay(countryName=");
        sb.append(this.write);
        sb.append(", countryCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public setCausedBy(String str, String str2) {
        onGetStartedClick.write((Object) str, "countryName");
        onGetStartedClick.write((Object) str2, "countryCode");
        this.write = str;
        this.IconCompatParcelizer = str2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public setCausedBy(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
            java.lang.String r0 = "$this$readStringNonNull"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
            java.lang.String r1 = r4.readString()
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x0013
            r1 = r2
        L_0x0013:
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
            java.lang.String r4 = r4.readString()
            if (r4 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r2 = r4
        L_0x001e:
            r3.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setCausedBy.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
    }
}
