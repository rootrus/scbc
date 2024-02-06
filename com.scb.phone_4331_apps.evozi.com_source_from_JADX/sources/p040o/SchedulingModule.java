package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.SchedulingModule */
public class SchedulingModule extends SchedulingConfigModule {
    @SerializedName("effectiveDate")
    public List<String> MediaBrowserCompat$ItemReceiver;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        List<String> list = this.MediaBrowserCompat$ItemReceiver;
        List<String> list2 = ((SchedulingModule) obj).MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = super.hashCode();
        List<String> list = this.MediaBrowserCompat$ItemReceiver;
        return (hashCode * 31) + (list != null ? list.hashCode() : 0);
    }
}
