package p040o;

/* renamed from: o.putAll */
public final /* synthetic */ class putAll implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ clearListener MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ putAll(clearListener clearlistener) {
        this.MediaBrowserCompat$CustomActionResultReceiver = clearlistener;
    }

    public final Object write(Object obj) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((setCurrentItemInternal) obj);
    }
}
