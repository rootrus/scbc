package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Scopes;
import p040o.ForwardingCheckedFuture;

/* renamed from: o.persistEvent */
public final class persistEvent extends ForwardingCheckedFuture.SimpleForwardingCheckedFuture implements Parcelable {
    public static final persistEvent$MediaBrowserCompat$CustomActionResultReceiver CREATOR = new persistEvent$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof persistEvent)) {
            return false;
        }
        persistEvent persistevent = (persistEvent) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) persistevent.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) persistevent.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) persistevent.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) persistevent.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) persistevent.write);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.write;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SCBSOnboardingSuccessDisplay(transactionDateTime=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", name=");
        sb.append(this.read);
        sb.append(", accountNickname=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountNo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", email=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public persistEvent(String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "transactionDateTime");
        onGetStartedClick.write((Object) str2, "name");
        onGetStartedClick.write((Object) str3, "accountNickname");
        onGetStartedClick.write((Object) str4, "accountNo");
        onGetStartedClick.write((Object) str5, Scopes.EMAIL);
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.write = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public persistEvent(android.os.Parcel r10) {
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
        throw new UnsupportedOperationException("Method not decompiled: p040o.persistEvent.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.write);
    }
}
