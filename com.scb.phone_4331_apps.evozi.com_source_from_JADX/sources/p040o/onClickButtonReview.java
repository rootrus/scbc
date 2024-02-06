package p040o;

import java.security.PrivilegedAction;

/* renamed from: o.onClickButtonReview */
final class onClickButtonReview implements PrivilegedAction {
    private final /* synthetic */ ClassLoader MediaBrowserCompat$ItemReceiver;

    onClickButtonReview(ClassLoader classLoader) {
        this.MediaBrowserCompat$ItemReceiver = classLoader;
    }

    public final Object run() {
        return this.MediaBrowserCompat$ItemReceiver.getParent();
    }
}
