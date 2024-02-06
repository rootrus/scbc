package p040o;

/* renamed from: o.zzvp */
public final class zzvp {
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzvp)) {
            return false;
        }
        zzvp zzvp = (zzvp) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzvp.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzvp.read);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DepositRemark(header=");
        sb.append(this.write);
        sb.append(", description=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public zzvp(String str, String str2) {
        this.write = str;
        this.read = str2;
    }
}
