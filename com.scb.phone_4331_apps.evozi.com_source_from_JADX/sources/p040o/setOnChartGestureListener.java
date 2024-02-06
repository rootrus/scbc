package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setOnChartGestureListener */
public final class setOnChartGestureListener {
    @SerializedName("paymentInfo")
    public final List<setNoDataTextColor> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("merchantInfo")
    public final setMarker MediaBrowserCompat$ItemReceiver;
    @SerializedName("callbackUrl")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setOnChartGestureListener)) {
            return false;
        }
        setOnChartGestureListener setonchartgesturelistener = (setOnChartGestureListener) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setonchartgesturelistener.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setonchartgesturelistener.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setonchartgesturelistener.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        setMarker setmarker = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = setmarker != null ? setmarker.hashCode() : 0;
        List<setNoDataTextColor> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MerchantMetaDataEntity(callbackUrl=");
        sb.append(this.write);
        sb.append(", merchantInfo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", paymentInfo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
