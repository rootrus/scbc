package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ResponseParser */
public final class ResponseParser implements Parcelable {
    public static final read CREATOR = new read((byte) 0);
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2778x50fd9e4a;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String RatingCompat;
    public String read;
    public String write;

    public ResponseParser() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseParser)) {
            return false;
        }
        ResponseParser responseParser = (ResponseParser) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) responseParser.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2778x50fd9e4a, (Object) responseParser.f2778x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) responseParser.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) responseParser.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) responseParser.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) responseParser.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) responseParser.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) responseParser.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) responseParser.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) responseParser.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) responseParser.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) responseParser.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) responseParser.MediaSessionCompat$ResultReceiverWrapper);
    }

    public final int hashCode() {
        String str = this.MediaSessionCompat$QueueItem;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f2778x50fd9e4a;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$MediaItem;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaDescriptionCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.RatingCompat;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaMetadataCompat;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.read;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode11 = str11 != null ? str11.hashCode() : 0;
        String str12 = this.IconCompatParcelizer;
        int hashCode12 = str12 != null ? str12.hashCode() : 0;
        String str13 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str13 != null) {
            i = str13.hashCode();
        }
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InputAddressDisplay(unitNumber=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", floorNumber=");
        sb.append(this.f2778x50fd9e4a);
        sb.append(", addressNumber=");
        sb.append(this.write);
        sb.append(", addressVillage=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", addressMoo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", addressTrok=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", addressSoi=");
        sb.append(this.RatingCompat);
        sb.append(", addressThanon=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", addressAmphur=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", addressDistrict=");
        sb.append(this.read);
        sb.append(", addressProvince=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", addressCountryCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", addressZipCode=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(")");
        return sb.toString();
    }

    private ResponseParser(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        onGetStartedClick.write((Object) str, "unitNumber");
        onGetStartedClick.write((Object) str2, "floorNumber");
        onGetStartedClick.write((Object) str3, "addressNumber");
        onGetStartedClick.write((Object) str4, "addressVillage");
        onGetStartedClick.write((Object) str5, "addressMoo");
        onGetStartedClick.write((Object) str6, "addressTrok");
        onGetStartedClick.write((Object) str7, "addressSoi");
        onGetStartedClick.write((Object) str8, "addressThanon");
        onGetStartedClick.write((Object) str9, "addressAmphur");
        onGetStartedClick.write((Object) str10, "addressDistrict");
        onGetStartedClick.write((Object) str11, "addressProvince");
        onGetStartedClick.write((Object) str12, "addressCountryCode");
        onGetStartedClick.write((Object) str13, "addressZipCode");
        this.MediaSessionCompat$QueueItem = str;
        this.f2778x50fd9e4a = str2;
        this.write = str3;
        this.MediaBrowserCompat$MediaItem = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = str5;
        this.MediaDescriptionCompat = str6;
        this.RatingCompat = str7;
        this.MediaMetadataCompat = str8;
        this.MediaBrowserCompat$ItemReceiver = str9;
        this.read = str10;
        this.MediaBrowserCompat$SearchResultReceiver = str11;
        this.IconCompatParcelizer = str12;
        this.MediaSessionCompat$ResultReceiverWrapper = str13;
    }

    private /* synthetic */ ResponseParser(byte b) {
        this("", "", "", "", "", "", "", "", "", "", "", "", "");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ResponseParser(android.os.Parcel r19) {
        /*
            r18 = this;
            r0 = r19
            java.lang.String r1 = "parcel"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r1 = "$this$readStringNonNull"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r19.readString()
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x0016
            r5 = r3
            goto L_0x0017
        L_0x0016:
            r5 = r2
        L_0x0017:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r19.readString()
            if (r2 != 0) goto L_0x0022
            r6 = r3
            goto L_0x0023
        L_0x0022:
            r6 = r2
        L_0x0023:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r19.readString()
            if (r2 != 0) goto L_0x002e
            r7 = r3
            goto L_0x002f
        L_0x002e:
            r7 = r2
        L_0x002f:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r19.readString()
            if (r2 != 0) goto L_0x003a
            r8 = r3
            goto L_0x003b
        L_0x003a:
            r8 = r2
        L_0x003b:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r19.readString()
            if (r2 != 0) goto L_0x0046
            r9 = r3
            goto L_0x0047
        L_0x0046:
            r9 = r2
        L_0x0047:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r19.readString()
            if (r2 != 0) goto L_0x0052
            r10 = r3
            goto L_0x0053
        L_0x0052:
            r10 = r2
        L_0x0053:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r19.readString()
            if (r2 != 0) goto L_0x005e
            r11 = r3
            goto L_0x005f
        L_0x005e:
            r11 = r2
        L_0x005f:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r19.readString()
            if (r2 != 0) goto L_0x006a
            r12 = r3
            goto L_0x006b
        L_0x006a:
            r12 = r2
        L_0x006b:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r19.readString()
            if (r2 != 0) goto L_0x0076
            r13 = r3
            goto L_0x0077
        L_0x0076:
            r13 = r2
        L_0x0077:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r19.readString()
            if (r2 != 0) goto L_0x0082
            r14 = r3
            goto L_0x0083
        L_0x0082:
            r14 = r2
        L_0x0083:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r19.readString()
            if (r2 != 0) goto L_0x008e
            r15 = r3
            goto L_0x008f
        L_0x008e:
            r15 = r2
        L_0x008f:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r19.readString()
            if (r2 != 0) goto L_0x009b
            r16 = r3
            goto L_0x009d
        L_0x009b:
            r16 = r2
        L_0x009d:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r0 = r19.readString()
            if (r0 != 0) goto L_0x00a9
            r17 = r3
            goto L_0x00ab
        L_0x00a9:
            r17 = r0
        L_0x00ab:
            r4 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ResponseParser.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.f2778x50fd9e4a);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
    }

    /* renamed from: o.ResponseParser$read */
    public static final class read implements Parcelable.Creator<ResponseParser> {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new ResponseParser(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ResponseParser[i];
        }
    }
}
