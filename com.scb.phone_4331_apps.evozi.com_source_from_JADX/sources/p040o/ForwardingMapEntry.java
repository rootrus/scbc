package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.ForwardingMapEntry */
public final class ForwardingMapEntry {
    @SerializedName("walletList")
    public List<standardCount> read;

    public ForwardingMapEntry(List<standardCount> list) {
        onGetStartedClick.write((Object) list, "list");
        this.read = list;
    }

    public ForwardingMapEntry(standardCount standardcount) {
        onGetStartedClick.write((Object) standardcount, "item");
        this.read = HmlNTBBusinessURLInformationActivity.IconCompatParcelizer(standardcount);
    }
}
