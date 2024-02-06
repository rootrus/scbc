package p040o;

/* renamed from: o.setItemIconPadding$MediaBrowserCompat$ItemReceiver */
public final class setItemIconPadding$MediaBrowserCompat$ItemReceiver implements C4602xca7af99c {
    final String MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof setItemIconPadding$MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((setItemIconPadding$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$CustomActionResultReceiver);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DocumentInstructionsParams(documentCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public setItemIconPadding$MediaBrowserCompat$ItemReceiver(String str) {
        onGetStartedClick.write((Object) str, "documentCode");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }
}
