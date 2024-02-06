package p040o;

/* renamed from: o.writeSessionUser */
public final class writeSessionUser {
    public final boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final boolean write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof writeSessionUser)) {
            return false;
        }
        writeSessionUser writesessionuser = (writeSessionUser) obj;
        return this.MediaBrowserCompat$CustomActionResultReceiver == writesessionuser.MediaBrowserCompat$CustomActionResultReceiver && this.write == writesessionuser.write;
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        boolean z3 = this.write;
        if (!z3) {
            z2 = z3;
        }
        return ((z ? 1 : 0) * true) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlLoanPurposeDisplay(businessExpansion=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", workingCapital=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public writeSessionUser(boolean z, boolean z2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.write = z2;
    }
}
