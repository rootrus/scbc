package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getFamily */
public final class getFamily {
    @SerializedName("depositList")
    public final List<getEnd> write;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof getFamily) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((getFamily) obj).write);
        }
        return true;
    }

    public final int hashCode() {
        List<getEnd> list = this.write;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlSetupAccountsEntity(depositList=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
