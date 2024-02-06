package p040o;

import java.util.List;

/* renamed from: o.onCameraIdle */
public final class onCameraIdle {
    public final String IconCompatParcelizer;
    public final double MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String f2904x50fd9e4a;
    public final String MediaDescriptionCompat;
    public final List<String> MediaMetadataCompat;
    public final String ParcelableVolumeInfo;
    public final double RatingCompat;
    public final double read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onCameraIdle)) {
            return false;
        }
        onCameraIdle oncameraidle = (onCameraIdle) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) oncameraidle.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) oncameraidle.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) oncameraidle.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) oncameraidle.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) oncameraidle.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) oncameraidle.MediaDescriptionCompat) && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, oncameraidle.MediaBrowserCompat$CustomActionResultReceiver) == 0 && Double.compare(this.RatingCompat, oncameraidle.RatingCompat) == 0 && Double.compare(this.read, oncameraidle.read) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) oncameraidle.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2904x50fd9e4a, (Object) oncameraidle.f2904x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) oncameraidle.MediaBrowserCompat$SearchResultReceiver);
    }

    public final int hashCode() {
        String str = this.ParcelableVolumeInfo;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$MediaItem;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaDescriptionCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.RatingCompat);
        int i3 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.read);
        int i4 = (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
        List<String> list = this.MediaMetadataCompat;
        int hashCode7 = list != null ? list.hashCode() : 0;
        String str7 = this.f2904x50fd9e4a;
        int hashCode8 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidRequestVerification(requestType=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", accountNo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", displayName=");
        sb.append(this.write);
        sb.append(", prepaidCardName=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", fee=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", annualFee=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", issuingFee=");
        sb.append(this.RatingCompat);
        sb.append(", deliveryFee=");
        sb.append(this.read);
        sb.append(", mailingAddress=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", transactionToken=");
        sb.append(this.f2904x50fd9e4a);
        sb.append(", personalInfoRemark=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public onCameraIdle(String str, String str2, String str3, String str4, String str5, String str6, double d, double d2, double d3, List<String> list, String str7, String str8) {
        String str9 = str5;
        String str10 = str6;
        List<String> list2 = list;
        String str11 = str7;
        String str12 = str8;
        onGetStartedClick.write((Object) str, "requestType");
        onGetStartedClick.write((Object) str2, "accountNo");
        onGetStartedClick.write((Object) str3, "accountName");
        onGetStartedClick.write((Object) str4, "displayName");
        onGetStartedClick.write((Object) str9, "prepaidCardName");
        onGetStartedClick.write((Object) str10, "fee");
        onGetStartedClick.write((Object) list2, "mailingAddress");
        onGetStartedClick.write((Object) str11, "transactionToken");
        onGetStartedClick.write((Object) str12, "personalInfoRemark");
        this.ParcelableVolumeInfo = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.write = str4;
        this.MediaBrowserCompat$MediaItem = str9;
        this.MediaDescriptionCompat = str10;
        this.MediaBrowserCompat$CustomActionResultReceiver = d;
        this.RatingCompat = d2;
        this.read = d3;
        this.MediaMetadataCompat = list2;
        this.f2904x50fd9e4a = str11;
        this.MediaBrowserCompat$SearchResultReceiver = str12;
    }
}
