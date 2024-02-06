package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.panningGesturesEnabled */
public final class panningGesturesEnabled {
    @SerializedName("campaignName")
    private final String IconCompatParcelizer;
    @SerializedName("campaignId")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("deeplink")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("image")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof panningGesturesEnabled)) {
            return false;
        }
        panningGesturesEnabled panninggesturesenabled = (panningGesturesEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) panninggesturesenabled.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) panninggesturesenabled.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) panninggesturesenabled.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) panninggesturesenabled.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BillPaymentContextualBanner(image=");
        sb.append(this.write);
        sb.append(", deeplink=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", campaignId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", campaignName=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
