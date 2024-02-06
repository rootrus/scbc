package okhttp3.repackaged.internal;

import java.io.IOException;
import okhttp3.repackaged.Request;
import okhttp3.repackaged.Response;
import okhttp3.repackaged.internal.http.CacheRequest;
import okhttp3.repackaged.internal.http.CacheStrategy;

public interface InternalCache {
    Response get(Request request) throws IOException;

    CacheRequest put(Response response) throws IOException;

    void remove(Request request) throws IOException;

    void trackConditionalCacheHit();

    void trackResponse(CacheStrategy cacheStrategy);

    void update(Response response, Response response2) throws IOException;
}
