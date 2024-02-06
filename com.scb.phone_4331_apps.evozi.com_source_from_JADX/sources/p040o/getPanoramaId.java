package p040o;

/* renamed from: o.getPanoramaId */
public final class getPanoramaId extends zzuk {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String read;
    public final onStreetViewPanoramaClick write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getPanoramaId)) {
            return false;
        }
        getPanoramaId getpanoramaid = (getPanoramaId) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getpanoramaid.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getpanoramaid.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getpanoramaid.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        onStreetViewPanoramaClick onstreetviewpanoramaclick = this.write;
        if (onstreetviewpanoramaclick != null) {
            i = onstreetviewpanoramaclick.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RedirectButton(buttonLabel=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", redirectUrl=");
        sb.append(this.read);
        sb.append(", partnerRedirect=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public getPanoramaId(String str, String str2, onStreetViewPanoramaClick onstreetviewpanoramaclick) {
        onGetStartedClick.write((Object) str, "buttonLabel");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = str2;
        this.write = onstreetviewpanoramaclick;
    }
}
