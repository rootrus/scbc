package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.ReserveIntents */
public final class ReserveIntents {
    @SerializedName("asOfDate")
    public final String IconCompatParcelizer;
    @SerializedName("singleAppFlag")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("marketValue")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("tradeNow")
    public final getInfo MediaBrowserCompat$MediaItem;
    @SerializedName("unrealizedPercent")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("unrealizedAmt")
    public final String MediaMetadataCompat;
    @SerializedName("accountList")
    public final List<getAdvertisingIdInfo> read;
    @SerializedName("pieChart")
    public final List<setShowDivider> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReserveIntents)) {
            return false;
        }
        ReserveIntents reserveIntents = (ReserveIntents) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) reserveIntents.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) reserveIntents.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) reserveIntents.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) reserveIntents.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) reserveIntents.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) reserveIntents.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) reserveIntents.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) reserveIntents.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaMetadataCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        List<getAdvertisingIdInfo> list = this.read;
        int hashCode5 = list != null ? list.hashCode() : 0;
        List<setShowDivider> list2 = this.write;
        int hashCode6 = list2 != null ? list2.hashCode() : 0;
        getInfo getinfo = this.MediaBrowserCompat$MediaItem;
        int hashCode7 = getinfo != null ? getinfo.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SecuritiesSummaryEntity(unrealizedAmt=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", unrealizedPercent=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", marketValue=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", asOfDate=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountList=");
        sb.append(this.read);
        sb.append(", pieChart=");
        sb.append(this.write);
        sb.append(", tradeNow=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", singleAppFlag=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
