package p040o;

/* renamed from: o.initializeRequest */
public final /* synthetic */ class initializeRequest implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ initializeRequest(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final boolean write(Object obj) {
        return ((InstallIdProvider) obj).MediaBrowserCompat$ItemReceiver.toLowerCase().contains(this.MediaBrowserCompat$ItemReceiver.toLowerCase());
    }
}
