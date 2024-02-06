package p040o;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: o.onInflate$MediaBrowserCompat$CustomActionResultReceiver */
class onInflate$MediaBrowserCompat$CustomActionResultReceiver implements onInflate$MediaBrowserCompat$ItemReceiver {
    onInflate$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final HttpURLConnection MediaBrowserCompat$CustomActionResultReceiver(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }
}
