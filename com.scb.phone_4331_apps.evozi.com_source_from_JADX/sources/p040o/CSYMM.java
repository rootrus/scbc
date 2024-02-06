package p040o;

import android.webkit.CookieSyncManager;

/* renamed from: o.CSYMM */
final class CSYMM {
    private static CardlessATMTutorialActivity write = new CardlessATMTutorialActivity();

    CSYMM() {
    }

    static {
        CookieSyncManager.createInstance(CSYR2K.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public static CardlessATMTutorialActivity write() {
        return write;
    }
}
