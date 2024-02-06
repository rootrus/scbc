package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p040o.LinkedHashTreeMap;

/* renamed from: o.rebalance */
public final class rebalance {
    @SerializedName("accountRemark")
    public final String IconCompatParcelizer;
    @SerializedName("applicationURL")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("function")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("urlEN")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("tncFlag")
    public final int MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("merchantMinAge")
    public final String MediaDescriptionCompat;
    @SerializedName("owner")
    public final rotateLeft MediaMetadataCompat;
    @SerializedName("urlTH")
    public final String MediaSessionCompat$ResultReceiverWrapper;
    @SerializedName("walletList")
    public final List<LinkedHashTreeMap.AvlBuilder> ParcelableVolumeInfo;
    @SerializedName("mobilePhoneNumber")
    public final String RatingCompat;
    @SerializedName("GMB")
    public final skipUnquotedValue read;
    @SerializedName("merchant")
    public final doubleCapacity write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rebalance)) {
            return false;
        }
        rebalance rebalance = (rebalance) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) rebalance.MediaBrowserCompat$ItemReceiver) && this.MediaBrowserCompat$SearchResultReceiver == rebalance.MediaBrowserCompat$SearchResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) rebalance.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) rebalance.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) rebalance.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) rebalance.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) rebalance.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) rebalance.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) rebalance.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) rebalance.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) rebalance.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) rebalance.MediaDescriptionCompat);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        int i2 = this.MediaBrowserCompat$SearchResultReceiver;
        String str2 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$MediaItem;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.RatingCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        doubleCapacity doublecapacity = this.write;
        int hashCode6 = doublecapacity != null ? doublecapacity.hashCode() : 0;
        rotateLeft rotateleft = this.MediaMetadataCompat;
        int hashCode7 = rotateleft != null ? rotateleft.hashCode() : 0;
        List<LinkedHashTreeMap.AvlBuilder> list = this.ParcelableVolumeInfo;
        int hashCode8 = list != null ? list.hashCode() : 0;
        String str6 = this.IconCompatParcelizer;
        int hashCode9 = str6 != null ? str6.hashCode() : 0;
        skipUnquotedValue skipunquotedvalue = this.read;
        int hashCode10 = skipunquotedvalue != null ? skipunquotedvalue.hashCode() : 0;
        String str7 = this.MediaDescriptionCompat;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return (((((((((((((((((((((hashCode * 31) + i2) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MerchantLandingEntity(function=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", tncFlag=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", urlTH=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", urlEN=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", applicationURL=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", mobilePhoneNumber=");
        sb.append(this.RatingCompat);
        sb.append(", merchant=");
        sb.append(this.write);
        sb.append(", owner=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", walletList=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", accountRemark=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", gmb=");
        sb.append(this.read);
        sb.append(", merchantMinAge=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(")");
        return sb.toString();
    }
}
