package p040o;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import java.util.Objects;

@ApiModel(description = "Face picture for identity matching")
/* renamed from: o.QuantitySelectionActivity */
public class QuantitySelectionActivity {
    @SerializedName("transactionId")
    public String MediaBrowserCompat$CustomActionResultReceiver = null;
    @SerializedName("faceSelfie")
    public String MediaBrowserCompat$ItemReceiver = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuantitySelectionActivity quantitySelectionActivity = (QuantitySelectionActivity) obj;
        return Objects.equals(this.MediaBrowserCompat$CustomActionResultReceiver, quantitySelectionActivity.MediaBrowserCompat$CustomActionResultReceiver) && Objects.equals(this.MediaBrowserCompat$ItemReceiver, quantitySelectionActivity.MediaBrowserCompat$ItemReceiver);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver});
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("class FaceMatchingForm {\n");
        sb.append("    transactionId: ");
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str3 = "null";
        if (str2 == null) {
            str = str3;
        } else {
            str = str2.toString().replace("\n", "\n    ");
        }
        sb.append(str);
        sb.append("\n");
        sb.append("    faceSelfie: ");
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        if (str4 != null) {
            str3 = str4.toString().replace("\n", "\n    ");
        }
        sb.append(str3);
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
