package p040o;

import java.security.PrivilegedAction;

/* renamed from: o.PrepaidCashOutLandingAndInputActivity_ViewBinding */
final class PrepaidCashOutLandingAndInputActivity_ViewBinding implements PrivilegedAction {
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

    PrepaidCashOutLandingAndInputActivity_ViewBinding(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final Object run() {
        ClassLoader write = PrepaidCashOutReviewActivity.MediaBrowserCompat$SearchResultReceiver();
        if (write != null) {
            return write.getResourceAsStream(this.MediaBrowserCompat$ItemReceiver);
        }
        return ClassLoader.getSystemResourceAsStream(this.MediaBrowserCompat$ItemReceiver);
    }
}
