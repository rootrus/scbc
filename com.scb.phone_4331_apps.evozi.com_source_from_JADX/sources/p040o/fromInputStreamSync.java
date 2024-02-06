package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.fromInputStreamSync */
public final class fromInputStreamSync {
    @SerializedName("sortSequence")
    public final int IconCompatParcelizer;
    @SerializedName("accountName")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("subList")
    public final List<fromAsset> MediaBrowserCompat$ItemReceiver;
    @SerializedName("salesSheetFlag")
    public final int read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fromInputStreamSync)) {
            return false;
        }
        fromInputStreamSync frominputstreamsync = (fromInputStreamSync) obj;
        return this.IconCompatParcelizer == frominputstreamsync.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) frominputstreamsync.MediaBrowserCompat$CustomActionResultReceiver) && this.read == frominputstreamsync.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) frominputstreamsync.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        int i3 = this.read;
        List<fromAsset> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            i2 = list.hashCode();
        }
        return (((((i * 31) + hashCode) * 31) + i3) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SalesSheetEntity(sortSequence=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", salesSheetFlag=");
        sb.append(this.read);
        sb.append(", subList=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
