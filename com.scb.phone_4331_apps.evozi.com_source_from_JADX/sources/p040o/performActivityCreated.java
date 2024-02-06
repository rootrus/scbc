package p040o;

import java.security.MessageDigest;

/* renamed from: o.performActivityCreated */
final class performActivityCreated implements isStateSaved {
    private final isStateSaved IconCompatParcelizer;
    private final isStateSaved read;

    performActivityCreated(isStateSaved isstatesaved, isStateSaved isstatesaved2) {
        this.read = isstatesaved;
        this.IconCompatParcelizer = isstatesaved2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof performActivityCreated)) {
            return false;
        }
        performActivityCreated performactivitycreated = (performActivityCreated) obj;
        if (!this.read.equals(performactivitycreated.read) || !this.IconCompatParcelizer.equals(performactivitycreated.IconCompatParcelizer)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.read.hashCode() * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataCacheKey{sourceKey=");
        sb.append(this.read);
        sb.append(", signature=");
        sb.append(this.IconCompatParcelizer);
        sb.append('}');
        return sb.toString();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(MessageDigest messageDigest) {
        this.read.MediaBrowserCompat$CustomActionResultReceiver(messageDigest);
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(messageDigest);
    }
}
