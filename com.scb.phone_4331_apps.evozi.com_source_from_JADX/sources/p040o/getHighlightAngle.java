package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getHighlightAngle */
public final class getHighlightAngle {
    @SerializedName("dataSource")
    public final String IconCompatParcelizer;
    @SerializedName("policyInfoList")
    public final List<getCapType> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("partnerIconUrl")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("partnerLabel")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getHighlightAngle)) {
            return false;
        }
        getHighlightAngle gethighlightangle = (getHighlightAngle) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) gethighlightangle.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) gethighlightangle.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) gethighlightangle.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) gethighlightangle.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        List<getCapType> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InsuranceInfoEntity(dataSource=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", partnerIconUrl=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", partnerLabel=");
        sb.append(this.write);
        sb.append(", policyInfoList=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
