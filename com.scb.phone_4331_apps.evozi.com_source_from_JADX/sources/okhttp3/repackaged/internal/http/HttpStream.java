package okhttp3.repackaged.internal.http;

import java.io.IOException;
import okhttp3.repackaged.Request;
import okhttp3.repackaged.Response;
import okhttp3.repackaged.ResponseBody;
import p040o.QuickPromptPayActivity;

public interface HttpStream {
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    void cancel();

    QuickPromptPayActivity createRequestBody(Request request, long j) throws IOException;

    void finishRequest() throws IOException;

    ResponseBody openResponseBody(Response response) throws IOException;

    Response.Builder readResponseHeaders() throws IOException;

    void setHttpEngine(HttpEngine httpEngine);

    void writeRequestBody(RetryableSink retryableSink) throws IOException;

    void writeRequestHeaders(Request request) throws IOException;
}
