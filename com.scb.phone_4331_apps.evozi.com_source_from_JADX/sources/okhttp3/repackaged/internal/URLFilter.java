package okhttp3.repackaged.internal;

import java.io.IOException;
import java.net.URL;

public interface URLFilter {
    void checkURLPermitted(URL url) throws IOException;
}
