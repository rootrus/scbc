package p040o;

/* renamed from: o.orientationToPoint */
public final class orientationToPoint {
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof orientationToPoint)) {
            return false;
        }
        orientationToPoint orientationtopoint = (orientationToPoint) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) orientationtopoint.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) orientationtopoint.write);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SymbolFullName(label=");
        sb.append(this.read);
        sb.append(", value=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public orientationToPoint(String str, String str2) {
        this.read = str;
        this.write = str2;
    }
}
