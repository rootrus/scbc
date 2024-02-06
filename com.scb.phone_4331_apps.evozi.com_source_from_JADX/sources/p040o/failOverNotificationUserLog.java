package p040o;

import java.util.Arrays;

/* renamed from: o.failOverNotificationUserLog */
public final class failOverNotificationUserLog {
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String[] write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof failOverNotificationUserLog)) {
            return false;
        }
        failOverNotificationUserLog failovernotificationuserlog = (failOverNotificationUserLog) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) failovernotificationuserlog.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) failovernotificationuserlog.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) failovernotificationuserlog.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String[] strArr = this.write;
        int hashCode2 = strArr != null ? Arrays.hashCode(strArr) : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberPickerObject(tag=");
        sb.append(this.read);
        sb.append(", data=");
        sb.append(Arrays.toString(this.write));
        sb.append(", name=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public failOverNotificationUserLog(String str, String[] strArr, String str2) {
        onGetStartedClick.write((Object) str, "tag");
        onGetStartedClick.write((Object) strArr, "data");
        onGetStartedClick.write((Object) str2, "name");
        this.read = str;
        this.write = strArr;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }
}
