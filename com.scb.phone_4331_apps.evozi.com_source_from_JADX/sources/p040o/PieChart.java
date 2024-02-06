package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.PieChart */
public final class PieChart {
    @SerializedName("items")
    public final List<setUnbindEnabled> read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PieChart) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((PieChart) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        List<setUnbindEnabled> list = this.read;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CountryListEntity(countries=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
