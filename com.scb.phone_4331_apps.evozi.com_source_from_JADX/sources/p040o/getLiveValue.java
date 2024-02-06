package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getLiveValue */
public final class getLiveValue {
    @SerializedName("productCode")
    private final String IconCompatParcelizer;
    @SerializedName("duration")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("loanAmount")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("sourceCode")
    private final String MediaBrowserCompat$MediaItem;
    @SerializedName("productSubCode")
    private final String MediaDescriptionCompat;
    @SerializedName("productType")
    private final String MediaMetadataCompat;
    @SerializedName("tilesVersion")
    public String read = null;
    @SerializedName("applicationId")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getLiveValue)) {
            return false;
        }
        getLiveValue getlivevalue = (getLiveValue) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) getlivevalue.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getlivevalue.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) getlivevalue.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getlivevalue.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getlivevalue.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getlivevalue.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getlivevalue.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getlivevalue.read);
    }

    public final int hashCode() {
        String str = this.MediaMetadataCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaDescriptionCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$MediaItem;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.write;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.read;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashLoanInfoRequest(productType=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", productCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", productSubCode=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", sourceCode=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", applicationId=");
        sb.append(this.write);
        sb.append(", loanAmount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", duration=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", tilesVersion=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public getLiveValue(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        onGetStartedClick.write((Object) str, "productType");
        onGetStartedClick.write((Object) str2, "productCode");
        onGetStartedClick.write((Object) str3, "productSubCode");
        onGetStartedClick.write((Object) str4, "sourceCode");
        onGetStartedClick.write((Object) str5, "applicationId");
        onGetStartedClick.write((Object) str6, "loanAmount");
        onGetStartedClick.write((Object) str7, "duration");
        this.MediaMetadataCompat = str;
        this.IconCompatParcelizer = str2;
        this.MediaDescriptionCompat = str3;
        this.MediaBrowserCompat$MediaItem = str4;
        this.write = str5;
        this.MediaBrowserCompat$ItemReceiver = str6;
        this.MediaBrowserCompat$CustomActionResultReceiver = str7;
    }
}
