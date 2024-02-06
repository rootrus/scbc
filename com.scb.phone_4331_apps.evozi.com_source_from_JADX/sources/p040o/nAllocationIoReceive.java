package p040o;

/* renamed from: o.nAllocationIoReceive */
public final class nAllocationIoReceive {
    public final loadProjectionNormalized MediaBrowserCompat$CustomActionResultReceiver;
    final RenderScript MediaBrowserCompat$ItemReceiver;
    final long write;

    public nAllocationIoReceive() {
    }

    public nAllocationIoReceive(long j, RenderScript renderScript, loadProjectionNormalized loadprojectionnormalized) {
        this();
        this.write = j;
        if (renderScript != null) {
            this.MediaBrowserCompat$ItemReceiver = renderScript;
            if (loadprojectionnormalized != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = loadprojectionnormalized;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nAllocationIoReceive)) {
            return false;
        }
        nAllocationIoReceive nallocationioreceive = (nAllocationIoReceive) obj;
        if (this.write != nallocationioreceive.write || !this.MediaBrowserCompat$ItemReceiver.equals(nallocationioreceive.MediaBrowserCompat$ItemReceiver) || !this.MediaBrowserCompat$CustomActionResultReceiver.equals(nallocationioreceive.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.write;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.MediaBrowserCompat$ItemReceiver.hashCode()) * 1000003) ^ this.MediaBrowserCompat$CustomActionResultReceiver.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersistedEvent{id=");
        sb.append(this.write);
        sb.append(", transportContext=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", event=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append("}");
        return sb.toString();
    }
}
