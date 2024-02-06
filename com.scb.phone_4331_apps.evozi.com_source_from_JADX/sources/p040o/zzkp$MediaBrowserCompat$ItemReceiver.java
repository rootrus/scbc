package p040o;

/* renamed from: o.zzkp$MediaBrowserCompat$ItemReceiver */
final class zzkp$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzkp MediaBrowserCompat$CustomActionResultReceiver;

    zzkp$MediaBrowserCompat$ItemReceiver(zzkp zzkp) {
        this.MediaBrowserCompat$CustomActionResultReceiver = zzkp;
    }

    public final /* synthetic */ Object write(Object obj) {
        setCurrentItemInternal setcurrentiteminternal = (setCurrentItemInternal) obj;
        onGetStartedClick.write((Object) setcurrentiteminternal, "it");
        return this.MediaBrowserCompat$CustomActionResultReceiver.write.MediaBrowserCompat$ItemReceiver(setcurrentiteminternal);
    }
}
