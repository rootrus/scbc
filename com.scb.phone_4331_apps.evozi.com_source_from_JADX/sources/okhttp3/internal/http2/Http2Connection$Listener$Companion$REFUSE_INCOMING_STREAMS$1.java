package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.http2.Http2Connection;
import p040o.onGetStartedClick;

public final class Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 extends Http2Connection.Listener {
    Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1() {
    }

    public final void onStream(Http2Stream http2Stream) throws IOException {
        onGetStartedClick.write((Object) http2Stream, "stream");
        http2Stream.close(ErrorCode.REFUSED_STREAM, (IOException) null);
    }
}
