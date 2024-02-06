package okhttp3;

import p040o.NsipPartnerPaymentReviewActivity;
import p040o.onGetStartedClick;

public final class RequestBody$Companion$toRequestBody$2 extends RequestBody {
    final /* synthetic */ int $byteCount;
    final /* synthetic */ MediaType $contentType;
    final /* synthetic */ int $offset;
    final /* synthetic */ byte[] $this_toRequestBody;

    RequestBody$Companion$toRequestBody$2(byte[] bArr, MediaType mediaType, int i, int i2) {
        this.$this_toRequestBody = bArr;
        this.$contentType = mediaType;
        this.$byteCount = i;
        this.$offset = i2;
    }

    public final MediaType contentType() {
        return this.$contentType;
    }

    public final long contentLength() {
        return (long) this.$byteCount;
    }

    public final void writeTo(NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity) {
        onGetStartedClick.write((Object) nsipPartnerPaymentReviewActivity, "sink");
        nsipPartnerPaymentReviewActivity.IconCompatParcelizer(this.$this_toRequestBody, this.$offset, this.$byteCount);
    }
}
