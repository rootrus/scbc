package okhttp3;

import p040o.NsipPartnerPaymentOtpActivity;

public final class ResponseBody$Companion$asResponseBody$1 extends ResponseBody {
    final /* synthetic */ long $contentLength;
    final /* synthetic */ MediaType $contentType;
    final /* synthetic */ NsipPartnerPaymentOtpActivity $this_asResponseBody;

    ResponseBody$Companion$asResponseBody$1(NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity, MediaType mediaType, long j) {
        this.$this_asResponseBody = nsipPartnerPaymentOtpActivity;
        this.$contentType = mediaType;
        this.$contentLength = j;
    }

    public final MediaType contentType() {
        return this.$contentType;
    }

    public final long contentLength() {
        return this.$contentLength;
    }

    public final NsipPartnerPaymentOtpActivity source() {
        return this.$this_asResponseBody;
    }
}
