package p040o;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

/* renamed from: o.ShapeFillParser */
public class ShapeFillParser {
    @SerializedName("interestRate")
    public BigDecimal IconCompatParcelizer;
    @SerializedName("claimedAmount")
    public BigDecimal MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("interestAmount")
    public BigDecimal MediaBrowserCompat$ItemReceiver;
    @SerializedName("claimedDate")
    public String write;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShapeFillParser shapeFillParser = (ShapeFillParser) obj;
        BigDecimal bigDecimal = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (bigDecimal == null ? shapeFillParser.MediaBrowserCompat$CustomActionResultReceiver != null : !bigDecimal.equals(shapeFillParser.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str = this.write;
        if (str == null ? shapeFillParser.write != null : !str.equals(shapeFillParser.write)) {
            return false;
        }
        BigDecimal bigDecimal2 = this.MediaBrowserCompat$ItemReceiver;
        if (bigDecimal2 == null ? shapeFillParser.MediaBrowserCompat$ItemReceiver != null : !bigDecimal2.equals(shapeFillParser.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        BigDecimal bigDecimal3 = this.IconCompatParcelizer;
        BigDecimal bigDecimal4 = shapeFillParser.IconCompatParcelizer;
        if (bigDecimal3 != null) {
            return bigDecimal3.equals(bigDecimal4);
        }
        if (bigDecimal4 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = bigDecimal != null ? bigDecimal.hashCode() : 0;
        String str = this.write;
        int hashCode2 = str != null ? str.hashCode() : 0;
        BigDecimal bigDecimal2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = bigDecimal2 != null ? bigDecimal2.hashCode() : 0;
        BigDecimal bigDecimal3 = this.IconCompatParcelizer;
        if (bigDecimal3 != null) {
            i = bigDecimal3.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }
}
