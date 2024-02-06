package p040o;

import java.security.MessageDigest;

/* renamed from: o.unregisterListener */
public final class unregisterListener implements isStateSaved {
    private final Object MediaBrowserCompat$CustomActionResultReceiver;

    public unregisterListener(Object obj) {
        if (obj != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = obj;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ObjectKey{object=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof unregisterListener) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.equals(((unregisterListener) obj).MediaBrowserCompat$CustomActionResultReceiver);
        }
        return false;
    }

    public final int hashCode() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.hashCode();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(MessageDigest messageDigest) {
        messageDigest.update(this.MediaBrowserCompat$CustomActionResultReceiver.toString().getBytes(write));
    }
}
