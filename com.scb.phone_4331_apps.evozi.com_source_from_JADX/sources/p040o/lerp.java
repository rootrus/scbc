package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.lerp */
public final class lerp {
    @SerializedName("description")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("interestRate")
    public final List<getGradientColor> read;
    @SerializedName("promoFlag")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lerp)) {
            return false;
        }
        lerp lerp = (lerp) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) lerp.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) lerp.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) lerp.read);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        List<getGradientColor> list = this.read;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlTierRateEntity(promoFlag=");
        sb.append(this.write);
        sb.append(", description=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", interestRate=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
