package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p040o.GoogleMap;

/* renamed from: o.onSnapshotReady */
public final class onSnapshotReady {
    @SerializedName("callbackUrl")
    public final String IconCompatParcelizer;
    @SerializedName("merchantInfo")
    public final GoogleMap.OnPolylineClickListener read;
    @SerializedName("paymentInfo")
    public final List<onPolylineClick> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onSnapshotReady)) {
            return false;
        }
        onSnapshotReady onsnapshotready = (onSnapshotReady) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) onsnapshotready.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) onsnapshotready.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onsnapshotready.write);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        GoogleMap.OnPolylineClickListener onPolylineClickListener = this.read;
        int hashCode2 = onPolylineClickListener != null ? onPolylineClickListener.hashCode() : 0;
        List<onPolylineClick> list = this.write;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MerchantMetaData(callbackUrl=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", merchantInfo=");
        sb.append(this.read);
        sb.append(", paymentInfo=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public onSnapshotReady(String str, GoogleMap.OnPolylineClickListener onPolylineClickListener, List<onPolylineClick> list) {
        this.IconCompatParcelizer = str;
        this.read = onPolylineClickListener;
        this.write = list;
    }
}
