package p040o;

/* renamed from: o.onCircleClick */
public final class onCircleClick {
    public final String IconCompatParcelizer;
    public final onGroundOverlayClick MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onCircleClick)) {
            return false;
        }
        onCircleClick oncircleclick = (onCircleClick) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) oncircleclick.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) oncircleclick.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) oncircleclick.IconCompatParcelizer);
    }

    public final int hashCode() {
        onGroundOverlayClick ongroundoverlayclick = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = ongroundoverlayclick != null ? ongroundoverlayclick.hashCode() : 0;
        String str = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrivacyConsentContent(contentSource=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", path=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", content=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public onCircleClick(onGroundOverlayClick ongroundoverlayclick, String str, String str2) {
        onGetStartedClick.write((Object) ongroundoverlayclick, "contentSource");
        this.MediaBrowserCompat$CustomActionResultReceiver = ongroundoverlayclick;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.IconCompatParcelizer = str2;
    }
}
