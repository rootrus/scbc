package p040o;

/* renamed from: o.setOnMarkerDragListener */
public final class setOnMarkerDragListener {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setOnMarkerDragListener)) {
            return false;
        }
        setOnMarkerDragListener setonmarkerdraglistener = (setOnMarkerDragListener) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setonmarkerdraglistener.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setonmarkerdraglistener.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EncryptedPin(rPin=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", e2eeSid=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public setOnMarkerDragListener(String str, String str2) {
        onGetStartedClick.write((Object) str, "rPin");
        onGetStartedClick.write((Object) str2, "e2eeSid");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.IconCompatParcelizer = str2;
    }
}
