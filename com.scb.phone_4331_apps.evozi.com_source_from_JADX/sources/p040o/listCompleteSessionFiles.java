package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.listCompleteSessionFiles */
public final class listCompleteSessionFiles implements Parcelable {
    public static final C4940x68ad5da5 CREATOR = new C4940x68ad5da5((byte) 0);
    public final List<getIdentifierUtf8Bytes> IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final String MediaMetadataCompat;
    public final String read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof listCompleteSessionFiles)) {
            return false;
        }
        listCompleteSessionFiles listcompletesessionfiles = (listCompleteSessionFiles) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) listcompletesessionfiles.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) listcompletesessionfiles.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) listcompletesessionfiles.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) listcompletesessionfiles.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) listcompletesessionfiles.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) listcompletesessionfiles.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) listcompletesessionfiles.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaMetadataCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        List<getIdentifierUtf8Bytes> list = this.IconCompatParcelizer;
        int hashCode5 = list != null ? list.hashCode() : 0;
        String str5 = this.read;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.write;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlOutcomePendingWithAIPDisplay(date=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", loanAmount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", repaymentAmount=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", repaymentFrequency=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", installments=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", duration=");
        sb.append(this.read);
        sb.append(", durationFrequency=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public listCompleteSessionFiles(String str, String str2, String str3, String str4, List<getIdentifierUtf8Bytes> list, String str5, String str6) {
        onGetStartedClick.write((Object) str2, "loanAmount");
        onGetStartedClick.write((Object) str3, "repaymentAmount");
        onGetStartedClick.write((Object) str4, "repaymentFrequency");
        onGetStartedClick.write((Object) list, "installments");
        onGetStartedClick.write((Object) str5, "duration");
        onGetStartedClick.write((Object) str6, "durationFrequency");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaMetadataCompat = str3;
        this.MediaBrowserCompat$SearchResultReceiver = str4;
        this.IconCompatParcelizer = list;
        this.read = str5;
        this.write = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public listCompleteSessionFiles(android.os.Parcel r10) {
        /*
            r9 = this;
            java.lang.String r0 = "parcel"
            p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r0)
            java.lang.String r2 = r10.readString()
            java.lang.String r0 = "$this$readStringNonNull"
            p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r0)
            java.lang.String r1 = r10.readString()
            java.lang.String r3 = ""
            if (r1 != 0) goto L_0x0018
            r4 = r3
            goto L_0x0019
        L_0x0018:
            r4 = r1
        L_0x0019:
            p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r0)
            java.lang.String r1 = r10.readString()
            if (r1 != 0) goto L_0x0024
            r5 = r3
            goto L_0x0025
        L_0x0024:
            r5 = r1
        L_0x0025:
            p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r0)
            java.lang.String r1 = r10.readString()
            if (r1 != 0) goto L_0x0030
            r6 = r3
            goto L_0x0031
        L_0x0030:
            r6 = r1
        L_0x0031:
            o.getIdentifierUtf8Bytes$IconCompatParcelizer r1 = p040o.getIdentifierUtf8Bytes.CREATOR
            android.os.Parcelable$Creator r1 = (android.os.Parcelable.Creator) r1
            java.util.ArrayList r1 = r10.createTypedArrayList(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x0041
            o.HmlNationalIdActivity r1 = p040o.HmlNationalIdActivity.IconCompatParcelizer
            java.util.List r1 = (java.util.List) r1
        L_0x0041:
            r7 = r1
            p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r0)
            java.lang.String r1 = r10.readString()
            if (r1 != 0) goto L_0x004d
            r8 = r3
            goto L_0x004e
        L_0x004d:
            r8 = r1
        L_0x004e:
            p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r0)
            java.lang.String r10 = r10.readString()
            if (r10 != 0) goto L_0x0058
            r10 = r3
        L_0x0058:
            r1 = r9
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.listCompleteSessionFiles.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeTypedList(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.write);
    }
}
