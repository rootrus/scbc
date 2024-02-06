package p040o;

import java.util.List;

/* renamed from: o.getElapsedRealTimeNanos */
public final class getElapsedRealTimeNanos {
    public final List<String> IconCompatParcelizer;
    public final List<String> MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getElapsedRealTimeNanos)) {
            return false;
        }
        getElapsedRealTimeNanos getelapsedrealtimenanos = (getElapsedRealTimeNanos) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getelapsedrealtimenanos.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getelapsedrealtimenanos.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        List<String> list = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<String> list2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlBusinessOwnerMarketURL(storeUrl=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", productUrl=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getElapsedRealTimeNanos(List<String> list, List<String> list2) {
        this.IconCompatParcelizer = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = list2;
    }
}
