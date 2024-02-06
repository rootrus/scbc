package p040o;

import com.google.gson.annotations.SerializedName;
import p040o.zzcb;

/* renamed from: o.getMaxScale */
public final class getMaxScale {
    @SerializedName("enable")
    private final String IconCompatParcelizer;
    @SerializedName("logo")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("loanAmount")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("monthlyPayment")
    private final String MediaBrowserCompat$MediaItem;
    @SerializedName("minimumCreditLimit")
    private final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("productName")
    private final String MediaDescriptionCompat;
    @SerializedName("productType")
    private final String MediaMetadataCompat;
    @SerializedName("sortSequence")
    private final String MediaSessionCompat$Token;
    @SerializedName("tenor")
    private final String ParcelableVolumeInfo;
    @SerializedName("sliderInterval")
    private final String RatingCompat;
    @SerializedName("maximumCreditLimit")
    private final String read;
    @SerializedName("interestRate")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getMaxScale)) {
            return false;
        }
        getMaxScale getmaxscale = (getMaxScale) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) getmaxscale.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) getmaxscale.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getmaxscale.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) getmaxscale.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getmaxscale.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getmaxscale.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) getmaxscale.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getmaxscale.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getmaxscale.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) getmaxscale.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getmaxscale.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) getmaxscale.MediaDescriptionCompat);
    }

    public final int hashCode() {
        String str = this.MediaSessionCompat$Token;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaMetadataCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.RatingCompat;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.write;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$MediaItem;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.ParcelableVolumeInfo;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode11 = str11 != null ? str11.hashCode() : 0;
        String str12 = this.MediaDescriptionCompat;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreditPowerProductEntity(sortSequence=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", productType=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", enable=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", minimumCreditLimit=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", maximumCreditLimit=");
        sb.append(this.read);
        sb.append(", loanAmount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", sliderInterval=");
        sb.append(this.RatingCompat);
        sb.append(", interestRate=");
        sb.append(this.write);
        sb.append(", monthlyPayment=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", tenor=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", logo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", productName=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(")");
        return sb.toString();
    }

    public final zzcb.zzc.zza IconCompatParcelizer() {
        return new zzcb.zzc.zza(this.MediaSessionCompat$Token, this.MediaMetadataCompat, this.IconCompatParcelizer, this.MediaBrowserCompat$SearchResultReceiver, this.read, this.MediaBrowserCompat$ItemReceiver, this.RatingCompat, this.write, this.MediaBrowserCompat$MediaItem, this.ParcelableVolumeInfo, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaDescriptionCompat);
    }
}
