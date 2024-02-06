package p040o;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.RewardSearchResultActivity */
public class RewardSearchResultActivity {
    @SerializedName("livenessActivity")
    public List<BigDecimal> IconCompatParcelizer = null;
    @SerializedName("livenessAcceptance")
    public Integer MediaBrowserCompat$CustomActionResultReceiver = null;
    @SerializedName("timeout")
    public OffsetDateTime MediaBrowserCompat$ItemReceiver = null;
    @SerializedName("serverTimestamp")
    public OffsetDateTime read = null;
    @SerializedName("transactionId")
    public String write = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RewardSearchResultActivity rewardSearchResultActivity = (RewardSearchResultActivity) obj;
        return Objects.equals(this.write, rewardSearchResultActivity.write) && Objects.equals(this.IconCompatParcelizer, rewardSearchResultActivity.IconCompatParcelizer) && Objects.equals(this.MediaBrowserCompat$CustomActionResultReceiver, rewardSearchResultActivity.MediaBrowserCompat$CustomActionResultReceiver) && Objects.equals(this.read, rewardSearchResultActivity.read) && Objects.equals(this.MediaBrowserCompat$ItemReceiver, rewardSearchResultActivity.MediaBrowserCompat$ItemReceiver);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.write, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver, this.read, this.MediaBrowserCompat$ItemReceiver});
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder();
        sb.append("class TransactionBeginResult {\n");
        sb.append("    transactionId: ");
        String str5 = this.write;
        String str6 = "null";
        if (str5 == null) {
            str = str6;
        } else {
            str = str5.toString().replace("\n", "\n    ");
        }
        sb.append(str);
        sb.append("\n");
        sb.append("    livenessActivity: ");
        List<BigDecimal> list = this.IconCompatParcelizer;
        if (list == null) {
            str2 = str6;
        } else {
            str2 = list.toString().replace("\n", "\n    ");
        }
        sb.append(str2);
        sb.append("\n");
        sb.append("    livenessAcceptance: ");
        Integer num = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (num == null) {
            str3 = str6;
        } else {
            str3 = num.toString().replace("\n", "\n    ");
        }
        sb.append(str3);
        sb.append("\n");
        sb.append("    serverTimestamp: ");
        OffsetDateTime offsetDateTime = this.read;
        if (offsetDateTime == null) {
            str4 = str6;
        } else {
            str4 = offsetDateTime.toString().replace("\n", "\n    ");
        }
        sb.append(str4);
        sb.append("\n");
        sb.append("    timeout: ");
        OffsetDateTime offsetDateTime2 = this.MediaBrowserCompat$ItemReceiver;
        if (offsetDateTime2 != null) {
            str6 = offsetDateTime2.toString().replace("\n", "\n    ");
        }
        sb.append(str6);
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
