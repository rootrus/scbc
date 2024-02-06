package p040o;

/* renamed from: o.onIndoorBuildingFocused */
public final class onIndoorBuildingFocused {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onIndoorBuildingFocused)) {
            return false;
        }
        onIndoorBuildingFocused onindoorbuildingfocused = (onIndoorBuildingFocused) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onindoorbuildingfocused.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) onindoorbuildingfocused.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductCatalog(productCatalogUrlTh=");
        sb.append(this.write);
        sb.append(", productCatalogUrlEn=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public onIndoorBuildingFocused(String str, String str2) {
        onGetStartedClick.write((Object) str, "productCatalogUrlTh");
        onGetStartedClick.write((Object) str2, "productCatalogUrlEn");
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }
}
