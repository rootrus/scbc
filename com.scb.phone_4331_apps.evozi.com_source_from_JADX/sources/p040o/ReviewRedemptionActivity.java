package p040o;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import p039io.beid.beidk.definitions.LivenessStatus;

/* renamed from: o.ReviewRedemptionActivity */
public class ReviewRedemptionActivity {
    @SerializedName("result")
    public String MediaBrowserCompat$CustomActionResultReceiver = null;
    @SerializedName("errorCode")
    public write MediaBrowserCompat$ItemReceiver = null;
    @SerializedName("error")
    public String read = null;

    @JsonAdapter(ReviewRedemptionActivity$write$MediaBrowserCompat$ItemReceiver.class)
    /* renamed from: o.ReviewRedemptionActivity$write */
    public enum write {
        _1001("1001"),
        _1002("1002"),
        _1003("1003"),
        _1004("1004"),
        _1005(LivenessStatus.ERROR_MATCHING_FAIL),
        _400("400"),
        _500(LivenessStatus.ERROR_UNKNOW);
        

        /* renamed from: h */
        public String f5527h;

        private write(String str) {
            this.f5527h = str;
        }

        public static write IconCompatParcelizer(String str) {
            for (write write : values()) {
                if (String.valueOf(write.f5527h).equals(str)) {
                    return write;
                }
            }
            return null;
        }

        public final String toString() {
            return String.valueOf(this.f5527h);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReviewRedemptionActivity reviewRedemptionActivity = (ReviewRedemptionActivity) obj;
        return Objects.equals(this.MediaBrowserCompat$CustomActionResultReceiver, reviewRedemptionActivity.MediaBrowserCompat$CustomActionResultReceiver) && Objects.equals(this.MediaBrowserCompat$ItemReceiver, reviewRedemptionActivity.MediaBrowserCompat$ItemReceiver) && Objects.equals(this.read, reviewRedemptionActivity.read);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.read});
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("class PassportVerificationResult {\n");
        sb.append("    result: ");
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str4 = "null";
        if (str3 == null) {
            str = str4;
        } else {
            str = str3.toString().replace("\n", "\n    ");
        }
        sb.append(str);
        sb.append("\n");
        sb.append("    errorCode: ");
        write write2 = this.MediaBrowserCompat$ItemReceiver;
        if (write2 == null) {
            str2 = str4;
        } else {
            str2 = write2.toString().replace("\n", "\n    ");
        }
        sb.append(str2);
        sb.append("\n");
        sb.append("    error: ");
        String str5 = this.read;
        if (str5 != null) {
            str4 = str5.toString().replace("\n", "\n    ");
        }
        sb.append(str4);
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
