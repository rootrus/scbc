package p040o;

/* renamed from: o.getPhoto */
public final class getPhoto {
    public final String read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof getPhoto) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((getPhoto) obj).read);
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
        sb.append("ScbsOnboardingProductCatalog(marketConductUrl=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public getPhoto(String str) {
        onGetStartedClick.write((Object) str, "marketConductUrl");
        this.read = str;
    }
}
