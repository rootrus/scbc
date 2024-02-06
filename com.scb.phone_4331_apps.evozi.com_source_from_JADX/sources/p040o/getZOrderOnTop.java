package p040o;

import java.util.List;

/* renamed from: o.getZOrderOnTop */
public final class getZOrderOnTop {
    public final List<getTiltGesturesEnabled> MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final int read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getZOrderOnTop)) {
            return false;
        }
        getZOrderOnTop getzorderontop = (getZOrderOnTop) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getzorderontop.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getzorderontop.write) && this.read == getzorderontop.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getzorderontop.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = this.read;
        List<getTiltGesturesEnabled> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + i2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Country(countryName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", flagImage=");
        sb.append(this.write);
        sb.append(", sortSequence=");
        sb.append(this.read);
        sb.append(", channelList=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getZOrderOnTop(String str, String str2, int i, List<getTiltGesturesEnabled> list) {
        onGetStartedClick.write((Object) str, "countryName");
        onGetStartedClick.write((Object) str2, "flagImage");
        onGetStartedClick.write((Object) list, "channelList");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
        this.read = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }
}
