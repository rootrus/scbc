package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getJoinType */
public final class getJoinType {
    @SerializedName("terminal")
    public final String IconCompatParcelizer;
    @SerializedName("code")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("referenceOrder")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("urlLogo")
    public final String MediaMetadataCompat;
    @SerializedName("name")
    public final String read;
    @SerializedName("id")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getJoinType)) {
            return false;
        }
        getJoinType getjointype = (getJoinType) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getjointype.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getjointype.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getjointype.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getjointype.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) getjointype.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getjointype.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaMetadataCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MerchantInfoEntity(id=");
        sb.append(this.write);
        sb.append(", name=");
        sb.append(this.read);
        sb.append(", code=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", terminal=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", urlLogo=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", referenceOrder=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
