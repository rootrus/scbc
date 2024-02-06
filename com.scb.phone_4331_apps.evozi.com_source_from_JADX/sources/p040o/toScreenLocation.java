package p040o;

/* renamed from: o.toScreenLocation */
public final class toScreenLocation {
    public final boolean read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof toScreenLocation) && this.read == ((toScreenLocation) obj).read;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.read;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IdentityValidation(hasDoneFatca=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public toScreenLocation(boolean z) {
        this.read = z;
    }
}
