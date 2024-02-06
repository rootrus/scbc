package p040o;

/* renamed from: o.setLogFile$MediaBrowserCompat$CustomActionResultReceiver */
public final class setLogFile$MediaBrowserCompat$CustomActionResultReceiver implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

    private setLogFile$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ setLogFile$MediaBrowserCompat$CustomActionResultReceiver(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final boolean write(Object obj) {
        getParentId getparentid = (getParentId) obj;
        return getparentid.write != null && getparentid.write.toLowerCase().startsWith(this.MediaBrowserCompat$CustomActionResultReceiver.toLowerCase());
    }
}
