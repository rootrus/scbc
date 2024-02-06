package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.beginSection */
public final class beginSection {
    @SerializedName("couponExpiry")
    public final String IconCompatParcelizer;
    @SerializedName("couponTimeLimit")
    public final Integer MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("couponStatus")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("txnRefNo")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("redemptionDate")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("imageUrl")
    public final String MediaDescriptionCompat;
    @SerializedName("name")
    public final String MediaMetadataCompat;
    @SerializedName("usedDate")
    public final String RatingCompat;
    @SerializedName("description")
    public final String read;
    @SerializedName("couponCode")
    public final String write;

    public beginSection() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof beginSection)) {
            return false;
        }
        beginSection beginsection = (beginSection) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) beginsection.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) beginsection.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) beginsection.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) beginsection.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) beginsection.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) beginsection.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) beginsection.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) beginsection.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) beginsection.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) beginsection.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$MediaItem;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaDescriptionCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        Integer num = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode6 = num != null ? num.hashCode() : 0;
        String str6 = this.MediaMetadataCompat;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.read;
        int hashCode8 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.RatingCompat;
        int hashCode9 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$ItemReceiver;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ECouponDetailEntity(txnRefNo=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", couponCode=");
        sb.append(this.write);
        sb.append(", imageUrl=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", couponExpiry=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", redemptionDate=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", couponTimeLimit=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", name=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", description=");
        sb.append(this.read);
        sb.append(", usedDate=");
        sb.append(this.RatingCompat);
        sb.append(", couponStatus=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    private beginSection(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9) {
        this.MediaBrowserCompat$MediaItem = str;
        this.write = str2;
        this.MediaDescriptionCompat = str3;
        this.IconCompatParcelizer = str4;
        this.MediaBrowserCompat$SearchResultReceiver = str5;
        this.MediaBrowserCompat$CustomActionResultReceiver = num;
        this.MediaMetadataCompat = str6;
        this.read = str7;
        this.RatingCompat = str8;
        this.MediaBrowserCompat$ItemReceiver = str9;
    }

    private /* synthetic */ beginSection(byte b) {
        this("", "", "", "", "", 0, "", "", "", "");
    }
}
