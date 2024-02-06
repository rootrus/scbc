package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.doubleCapacity */
public final class doubleCapacity {
    @SerializedName("category")
    public final String IconCompatParcelizer;
    @SerializedName("merchantId")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("estimatedMonthlySales")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("registrationChannel")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("subCategory")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("referralCode")
    public final String MediaDescriptionCompat;
    @SerializedName("nameTH")
    public final String MediaMetadataCompat;
    @SerializedName("segment")
    public final String RatingCompat;
    @SerializedName("nameEN")
    public final String read;
    @SerializedName("citizenId")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doubleCapacity)) {
            return false;
        }
        doubleCapacity doublecapacity = (doubleCapacity) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) doublecapacity.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) doublecapacity.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) doublecapacity.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) doublecapacity.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) doublecapacity.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) doublecapacity.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) doublecapacity.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) doublecapacity.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) doublecapacity.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) doublecapacity.MediaDescriptionCompat);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaMetadataCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.RatingCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.IconCompatParcelizer;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$MediaItem;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaDescriptionCompat;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MerchantEntity(merchantId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", nameTH=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", nameEN=");
        sb.append(this.read);
        sb.append(", citizenId=");
        sb.append(this.write);
        sb.append(", segment=");
        sb.append(this.RatingCompat);
        sb.append(", category=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", subCategory=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", estimatedMonthlySales=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", registrationChannel=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", referralCode=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(")");
        return sb.toString();
    }
}
