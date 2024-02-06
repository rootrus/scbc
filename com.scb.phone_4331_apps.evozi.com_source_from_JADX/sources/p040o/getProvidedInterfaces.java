package p040o;

/* renamed from: o.getProvidedInterfaces */
public final class getProvidedInterfaces {
    private String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof getProvidedInterfaces) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ((getProvidedInterfaces) obj).MediaBrowserCompat$ItemReceiver);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeactivateDisplay(refId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getProvidedInterfaces(String str) {
        onGetStartedClick.write((Object) str, "refId");
        this.MediaBrowserCompat$ItemReceiver = str;
    }
}
