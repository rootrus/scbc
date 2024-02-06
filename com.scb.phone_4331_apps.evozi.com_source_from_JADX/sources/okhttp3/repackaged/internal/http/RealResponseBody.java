package okhttp3.repackaged.internal.http;

import okhttp3.repackaged.Headers;
import okhttp3.repackaged.MediaType;
import okhttp3.repackaged.ResponseBody;
import p040o.PinLoginActivity;

public final class RealResponseBody extends ResponseBody {
    private final Headers aii;
    private final PinLoginActivity source;

    public RealResponseBody(Headers headers, PinLoginActivity pinLoginActivity) {
        this.aii = headers;
        this.source = pinLoginActivity;
    }

    public final MediaType contentType() {
        String str = this.aii.get("Content-Type");
        if (str != null) {
            return MediaType.parse(str);
        }
        return null;
    }

    public final long contentLength() {
        return OkHeaders.contentLength(this.aii);
    }

    public final PinLoginActivity source() {
        return this.source;
    }
}
