package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.expireEntries */
public final class expireEntries {
    @SerializedName("tilesVersion")
    public String IconCompatParcelizer = null;
    @SerializedName("productSubCode")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("amount")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("productType")
    private final String MediaBrowserCompat$MediaItem;
    @SerializedName("sourceCode")
    private final String MediaDescriptionCompat;
    @SerializedName("applicationId")
    private final String read;
    @SerializedName("productCode")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof expireEntries)) {
            return false;
        }
        expireEntries expireentries = (expireEntries) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) expireentries.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) expireentries.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) expireentries.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) expireentries.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) expireentries.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) expireentries.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) expireentries.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$MediaItem;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaDescriptionCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.IconCompatParcelizer;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashCardInfoRequest(productType=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", productCode=");
        sb.append(this.write);
        sb.append(", productSubCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", sourceCode=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", applicationId=");
        sb.append(this.read);
        sb.append(", amount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", tilesVersion=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public expireEntries(String str, String str2, String str3, String str4, String str5, String str6) {
        onGetStartedClick.write((Object) str, "productType");
        onGetStartedClick.write((Object) str2, "productCode");
        onGetStartedClick.write((Object) str3, "productSubCode");
        onGetStartedClick.write((Object) str4, "sourceCode");
        onGetStartedClick.write((Object) str5, "applicationId");
        onGetStartedClick.write((Object) str6, "amount");
        this.MediaBrowserCompat$MediaItem = str;
        this.write = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.MediaDescriptionCompat = str4;
        this.read = str5;
        this.MediaBrowserCompat$ItemReceiver = str6;
    }
}
