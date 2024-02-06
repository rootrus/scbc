package okhttp3.internal.http;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import p040o.NsipPartnerPaymentOtpActivity;
import p040o.onGetStartedClick;

public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final NsipPartnerPaymentOtpActivity source;

    public RealResponseBody(String str, long j, NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity) {
        onGetStartedClick.write((Object) nsipPartnerPaymentOtpActivity, "source");
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = nsipPartnerPaymentOtpActivity;
    }

    public final long contentLength() {
        return this.contentLength;
    }

    public final MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.Companion.parse(str);
        }
        return null;
    }

    public final NsipPartnerPaymentOtpActivity source() {
        return this.source;
    }
}
