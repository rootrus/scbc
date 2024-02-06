package p040o;

import java.net.URI;

/* renamed from: o.PreregistrationOtpActivity */
public final class PreregistrationOtpActivity extends PreregistrationLandingActivity {
    public final String aW_() {
        return "GET";
    }

    public PreregistrationOtpActivity() {
    }

    public PreregistrationOtpActivity(URI uri) {
        this.MediaBrowserCompat$ItemReceiver = uri;
    }

    public PreregistrationOtpActivity(String str) {
        this.MediaBrowserCompat$ItemReceiver = URI.create(str);
    }
}
