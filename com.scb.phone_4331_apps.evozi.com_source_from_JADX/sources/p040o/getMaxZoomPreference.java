package p040o;

/* renamed from: o.getMaxZoomPreference */
public final class getMaxZoomPreference {
    public final boolean IconCompatParcelizer;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof getMaxZoomPreference) && this.IconCompatParcelizer == ((getMaxZoomPreference) obj).IconCompatParcelizer;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.IconCompatParcelizer;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResetPinRegistrationVerification(tcAcceptRequired=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public getMaxZoomPreference(boolean z) {
        this.IconCompatParcelizer = z;
    }
}
