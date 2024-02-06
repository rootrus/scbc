package p040o;

import java.security.PrivilegedAction;

/* renamed from: o.onBuyButtonClick */
final class onBuyButtonClick implements PrivilegedAction {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ ClassLoader MediaBrowserCompat$ItemReceiver;

    onBuyButtonClick(ClassLoader classLoader, String str) {
        this.MediaBrowserCompat$ItemReceiver = classLoader;
        this.IconCompatParcelizer = str;
    }

    public final Object run() {
        ClassLoader classLoader = this.MediaBrowserCompat$ItemReceiver;
        if (classLoader != null) {
            return classLoader.getResourceAsStream(this.IconCompatParcelizer);
        }
        return ClassLoader.getSystemResourceAsStream(this.IconCompatParcelizer);
    }
}
