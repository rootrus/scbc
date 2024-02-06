package p040o;

import com.google.gson.annotations.SerializedName;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.SupportStreetViewPanoramaFragment */
public final class SupportStreetViewPanoramaFragment {
    @SerializedName("QRstring")
    public final String IconCompatParcelizer;
    @SerializedName("imageURL")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("header")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("type")
    public final String MediaDescriptionCompat;
    @SerializedName("title")
    public final String read;
    @SerializedName("description")
    public final String write;

    public SupportStreetViewPanoramaFragment() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportStreetViewPanoramaFragment)) {
            return false;
        }
        SupportStreetViewPanoramaFragment supportStreetViewPanoramaFragment = (SupportStreetViewPanoramaFragment) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) supportStreetViewPanoramaFragment.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) supportStreetViewPanoramaFragment.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) supportStreetViewPanoramaFragment.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) supportStreetViewPanoramaFragment.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) supportStreetViewPanoramaFragment.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) supportStreetViewPanoramaFragment.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaDescriptionCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.IconCompatParcelizer;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaymentInfo(imageURL=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", header=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", description=");
        sb.append(this.write);
        sb.append(", type=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", title=");
        sb.append(this.read);
        sb.append(", QRstring=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: o.SupportStreetViewPanoramaFragment$zzb */
    public final class zzb {
        @SerializedName("ref1")
        public String IconCompatParcelizer;
        @SerializedName("dateTime")
        public OffsetDateTime MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("receiver")
        public isRotateGesturesEnabled MediaBrowserCompat$ItemReceiver;
        @SerializedName("transRef")
        public String MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("ref2")
        public String MediaDescriptionCompat;
        @SerializedName("ref3")
        public String MediaMetadataCompat;
        @SerializedName("sender")
        public isIndoorLevelPickerEnabled RatingCompat;
        @SerializedName("fee")
        public Double read;
        @SerializedName("function")
        public isCompassEnabled write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzb)) {
                return false;
            }
            zzb zzb = (zzb) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzb.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) zzb.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzb.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) zzb.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) zzb.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzb.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzb.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) zzb.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzb.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            OffsetDateTime offsetDateTime = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
            String str = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode2 = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            int hashCode3 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaDescriptionCompat;
            int hashCode4 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaMetadataCompat;
            int hashCode5 = str4 != null ? str4.hashCode() : 0;
            Double d = this.read;
            int hashCode6 = d != null ? d.hashCode() : 0;
            isCompassEnabled iscompassenabled = this.write;
            int hashCode7 = iscompassenabled != null ? iscompassenabled.hashCode() : 0;
            isIndoorLevelPickerEnabled isindoorlevelpickerenabled = this.RatingCompat;
            int hashCode8 = isindoorlevelpickerenabled != null ? isindoorlevelpickerenabled.hashCode() : 0;
            isRotateGesturesEnabled isrotategesturesenabled = this.MediaBrowserCompat$ItemReceiver;
            if (isrotategesturesenabled != null) {
                i = isrotategesturesenabled.hashCode();
            }
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PullSlip(dateTime=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", transRef=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", ref1=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", ref2=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", ref3=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", fee=");
            sb.append(this.read);
            sb.append(", function=");
            sb.append(this.write);
            sb.append(", sender=");
            sb.append(this.RatingCompat);
            sb.append(", receiver=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public zzb(OffsetDateTime offsetDateTime, String str, String str2, String str3, String str4, Double d, isCompassEnabled iscompassenabled, isIndoorLevelPickerEnabled isindoorlevelpickerenabled, isRotateGesturesEnabled isrotategesturesenabled) {
            this.MediaBrowserCompat$CustomActionResultReceiver = offsetDateTime;
            this.MediaBrowserCompat$SearchResultReceiver = str;
            this.IconCompatParcelizer = str2;
            this.MediaDescriptionCompat = str3;
            this.MediaMetadataCompat = str4;
            this.read = d;
            this.write = iscompassenabled;
            this.RatingCompat = isindoorlevelpickerenabled;
            this.MediaBrowserCompat$ItemReceiver = isrotategesturesenabled;
        }
    }

    /* renamed from: o.SupportStreetViewPanoramaFragment$zza */
    public class zza {
        @SerializedName("billerAccountNo")
        public String IconCompatParcelizer;
        @SerializedName("giftNameTh")
        public String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("amount")
        public Double MediaBrowserCompat$ItemReceiver;
        @SerializedName("orderId")
        public String MediaBrowserCompat$MediaItem;
        @SerializedName("giftImagePath")
        public String read;
        @SerializedName("giftNameEn")
        public String write;

        public static zza write() {
            return new zza();
        }
    }

    public SupportStreetViewPanoramaFragment(String str, String str2, String str3, String str4, String str5, String str6) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.write = str3;
        this.MediaDescriptionCompat = str4;
        this.read = str5;
        this.IconCompatParcelizer = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SupportStreetViewPanoramaFragment(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r6 = this;
            r0 = r13 & 1
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0008
            r0 = r1
            goto L_0x0009
        L_0x0008:
            r0 = r7
        L_0x0009:
            r7 = r13 & 2
            if (r7 == 0) goto L_0x000f
            r2 = r1
            goto L_0x0010
        L_0x000f:
            r2 = r8
        L_0x0010:
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0016
            r3 = r1
            goto L_0x0017
        L_0x0016:
            r3 = r9
        L_0x0017:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001d
            r4 = r1
            goto L_0x001e
        L_0x001d:
            r4 = r10
        L_0x001e:
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0024
            r5 = r1
            goto L_0x0025
        L_0x0024:
            r5 = r11
        L_0x0025:
            r7 = r13 & 32
            if (r7 == 0) goto L_0x002b
            r13 = r1
            goto L_0x002c
        L_0x002b:
            r13 = r12
        L_0x002c:
            r7 = r6
            r8 = r0
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.SupportStreetViewPanoramaFragment.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
