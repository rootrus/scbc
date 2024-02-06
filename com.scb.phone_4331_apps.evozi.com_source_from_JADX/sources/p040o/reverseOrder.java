package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.reverseOrder */
public final class reverseOrder {
    @SerializedName("accountFromNumber")
    private final String IconCompatParcelizer;
    @SerializedName("amountFrom")
    private final double MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("agentType")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("currencyCode")
    private final String MediaBrowserCompat$MediaItem;
    @SerializedName("countryName")
    private final String MediaMetadataCompat;
    @SerializedName("amountTo")
    private final double read;
    @SerializedName("channelType")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof reverseOrder)) {
            return false;
        }
        reverseOrder reverseorder = (reverseOrder) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) reverseorder.IconCompatParcelizer) && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, reverseorder.MediaBrowserCompat$CustomActionResultReceiver) == 0 && Double.compare(this.read, reverseorder.read) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) reverseorder.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) reverseorder.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) reverseorder.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) reverseorder.MediaBrowserCompat$MediaItem);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.read);
        int i3 = (int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2);
        String str2 = this.MediaMetadataCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$MediaItem;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((((((hashCode * 31) + i2) * 31) + i3) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemittanceValidationRequest(accountFromNumber=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", amountFrom=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", amountTo=");
        sb.append(this.read);
        sb.append(", countryName=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", channelType=");
        sb.append(this.write);
        sb.append(", agentType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", currencyCode=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(")");
        return sb.toString();
    }

    public reverseOrder(String str, double d, double d2, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "accountFromNumber");
        onGetStartedClick.write((Object) str2, "countryName");
        onGetStartedClick.write((Object) str3, "channelType");
        onGetStartedClick.write((Object) str4, "agentType");
        onGetStartedClick.write((Object) str5, "currencyCode");
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = d;
        this.read = d2;
        this.MediaMetadataCompat = str2;
        this.write = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
        this.MediaBrowserCompat$MediaItem = str5;
    }
}
