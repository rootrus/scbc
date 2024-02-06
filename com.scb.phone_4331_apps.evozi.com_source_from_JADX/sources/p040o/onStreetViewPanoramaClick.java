package p040o;

/* renamed from: o.onStreetViewPanoramaClick */
public final class onStreetViewPanoramaClick extends zzuk {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final boolean MediaBrowserCompat$ItemReceiver;
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onStreetViewPanoramaClick)) {
            return false;
        }
        onStreetViewPanoramaClick onstreetviewpanoramaclick = (onStreetViewPanoramaClick) obj;
        return this.MediaBrowserCompat$ItemReceiver == onstreetviewpanoramaclick.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) onstreetviewpanoramaclick.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) onstreetviewpanoramaclick.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        if (z) {
            z = true;
        }
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((z ? 1 : 0) * true) + hashCode) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PartnerRedirect(returnFlag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", param=");
        sb.append(this.read);
        sb.append(", value=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public onStreetViewPanoramaClick(boolean z, String str, String str2) {
        this.MediaBrowserCompat$ItemReceiver = z;
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }
}
