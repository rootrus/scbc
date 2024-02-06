package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getDashOffset */
public final class getDashOffset {
    @SerializedName("callbackUrl")
    public final String IconCompatParcelizer;
    @SerializedName("paymentInfo")
    public final List<getLineDashPattern> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("merchantInfo")
    public final getJoinType MediaBrowserCompat$ItemReceiver;
    @SerializedName("extraData")
    public final GradientStroke write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDashOffset)) {
            return false;
        }
        getDashOffset getdashoffset = (getDashOffset) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getdashoffset.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getdashoffset.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getdashoffset.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getdashoffset.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        GradientStroke gradientStroke = this.write;
        int hashCode2 = gradientStroke != null ? gradientStroke.hashCode() : 0;
        getJoinType getjointype = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = getjointype != null ? getjointype.hashCode() : 0;
        List<getLineDashPattern> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MerchantMetaDataEntity(callbackUrl=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", extraData=");
        sb.append(this.write);
        sb.append(", merchantInfo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", paymentInfo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
