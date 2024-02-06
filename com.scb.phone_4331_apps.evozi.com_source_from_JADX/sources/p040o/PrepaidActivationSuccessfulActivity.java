package p040o;

import java.security.PrivilegedAction;

/* renamed from: o.PrepaidActivationSuccessfulActivity */
final class PrepaidActivationSuccessfulActivity implements PrivilegedAction {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String read = null;

    PrepaidActivationSuccessfulActivity(String str, String str2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final Object run() {
        return System.getProperty(this.MediaBrowserCompat$CustomActionResultReceiver, this.read);
    }
}
