package p040o;

/* renamed from: o.setNavigationItemSelectedListener$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5344xabb45d65 implements C4602xca7af99c {
    final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C5344xabb45d65) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ((C5344xabb45d65) obj).MediaBrowserCompat$ItemReceiver);
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
        sb.append("SendOfferParams(principal=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public C5344xabb45d65(String str) {
        onGetStartedClick.write((Object) str, "principal");
        this.MediaBrowserCompat$ItemReceiver = str;
    }
}
