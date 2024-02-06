package okhttp3.internal.cache;

import java.io.IOException;
import p040o.PinChangeActivity;

public interface CacheRequest {
    void abort();

    PinChangeActivity body() throws IOException;
}
