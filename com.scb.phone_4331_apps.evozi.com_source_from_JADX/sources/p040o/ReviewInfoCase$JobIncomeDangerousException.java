package p040o;

/* renamed from: o.ReviewInfoCase$JobIncomeDangerousException */
public final class ReviewInfoCase$JobIncomeDangerousException {
    final boolean IconCompatParcelizer;
    final boolean MediaBrowserCompat$ItemReceiver;

    public ReviewInfoCase$JobIncomeDangerousException() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewInfoCase$JobIncomeDangerousException)) {
            return false;
        }
        ReviewInfoCase$JobIncomeDangerousException reviewInfoCase$JobIncomeDangerousException = (ReviewInfoCase$JobIncomeDangerousException) obj;
        return this.MediaBrowserCompat$ItemReceiver == reviewInfoCase$JobIncomeDangerousException.MediaBrowserCompat$ItemReceiver && this.IconCompatParcelizer == reviewInfoCase$JobIncomeDangerousException.IconCompatParcelizer;
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$ItemReceiver;
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
        sb.append("SecurityState(sslUpdated=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", errorUpdatingSsl=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ ReviewInfoCase$JobIncomeDangerousException(byte b) {
        this(false, false);
    }

    public ReviewInfoCase$JobIncomeDangerousException(boolean z, boolean z2) {
        this.MediaBrowserCompat$ItemReceiver = z;
        this.IconCompatParcelizer = z2;
    }
}
