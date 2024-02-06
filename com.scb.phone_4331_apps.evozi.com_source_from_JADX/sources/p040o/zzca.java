package p040o;

import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.updateBounds;
import p040o.zzcb;
import p040o.zzjx;

/* renamed from: o.zzca */
public final /* synthetic */ class zzca implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zzca read = new zzca();

    /* renamed from: o.zzca$zza */
    public final class zza {
        public final List<PlacePhotoMetadataResult> MediaBrowserCompat$ItemReceiver;
        public final boolean read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj;
            return this.read == zza.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            boolean z = this.read;
            if (z) {
                z = true;
            }
            List<PlacePhotoMetadataResult> list = this.MediaBrowserCompat$ItemReceiver;
            return ((z ? 1 : 0) * true) + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ETBCheckActiveCASA(etbActiveCasa=");
            sb.append(this.read);
            sb.append(", staticTileList=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: o.zzca$zza$zza  reason: collision with other inner class name */
        public final class C10763zza {
            public final String IconCompatParcelizer;
            public final String MediaBrowserCompat$CustomActionResultReceiver;
            public final List<zzb.zzc> MediaBrowserCompat$ItemReceiver;
            public final String read;
            public final String write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10763zza)) {
                    return false;
                }
                C10763zza zza = (C10763zza) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver);
            }

            public final int hashCode() {
                String str = this.read;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.write;
                int hashCode3 = str3 != null ? str3.hashCode() : 0;
                String str4 = this.IconCompatParcelizer;
                int hashCode4 = str4 != null ? str4.hashCode() : 0;
                List<zzb.zzc> list = this.MediaBrowserCompat$ItemReceiver;
                if (list != null) {
                    i = list.hashCode();
                }
                return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("ETBProductDetailResponse(productName=");
                sb.append(this.read);
                sb.append(", accountType=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", shortDesc=");
                sb.append(this.write);
                sb.append(", detailImageURL=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", productDetailList=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(")");
                return sb.toString();
            }

            public C10763zza(String str, String str2, String str3, String str4, List<zzb.zzc> list) {
                onGetStartedClick.write((Object) str, "productName");
                onGetStartedClick.write((Object) str2, "accountType");
                onGetStartedClick.write((Object) str3, "shortDesc");
                onGetStartedClick.write((Object) str4, "detailImageURL");
                onGetStartedClick.write((Object) list, "productDetailList");
                this.read = str;
                this.MediaBrowserCompat$CustomActionResultReceiver = str2;
                this.write = str3;
                this.IconCompatParcelizer = str4;
                this.MediaBrowserCompat$ItemReceiver = list;
            }
        }

        public zza(boolean z, List<? extends PlacePhotoMetadataResult> list) {
            onGetStartedClick.write((Object) list, "staticTileList");
            this.read = z;
            this.MediaBrowserCompat$ItemReceiver = list;
        }
    }

    private /* synthetic */ zzca() {
    }

    /* renamed from: o.zzca$zzc */
    public final class zzc {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String read;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzc)) {
                return false;
            }
            zzc zzc = (zzc) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzc.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzc.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzc.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzc.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.read;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.write;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FriendsLanding(imagePath=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", referCode=");
            sb.append(this.read);
            sb.append(", termsandconditionsURL=");
            sb.append(this.write);
            sb.append(", sharedText=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public zzc(String str, String str2, String str3, String str4) {
            onGetStartedClick.write((Object) str, "imagePath");
            onGetStartedClick.write((Object) str2, "referCode");
            onGetStartedClick.write((Object) str3, "termsandconditionsURL");
            onGetStartedClick.write((Object) str4, "sharedText");
            this.IconCompatParcelizer = str;
            this.read = str2;
            this.write = str3;
            this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        }

        /* renamed from: o.zzca$zzc$zza */
        public final class zza {
            @SerializedName("thaiAddressProvince")
            private final String AlertController$RecycleListView;
            @SerializedName("addressMoo")
            private final String IconCompatParcelizer;
            @SerializedName("unitNumber")
            private final String Keep;
            @SerializedName("addressSoi")
            private final String MediaBrowserCompat$CustomActionResultReceiver;
            @SerializedName("addressThanon")
            private final String MediaBrowserCompat$ItemReceiver;
            @SerializedName("addressVillage")
            private final String MediaBrowserCompat$MediaItem;
            @SerializedName("engAddressDistrict")
            private final String MediaBrowserCompat$SearchResultReceiver;
            @SerializedName("thaiAddressAmphur")

            /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
            private final String f2983x50fd9e4a;
            @SerializedName("engAddressAmphur")
            private final String MediaDescriptionCompat;
            @SerializedName("addressTrok")
            private final String MediaMetadataCompat;
            @SerializedName("formatCode")
            private final String MediaSessionCompat$QueueItem;
            @SerializedName("thaiAddressDistrict")
            private final String MediaSessionCompat$ResultReceiverWrapper;
            @SerializedName("engAddressProvince")
            private final String MediaSessionCompat$Token;
            @SerializedName("floorNumber")
            private final String ParcelableVolumeInfo;
            @SerializedName("addressZipCode")
            private final String RatingCompat;
            @SerializedName("addressNumber")
            private final String read;
            @SerializedName("addressFormatted")
            private final List<String> write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zza)) {
                    return false;
                }
                zza zza = (zza) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) zza.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) zza.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.Keep, (Object) zza.Keep) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) zza.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) zza.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) zza.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) zza.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2983x50fd9e4a, (Object) zza.f2983x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.AlertController$RecycleListView, (Object) zza.AlertController$RecycleListView) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) zza.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) zza.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) zza.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write);
            }

            public final int hashCode() {
                String str = this.ParcelableVolumeInfo;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.MediaSessionCompat$QueueItem;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.Keep;
                int hashCode3 = str3 != null ? str3.hashCode() : 0;
                String str4 = this.read;
                int hashCode4 = str4 != null ? str4.hashCode() : 0;
                String str5 = this.MediaBrowserCompat$MediaItem;
                int hashCode5 = str5 != null ? str5.hashCode() : 0;
                String str6 = this.IconCompatParcelizer;
                int hashCode6 = str6 != null ? str6.hashCode() : 0;
                String str7 = this.MediaMetadataCompat;
                int hashCode7 = str7 != null ? str7.hashCode() : 0;
                String str8 = this.MediaBrowserCompat$CustomActionResultReceiver;
                int hashCode8 = str8 != null ? str8.hashCode() : 0;
                String str9 = this.MediaBrowserCompat$ItemReceiver;
                int hashCode9 = str9 != null ? str9.hashCode() : 0;
                String str10 = this.RatingCompat;
                int hashCode10 = str10 != null ? str10.hashCode() : 0;
                String str11 = this.MediaSessionCompat$ResultReceiverWrapper;
                int hashCode11 = str11 != null ? str11.hashCode() : 0;
                String str12 = this.f2983x50fd9e4a;
                int hashCode12 = str12 != null ? str12.hashCode() : 0;
                String str13 = this.AlertController$RecycleListView;
                int hashCode13 = str13 != null ? str13.hashCode() : 0;
                String str14 = this.MediaBrowserCompat$SearchResultReceiver;
                int hashCode14 = str14 != null ? str14.hashCode() : 0;
                String str15 = this.MediaDescriptionCompat;
                int hashCode15 = str15 != null ? str15.hashCode() : 0;
                String str16 = this.MediaSessionCompat$Token;
                int hashCode16 = str16 != null ? str16.hashCode() : 0;
                List<String> list = this.write;
                return (((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + (list != null ? list.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("AddressRequest(floorNumber=");
                sb.append(this.ParcelableVolumeInfo);
                sb.append(", formatCode=");
                sb.append(this.MediaSessionCompat$QueueItem);
                sb.append(", unitNumber=");
                sb.append(this.Keep);
                sb.append(", addressNumber=");
                sb.append(this.read);
                sb.append(", addressVillage=");
                sb.append(this.MediaBrowserCompat$MediaItem);
                sb.append(", addressMoo=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", addressTrok=");
                sb.append(this.MediaMetadataCompat);
                sb.append(", addressSoi=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", addressThanon=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", addressZipCode=");
                sb.append(this.RatingCompat);
                sb.append(", thaiAddressDistrict=");
                sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
                sb.append(", thaiAddressAmphur=");
                sb.append(this.f2983x50fd9e4a);
                sb.append(", thaiAddressProvince=");
                sb.append(this.AlertController$RecycleListView);
                sb.append(", engAddressDistrict=");
                sb.append(this.MediaBrowserCompat$SearchResultReceiver);
                sb.append(", engAddressAmphur=");
                sb.append(this.MediaDescriptionCompat);
                sb.append(", engAddressProvince=");
                sb.append(this.MediaSessionCompat$Token);
                sb.append(", addressFormatted=");
                sb.append(this.write);
                sb.append(")");
                return sb.toString();
            }

            public zza(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, List<String> list) {
                List<String> list2 = list;
                onGetStartedClick.write((Object) list2, "addressFormatted");
                this.ParcelableVolumeInfo = str;
                this.MediaSessionCompat$QueueItem = str2;
                this.Keep = str3;
                this.read = str4;
                this.MediaBrowserCompat$MediaItem = str5;
                this.IconCompatParcelizer = str6;
                this.MediaMetadataCompat = str7;
                this.MediaBrowserCompat$CustomActionResultReceiver = str8;
                this.MediaBrowserCompat$ItemReceiver = str9;
                this.RatingCompat = str10;
                this.MediaSessionCompat$ResultReceiverWrapper = str11;
                this.f2983x50fd9e4a = str12;
                this.AlertController$RecycleListView = str13;
                this.MediaBrowserCompat$SearchResultReceiver = str14;
                this.MediaDescriptionCompat = str15;
                this.MediaSessionCompat$Token = str16;
                this.write = list2;
            }
        }
    }

    /* renamed from: o.zzca$zzb */
    public final class zzb {
        public final List<zza> MediaBrowserCompat$CustomActionResultReceiver;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzb)) {
                return false;
            }
            zzb zzb = (zzb) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzb.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzb.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.write;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            List<zza> list = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (list != null) {
                i = list.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LongDescListResponse(header=");
            sb.append(this.write);
            sb.append(", items=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: o.zzca$zzb$zzb  reason: collision with other inner class name */
        public final class C10819zzb {
            public String IconCompatParcelizer;
            public String MediaBrowserCompat$CustomActionResultReceiver;
            public String MediaBrowserCompat$ItemReceiver;
            public String MediaBrowserCompat$MediaItem;
            public String MediaBrowserCompat$SearchResultReceiver;

            /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
            public String f2982x50fd9e4a;
            public boolean MediaDescriptionCompat;
            public String MediaMetadataCompat;
            public List<String> MediaSessionCompat$QueueItem;
            public OffsetDateTime MediaSessionCompat$ResultReceiverWrapper;
            public String MediaSessionCompat$Token;
            public String RatingCompat;
            public String read;
            public String write;

            /* renamed from: o.zzca$zzb$zzb$zza */
            public final class zza extends zzuk {
                public String MediaBrowserCompat$CustomActionResultReceiver;
                public String MediaBrowserCompat$ItemReceiver;
                public String MediaBrowserCompat$MediaItem;
                public String MediaDescriptionCompat;
                public isBleUsable MediaMetadataCompat;
                public isBleUsable read;
                public isBleUsable write;
            }

            public C10819zzb() {
                this((OffsetDateTime) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 16383);
            }

            private C10819zzb(OffsetDateTime offsetDateTime, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<String> list, boolean z) {
                this.MediaSessionCompat$ResultReceiverWrapper = offsetDateTime;
                this.IconCompatParcelizer = str;
                this.read = str2;
                this.write = str3;
                this.MediaBrowserCompat$SearchResultReceiver = str4;
                this.RatingCompat = str5;
                this.MediaBrowserCompat$MediaItem = str6;
                this.MediaBrowserCompat$ItemReceiver = str7;
                this.MediaBrowserCompat$CustomActionResultReceiver = str8;
                this.MediaSessionCompat$Token = str9;
                this.MediaMetadataCompat = str10;
                this.f2982x50fd9e4a = str11;
                this.MediaSessionCompat$QueueItem = list;
                this.MediaDescriptionCompat = false;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ C10819zzb(org.threeten.p041bp.OffsetDateTime r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.util.List r31, int r32) {
                /*
                    r18 = this;
                    r0 = r32
                    r1 = r0 & 1
                    r2 = 0
                    if (r1 == 0) goto L_0x0009
                    r4 = r2
                    goto L_0x000b
                L_0x0009:
                    r4 = r19
                L_0x000b:
                    r1 = r0 & 2
                    if (r1 == 0) goto L_0x0011
                    r5 = r2
                    goto L_0x0013
                L_0x0011:
                    r5 = r20
                L_0x0013:
                    r1 = r0 & 4
                    if (r1 == 0) goto L_0x0019
                    r6 = r2
                    goto L_0x001b
                L_0x0019:
                    r6 = r21
                L_0x001b:
                    r1 = r0 & 8
                    if (r1 == 0) goto L_0x0021
                    r7 = r2
                    goto L_0x0023
                L_0x0021:
                    r7 = r22
                L_0x0023:
                    r1 = r0 & 16
                    if (r1 == 0) goto L_0x0029
                    r8 = r2
                    goto L_0x002b
                L_0x0029:
                    r8 = r23
                L_0x002b:
                    r1 = r0 & 32
                    if (r1 == 0) goto L_0x0031
                    r9 = r2
                    goto L_0x0033
                L_0x0031:
                    r9 = r24
                L_0x0033:
                    r1 = r0 & 64
                    if (r1 == 0) goto L_0x0039
                    r10 = r2
                    goto L_0x003b
                L_0x0039:
                    r10 = r25
                L_0x003b:
                    r1 = r0 & 128(0x80, float:1.794E-43)
                    if (r1 == 0) goto L_0x0041
                    r11 = r2
                    goto L_0x0043
                L_0x0041:
                    r11 = r26
                L_0x0043:
                    r1 = r0 & 256(0x100, float:3.59E-43)
                    if (r1 == 0) goto L_0x0049
                    r12 = r2
                    goto L_0x004b
                L_0x0049:
                    r12 = r27
                L_0x004b:
                    r1 = r0 & 512(0x200, float:7.175E-43)
                    if (r1 == 0) goto L_0x0051
                    r13 = r2
                    goto L_0x0053
                L_0x0051:
                    r13 = r28
                L_0x0053:
                    r1 = r0 & 1024(0x400, float:1.435E-42)
                    if (r1 == 0) goto L_0x0059
                    r14 = r2
                    goto L_0x005b
                L_0x0059:
                    r14 = r29
                L_0x005b:
                    r1 = r0 & 2048(0x800, float:2.87E-42)
                    if (r1 == 0) goto L_0x0061
                    r15 = r2
                    goto L_0x0063
                L_0x0061:
                    r15 = r30
                L_0x0063:
                    r0 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r0 == 0) goto L_0x006a
                    r16 = r2
                    goto L_0x006c
                L_0x006a:
                    r16 = r31
                L_0x006c:
                    r17 = 0
                    r3 = r18
                    r3.<init>((org.threeten.p041bp.OffsetDateTime) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (java.util.List<java.lang.String>) r16, (boolean) r17)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p040o.zzca.zzb.C10819zzb.<init>(org.threeten.bp.OffsetDateTime, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int):void");
            }
        }

        /* renamed from: o.zzca$zzb$zzc */
        public final class zzc {
            public final int IconCompatParcelizer;
            public final int MediaBrowserCompat$CustomActionResultReceiver;
            public final List<zzb> MediaBrowserCompat$ItemReceiver;
            public final int MediaBrowserCompat$MediaItem;
            public final String MediaDescriptionCompat;
            public final String RatingCompat;
            public final String read;
            public final int write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zzc)) {
                    return false;
                }
                zzc zzc = (zzc) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) zzc.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) zzc.RatingCompat) && this.MediaBrowserCompat$MediaItem == zzc.MediaBrowserCompat$MediaItem && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzc.read) && this.write == zzc.write && this.MediaBrowserCompat$CustomActionResultReceiver == zzc.MediaBrowserCompat$CustomActionResultReceiver && this.IconCompatParcelizer == zzc.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzc.MediaBrowserCompat$ItemReceiver);
            }

            public final int hashCode() {
                String str = this.MediaDescriptionCompat;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.RatingCompat;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                int i2 = this.MediaBrowserCompat$MediaItem;
                String str3 = this.read;
                int hashCode3 = str3 != null ? str3.hashCode() : 0;
                int i3 = this.write;
                int i4 = this.MediaBrowserCompat$CustomActionResultReceiver;
                int i5 = this.IconCompatParcelizer;
                List<zzb> list = this.MediaBrowserCompat$ItemReceiver;
                if (list != null) {
                    i = list.hashCode();
                }
                return (((((((((((((hashCode * 31) + hashCode2) * 31) + i2) * 31) + hashCode3) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("ProductDetailListResponse(subAttribute=");
                sb.append(this.MediaDescriptionCompat);
                sb.append(", productCode=");
                sb.append(this.RatingCompat);
                sb.append(", sortSequence=");
                sb.append(this.MediaBrowserCompat$MediaItem);
                sb.append(", defaultFlag=");
                sb.append(this.read);
                sb.append(", minAmount=");
                sb.append(this.write);
                sb.append(", maxAmount=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", incrementalAmount=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", longDesc=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(")");
                return sb.toString();
            }

            public zzc(String str, String str2, int i, String str3, int i2, int i3, int i4, List<zzb> list) {
                onGetStartedClick.write((Object) str, "subAttribute");
                onGetStartedClick.write((Object) str2, "productCode");
                onGetStartedClick.write((Object) list, "longDesc");
                this.MediaDescriptionCompat = str;
                this.RatingCompat = str2;
                this.MediaBrowserCompat$MediaItem = i;
                this.read = str3;
                this.write = i2;
                this.MediaBrowserCompat$CustomActionResultReceiver = i3;
                this.IconCompatParcelizer = i4;
                this.MediaBrowserCompat$ItemReceiver = list;
            }
        }

        public zzb(String str, List<zza> list) {
            onGetStartedClick.write((Object) str, "header");
            onGetStartedClick.write((Object) list, "items");
            this.write = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = list;
        }

        /* renamed from: o.zzca$zzb$zza */
        public final class zza {
            public final String MediaBrowserCompat$ItemReceiver;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof zza) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ((zza) obj).MediaBrowserCompat$ItemReceiver);
                }
                return true;
            }

            public final int hashCode() {
                String str = this.MediaBrowserCompat$ItemReceiver;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("ItemResponse(text=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(")");
                return sb.toString();
            }

            public zza(String str) {
                onGetStartedClick.write((Object) str, "text");
                this.MediaBrowserCompat$ItemReceiver = str;
            }
        }
    }

    /* renamed from: o.zzca$zze */
    public enum zze {
        INITIAL,
        PENDING,
        APPROVE,
        REJECT,
        DECLINE,
        ACCEPT,
        SUCCESS,
        PROGRESS,
        FAIL;

        /* renamed from: o.zzca$zze$zza */
        public final class zza {
            public final write IconCompatParcelizer;
            public final zzca$zze$zza$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
            public final read MediaBrowserCompat$ItemReceiver;
            public final String RatingCompat;
            public final String read;
            public final String write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zza)) {
                    return false;
                }
                zza zza = (zza) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) zza.RatingCompat);
            }

            public final int hashCode() {
                String str = this.read;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                zzca$zze$zza$MediaBrowserCompat$ItemReceiver zzca_zze_zza_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
                int hashCode2 = zzca_zze_zza_mediabrowsercompat_itemreceiver != null ? zzca_zze_zza_mediabrowsercompat_itemreceiver.hashCode() : 0;
                read read2 = this.MediaBrowserCompat$ItemReceiver;
                int hashCode3 = read2 != null ? read2.hashCode() : 0;
                write write2 = this.IconCompatParcelizer;
                int hashCode4 = write2 != null ? write2.hashCode() : 0;
                String str2 = this.write;
                int hashCode5 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.RatingCompat;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("BusinessProfileDetails(businessName=");
                sb.append(this.read);
                sb.append(", contact=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", privilegedProfession=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", businessExperience=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", applicationUuid=");
                sb.append(this.write);
                sb.append(", productType=");
                sb.append(this.RatingCompat);
                sb.append(")");
                return sb.toString();
            }

            public zza(String str, zzca$zze$zza$MediaBrowserCompat$ItemReceiver zzca_zze_zza_mediabrowsercompat_itemreceiver, read read2, write write2, String str2, String str3) {
                onGetStartedClick.write((Object) zzca_zze_zza_mediabrowsercompat_itemreceiver, "contact");
                onGetStartedClick.write((Object) read2, "privilegedProfession");
                onGetStartedClick.write((Object) write2, "businessExperience");
                this.read = str;
                this.MediaBrowserCompat$CustomActionResultReceiver = zzca_zze_zza_mediabrowsercompat_itemreceiver;
                this.MediaBrowserCompat$ItemReceiver = read2;
                this.IconCompatParcelizer = write2;
                this.write = str2;
                this.RatingCompat = str3;
            }

            /* renamed from: o.zzca$zze$zza$read */
            public static final class read {
                public final String IconCompatParcelizer;
                public final boolean read;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof read)) {
                        return false;
                    }
                    read read2 = (read) obj;
                    return this.read == read2.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) read2.IconCompatParcelizer);
                }

                public final int hashCode() {
                    boolean z = this.read;
                    if (z) {
                        z = true;
                    }
                    String str = this.IconCompatParcelizer;
                    return ((z ? 1 : 0) * true) + (str != null ? str.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("PrivilegedProfession(flag=");
                    sb.append(this.read);
                    sb.append(", code=");
                    sb.append(this.IconCompatParcelizer);
                    sb.append(")");
                    return sb.toString();
                }

                public read(boolean z, String str) {
                    this.read = z;
                    this.IconCompatParcelizer = str;
                }
            }

            /* renamed from: o.zzca$zze$zza$write */
            public static final class write {
                public final String MediaBrowserCompat$CustomActionResultReceiver;
                public final String MediaBrowserCompat$ItemReceiver;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof write)) {
                        return false;
                    }
                    write write = (write) obj;
                    return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) write.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) write.MediaBrowserCompat$ItemReceiver);
                }

                public final int hashCode() {
                    String str = this.MediaBrowserCompat$CustomActionResultReceiver;
                    int i = 0;
                    int hashCode = str != null ? str.hashCode() : 0;
                    String str2 = this.MediaBrowserCompat$ItemReceiver;
                    if (str2 != null) {
                        i = str2.hashCode();
                    }
                    return (hashCode * 31) + i;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("BusinessExperience(year=");
                    sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                    sb.append(", month=");
                    sb.append(this.MediaBrowserCompat$ItemReceiver);
                    sb.append(")");
                    return sb.toString();
                }

                public write(String str, String str2) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = str;
                    this.MediaBrowserCompat$ItemReceiver = str2;
                }
            }
        }
    }

    /* renamed from: o.zzca$zzf */
    public final class zzf {
        @SerializedName("expiryDate")
        private final String IconCompatParcelizer;
        @SerializedName("laserCode")
        private final String read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzf)) {
                return false;
            }
            zzf zzf = (zzf) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzf.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzf.read);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.read;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CitizenIdEntity(expiryDate=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", laserCode=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: o.zzca$zzf$zza */
        public final class zza {
            private final zze AlertController$RecycleListView;
            public final OffsetDateTime IconCompatParcelizer;
            public final String Keep;
            public final String MediaBrowserCompat$CustomActionResultReceiver;
            public final String MediaBrowserCompat$ItemReceiver;
            public final String MediaBrowserCompat$MediaItem;
            public final Integer MediaBrowserCompat$SearchResultReceiver;

            /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
            public final String f2984x50fd9e4a;
            public final Double MediaDescriptionCompat;
            public final String MediaMetadataCompat;
            public final zzjx.zzc MediaSessionCompat$QueueItem;
            public final String MediaSessionCompat$ResultReceiverWrapper;
            public final IconCompatParcelizer MediaSessionCompat$Token;
            public final boolean ParcelableVolumeInfo;
            public final String PlaybackStateCompat$CustomAction;
            public final zzjx.zzc RatingCompat;
            public final setContentDescription read;
            public final zzjx.zzc write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zza)) {
                    return false;
                }
                zza zza = (zza) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.AlertController$RecycleListView, (Object) zza.AlertController$RecycleListView) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && this.ParcelableVolumeInfo == zza.ParcelableVolumeInfo && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2984x50fd9e4a, (Object) zza.f2984x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.Keep, (Object) zza.Keep) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.PlaybackStateCompat$CustomAction, (Object) zza.PlaybackStateCompat$CustomAction) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) zza.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) zza.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) zza.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) zza.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) zza.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) zza.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) zza.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) zza.MediaSessionCompat$Token);
            }

            public final int hashCode() {
                zze zze = this.AlertController$RecycleListView;
                int hashCode = zze != null ? zze.hashCode() : 0;
                String str = this.MediaBrowserCompat$ItemReceiver;
                int hashCode2 = str != null ? str.hashCode() : 0;
                boolean z = this.ParcelableVolumeInfo;
                if (z) {
                    z = true;
                }
                String str2 = this.f2984x50fd9e4a;
                int hashCode3 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.Keep;
                int hashCode4 = str3 != null ? str3.hashCode() : 0;
                String str4 = this.PlaybackStateCompat$CustomAction;
                int hashCode5 = str4 != null ? str4.hashCode() : 0;
                String str5 = this.MediaMetadataCompat;
                int hashCode6 = str5 != null ? str5.hashCode() : 0;
                String str6 = this.MediaBrowserCompat$MediaItem;
                int hashCode7 = str6 != null ? str6.hashCode() : 0;
                Double d = this.MediaDescriptionCompat;
                int hashCode8 = d != null ? d.hashCode() : 0;
                setContentDescription setcontentdescription = this.read;
                int hashCode9 = setcontentdescription != null ? setcontentdescription.hashCode() : 0;
                zzjx.zzc zzc = this.RatingCompat;
                int hashCode10 = zzc != null ? zzc.hashCode() : 0;
                zzjx.zzc zzc2 = this.MediaSessionCompat$QueueItem;
                int hashCode11 = zzc2 != null ? zzc2.hashCode() : 0;
                zzjx.zzc zzc3 = this.write;
                int hashCode12 = zzc3 != null ? zzc3.hashCode() : 0;
                OffsetDateTime offsetDateTime = this.IconCompatParcelizer;
                int hashCode13 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
                String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
                int hashCode14 = str7 != null ? str7.hashCode() : 0;
                String str8 = this.MediaSessionCompat$ResultReceiverWrapper;
                int hashCode15 = str8 != null ? str8.hashCode() : 0;
                Integer num = this.MediaBrowserCompat$SearchResultReceiver;
                int hashCode16 = num != null ? num.hashCode() : 0;
                IconCompatParcelizer iconCompatParcelizer = this.MediaSessionCompat$Token;
                return (((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + (z ? 1 : 0)) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + (iconCompatParcelizer != null ? iconCompatParcelizer.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("ContactInfo(applicationStatus=");
                sb.append(this.AlertController$RecycleListView);
                sb.append(", applicationUuid=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", requireThaiName=");
                sb.append(this.ParcelableVolumeInfo);
                sb.append(", name=");
                sb.append(this.f2984x50fd9e4a);
                sb.append(", thaiFirstName=");
                sb.append(this.Keep);
                sb.append(", thaiLastName=");
                sb.append(this.PlaybackStateCompat$CustomAction);
                sb.append(", mobileNo=");
                sb.append(this.MediaMetadataCompat);
                sb.append(", email=");
                sb.append(this.MediaBrowserCompat$MediaItem);
                sb.append(", income=");
                sb.append(this.MediaDescriptionCompat);
                sb.append(", address=");
                sb.append(this.read);
                sb.append(", maritalStatus=");
                sb.append(this.RatingCompat);
                sb.append(", residentialStatus=");
                sb.append(this.MediaSessionCompat$QueueItem);
                sb.append(", educationLevel=");
                sb.append(this.write);
                sb.append(", cIdExpiryDate=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", cIdLaserCode=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", productType=");
                sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
                sb.append(", minIncome=");
                sb.append(this.MediaBrowserCompat$SearchResultReceiver);
                sb.append(", spouseInfo=");
                sb.append(this.MediaSessionCompat$Token);
                sb.append(")");
                return sb.toString();
            }

            public zza(zze zze, String str, boolean z, String str2, String str3, String str4, String str5, String str6, Double d, setContentDescription setcontentdescription, zzjx.zzc zzc, zzjx.zzc zzc2, zzjx.zzc zzc3, OffsetDateTime offsetDateTime, String str7, String str8, Integer num, IconCompatParcelizer iconCompatParcelizer) {
                String str9 = str8;
                onGetStartedClick.write((Object) str2, "name");
                onGetStartedClick.write((Object) str5, "mobileNo");
                onGetStartedClick.write((Object) str9, "productType");
                this.AlertController$RecycleListView = zze;
                this.MediaBrowserCompat$ItemReceiver = str;
                this.ParcelableVolumeInfo = z;
                this.f2984x50fd9e4a = str2;
                this.Keep = str3;
                this.PlaybackStateCompat$CustomAction = str4;
                this.MediaMetadataCompat = str5;
                this.MediaBrowserCompat$MediaItem = str6;
                this.MediaDescriptionCompat = d;
                this.read = setcontentdescription;
                this.RatingCompat = zzc;
                this.MediaSessionCompat$QueueItem = zzc2;
                this.write = zzc3;
                this.IconCompatParcelizer = offsetDateTime;
                this.MediaBrowserCompat$CustomActionResultReceiver = str7;
                this.MediaSessionCompat$ResultReceiverWrapper = str9;
                this.MediaBrowserCompat$SearchResultReceiver = num;
                this.MediaSessionCompat$Token = iconCompatParcelizer;
            }

            public /* synthetic */ zza(zze zze, String str, boolean z, String str2, String str3, String str4, String str5, String str6, Double d, setContentDescription setcontentdescription, zzjx.zzc zzc, zzjx.zzc zzc2, zzjx.zzc zzc3, OffsetDateTime offsetDateTime, String str7, String str8, Integer num) {
                this(zze, str, z, str2, str3, str4, str5, str6, d, setcontentdescription, zzc, zzc2, zzc3, offsetDateTime, str7, str8, num, (IconCompatParcelizer) null);
            }

            /* renamed from: o.zzca$zzf$zza$IconCompatParcelizer */
            public static final class IconCompatParcelizer {
                public final String IconCompatParcelizer;
                public final String MediaBrowserCompat$CustomActionResultReceiver;
                public final String read;
                public final String write;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof IconCompatParcelizer)) {
                        return false;
                    }
                    IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
                    return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) iconCompatParcelizer.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) iconCompatParcelizer.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) iconCompatParcelizer.write);
                }

                public final int hashCode() {
                    String str = this.read;
                    int i = 0;
                    int hashCode = str != null ? str.hashCode() : 0;
                    String str2 = this.IconCompatParcelizer;
                    int hashCode2 = str2 != null ? str2.hashCode() : 0;
                    String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
                    int hashCode3 = str3 != null ? str3.hashCode() : 0;
                    String str4 = this.write;
                    if (str4 != null) {
                        i = str4.hashCode();
                    }
                    return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpouseInfo(citizenship=");
                    sb.append(this.read);
                    sb.append(", thaiFirstName=");
                    sb.append(this.IconCompatParcelizer);
                    sb.append(", thaiLastName=");
                    sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                    sb.append(", citizenId=");
                    sb.append(this.write);
                    sb.append(")");
                    return sb.toString();
                }

                public IconCompatParcelizer(String str, String str2, String str3, String str4) {
                    this.read = str;
                    this.IconCompatParcelizer = str2;
                    this.MediaBrowserCompat$CustomActionResultReceiver = str3;
                    this.write = str4;
                }
            }
        }

        public zzf(String str, String str2) {
            onGetStartedClick.write((Object) str, "expiryDate");
            onGetStartedClick.write((Object) str2, "laserCode");
            this.IconCompatParcelizer = str;
            this.read = str2;
        }
    }

    /* renamed from: o.zzca$zzg */
    public final class zzg implements C4602xca7af99c {
        public String IconCompatParcelizer;
        public zzca$zzg$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver;
        public zzca$zzg$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;
        public IconCompatParcelizer read;

        public zzg() {
            this((byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzg)) {
                return false;
            }
            zzg zzg = (zzg) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzg.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzg.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzg.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzg.read);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            zzca$zzg$MediaBrowserCompat$CustomActionResultReceiver zzca_zzg_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = zzca_zzg_mediabrowsercompat_customactionresultreceiver != null ? zzca_zzg_mediabrowsercompat_customactionresultreceiver.hashCode() : 0;
            zzca$zzg$MediaBrowserCompat$ItemReceiver zzca_zzg_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$ItemReceiver;
            int hashCode3 = zzca_zzg_mediabrowsercompat_itemreceiver != null ? zzca_zzg_mediabrowsercompat_itemreceiver.hashCode() : 0;
            IconCompatParcelizer iconCompatParcelizer = this.read;
            if (iconCompatParcelizer != null) {
                i = iconCompatParcelizer.hashCode();
            }
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BusinessProfileDetailsForm(businessName=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", contact=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", privilegedProfession=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", businessExperience=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        private zzg(String str, zzca$zzg$MediaBrowserCompat$CustomActionResultReceiver zzca_zzg_mediabrowsercompat_customactionresultreceiver, zzca$zzg$MediaBrowserCompat$ItemReceiver zzca_zzg_mediabrowsercompat_itemreceiver, IconCompatParcelizer iconCompatParcelizer) {
            onGetStartedClick.write((Object) zzca_zzg_mediabrowsercompat_customactionresultreceiver, "contact");
            onGetStartedClick.write((Object) zzca_zzg_mediabrowsercompat_itemreceiver, "privilegedProfession");
            onGetStartedClick.write((Object) iconCompatParcelizer, "businessExperience");
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver = zzca_zzg_mediabrowsercompat_customactionresultreceiver;
            this.MediaBrowserCompat$ItemReceiver = zzca_zzg_mediabrowsercompat_itemreceiver;
            this.read = iconCompatParcelizer;
        }

        public /* synthetic */ zzg(byte b) {
            this((String) null, new zzca$zzg$MediaBrowserCompat$CustomActionResultReceiver((byte) 0), new zzca$zzg$MediaBrowserCompat$ItemReceiver((byte) 0), new IconCompatParcelizer((byte) 0));
        }

        /* renamed from: o.zzca$zzg$IconCompatParcelizer */
        public static final class IconCompatParcelizer {
            public Integer MediaBrowserCompat$ItemReceiver;
            public Integer write;

            public IconCompatParcelizer() {
                this((byte) 0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof IconCompatParcelizer)) {
                    return false;
                }
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) iconCompatParcelizer.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) iconCompatParcelizer.write);
            }

            public final int hashCode() {
                Integer num = this.MediaBrowserCompat$ItemReceiver;
                int i = 0;
                int hashCode = num != null ? num.hashCode() : 0;
                Integer num2 = this.write;
                if (num2 != null) {
                    i = num2.hashCode();
                }
                return (hashCode * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("BusinessExperience(year=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", month=");
                sb.append(this.write);
                sb.append(")");
                return sb.toString();
            }

            private IconCompatParcelizer(Integer num, Integer num2) {
                this.MediaBrowserCompat$ItemReceiver = null;
                this.write = null;
            }

            public /* synthetic */ IconCompatParcelizer(byte b) {
                this((Integer) null, (Integer) null);
            }
        }

        /* renamed from: o.zzca$zzg$zza */
        public final class zza {
            @SerializedName("educationLevel")
            public final zzjx.zzc IconCompatParcelizer;
            @SerializedName("mailingAddress")
            public final zzc.zza MediaBrowserCompat$CustomActionResultReceiver;
            @SerializedName("citizenId")
            public final zzf MediaBrowserCompat$ItemReceiver;
            @SerializedName("maritalStatus")
            public final zzjx.zzc MediaBrowserCompat$MediaItem;
            @SerializedName("thaiFirstName")
            public final String MediaBrowserCompat$SearchResultReceiver;
            @SerializedName("spouseInfo")
            public getTransitionType MediaDescriptionCompat;
            @SerializedName("residentType")
            public final zzjx.zzc MediaMetadataCompat;
            @SerializedName("thaiLastName")
            public final String MediaSessionCompat$QueueItem;
            @SerializedName("mobileNo")
            public final String RatingCompat;
            @SerializedName("income")
            public final String read;
            @SerializedName("email")
            public final String write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zza)) {
                    return false;
                }
                zza zza = (zza) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) zza.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) zza.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) zza.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) zza.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) zza.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) zza.MediaDescriptionCompat);
            }

            public final int hashCode() {
                String str = this.MediaBrowserCompat$SearchResultReceiver;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.MediaSessionCompat$QueueItem;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.RatingCompat;
                int hashCode3 = str3 != null ? str3.hashCode() : 0;
                String str4 = this.write;
                int hashCode4 = str4 != null ? str4.hashCode() : 0;
                String str5 = this.read;
                int hashCode5 = str5 != null ? str5.hashCode() : 0;
                zzc.zza zza = this.MediaBrowserCompat$CustomActionResultReceiver;
                int hashCode6 = zza != null ? zza.hashCode() : 0;
                zzjx.zzc zzc = this.MediaBrowserCompat$MediaItem;
                int hashCode7 = zzc != null ? zzc.hashCode() : 0;
                zzjx.zzc zzc2 = this.MediaMetadataCompat;
                int hashCode8 = zzc2 != null ? zzc2.hashCode() : 0;
                zzjx.zzc zzc3 = this.IconCompatParcelizer;
                int hashCode9 = zzc3 != null ? zzc3.hashCode() : 0;
                zzf zzf = this.MediaBrowserCompat$ItemReceiver;
                int hashCode10 = zzf != null ? zzf.hashCode() : 0;
                getTransitionType gettransitiontype = this.MediaDescriptionCompat;
                if (gettransitiontype != null) {
                    i = gettransitiontype.hashCode();
                }
                return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("CustomerContactRequest(thaiFirstName=");
                sb.append(this.MediaBrowserCompat$SearchResultReceiver);
                sb.append(", thaiLastName=");
                sb.append(this.MediaSessionCompat$QueueItem);
                sb.append(", mobileNo=");
                sb.append(this.RatingCompat);
                sb.append(", email=");
                sb.append(this.write);
                sb.append(", income=");
                sb.append(this.read);
                sb.append(", mailingAddress=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", maritalStatus=");
                sb.append(this.MediaBrowserCompat$MediaItem);
                sb.append(", residentType=");
                sb.append(this.MediaMetadataCompat);
                sb.append(", educationLevel=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", citizenId=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", spouseInfo=");
                sb.append(this.MediaDescriptionCompat);
                sb.append(")");
                return sb.toString();
            }

            public zza(String str, String str2, String str3, String str4, String str5, zzc.zza zza, zzjx.zzc zzc, zzjx.zzc zzc2, zzjx.zzc zzc3, zzf zzf, getTransitionType gettransitiontype) {
                onGetStartedClick.write((Object) str3, "mobileNo");
                onGetStartedClick.write((Object) str4, Scopes.EMAIL);
                onGetStartedClick.write((Object) str5, "income");
                onGetStartedClick.write((Object) zza, "mailingAddress");
                onGetStartedClick.write((Object) zzc, "maritalStatus");
                onGetStartedClick.write((Object) zzc2, "residentType");
                onGetStartedClick.write((Object) zzc3, "educationLevel");
                onGetStartedClick.write((Object) zzf, "citizenId");
                this.MediaBrowserCompat$SearchResultReceiver = str;
                this.MediaSessionCompat$QueueItem = str2;
                this.RatingCompat = str3;
                this.write = str4;
                this.read = str5;
                this.MediaBrowserCompat$CustomActionResultReceiver = zza;
                this.MediaBrowserCompat$MediaItem = zzc;
                this.MediaMetadataCompat = zzc2;
                this.IconCompatParcelizer = zzc3;
                this.MediaBrowserCompat$ItemReceiver = zzf;
                this.MediaDescriptionCompat = gettransitiontype;
            }
        }
    }

    /* renamed from: o.zzca$zzd */
    public final class zzd {
        public double IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public double MediaBrowserCompat$ItemReceiver;
        public double MediaDescriptionCompat;
        public double RatingCompat;
        public boolean read;
        public String write;

        public zzd(boolean z, String str, String str2, double d, double d2, double d3, double d4) {
            this.read = z;
            this.write = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
            this.MediaBrowserCompat$ItemReceiver = d;
            this.RatingCompat = d2;
            this.MediaDescriptionCompat = d3;
            this.IconCompatParcelizer = d4;
        }

        /* renamed from: o.zzca$zzd$zza */
        public final class zza extends zzuk {
            public double MediaBrowserCompat$CustomActionResultReceiver;
            public String MediaBrowserCompat$ItemReceiver;
            public String MediaDescriptionCompat;
            public String MediaMetadataCompat;
            public String RatingCompat;
            public double read;
            public double write;

            public static zza read() {
                return new zza();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzd)) {
                return false;
            }
            zzd zzd = (zzd) obj;
            if (this.read != zzd.read || Double.compare(zzd.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$ItemReceiver) != 0 || Double.compare(zzd.RatingCompat, this.RatingCompat) != 0 || Double.compare(zzd.MediaDescriptionCompat, this.MediaDescriptionCompat) != 0 || Double.compare(zzd.IconCompatParcelizer, this.IconCompatParcelizer) != 0) {
                return false;
            }
            String str = this.write;
            if (str == null ? zzd.write != null : !str.equals(zzd.write)) {
                return false;
            }
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str2 != null) {
                return str2.equals(zzd.MediaBrowserCompat$CustomActionResultReceiver);
            }
            if (zzd.MediaBrowserCompat$CustomActionResultReceiver != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i;
            boolean z = this.read;
            String str = this.write;
            int i2 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$ItemReceiver);
            long doubleToLongBits2 = Double.doubleToLongBits(this.RatingCompat);
            int i3 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
            long doubleToLongBits3 = Double.doubleToLongBits(this.MediaDescriptionCompat);
            long doubleToLongBits4 = Double.doubleToLongBits(this.IconCompatParcelizer);
            return ((((((((((((z ? 1 : 0) * true) + i) * 31) + i2) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + i3) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4));
        }
    }

    public final Object write(Object obj) {
        updateBounds updatebounds = (updateBounds) obj;
        String str = updatebounds.MediaBrowserCompat$CustomActionResultReceiver;
        String str2 = updatebounds.write;
        String str3 = updatebounds.MediaBrowserCompat$MediaItem;
        String str4 = updatebounds.IconCompatParcelizer;
        String str5 = updatebounds.MediaMetadataCompat;
        String str6 = updatebounds.read;
        String str7 = updatebounds.MediaBrowserCompat$ItemReceiver;
        String str8 = updatebounds.RatingCompat;
        Iterable iterable = updatebounds.MediaBrowserCompat$SearchResultReceiver;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            endAnimation endanimation = (endAnimation) it.next();
            int i = endanimation.MediaSessionCompat$QueueItem;
            String str9 = endanimation.MediaBrowserCompat$SearchResultReceiver;
            String str10 = endanimation.MediaSessionCompat$Token;
            String str11 = endanimation.MediaBrowserCompat$CustomActionResultReceiver;
            String str12 = endanimation.MediaSessionCompat$ResultReceiverWrapper;
            Iterator it2 = it;
            String str13 = endanimation.RatingCompat;
            String str14 = str12;
            boolean z = endanimation.MediaBrowserCompat$ItemReceiver;
            String str15 = str11;
            boolean z2 = endanimation.MediaBrowserCompat$MediaItem;
            String str16 = str8;
            boolean z3 = endanimation.MediaDescriptionCompat;
            String str17 = str7;
            String str18 = endanimation.read;
            String str19 = str6;
            List<setDataCollectionEnabled> MediaBrowserCompat$CustomActionResultReceiver = endAnimation.MediaBrowserCompat$CustomActionResultReceiver(endanimation.IconCompatParcelizer);
            boolean z4 = endanimation.write;
            String str20 = endanimation.MediaMetadataCompat;
            arrayList.add(new zzcb.zzf(Integer.valueOf(i), str9, str10, str15, str14, str13, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), str18, MediaBrowserCompat$CustomActionResultReceiver, Boolean.valueOf(z4), str20));
            it = it2;
            str8 = str16;
            str7 = str17;
            str6 = str19;
            str5 = str5;
        }
        String str21 = str5;
        String str22 = str6;
        String str23 = str7;
        String str24 = str8;
        return new zzcb.zzd.zza(str, str2, str3, str4, str5, str6, str7, str8, HmlNTBBusinessURLInformationActivity.write((List) arrayList, new updateBounds.write()));
    }
}
