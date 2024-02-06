package p040o;

/* renamed from: o.JustForYouDeepLinkActivity */
public final class JustForYouDeepLinkActivity<T> extends JustForYouEntryPointDeepLinkActivity<T> {
    public final void onNext(T t) {
        if (this.MediaBrowserCompat$ItemReceiver == null) {
            this.MediaBrowserCompat$ItemReceiver = t;
            this.write.dispose();
            countDown();
        }
    }

    public final void onError(Throwable th) {
        if (this.MediaBrowserCompat$ItemReceiver == null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = th;
        }
        countDown();
    }
}
