package p040o;

import android.os.Parcel;
import p040o.CrashlyticsReport;

/* renamed from: o.writeNonFatalEventsTo */
public final class writeNonFatalEventsTo implements loadInBackground {
    public static final C5459xac62f5d7 CREATOR = new C5459xac62f5d7((byte) 0);
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaDescriptionCompat;
    public final String read;
    public final CrashlyticsReport.FilesPayload.Builder write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof writeNonFatalEventsTo)) {
            return false;
        }
        writeNonFatalEventsTo writenonfataleventsto = (writeNonFatalEventsTo) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) writenonfataleventsto.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) writenonfataleventsto.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) writenonfataleventsto.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) writenonfataleventsto.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) writenonfataleventsto.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) writenonfataleventsto.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaDescriptionCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        CrashlyticsReport.FilesPayload.Builder builder = this.write;
        int hashCode5 = builder != null ? builder.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlCounterOfferDisplay(title=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", header=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", amount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", frequency=");
        sb.append(this.read);
        sb.append(", promotion=");
        sb.append(this.write);
        sb.append(", icon=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public writeNonFatalEventsTo(String str, String str2, String str3, String str4, CrashlyticsReport.FilesPayload.Builder builder, String str5) {
        onGetStartedClick.write((Object) str2, "header");
        onGetStartedClick.write((Object) str3, "amount");
        onGetStartedClick.write((Object) str4, "frequency");
        this.MediaDescriptionCompat = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.read = str4;
        this.write = builder;
        this.IconCompatParcelizer = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public writeNonFatalEventsTo(android.os.Parcel r9) {
        /*
            r8 = this;
            java.lang.String r0 = "parcel"
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r0)
            java.lang.String r2 = r9.readString()
            java.lang.String r0 = "$this$readStringNonNull"
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r0)
            java.lang.String r1 = r9.readString()
            java.lang.String r3 = ""
            if (r1 != 0) goto L_0x0018
            r4 = r3
            goto L_0x0019
        L_0x0018:
            r4 = r1
        L_0x0019:
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r0)
            java.lang.String r1 = r9.readString()
            if (r1 != 0) goto L_0x0024
            r5 = r3
            goto L_0x0025
        L_0x0024:
            r5 = r1
        L_0x0025:
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r0)
            java.lang.String r0 = r9.readString()
            if (r0 != 0) goto L_0x002f
            r0 = r3
        L_0x002f:
            java.lang.Class<o.CrashlyticsReport$FilesPayload$Builder> r1 = p040o.CrashlyticsReport.FilesPayload.Builder.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r9.readParcelable(r1)
            r6 = r1
            o.CrashlyticsReport$FilesPayload$Builder r6 = (p040o.CrashlyticsReport.FilesPayload.Builder) r6
            java.lang.String r7 = r9.readString()
            r1 = r8
            r3 = r4
            r4 = r5
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.writeNonFatalEventsTo.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
        parcel.writeParcelable(this.write, i);
        parcel.writeString(this.IconCompatParcelizer);
    }
}
