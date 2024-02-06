package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setAlignItems */
public class setAlignItems {
    @SerializedName("scheduleList")
    public List<setDividerDrawableHorizontal> MediaBrowserCompat$ItemReceiver;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        List<setDividerDrawableHorizontal> list = this.MediaBrowserCompat$ItemReceiver;
        List<setDividerDrawableHorizontal> list2 = ((setAlignItems) obj).MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<setDividerDrawableHorizontal> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }
}
