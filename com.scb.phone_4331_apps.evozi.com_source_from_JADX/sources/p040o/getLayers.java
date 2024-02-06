package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p040o.zzag;
import p040o.zzvm;

/* renamed from: o.getLayers */
public final class getLayers implements Comparable<getLayers> {
    private static getLayers$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$SearchResultReceiver;
    private static final Map<String, zzvm.write> MediaSessionCompat$Token;
    private static final Map<String, zzvm$MediaBrowserCompat$CustomActionResultReceiver> ParcelableVolumeInfo = HmlNdidSelectIdpActivity.read((HmlVerifyEmailSuccessfulActivity<? extends K, ? extends V>[]) new HmlVerifyEmailSuccessfulActivity[]{new HmlVerifyEmailSuccessfulActivity("TEXT_IMAGE", zzvm$MediaBrowserCompat$CustomActionResultReceiver.TEXT), new HmlVerifyEmailSuccessfulActivity("IMAGE", zzvm$MediaBrowserCompat$CustomActionResultReceiver.IMAGE)});
    @SerializedName("adsName")
    String IconCompatParcelizer;
    @SerializedName("contextualMetadata")
    getLayers$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("deeplinkUrlEN")
    String MediaBrowserCompat$ItemReceiver;
    @SerializedName("imageUrlTH")
    String MediaBrowserCompat$MediaItem;
    @SerializedName("imageUrlEN")
    String MediaDescriptionCompat;
    @SerializedName("fontColor")
    String MediaMetadataCompat;
    @SerializedName("sortSequence")
    int RatingCompat;
    @SerializedName("deeplinkUrlTH")
    String read;
    @SerializedName("adsId")
    int write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getLayers)) {
            return false;
        }
        getLayers getlayers = (getLayers) obj;
        return this.write == getlayers.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getlayers.IconCompatParcelizer) && this.RatingCompat == getlayers.RatingCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) getlayers.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getlayers.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) getlayers.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getlayers.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getlayers.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getlayers.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        int i = this.write;
        String str = this.IconCompatParcelizer;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        int i3 = this.RatingCompat;
        String str2 = this.MediaDescriptionCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$MediaItem;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaMetadataCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.read;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        getLayers$MediaBrowserCompat$ItemReceiver getlayers_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getlayers_mediabrowsercompat_itemreceiver != null) {
            i2 = getlayers_mediabrowsercompat_itemreceiver.hashCode();
        }
        return (((((((((((((((i * 31) + hashCode) * 31) + i3) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdBannerEntity(adsId=");
        sb.append(this.write);
        sb.append(", adsName=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", sortSequence=");
        sb.append(this.RatingCompat);
        sb.append(", imageUrlEN=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", imageUrlTH=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", fontColor=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", deeplinkUrlEN=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", deeplinkUrlTH=");
        sb.append(this.read);
        sb.append(", contextualMetadata=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final /* synthetic */ int compareTo(Object obj) {
        getLayers getlayers = (getLayers) obj;
        onGetStartedClick.write((Object) getlayers, "other");
        return onGetStartedClick.IconCompatParcelizer(this.RatingCompat, getlayers.RatingCompat);
    }

    static {
        HmlVerifyEmailSuccessfulActivity hmlVerifyEmailSuccessfulActivity = new HmlVerifyEmailSuccessfulActivity("FakeWhite", zzvm.write.FakeWhite);
        onGetStartedClick.write((Object) hmlVerifyEmailSuccessfulActivity, "pair");
        Map<String, zzvm.write> singletonMap = Collections.singletonMap(hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver, hmlVerifyEmailSuccessfulActivity.write);
        onGetStartedClick.IconCompatParcelizer((Object) singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        MediaSessionCompat$Token = singletonMap;
    }

    public final zzvm write() {
        int i = this.write;
        String str = this.IconCompatParcelizer;
        zzag.zza MediaBrowserCompat$CustomActionResultReceiver2 = zzag.zza.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver2.read = this.MediaDescriptionCompat;
        MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$MediaItem;
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver2, "Bilingual.create().withE…lEN).withThai(imageUrlTH)");
        zzvm.write write2 = MediaSessionCompat$Token.get(this.MediaMetadataCompat);
        zzag.zza MediaBrowserCompat$CustomActionResultReceiver3 = zzag.zza.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver3.read = this.MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$ItemReceiver = this.read;
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver3, "Bilingual.create().withE…).withThai(deeplinkUrlTH)");
        zzag.zza MediaBrowserCompat$CustomActionResultReceiver4 = zzag.zza.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver4.read = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver;
        MediaBrowserCompat$CustomActionResultReceiver4.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat;
        zzag.zza MediaBrowserCompat$CustomActionResultReceiver5 = zzag.zza.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver5.read = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$CustomActionResultReceiver5.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.read;
        zzag.zza MediaBrowserCompat$CustomActionResultReceiver6 = zzag.zza.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver6.read = this.MediaBrowserCompat$CustomActionResultReceiver.write;
        MediaBrowserCompat$CustomActionResultReceiver6.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        zzvm$MediaBrowserCompat$CustomActionResultReceiver zzvm_mediabrowsercompat_customactionresultreceiver = ParcelableVolumeInfo.get(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
        if (zzvm_mediabrowsercompat_customactionresultreceiver == null) {
            zzvm_mediabrowsercompat_customactionresultreceiver = zzvm$MediaBrowserCompat$CustomActionResultReceiver.IMAGE;
        }
        return new zzvm(String.valueOf(i), str, MediaBrowserCompat$CustomActionResultReceiver2, write2, MediaBrowserCompat$CustomActionResultReceiver3, MediaBrowserCompat$CustomActionResultReceiver4, MediaBrowserCompat$CustomActionResultReceiver5, MediaBrowserCompat$CustomActionResultReceiver6, zzvm_mediabrowsercompat_customactionresultreceiver);
    }

    /* renamed from: o.getLayers$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public final byte[] IconCompatParcelizer;
        public int read;
        public int write;

        private IconCompatParcelizer() {
        }

        public static final zzvm write(List<getLayers> list) {
            if (list == null || !(!list.isEmpty())) {
                return null;
            }
            return ((getLayers) HmlNTBBusinessURLInformationActivity.IconCompatParcelizer(list).get(0)).write();
        }

        public IconCompatParcelizer(byte[] bArr) {
            this.IconCompatParcelizer = bArr;
        }

        public final int MediaBrowserCompat$ItemReceiver(int i) {
            if (i > 0 && i <= 32) {
                int i2 = this.read;
                if (i <= ((this.IconCompatParcelizer.length - this.write) << 3) - i2) {
                    byte b = 0;
                    if (i2 > 0) {
                        int i3 = 8 - i2;
                        int i4 = i < i3 ? i : i3;
                        int i5 = i3 - i4;
                        byte[] bArr = this.IconCompatParcelizer;
                        int i6 = this.write;
                        byte b2 = bArr[i6];
                        i -= i4;
                        int i7 = this.read + i4;
                        this.read = i7;
                        if (i7 == 8) {
                            this.read = 0;
                            this.write = i6 + 1;
                        }
                        b = (((255 >> (8 - i4)) << i5) & b2) >> i5;
                    }
                    if (i <= 0) {
                        return b;
                    }
                    while (i >= 8) {
                        byte[] bArr2 = this.IconCompatParcelizer;
                        int i8 = this.write;
                        b = (b << 8) | (bArr2[i8] & 255);
                        this.write = i8 + 1;
                        i -= 8;
                    }
                    if (i <= 0) {
                        return b;
                    }
                    int i9 = 8 - i;
                    int i10 = (b << i) | ((((255 >> i9) << i9) & this.IconCompatParcelizer[this.write]) >> i9);
                    this.read += i;
                    return i10;
                }
            }
            throw new IllegalArgumentException(String.valueOf(i));
        }
    }
}
