package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getStyle */
public final class getStyle {
    @SerializedName("onlineViaMarketplace")
    public final String IconCompatParcelizer;
    @SerializedName("brickAndMortar")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("onlineViaWeb")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getStyle)) {
            return false;
        }
        getStyle getstyle = (getStyle) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getstyle.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getstyle.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getstyle.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlStoreTypeEntity(brickAndMortar=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", onlineViaWeb=");
        sb.append(this.write);
        sb.append(", onlineViaMarket=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
