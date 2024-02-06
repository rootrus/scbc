package p040o;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import java.util.Objects;

@ApiModel(description = "Transaction Begin Form")
/* renamed from: o.RewardSearchActivity_ViewBinding */
public class RewardSearchActivity_ViewBinding {
    @SerializedName("sdkVersion")
    public String IconCompatParcelizer = null;
    @SerializedName("platformId")
    public String MediaBrowserCompat$ItemReceiver = null;
    @SerializedName("deviceId")
    public String read = null;
    @SerializedName("applicationName")
    public String write = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RewardSearchActivity_ViewBinding rewardSearchActivity_ViewBinding = (RewardSearchActivity_ViewBinding) obj;
        return Objects.equals(this.read, rewardSearchActivity_ViewBinding.read) && Objects.equals(this.MediaBrowserCompat$ItemReceiver, rewardSearchActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) && Objects.equals(this.IconCompatParcelizer, rewardSearchActivity_ViewBinding.IconCompatParcelizer) && Objects.equals(this.write, rewardSearchActivity_ViewBinding.write);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.read, this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer, this.write});
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("class TransactionBeginForm {\n");
        sb.append("    deviceId: ");
        String str4 = this.read;
        String str5 = "null";
        if (str4 == null) {
            str = str5;
        } else {
            str = str4.toString().replace("\n", "\n    ");
        }
        sb.append(str);
        sb.append("\n");
        sb.append("    platformId: ");
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        if (str6 == null) {
            str2 = str5;
        } else {
            str2 = str6.toString().replace("\n", "\n    ");
        }
        sb.append(str2);
        sb.append("\n");
        sb.append("    sdkVersion: ");
        String str7 = this.IconCompatParcelizer;
        if (str7 == null) {
            str3 = str5;
        } else {
            str3 = str7.toString().replace("\n", "\n    ");
        }
        sb.append(str3);
        sb.append("\n");
        sb.append("    applicationName: ");
        String str8 = this.write;
        if (str8 != null) {
            str5 = str8.toString().replace("\n", "\n    ");
        }
        sb.append(str5);
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
