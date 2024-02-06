package p040o;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import java.util.Objects;

@ApiModel(description = "Passport information from mobile")
/* renamed from: o.onButtonClearClick */
public class onButtonClearClick {
    @SerializedName("DG1")
    public String IconCompatParcelizer = null;
    @SerializedName("SOD")
    public String MediaBrowserCompat$CustomActionResultReceiver = null;
    @SerializedName("DG2")
    public String MediaBrowserCompat$ItemReceiver = null;
    @SerializedName("DG13")
    public String read = null;
    @SerializedName("transactionId")
    public String write = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        onButtonClearClick onbuttonclearclick = (onButtonClearClick) obj;
        return Objects.equals(this.write, onbuttonclearclick.write) && Objects.equals(this.IconCompatParcelizer, onbuttonclearclick.IconCompatParcelizer) && Objects.equals(this.MediaBrowserCompat$ItemReceiver, onbuttonclearclick.MediaBrowserCompat$ItemReceiver) && Objects.equals(this.read, onbuttonclearclick.read) && Objects.equals(this.MediaBrowserCompat$CustomActionResultReceiver, onbuttonclearclick.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.write, this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver, this.read, this.MediaBrowserCompat$CustomActionResultReceiver});
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder();
        sb.append("class PassportVerificationForm {\n");
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
        sb.append("    dg1: ");
        String str7 = this.IconCompatParcelizer;
        if (str7 == null) {
            str2 = str6;
        } else {
            str2 = str7.toString().replace("\n", "\n    ");
        }
        sb.append(str2);
        sb.append("\n");
        sb.append("    dg2: ");
        String str8 = this.MediaBrowserCompat$ItemReceiver;
        if (str8 == null) {
            str3 = str6;
        } else {
            str3 = str8.toString().replace("\n", "\n    ");
        }
        sb.append(str3);
        sb.append("\n");
        sb.append("    dg13: ");
        String str9 = this.read;
        if (str9 == null) {
            str4 = str6;
        } else {
            str4 = str9.toString().replace("\n", "\n    ");
        }
        sb.append(str4);
        sb.append("\n");
        sb.append("    SOD: ");
        String str10 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str10 != null) {
            str6 = str10.toString().replace("\n", "\n    ");
        }
        sb.append(str6);
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
