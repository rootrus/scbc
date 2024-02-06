package p040o;

import java.util.List;

/* renamed from: o.setNumUpdates */
public final class setNumUpdates {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String read;
    public final List<setFastestInterval> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setNumUpdates)) {
            return false;
        }
        setNumUpdates setnumupdates = (setNumUpdates) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setnumupdates.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setnumupdates.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setnumupdates.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        List<setFastestInterval> list = this.write;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DiscoverTop(title=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", remark=");
        sb.append(this.read);
        sb.append(", items=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public setNumUpdates(String str, String str2, List<setFastestInterval> list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = str2;
        this.write = list;
    }
}
