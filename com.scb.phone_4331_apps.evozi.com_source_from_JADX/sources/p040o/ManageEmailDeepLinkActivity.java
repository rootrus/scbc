package p040o;

/* renamed from: o.ManageEmailDeepLinkActivity */
public final class ManageEmailDeepLinkActivity<T> extends JustForYouEntryPointDeepLinkActivity<T> {
    public final void onNext(T t) {
        this.MediaBrowserCompat$ItemReceiver = t;
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$ItemReceiver = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
        countDown();
    }
}
