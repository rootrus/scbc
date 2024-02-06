package p040o;

/* renamed from: o.getMapToolbarEnabled */
public final class getMapToolbarEnabled {
    public final boolean IconCompatParcelizer;
    public final boolean MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getMapToolbarEnabled)) {
            return false;
        }
        getMapToolbarEnabled getmaptoolbarenabled = (getMapToolbarEnabled) obj;
        return this.MediaBrowserCompat$CustomActionResultReceiver == getmaptoolbarenabled.MediaBrowserCompat$CustomActionResultReceiver && this.IconCompatParcelizer == getmaptoolbarenabled.IconCompatParcelizer;
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        boolean z3 = this.IconCompatParcelizer;
        if (!z3) {
            z2 = z3;
        }
        return ((z ? 1 : 0) * true) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PreValidation(tcRequiered=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", pinLocked=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public getMapToolbarEnabled(boolean z, boolean z2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.IconCompatParcelizer = z2;
    }
}
