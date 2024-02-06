package p040o;

/* renamed from: o.awaitEvent */
public final class awaitEvent {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awaitEvent)) {
            return false;
        }
        awaitEvent awaitevent = (awaitEvent) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) awaitevent.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) awaitevent.MediaBrowserCompat$CustomActionResultReceiver);
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
        sb.append("HmlDocumentTutorialDisplay(doCaptureImage=");
        sb.append(this.write);
        sb.append(", dontCaptureImage=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public awaitEvent(String str, String str2) {
        onGetStartedClick.write((Object) str, "doCaptureImage");
        onGetStartedClick.write((Object) str2, "dontCaptureImage");
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }
}
