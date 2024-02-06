package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p040o.LinkedHashTreeMap;

/* renamed from: o.last */
public final class last {
    @SerializedName("notificationChannelList")
    public final List<LinkedHashTreeMap.KeySet> MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof last) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ((last) obj).MediaBrowserCompat$ItemReceiver);
        }
        return true;
    }

    public final int hashCode() {
        List<LinkedHashTreeMap.KeySet> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NotificationsPreferencesEntity(notificationChannelList=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public last(List<LinkedHashTreeMap.KeySet> list) {
        onGetStartedClick.write((Object) list, "notificationChannelList");
        this.MediaBrowserCompat$ItemReceiver = list;
    }
}
