package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.endTask */
public final class endTask implements Parcelable {
    public static final endTask$MediaBrowserCompat$CustomActionResultReceiver CREATOR = new endTask$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    public final String IconCompatParcelizer;
    public final long MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof endTask)) {
            return false;
        }
        endTask endtask = (endTask) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) endtask.read) && this.MediaBrowserCompat$ItemReceiver == endtask.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) endtask.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) endtask.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.MediaBrowserCompat$ItemReceiver;
        int i2 = (int) (j ^ (j >>> 32));
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((hashCode * 31) + i2) * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GenerateQRDisplay(expiredTimeMessage=");
        sb.append(this.read);
        sb.append(", validDuration=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", qrCode=");
        sb.append(this.write);
        sb.append(", barcode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public endTask(String str, long j, String str2, String str3) {
        onGetStartedClick.write((Object) str, "expiredTimeMessage");
        onGetStartedClick.write((Object) str2, "qrCode");
        onGetStartedClick.write((Object) str3, "barcode");
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = j;
        this.write = str2;
        this.IconCompatParcelizer = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public endTask(android.os.Parcel r10) {
        /*
            r9 = this;
            java.lang.String r0 = "parcel"
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
            long r5 = r10.readLong()
            p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r0)
            java.lang.String r1 = r10.readString()
            if (r1 != 0) goto L_0x0024
            r7 = r2
            goto L_0x0025
        L_0x0024:
            r7 = r1
        L_0x0025:
            p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r0)
            java.lang.String r10 = r10.readString()
            if (r10 != 0) goto L_0x0030
            r8 = r2
            goto L_0x0031
        L_0x0030:
            r8 = r10
        L_0x0031:
            r3 = r9
            r3.<init>(r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.endTask.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.read);
        parcel.writeLong(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
    }
}
