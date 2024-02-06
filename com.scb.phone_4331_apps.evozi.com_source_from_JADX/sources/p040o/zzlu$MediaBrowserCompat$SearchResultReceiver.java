package p040o;

/* renamed from: o.zzlu$MediaBrowserCompat$SearchResultReceiver */
final class zzlu$MediaBrowserCompat$SearchResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzlu MediaBrowserCompat$ItemReceiver;

    zzlu$MediaBrowserCompat$SearchResultReceiver(zzlu zzlu) {
        this.MediaBrowserCompat$ItemReceiver = zzlu;
    }

    public final /* synthetic */ Object write(Object obj) {
        setCurrentItemInternal setcurrentiteminternal = (setCurrentItemInternal) obj;
        onGetStartedClick.write((Object) setcurrentiteminternal, "it");
        return this.MediaBrowserCompat$ItemReceiver.write.MediaBrowserCompat$ItemReceiver(setcurrentiteminternal);
    }
}
