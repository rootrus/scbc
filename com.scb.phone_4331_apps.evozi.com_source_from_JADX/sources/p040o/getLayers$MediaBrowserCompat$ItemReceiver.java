package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getLayers$MediaBrowserCompat$ItemReceiver */
public final class getLayers$MediaBrowserCompat$ItemReceiver {
    @SerializedName("buttonTextTh")
    String IconCompatParcelizer;
    @SerializedName("formatType")
    String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("descriptionEn")
    String MediaBrowserCompat$ItemReceiver;
    @SerializedName("headerEn")
    String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("headerTh")
    String MediaMetadataCompat;
    @SerializedName("descriptionTh")
    String read;
    @SerializedName("buttonTextEn")
    String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getLayers$MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        getLayers$MediaBrowserCompat$ItemReceiver getlayers_mediabrowsercompat_itemreceiver = (getLayers$MediaBrowserCompat$ItemReceiver) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) getlayers_mediabrowsercompat_itemreceiver.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) getlayers_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getlayers_mediabrowsercompat_itemreceiver.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getlayers_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getlayers_mediabrowsercompat_itemreceiver.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getlayers_mediabrowsercompat_itemreceiver.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getlayers_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaMetadataCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.write;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContextualMetadata(headerTh=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", headerEn=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", descriptionTh=");
        sb.append(this.read);
        sb.append(", descriptionEn=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", buttonTextTh=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", buttonTextEn=");
        sb.append(this.write);
        sb.append(", formatType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
