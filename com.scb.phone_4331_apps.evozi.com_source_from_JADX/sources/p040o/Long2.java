package p040o;

/* renamed from: o.Long2 */
public final class Long2<T> extends Int2<T> {
    private final Integer IconCompatParcelizer = null;
    private final T MediaBrowserCompat$CustomActionResultReceiver;
    private final Int4 read;

    public final Integer read() {
        return null;
    }

    public Long2(T t, Int4 int4) {
        if (t != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = t;
            if (int4 != null) {
                this.read = int4;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    public final T MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final Int4 write() {
        return this.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Event{code=");
        sb.append((Object) null);
        sb.append(", payload=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", priority=");
        sb.append(this.read);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Int2)) {
            return false;
        }
        Int2 int2 = (Int2) obj;
        if (int2.read() != null || !this.MediaBrowserCompat$CustomActionResultReceiver.equals(int2.MediaBrowserCompat$ItemReceiver()) || !this.read.equals(int2.write())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.MediaBrowserCompat$CustomActionResultReceiver.hashCode() ^ -721379959) * 1000003) ^ this.read.hashCode();
    }
}
