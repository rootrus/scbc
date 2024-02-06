package p040o;

import java.io.IOException;
import java.security.PrivilegedAction;

/* renamed from: o.PrepaidTravelGettingStartedActivity */
final class PrepaidTravelGettingStartedActivity implements PrivilegedAction {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ ClassLoader MediaBrowserCompat$CustomActionResultReceiver;

    PrepaidTravelGettingStartedActivity(ClassLoader classLoader, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = classLoader;
        this.IconCompatParcelizer = str;
    }

    public final Object run() {
        try {
            if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                return this.MediaBrowserCompat$CustomActionResultReceiver.getResources(this.IconCompatParcelizer);
            }
            return ClassLoader.getSystemResources(this.IconCompatParcelizer);
        } catch (IOException e) {
            if (PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Exception while trying to find configuration file ");
                stringBuffer.append(this.IconCompatParcelizer);
                stringBuffer.append(":");
                stringBuffer.append(e.getMessage());
                PrepaidOtpActivity.MediaBrowserCompat$CustomActionResultReceiver(stringBuffer.toString());
            }
            return null;
        } catch (NoSuchMethodError unused) {
            return null;
        }
    }
}
