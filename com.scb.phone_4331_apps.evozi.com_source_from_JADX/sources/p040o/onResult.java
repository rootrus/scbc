package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.onResult */
public final class onResult {
    @SerializedName("annualFee")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("deliveryFee")
    public final String read;
    @SerializedName("issuingFee")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onResult)) {
            return false;
        }
        onResult onresult = (onResult) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) onresult.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onresult.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) onresult.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebitCardFeeEntity(annualFee=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", issuingFee=");
        sb.append(this.write);
        sb.append(", deliveryFee=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
