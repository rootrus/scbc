package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.parseEventFrame */
public final class parseEventFrame implements Parcelable {
    public static final parseEventFrame$MediaBrowserCompat$ItemReceiver CREATOR = new parseEventFrame$MediaBrowserCompat$ItemReceiver((byte) 0);
    public final String IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    private final String MediaBrowserCompat$MediaItem;
    private final String MediaBrowserCompat$SearchResultReceiver;
    private final String MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final String RatingCompat;
    public final String read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof parseEventFrame)) {
            return false;
        }
        parseEventFrame parseeventframe = (parseEventFrame) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) parseeventframe.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) parseeventframe.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) parseeventframe.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) parseeventframe.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) parseeventframe.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) parseeventframe.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) parseeventframe.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) parseeventframe.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) parseeventframe.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) parseeventframe.read);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.RatingCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaMetadataCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaDescriptionCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.write;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$MediaItem;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.read;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TopUpRepeatDisplay(accountFrom=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", serviceNumber=");
        sb.append(this.RatingCompat);
        sb.append(", amount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", billerLogo=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", billerName=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", billerAccountNumber=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", billerId=");
        sb.append(this.write);
        sb.append(", billerType=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", ref1Label=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", ref2Label=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public parseEventFrame(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        onGetStartedClick.write((Object) str2, "serviceNumber");
        onGetStartedClick.write((Object) str4, "billerLogo");
        onGetStartedClick.write((Object) str5, "billerName");
        onGetStartedClick.write((Object) str6, "billerAccountNumber");
        onGetStartedClick.write((Object) str7, "billerId");
        onGetStartedClick.write((Object) str8, "billerType");
        onGetStartedClick.write((Object) str9, "ref1Label");
        this.IconCompatParcelizer = str;
        this.RatingCompat = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.MediaMetadataCompat = str4;
        this.MediaDescriptionCompat = str5;
        this.MediaBrowserCompat$CustomActionResultReceiver = str6;
        this.write = str7;
        this.MediaBrowserCompat$MediaItem = str8;
        this.MediaBrowserCompat$SearchResultReceiver = str9;
        this.read = str10;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public parseEventFrame(android.os.Parcel r13) {
        /*
            r12 = this;
            java.lang.String r0 = "parcel"
            p040o.onGetStartedClick.write((java.lang.Object) r13, (java.lang.String) r0)
            java.lang.String r2 = r13.readString()
            java.lang.String r0 = "$this$readStringNonNull"
            p040o.onGetStartedClick.write((java.lang.Object) r13, (java.lang.String) r0)
            java.lang.String r1 = r13.readString()
            java.lang.String r3 = ""
            if (r1 != 0) goto L_0x0018
            r4 = r3
            goto L_0x0019
        L_0x0018:
            r4 = r1
        L_0x0019:
            java.lang.String r5 = r13.readString()
            p040o.onGetStartedClick.write((java.lang.Object) r13, (java.lang.String) r0)
            java.lang.String r1 = r13.readString()
            if (r1 != 0) goto L_0x0028
            r6 = r3
            goto L_0x0029
        L_0x0028:
            r6 = r1
        L_0x0029:
            p040o.onGetStartedClick.write((java.lang.Object) r13, (java.lang.String) r0)
            java.lang.String r1 = r13.readString()
            if (r1 != 0) goto L_0x0034
            r7 = r3
            goto L_0x0035
        L_0x0034:
            r7 = r1
        L_0x0035:
            p040o.onGetStartedClick.write((java.lang.Object) r13, (java.lang.String) r0)
            java.lang.String r1 = r13.readString()
            if (r1 != 0) goto L_0x0040
            r8 = r3
            goto L_0x0041
        L_0x0040:
            r8 = r1
        L_0x0041:
            p040o.onGetStartedClick.write((java.lang.Object) r13, (java.lang.String) r0)
            java.lang.String r1 = r13.readString()
            if (r1 != 0) goto L_0x004c
            r9 = r3
            goto L_0x004d
        L_0x004c:
            r9 = r1
        L_0x004d:
            p040o.onGetStartedClick.write((java.lang.Object) r13, (java.lang.String) r0)
            java.lang.String r1 = r13.readString()
            if (r1 != 0) goto L_0x0058
            r10 = r3
            goto L_0x0059
        L_0x0058:
            r10 = r1
        L_0x0059:
            p040o.onGetStartedClick.write((java.lang.Object) r13, (java.lang.String) r0)
            java.lang.String r0 = r13.readString()
            if (r0 != 0) goto L_0x0063
            r0 = r3
        L_0x0063:
            java.lang.String r11 = r13.readString()
            r1 = r12
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.parseEventFrame.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.read);
    }
}
