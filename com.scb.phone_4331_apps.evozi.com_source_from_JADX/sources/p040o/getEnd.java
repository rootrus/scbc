package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getEnd */
public final class getEnd {
    @SerializedName("accountNo")
    public final String IconCompatParcelizer;
    @SerializedName("accountName")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("ruleName")
    public final List<String> read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getEnd)) {
            return false;
        }
        getEnd getend = (getEnd) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getend.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getend.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getend.read);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        List<String> list = this.read;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DepositListEntity(accountNo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", ruleName=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
