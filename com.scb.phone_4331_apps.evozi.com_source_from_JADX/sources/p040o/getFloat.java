package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getFloat */
public final class getFloat {
    @SerializedName("transactions")
    public final List<CampaignTrackingReceiver> IconCompatParcelizer;
    @SerializedName("totalCount")
    public final int MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("remark")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("pagingOffset")
    public final int read;
    @SerializedName("endOfListFlag")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getFloat)) {
            return false;
        }
        getFloat getfloat = (getFloat) obj;
        return this.MediaBrowserCompat$CustomActionResultReceiver == getfloat.MediaBrowserCompat$CustomActionResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getfloat.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getfloat.MediaBrowserCompat$ItemReceiver) && this.read == getfloat.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getfloat.IconCompatParcelizer);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str = this.write;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i3 = this.read;
        List<CampaignTrackingReceiver> list = this.IconCompatParcelizer;
        if (list != null) {
            i2 = list.hashCode();
        }
        return (((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + i3) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TopUpHistoryEntity(totalCount=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", endOfListFlag=");
        sb.append(this.write);
        sb.append(", remark=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", pagingOffset=");
        sb.append(this.read);
        sb.append(", transactions=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
