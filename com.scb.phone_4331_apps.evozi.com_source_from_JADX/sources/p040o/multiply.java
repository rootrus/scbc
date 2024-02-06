package p040o;

import java.util.List;

/* renamed from: o.multiply */
public final class multiply extends transpose {
    private final List<computeCofactor> MediaBrowserCompat$ItemReceiver;

    public multiply(List<computeCofactor> list) {
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final List<computeCofactor> IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof transpose) {
            return this.MediaBrowserCompat$ItemReceiver.equals(((transpose) obj).IconCompatParcelizer());
        }
        return false;
    }

    public final int hashCode() {
        return this.MediaBrowserCompat$ItemReceiver.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BatchedLogRequest{logRequests=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append("}");
        return sb.toString();
    }
}
