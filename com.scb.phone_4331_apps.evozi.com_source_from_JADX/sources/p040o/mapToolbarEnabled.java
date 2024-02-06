package p040o;

import java.util.List;

/* renamed from: o.mapToolbarEnabled */
public final class mapToolbarEnabled {
    public final List<rotateGesturesEnabled> MediaBrowserCompat$CustomActionResultReceiver;
    public final int MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mapToolbarEnabled)) {
            return false;
        }
        mapToolbarEnabled maptoolbarenabled = (mapToolbarEnabled) obj;
        return this.MediaBrowserCompat$ItemReceiver == maptoolbarenabled.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) maptoolbarenabled.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$ItemReceiver;
        List<rotateGesturesEnabled> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        return (i * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Limit(maxLimitTransaction=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", remainingLimits=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public mapToolbarEnabled(int i, List<rotateGesturesEnabled> list) {
        this.MediaBrowserCompat$ItemReceiver = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }
}
