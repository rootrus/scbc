package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.removeInternalByKey */
public final class removeInternalByKey {
    @SerializedName("companyCode")
    public final String IconCompatParcelizer;
    @SerializedName("marketingNameTH")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("maxIal")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("nodeId")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("marketingNameEN")
    public final String read;
    @SerializedName("maxAal")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof removeInternalByKey)) {
            return false;
        }
        removeInternalByKey removeinternalbykey = (removeInternalByKey) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) removeinternalbykey.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) removeinternalbykey.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) removeinternalbykey.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) removeinternalbykey.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) removeinternalbykey.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) removeinternalbykey.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$MediaItem;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.write;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IdpEntity(nodeId=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", companyCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", marketingNameTH=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", marketingNameEN=");
        sb.append(this.read);
        sb.append(", maxIal=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", maxAal=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
