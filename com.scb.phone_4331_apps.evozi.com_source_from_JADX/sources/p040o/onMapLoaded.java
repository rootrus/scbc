package p040o;

/* renamed from: o.onMapLoaded */
public final class onMapLoaded {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final boolean write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onMapLoaded)) {
            return false;
        }
        onMapLoaded onmaploaded = (onMapLoaded) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) onmaploaded.MediaBrowserCompat$CustomActionResultReceiver) && this.write == onmaploaded.write;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode = str != null ? str.hashCode() : 0;
        boolean z = this.write;
        if (z) {
            z = true;
        }
        return (hashCode * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SecuritiesWithStatus(error=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", securitiesUnregistered=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public onMapLoaded(String str, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = z;
    }
}
