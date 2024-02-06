package p040o;

import java.security.PrivilegedAction;

/* renamed from: o.PrepaidTravelConversionReviewActivity */
final class PrepaidTravelConversionReviewActivity implements PrivilegedAction {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ ClassLoader read;

    PrepaidTravelConversionReviewActivity(String str, ClassLoader classLoader) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = classLoader;
    }

    public final Object run() {
        return PrepaidOtpActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, this.read);
    }
}
