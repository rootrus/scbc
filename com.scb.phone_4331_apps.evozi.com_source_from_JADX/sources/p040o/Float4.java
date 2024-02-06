package p040o;

/* renamed from: o.Float4 */
public final class Float4 {
    public final String MediaBrowserCompat$ItemReceiver;

    public Float4(String str) {
        if (str != null) {
            this.MediaBrowserCompat$ItemReceiver = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Float4)) {
            return false;
        }
        return this.MediaBrowserCompat$ItemReceiver.equals(((Float4) obj).MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        return this.MediaBrowserCompat$ItemReceiver.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Encoding{name=\"");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append("\"}");
        return sb.toString();
    }
}
