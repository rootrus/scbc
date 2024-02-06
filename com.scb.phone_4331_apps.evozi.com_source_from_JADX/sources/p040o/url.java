package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.url */
public final class url {
    @SerializedName("postDate")
    public final String IconCompatParcelizer;
    @SerializedName("merchName")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("cycleNumber")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("transactionDate")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("transactionAmt")
    public final Double MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("refNo")
    public final String read;
    @SerializedName("sequenceNo")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof url)) {
            return false;
        }
        url url = (url) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) url.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) url.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) url.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) url.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) url.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) url.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) url.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$MediaItem;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        Double d = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode3 = d != null ? d.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.write;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CardTransactionEntity(merchantName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", transactionDate=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", transactionAmt=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", postDate=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", refNo=");
        sb.append(this.read);
        sb.append(", cycleNo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", sequenceNo=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
