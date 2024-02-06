package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.MergePathsParser */
public class MergePathsParser extends ShapeDataParser {
    @SerializedName("loanAccountId")
    private String setCheckable;
    @SerializedName("loanType")
    private String setShortcut;

    public final String write() {
        return this.setShortcut;
    }
}
