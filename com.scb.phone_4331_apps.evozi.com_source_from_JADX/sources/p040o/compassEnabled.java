package p040o;

/* renamed from: o.compassEnabled */
public final class compassEnabled {
    public final String IconCompatParcelizer;
    public final C4169camera MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final boolean MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean f2809x50fd9e4a;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompat$QueueItem;
    public final String MediaSessionCompat$ResultReceiverWrapper;
    public final Integer MediaSessionCompat$Token;
    public final String ParcelableVolumeInfo;
    public final String RatingCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof compassEnabled)) {
            return false;
        }
        compassEnabled compassenabled = (compassEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) compassenabled.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) compassenabled.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) compassenabled.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) compassenabled.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) compassenabled.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) compassenabled.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) compassenabled.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) compassenabled.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) compassenabled.write) && this.f2809x50fd9e4a == compassenabled.f2809x50fd9e4a && this.MediaBrowserCompat$MediaItem == compassenabled.MediaBrowserCompat$MediaItem && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) compassenabled.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) compassenabled.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) compassenabled.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) compassenabled.MediaSessionCompat$QueueItem);
    }

    public final int hashCode() {
        Integer num = this.MediaSessionCompat$Token;
        int hashCode = num != null ? num.hashCode() : 0;
        String str = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.ParcelableVolumeInfo;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.RatingCompat;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.IconCompatParcelizer;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode8 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.write;
        int hashCode9 = str8 != null ? str8.hashCode() : 0;
        boolean z = this.f2809x50fd9e4a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        boolean z3 = this.MediaBrowserCompat$MediaItem;
        if (!z3) {
            z2 = z3;
        }
        C4169camera camera = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode10 = camera != null ? camera.hashCode() : 0;
        String str9 = this.MediaMetadataCompat;
        int hashCode11 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaDescriptionCompat;
        int hashCode12 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.MediaSessionCompat$QueueItem;
        return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HistoryTransactionResponse(sortSequence=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", id=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", transactionDateTime=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", serviceNumber=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", referenceNo1=");
        sb.append(this.RatingCompat);
        sb.append(", accountTo=");
        sb.append(this.read);
        sb.append(", accountToName=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", bankLogo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", amount=");
        sb.append(this.write);
        sb.append(", repeatFlag=");
        sb.append(this.f2809x50fd9e4a);
        sb.append(", regenerateFlag=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", biller=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", promptpayId=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", promptpayType=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", transferType=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(")");
        return sb.toString();
    }

    private compassEnabled(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, C4169camera camera, String str9, String str10, String str11) {
        this.MediaSessionCompat$Token = num;
        this.MediaBrowserCompat$SearchResultReceiver = str;
        this.ParcelableVolumeInfo = str2;
        this.MediaSessionCompat$ResultReceiverWrapper = str3;
        this.RatingCompat = str4;
        this.read = str5;
        this.IconCompatParcelizer = str6;
        this.MediaBrowserCompat$ItemReceiver = str7;
        this.write = str8;
        this.f2809x50fd9e4a = z;
        this.MediaBrowserCompat$MediaItem = z2;
        this.MediaBrowserCompat$CustomActionResultReceiver = camera;
        this.MediaMetadataCompat = str9;
        this.MediaDescriptionCompat = str10;
        this.MediaSessionCompat$QueueItem = str11;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ compassEnabled(java.lang.Integer r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, boolean r29, boolean r30, p040o.C4169camera r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, int r35) {
        /*
            r19 = this;
            r0 = r35
            r1 = r0 & 2
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r5 = r2
            goto L_0x000c
        L_0x000a:
            r5 = r21
        L_0x000c:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0012
            r6 = r2
            goto L_0x0014
        L_0x0012:
            r6 = r22
        L_0x0014:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x001b
            r7 = r2
            goto L_0x001d
        L_0x001b:
            r7 = r23
        L_0x001d:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0023
            r8 = r2
            goto L_0x0025
        L_0x0023:
            r8 = r24
        L_0x0025:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002b
            r9 = r2
            goto L_0x002d
        L_0x002b:
            r9 = r25
        L_0x002d:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0033
            r10 = r2
            goto L_0x0035
        L_0x0033:
            r10 = r26
        L_0x0035:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x003b
            r11 = r2
            goto L_0x003d
        L_0x003b:
            r11 = r27
        L_0x003d:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0043
            r12 = r2
            goto L_0x0045
        L_0x0043:
            r12 = r28
        L_0x0045:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x004b
            r15 = r2
            goto L_0x004d
        L_0x004b:
            r15 = r31
        L_0x004d:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0054
            r16 = r2
            goto L_0x0056
        L_0x0054:
            r16 = r32
        L_0x0056:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x005d
            r17 = r2
            goto L_0x005f
        L_0x005d:
            r17 = r33
        L_0x005f:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0066
            r18 = r2
            goto L_0x0068
        L_0x0066:
            r18 = r34
        L_0x0068:
            r3 = r19
            r4 = r20
            r13 = r29
            r14 = r30
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.compassEnabled.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, o.camera, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
