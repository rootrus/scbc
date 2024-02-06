package p040o;

/* renamed from: o.getStrokePattern */
public final class getStrokePattern {
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getStrokePattern)) {
            return false;
        }
        getStrokePattern getstrokepattern = (getStrokePattern) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getstrokepattern.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getstrokepattern.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
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
        sb.append("DebitCardProductCatalog(productCatalogUrlTh=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", productCatalogUrlEn=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public getStrokePattern(String str, String str2) {
        onGetStartedClick.write((Object) str, "productCatalogUrlTh");
        onGetStartedClick.write((Object) str2, "productCatalogUrlEn");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = str2;
    }
}
