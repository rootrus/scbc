package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.fetch */
public final class fetch extends setCurrentItemInternal {
    @SerializedName("unrealizedAmt")
    public final String IconCompatParcelizer;
    @SerializedName("asOfDate")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("cardTitle")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("unrealizedPercent")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("marketValue")
    public final String read;
    @SerializedName("iconUrl")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fetch)) {
            return false;
        }
        fetch fetch = (fetch) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fetch.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fetch.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fetch.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) fetch.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fetch.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fetch.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SecuritiesEntity(cardTitle=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", iconUrl=");
        sb.append(this.write);
        sb.append(", unrealizedAmt=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", unrealizedPercent=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", marketValue=");
        sb.append(this.read);
        sb.append(", asOfDate=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
