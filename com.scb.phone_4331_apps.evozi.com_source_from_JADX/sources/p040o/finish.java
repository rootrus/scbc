package p040o;

/* renamed from: o.finish */
public final class finish {
    public final IconCompatParcelizer MediaBrowserCompat$ItemReceiver;
    public final long write;

    /* renamed from: o.finish$IconCompatParcelizer */
    public enum IconCompatParcelizer {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR
    }

    public finish() {
    }

    public finish(IconCompatParcelizer iconCompatParcelizer, long j) {
        this();
        if (iconCompatParcelizer != null) {
            this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
            this.write = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof finish)) {
            return false;
        }
        finish finish = (finish) obj;
        if (!this.MediaBrowserCompat$ItemReceiver.equals(finish.MediaBrowserCompat$ItemReceiver) || this.write != finish.write) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.MediaBrowserCompat$ItemReceiver.hashCode();
        long j = this.write;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BackendResponse{status=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.write);
        sb.append("}");
        return sb.toString();
    }
}
