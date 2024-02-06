package p040o;

/* renamed from: o.writeToLog */
public final class writeToLog {
    public final boolean IconCompatParcelizer;
    public final boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final boolean MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof writeToLog)) {
            return false;
        }
        writeToLog writetolog = (writeToLog) obj;
        return this.MediaBrowserCompat$ItemReceiver == writetolog.MediaBrowserCompat$ItemReceiver && this.MediaBrowserCompat$CustomActionResultReceiver == writetolog.MediaBrowserCompat$CustomActionResultReceiver && this.IconCompatParcelizer == writetolog.IconCompatParcelizer;
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        boolean z3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (z3) {
            z3 = true;
        }
        boolean z4 = this.IconCompatParcelizer;
        if (!z4) {
            z2 = z4;
        }
        return ((((z ? 1 : 0) * true) + (z3 ? 1 : 0)) * 31) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlStoreTypeDisplay(brickAndMortar=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", onlineViaWeb=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", onineViaMarket=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public writeToLog(boolean z, boolean z2, boolean z3) {
        this.MediaBrowserCompat$ItemReceiver = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = z2;
        this.IconCompatParcelizer = z3;
    }
}
