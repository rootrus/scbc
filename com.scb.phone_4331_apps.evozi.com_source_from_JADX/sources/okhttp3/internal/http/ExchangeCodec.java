package okhttp3.internal.http;

import java.io.IOException;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;
import p040o.HowToAddAccountStep2Activity;
import p040o.PinChangeActivity;

public interface ExchangeCodec {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    void cancel();

    RealConnection connection();

    PinChangeActivity createRequestBody(Request request, long j) throws IOException;

    void finishRequest() throws IOException;

    void flushRequest() throws IOException;

    HowToAddAccountStep2Activity openResponseBodySource(Response response) throws IOException;

    Response.Builder readResponseHeaders(boolean z) throws IOException;

    long reportedContentLength(Response response) throws IOException;

    Headers trailers() throws IOException;

    void writeRequestHeaders(Request request) throws IOException;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

        private Companion() {
        }
    }
}
