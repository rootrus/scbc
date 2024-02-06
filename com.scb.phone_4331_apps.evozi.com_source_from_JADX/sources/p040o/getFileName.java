package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getFileName */
public final class getFileName {
    @SerializedName("collateral")
    public final List<getHeight> MediaBrowserCompat$ItemReceiver;
    @SerializedName("minimumAmount")
    public final String read;
    @SerializedName("prefill")
    public final LottieImageAsset write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getFileName)) {
            return false;
        }
        getFileName getfilename = (getFileName) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getfilename.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getfilename.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getfilename.read);
    }

    public final int hashCode() {
        LottieImageAsset lottieImageAsset = this.write;
        int i = 0;
        int hashCode = lottieImageAsset != null ? lottieImageAsset.hashCode() : 0;
        List<getHeight> list = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = list != null ? list.hashCode() : 0;
        String str = this.read;
        if (str != null) {
            i = str.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CollateralListEntity(prefill=");
        sb.append(this.write);
        sb.append(", collateral=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", minimumAmount=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
