package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.jsonToUserData */
public final class jsonToUserData implements Parcelable {
    public static final jsonToUserData$MediaBrowserCompat$ItemReceiver CREATOR = new jsonToUserData$MediaBrowserCompat$ItemReceiver((byte) 0);
    public final boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final List<userDataToJson> write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsonToUserData)) {
            return false;
        }
        jsonToUserData jsontouserdata = (jsonToUserData) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) jsontouserdata.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) jsontouserdata.MediaBrowserCompat$ItemReceiver) && this.MediaBrowserCompat$CustomActionResultReceiver == jsontouserdata.MediaBrowserCompat$CustomActionResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) jsontouserdata.read);
    }

    public final int hashCode() {
        List<userDataToJson> list = this.write;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        String str = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str != null ? str.hashCode() : 0;
        boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (z) {
            z = true;
        }
        String str2 = this.read;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + (z ? 1 : 0)) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OffshoreCurrencyDisplay(cashOffshores=");
        sb.append(this.write);
        sb.append(", disclaimer=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", showButton=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", appId=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public jsonToUserData(List<userDataToJson> list, String str, boolean z, String str2) {
        onGetStartedClick.write((Object) list, "cashOffshores");
        onGetStartedClick.write((Object) str, "disclaimer");
        onGetStartedClick.write((Object) str2, "appId");
        this.write = list;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.read = str2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public jsonToUserData(android.os.Parcel r7) {
        /*
            r6 = this;
            java.lang.String r0 = "parcel"
            p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r0)
            o.userDataToJson$MediaBrowserCompat$ItemReceiver r0 = p040o.userDataToJson.CREATOR
            android.os.Parcelable$Creator r0 = (android.os.Parcelable.Creator) r0
            java.util.ArrayList r0 = r7.createTypedArrayList(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x0015
            o.HmlNationalIdActivity r0 = p040o.HmlNationalIdActivity.IconCompatParcelizer
            java.util.List r0 = (java.util.List) r0
        L_0x0015:
            java.lang.String r1 = "$this$readStringNonNull"
            p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r1)
            java.lang.String r2 = r7.readString()
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x0023
            r2 = r3
        L_0x0023:
            byte r4 = r7.readByte()
            r5 = 0
            if (r4 == 0) goto L_0x002b
            r5 = 1
        L_0x002b:
            p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r1)
            java.lang.String r7 = r7.readString()
            if (r7 != 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r3 = r7
        L_0x0036:
            r6.<init>(r0, r2, r5, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.jsonToUserData.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeTypedList(this.write);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeByte(this.MediaBrowserCompat$CustomActionResultReceiver ? (byte) 1 : 0);
        parcel.writeString(this.read);
    }
}
