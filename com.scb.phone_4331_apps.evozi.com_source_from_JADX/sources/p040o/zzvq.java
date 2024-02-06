package p040o;

/* renamed from: o.zzvq */
public final class zzvq {
    public final String read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof zzvq) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((zzvq) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.read;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DepositSubProduct(productName=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public zzvq(String str) {
        this.read = str;
    }
}
