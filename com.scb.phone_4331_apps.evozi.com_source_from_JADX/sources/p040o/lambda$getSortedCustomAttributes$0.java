package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.lambda$getSortedCustomAttributes$0 */
public final class lambda$getSortedCustomAttributes$0 implements Parcelable {
    public static final C4933xfba60f7 CREATOR = new C4933xfba60f7((byte) 0);
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lambda$getSortedCustomAttributes$0)) {
            return false;
        }
        lambda$getSortedCustomAttributes$0 lambda_getsortedcustomattributes_0 = (lambda$getSortedCustomAttributes$0) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) lambda_getsortedcustomattributes_0.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) lambda_getsortedcustomattributes_0.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SourceOfFundDisplay(code=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", description=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public lambda$getSortedCustomAttributes$0(String str, String str2) {
        onGetStartedClick.write((Object) str, "code");
        onGetStartedClick.write((Object) str2, "description");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = str2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public lambda$getSortedCustomAttributes$0(android.os.Parcel r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: p040o.lambda$getSortedCustomAttributes$0.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.write);
    }
}
