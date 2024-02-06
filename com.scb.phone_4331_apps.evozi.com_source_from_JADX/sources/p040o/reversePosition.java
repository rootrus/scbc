package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.reversePosition */
public final class reversePosition {
    @SerializedName("houseNumber")
    private final String IconCompatParcelizer;
    @SerializedName("countryCode")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("floor")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("road")
    private final String MediaBrowserCompat$MediaItem;
    @SerializedName("postalCode")
    private final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("unit")

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final String f5556x50fd9e4a;
    @SerializedName("subDistrict")
    private final String MediaDescriptionCompat;
    @SerializedName("moo")
    private final String MediaMetadataCompat;
    @SerializedName("trok")
    private final String MediaSessionCompat$QueueItem;
    @SerializedName("village")
    private final String MediaSessionCompat$Token;
    @SerializedName("province")
    private final String RatingCompat;
    @SerializedName("alley")
    private final String read;
    @SerializedName("district")
    private final String write;

    public reversePosition() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof reversePosition)) {
            return false;
        }
        reversePosition reverseposition = (reversePosition) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) reverseposition.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f5556x50fd9e4a, (Object) reverseposition.f5556x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) reverseposition.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) reverseposition.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) reverseposition.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) reverseposition.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) reverseposition.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) reverseposition.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) reverseposition.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) reverseposition.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) reverseposition.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) reverseposition.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) reverseposition.MediaBrowserCompat$SearchResultReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f5556x50fd9e4a;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaSessionCompat$Token;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaMetadataCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaSessionCompat$QueueItem;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.read;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$MediaItem;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.write;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaDescriptionCompat;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.RatingCompat;
        int hashCode11 = str11 != null ? str11.hashCode() : 0;
        String str12 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode12 = str12 != null ? str12.hashCode() : 0;
        String str13 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str13 != null) {
            i = str13.hashCode();
        }
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CurrentAddressRequest(houseNumber=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", unit=");
        sb.append(this.f5556x50fd9e4a);
        sb.append(", floor=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", village=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", moo=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", trok=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", alley=");
        sb.append(this.read);
        sb.append(", road=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", district=");
        sb.append(this.write);
        sb.append(", subDistrict=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", province=");
        sb.append(this.RatingCompat);
        sb.append(", countryCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", postalCode=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    private reversePosition(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.IconCompatParcelizer = str;
        this.f5556x50fd9e4a = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.MediaSessionCompat$Token = str4;
        this.MediaMetadataCompat = str5;
        this.MediaSessionCompat$QueueItem = null;
        this.read = str7;
        this.MediaBrowserCompat$MediaItem = str8;
        this.write = str9;
        this.MediaDescriptionCompat = str10;
        this.RatingCompat = str11;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.MediaBrowserCompat$SearchResultReceiver = str13;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ reversePosition(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, int r29) {
        /*
            r17 = this;
            r0 = r29
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r18
        L_0x000b:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0011
            r5 = r2
            goto L_0x0013
        L_0x0011:
            r5 = r19
        L_0x0013:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0019
            r6 = r2
            goto L_0x001b
        L_0x0019:
            r6 = r20
        L_0x001b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0021
            r7 = r2
            goto L_0x0023
        L_0x0021:
            r7 = r21
        L_0x0023:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0029
            r8 = r2
            goto L_0x002b
        L_0x0029:
            r8 = r22
        L_0x002b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0031
            r10 = r2
            goto L_0x0033
        L_0x0031:
            r10 = r23
        L_0x0033:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0039
            r11 = r2
            goto L_0x003b
        L_0x0039:
            r11 = r24
        L_0x003b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0041
            r12 = r2
            goto L_0x0043
        L_0x0041:
            r12 = r25
        L_0x0043:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0049
            r13 = r2
            goto L_0x004b
        L_0x0049:
            r13 = r26
        L_0x004b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0051
            r14 = r2
            goto L_0x0053
        L_0x0051:
            r14 = r27
        L_0x0053:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x005a
            r16 = r2
            goto L_0x005c
        L_0x005a:
            r16 = r28
        L_0x005c:
            r9 = 0
            r15 = 0
            r3 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.reversePosition.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
