package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.valueOrNull */
public final class valueOrNull implements Parcelable {
    public static final valueOrNull$MediaBrowserCompat$CustomActionResultReceiver CREATOR = new valueOrNull$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final boolean MediaBrowserCompat$SearchResultReceiver;
    public final List<getKeysFileForSession> MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String RatingCompat;
    public final String read;
    public final int write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof valueOrNull)) {
            return false;
        }
        valueOrNull valueornull = (valueOrNull) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) valueornull.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) valueornull.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) valueornull.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) valueornull.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) valueornull.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) valueornull.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) valueornull.MediaBrowserCompat$CustomActionResultReceiver) && this.MediaBrowserCompat$SearchResultReceiver == valueornull.MediaBrowserCompat$SearchResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) valueornull.MediaMetadataCompat) && this.write == valueornull.write;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$MediaItem;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.RatingCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        List<getKeysFileForSession> list = this.MediaDescriptionCompat;
        int hashCode5 = list != null ? list.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        boolean z = this.MediaBrowserCompat$SearchResultReceiver;
        if (z) {
            z = true;
        }
        String str7 = this.MediaMetadataCompat;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (z ? 1 : 0)) * 31) + i) * 31) + this.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductDetailListDisplay(marketValue=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", symbol=");
        sb.append(this.RatingCompat);
        sb.append(", fullNameLabel=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", fullNameValue=");
        sb.append(this.read);
        sb.append(", items=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", formattedUnrealizedAmount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", formattedDisclaimer=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", hasTradeNow=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", tradeNowAppId=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", arrowDirection=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public valueOrNull(String str, String str2, String str3, String str4, List<getKeysFileForSession> list, String str5, String str6, boolean z, String str7, int i) {
        onGetStartedClick.write((Object) str, "marketValue");
        onGetStartedClick.write((Object) str2, "symbol");
        onGetStartedClick.write((Object) str3, "fullNameLabel");
        onGetStartedClick.write((Object) str4, "fullNameValue");
        onGetStartedClick.write((Object) list, "items");
        onGetStartedClick.write((Object) str5, "formattedUnrealizedAmount");
        onGetStartedClick.write((Object) str6, "formattedDisclaimer");
        onGetStartedClick.write((Object) str7, "tradeNowAppId");
        this.MediaBrowserCompat$MediaItem = str;
        this.RatingCompat = str2;
        this.IconCompatParcelizer = str3;
        this.read = str4;
        this.MediaDescriptionCompat = list;
        this.MediaBrowserCompat$ItemReceiver = str5;
        this.MediaBrowserCompat$CustomActionResultReceiver = str6;
        this.MediaBrowserCompat$SearchResultReceiver = z;
        this.MediaMetadataCompat = str7;
        this.write = i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public valueOrNull(android.os.Parcel r15) {
        /*
            r14 = this;
            java.lang.String r0 = "parcel"
            p040o.onGetStartedClick.write((java.lang.Object) r15, (java.lang.String) r0)
            java.lang.String r0 = "$this$readStringNonNull"
            p040o.onGetStartedClick.write((java.lang.Object) r15, (java.lang.String) r0)
            java.lang.String r1 = r15.readString()
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x0014
            r4 = r2
            goto L_0x0015
        L_0x0014:
            r4 = r1
        L_0x0015:
            p040o.onGetStartedClick.write((java.lang.Object) r15, (java.lang.String) r0)
            java.lang.String r1 = r15.readString()
            if (r1 != 0) goto L_0x0020
            r5 = r2
            goto L_0x0021
        L_0x0020:
            r5 = r1
        L_0x0021:
            p040o.onGetStartedClick.write((java.lang.Object) r15, (java.lang.String) r0)
            java.lang.String r1 = r15.readString()
            if (r1 != 0) goto L_0x002c
            r6 = r2
            goto L_0x002d
        L_0x002c:
            r6 = r1
        L_0x002d:
            p040o.onGetStartedClick.write((java.lang.Object) r15, (java.lang.String) r0)
            java.lang.String r1 = r15.readString()
            if (r1 != 0) goto L_0x0038
            r7 = r2
            goto L_0x0039
        L_0x0038:
            r7 = r1
        L_0x0039:
            o.getKeysFileForSession$MediaBrowserCompat$ItemReceiver r1 = p040o.getKeysFileForSession.CREATOR
            android.os.Parcelable$Creator r1 = (android.os.Parcelable.Creator) r1
            java.util.ArrayList r1 = r15.createTypedArrayList(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x0049
            o.HmlNationalIdActivity r1 = p040o.HmlNationalIdActivity.IconCompatParcelizer
            java.util.List r1 = (java.util.List) r1
        L_0x0049:
            r8 = r1
            p040o.onGetStartedClick.write((java.lang.Object) r15, (java.lang.String) r0)
            java.lang.String r1 = r15.readString()
            if (r1 != 0) goto L_0x0055
            r9 = r2
            goto L_0x0056
        L_0x0055:
            r9 = r1
        L_0x0056:
            p040o.onGetStartedClick.write((java.lang.Object) r15, (java.lang.String) r0)
            java.lang.String r1 = r15.readString()
            if (r1 != 0) goto L_0x0061
            r10 = r2
            goto L_0x0062
        L_0x0061:
            r10 = r1
        L_0x0062:
            byte r1 = r15.readByte()
            if (r1 == 0) goto L_0x006a
            r1 = 1
            goto L_0x006b
        L_0x006a:
            r1 = 0
        L_0x006b:
            r11 = r1
            p040o.onGetStartedClick.write((java.lang.Object) r15, (java.lang.String) r0)
            java.lang.String r0 = r15.readString()
            if (r0 != 0) goto L_0x0077
            r12 = r2
            goto L_0x0078
        L_0x0077:
            r12 = r0
        L_0x0078:
            int r13 = r15.readInt()
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.valueOrNull.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeTypedList(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeByte(this.MediaBrowserCompat$SearchResultReceiver ? (byte) 1 : 0);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeInt(this.write);
    }
}
