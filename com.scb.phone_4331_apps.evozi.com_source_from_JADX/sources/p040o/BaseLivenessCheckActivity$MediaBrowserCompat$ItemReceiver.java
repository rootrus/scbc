package p040o;

/* renamed from: o.BaseLivenessCheckActivity$MediaBrowserCompat$ItemReceiver */
public final class BaseLivenessCheckActivity$MediaBrowserCompat$ItemReceiver {
    private Throwable write;

    public BaseLivenessCheckActivity$MediaBrowserCompat$ItemReceiver(Throwable th) {
        this.write = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof BaseLivenessCheckActivity$MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((BaseLivenessCheckActivity$MediaBrowserCompat$ItemReceiver) obj).write);
    }

    public final int hashCode() {
        Throwable th = this.write;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Closed(");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
