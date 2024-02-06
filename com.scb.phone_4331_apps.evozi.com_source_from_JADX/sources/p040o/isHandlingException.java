package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import org.bouncycastle.i18n.MessageBundle;

/* renamed from: o.isHandlingException */
public final class isHandlingException implements Parcelable {
    public static final C4825xd3bf956d CREATOR = new C4825xd3bf956d((byte) 0);
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
        if (!(obj instanceof isHandlingException)) {
            return false;
        }
        isHandlingException ishandlingexception = (isHandlingException) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ishandlingexception.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ishandlingexception.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ishandlingexception.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlOutcomePendingDisplay(title=");
        sb.append(this.read);
        sb.append(", subtitle=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", date=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public isHandlingException(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) str2, "subtitle");
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public isHandlingException(android.os.Parcel r4) {
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
            java.lang.String r0 = r4.readString()
            if (r0 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r2 = r0
        L_0x001e:
            java.lang.String r4 = r4.readString()
            r3.<init>(r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.isHandlingException.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }
}
