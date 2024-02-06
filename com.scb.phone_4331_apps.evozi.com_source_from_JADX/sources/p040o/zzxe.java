package p040o;

/* renamed from: o.zzxe */
public final class zzxe {
    private final int MediaBrowserCompat$CustomActionResultReceiver;
    public final boolean read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzxe)) {
            return false;
        }
        zzxe zzxe = (zzxe) obj;
        return this.MediaBrowserCompat$CustomActionResultReceiver == zzxe.MediaBrowserCompat$CustomActionResultReceiver && this.read == zzxe.read;
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = this.read;
        if (z) {
            z = true;
        }
        return (i * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TcVersion(tcLatestVersion=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", tcAcceptRequired=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public zzxe(int i, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.read = z;
    }
}
