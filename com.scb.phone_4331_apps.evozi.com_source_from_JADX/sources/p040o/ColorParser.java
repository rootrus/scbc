package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ColorParser */
public final class ColorParser {
    @SerializedName("campaignName")
    private final String IconCompatParcelizer;
    @SerializedName("campaignId")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("fontColor")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("image")
    private final String read;
    @SerializedName("deeplink")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorParser)) {
            return false;
        }
        ColorParser colorParser = (ColorParser) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) colorParser.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) colorParser.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) colorParser.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) colorParser.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) colorParser.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LandingPopupInfoEntity(image=");
        sb.append(this.read);
        sb.append(", deeplink=");
        sb.append(this.write);
        sb.append(", campaignId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", campaignName=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", fontColor=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
