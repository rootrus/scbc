package p040o;

import com.scb.phone.view.activity.deeplink.BaseDeepLinkActivity;

/* renamed from: o.getServerTimeout */
public final /* synthetic */ class getServerTimeout implements Runnable {
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ BaseDeepLinkActivity read;

    public /* synthetic */ getServerTimeout(BaseDeepLinkActivity baseDeepLinkActivity, Throwable th) {
        this.read = baseDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final void run() {
        this.read.setWindowCallback();
    }
}
