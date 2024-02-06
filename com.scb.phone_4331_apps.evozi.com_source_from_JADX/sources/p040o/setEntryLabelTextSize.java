package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setEntryLabelTextSize */
public final class setEntryLabelTextSize {
    @SerializedName("channelList")
    public final List<setDrawRoundedSlices> IconCompatParcelizer;
    @SerializedName("flagImage")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("sortSequence")
    public final String read;
    @SerializedName("countryName")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setEntryLabelTextSize)) {
            return false;
        }
        setEntryLabelTextSize setentrylabeltextsize = (setEntryLabelTextSize) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setentrylabeltextsize.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setentrylabeltextsize.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setentrylabeltextsize.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setentrylabeltextsize.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        List<setDrawRoundedSlices> list = this.IconCompatParcelizer;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CountryEntity(countryName=");
        sb.append(this.write);
        sb.append(", flagImage=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", sortSequence=");
        sb.append(this.read);
        sb.append(", channelList=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
