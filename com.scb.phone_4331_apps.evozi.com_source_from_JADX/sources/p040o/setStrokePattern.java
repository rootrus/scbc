package p040o;

import java.util.List;

/* renamed from: o.setStrokePattern */
public final class setStrokePattern {
    public final double IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final double MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final List<String> f2960x50fd9e4a;
    public final String MediaDescriptionCompat;
    public final double MediaMetadataCompat;
    public final String MediaSessionCompat$QueueItem;
    public final String MediaSessionCompat$ResultReceiverWrapper;
    public final String MediaSessionCompat$Token;
    private final double ParcelableVolumeInfo;
    public final boolean RatingCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setStrokePattern)) {
            return false;
        }
        setStrokePattern setstrokepattern = (setStrokePattern) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) setstrokepattern.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setstrokepattern.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setstrokepattern.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setstrokepattern.write) && Double.compare(this.ParcelableVolumeInfo, setstrokepattern.ParcelableVolumeInfo) == 0 && Double.compare(this.IconCompatParcelizer, setstrokepattern.IconCompatParcelizer) == 0 && Double.compare(this.MediaBrowserCompat$MediaItem, setstrokepattern.MediaBrowserCompat$MediaItem) == 0 && Double.compare(this.MediaMetadataCompat, setstrokepattern.MediaMetadataCompat) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2960x50fd9e4a, (Object) setstrokepattern.f2960x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) setstrokepattern.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) setstrokepattern.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setstrokepattern.read) && this.RatingCompat == setstrokepattern.RatingCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setstrokepattern.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setstrokepattern.MediaBrowserCompat$SearchResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaSessionCompat$QueueItem;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.ParcelableVolumeInfo);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.IconCompatParcelizer);
        int i2 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.MediaBrowserCompat$MediaItem);
        int i3 = (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
        long doubleToLongBits4 = Double.doubleToLongBits(this.MediaMetadataCompat);
        int i4 = (int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32));
        List<String> list = this.f2960x50fd9e4a;
        int hashCode5 = list != null ? list.hashCode() : 0;
        String str5 = this.MediaSessionCompat$Token;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.read;
        int hashCode8 = str7 != null ? str7.hashCode() : 0;
        boolean z = this.RatingCompat;
        if (z) {
            z = true;
        }
        String str8 = this.MediaDescriptionCompat;
        int hashCode9 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$SearchResultReceiver;
        return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (z ? 1 : 0)) * 31) + hashCode9) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebitCardVerification(requestType=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", accountNo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", debitCardName=");
        sb.append(this.write);
        sb.append(", fee=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", annualfee=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", issuingfee=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", deliveryfee=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", mailingAddress=");
        sb.append(this.f2960x50fd9e4a);
        sb.append(", transactionToken=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", remark=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", debitPlusRemark=");
        sb.append(this.read);
        sb.append(", isDuplicated=");
        sb.append(this.RatingCompat);
        sb.append(", header=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", description=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public setStrokePattern(String str, String str2, String str3, String str4, double d, double d2, double d3, double d4, List<String> list, String str5, String str6, String str7, boolean z, String str8, String str9) {
        String str10 = str5;
        String str11 = str8;
        String str12 = str9;
        onGetStartedClick.write((Object) str, "requestType");
        onGetStartedClick.write((Object) str2, "accountNo");
        onGetStartedClick.write((Object) str3, "accountName");
        onGetStartedClick.write((Object) str4, "debitCardName");
        onGetStartedClick.write((Object) str10, "transactionToken");
        onGetStartedClick.write((Object) str11, "header");
        onGetStartedClick.write((Object) str12, "description");
        this.MediaSessionCompat$QueueItem = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.write = str4;
        this.ParcelableVolumeInfo = d;
        this.IconCompatParcelizer = d2;
        this.MediaBrowserCompat$MediaItem = d3;
        this.MediaMetadataCompat = d4;
        this.f2960x50fd9e4a = list;
        this.MediaSessionCompat$Token = str10;
        this.MediaSessionCompat$ResultReceiverWrapper = str6;
        this.read = str7;
        this.RatingCompat = z;
        this.MediaDescriptionCompat = str11;
        this.MediaBrowserCompat$SearchResultReceiver = str12;
    }
}
