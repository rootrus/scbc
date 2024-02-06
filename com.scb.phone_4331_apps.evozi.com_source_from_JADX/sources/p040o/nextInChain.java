package p040o;

import com.google.gson.annotations.SerializedName;
import p040o.CustomConcurrentHashMap;

/* renamed from: o.nextInChain */
public final class nextInChain {
    @SerializedName("insurance")
    public CustomConcurrentHashMap.HashIterator IconCompatParcelizer;
    @SerializedName("collateralOwnership")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("collateralCode")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("productType")
    public String MediaBrowserCompat$MediaItem;
    @SerializedName("residentialStatus")
    public String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("tilesVersion")
    public String MediaDescriptionCompat;
    @SerializedName("monthlyIncome")
    public String MediaMetadataCompat;
    @SerializedName("repaymentAbility")
    public String RatingCompat;
    @SerializedName("collateralPrice")
    public String read;
    @SerializedName("address")
    public zzwk write;

    public nextInChain() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nextInChain)) {
            return false;
        }
        nextInChain nextinchain = (nextInChain) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) nextinchain.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) nextinchain.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) nextinchain.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) nextinchain.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) nextinchain.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) nextinchain.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) nextinchain.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) nextinchain.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) nextinchain.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) nextinchain.MediaDescriptionCompat);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$MediaItem;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaMetadataCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.RatingCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.read;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        zzwk zzwk = this.write;
        int hashCode8 = zzwk != null ? zzwk.hashCode() : 0;
        CustomConcurrentHashMap.HashIterator hashIterator = this.IconCompatParcelizer;
        int hashCode9 = hashIterator != null ? hashIterator.hashCode() : 0;
        String str8 = this.MediaDescriptionCompat;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MortgageInfoRequest(productType=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", monthlyIncome=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", repaymentAbility=");
        sb.append(this.RatingCompat);
        sb.append(", collateralCode=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", collateralOwnership=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", residentialStatus=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", collateralPrice=");
        sb.append(this.read);
        sb.append(", address=");
        sb.append(this.write);
        sb.append(", insurance=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", tilesVersion=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(")");
        return sb.toString();
    }

    private nextInChain(String str, String str2, String str3, String str4, String str5, String str6, String str7, zzwk zzwk, CustomConcurrentHashMap.HashIterator hashIterator, String str8) {
        onGetStartedClick.write((Object) str, "productType");
        onGetStartedClick.write((Object) str2, "monthlyIncome");
        onGetStartedClick.write((Object) str3, "repaymentAbility");
        onGetStartedClick.write((Object) str4, "collateralCode");
        onGetStartedClick.write((Object) str5, "collateralOwnership");
        onGetStartedClick.write((Object) str6, "residentialStatus");
        onGetStartedClick.write((Object) str7, "collateralPrice");
        onGetStartedClick.write((Object) zzwk, "address");
        onGetStartedClick.write((Object) hashIterator, "insurance");
        onGetStartedClick.write((Object) str8, "tilesVersion");
        this.MediaBrowserCompat$MediaItem = str;
        this.MediaMetadataCompat = str2;
        this.RatingCompat = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = str5;
        this.MediaBrowserCompat$SearchResultReceiver = str6;
        this.read = str7;
        this.write = zzwk;
        this.IconCompatParcelizer = hashIterator;
        this.MediaDescriptionCompat = str8;
    }

    private /* synthetic */ nextInChain(byte b) {
        this("", "", "", "", "", "", "", new zzwk(), new CustomConcurrentHashMap.HashIterator((byte) 0), "");
    }
}
