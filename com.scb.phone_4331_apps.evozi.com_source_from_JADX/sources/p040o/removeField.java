package p040o;

/* renamed from: o.removeField */
public final /* synthetic */ class removeField implements Runnable {
    private final /* synthetic */ nativeConfigure MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ removeField(nativeConfigure nativeconfigure) {
        this.MediaBrowserCompat$CustomActionResultReceiver = nativeconfigure;
    }

    public final void run() {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(false, false);
    }
}
