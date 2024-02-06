package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.PlaceLikelihood */
public final class PlaceLikelihood {
    @SerializedName("campaignName")
    private final String IconCompatParcelizer;
    @SerializedName("fontColor")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("campaignId")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("image")
    private final String read;
    @SerializedName("deeplink")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceLikelihood)) {
            return false;
        }
        PlaceLikelihood placeLikelihood = (PlaceLikelihood) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) placeLikelihood.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) placeLikelihood.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) placeLikelihood.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) placeLikelihood.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) placeLikelihood.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LandingPopupInfo(image=");
        sb.append(this.read);
        sb.append(", deeplink=");
        sb.append(this.write);
        sb.append(", campaignId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", campaignName=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", fontColor=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
