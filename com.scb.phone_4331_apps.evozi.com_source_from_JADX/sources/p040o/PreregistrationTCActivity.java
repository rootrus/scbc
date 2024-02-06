package p040o;

import java.net.URI;

/* renamed from: o.PreregistrationTCActivity */
public final class PreregistrationTCActivity extends PreregistrationInformationActivity {
    public final String aW_() {
        return "POST";
    }

    public PreregistrationTCActivity() {
    }

    public PreregistrationTCActivity(String str) {
        this.MediaBrowserCompat$ItemReceiver = URI.create(str);
    }
}
