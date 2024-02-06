package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.L */
public final class C1224L {
    @SerializedName("couponTimeLimit")
    public final Integer IconCompatParcelizer;
    @SerializedName("imageUrl")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("itemCode")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("refId")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("redemptionDate")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("usedDate")
    public final String MediaDescriptionCompat;
    @SerializedName("relationId")
    public final String MediaMetadataCompat;
    @SerializedName("name")
    public final String read;
    @SerializedName("couponExpiry")
    public final String write;

    public C1224L() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1224L)) {
            return false;
        }
        C1224L l = (C1224L) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) l.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) l.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) l.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) l.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) l.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) l.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) l.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) l.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) l.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        Integer num = this.IconCompatParcelizer;
        int hashCode2 = num != null ? num.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$MediaItem;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaMetadataCompat;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaDescriptionCompat;
        int hashCode8 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$ItemReceiver;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ECouponTransactionDataEntity(couponExpiry=");
        sb.append(this.write);
        sb.append(", couponTimeLimit=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", imageUrl=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", name=");
        sb.append(this.read);
        sb.append(", redemptionDate=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", refId=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", relationId=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", usedDate=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", itemCode=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    private C1224L(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.write = str;
        this.IconCompatParcelizer = num;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.read = str3;
        this.MediaBrowserCompat$SearchResultReceiver = str4;
        this.MediaBrowserCompat$MediaItem = str5;
        this.MediaMetadataCompat = str6;
        this.MediaDescriptionCompat = str7;
        this.MediaBrowserCompat$ItemReceiver = str8;
    }

    private /* synthetic */ C1224L(byte b) {
        this("", 0, "", "", "", "", "", "", "");
    }
}
