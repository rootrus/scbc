package p040o;

import java.security.PrivilegedAction;

/* renamed from: o.onSellButtonClick */
final class onSellButtonClick implements PrivilegedAction {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver = null;

    onSellButtonClick(String str, String str2) {
        this.IconCompatParcelizer = str;
    }

    public final Object run() {
        return System.getProperty(this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver);
    }
}
