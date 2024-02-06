package p040o;

import android.webkit.JavascriptInterface;

/* renamed from: o.ZTBMV */
public final class ZTBMV {
    private ZTBMV$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;

    public ZTBMV(ZTBMV$MediaBrowserCompat$ItemReceiver zTBMV$MediaBrowserCompat$ItemReceiver) {
        this.IconCompatParcelizer = zTBMV$MediaBrowserCompat$ItemReceiver;
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(str);
    }
}
