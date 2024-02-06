package okhttp3;

import p040o.NsipPartnerPaymentReviewActivity;
import p040o.SCBUniversalWebViewActivity_ViewBinding;
import p040o.onGetStartedClick;

public final class RequestBody$Companion$toRequestBody$1 extends RequestBody {
    final /* synthetic */ MediaType $contentType;
    final /* synthetic */ SCBUniversalWebViewActivity_ViewBinding $this_toRequestBody;

    RequestBody$Companion$toRequestBody$1(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, MediaType mediaType) {
        this.$this_toRequestBody = sCBUniversalWebViewActivity_ViewBinding;
        this.$contentType = mediaType;
    }

    public final MediaType contentType() {
        return this.$contentType;
    }

    public final long contentLength() {
        return (long) this.$this_toRequestBody.write();
    }

    public final void writeTo(NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity) {
        onGetStartedClick.write((Object) nsipPartnerPaymentReviewActivity, "sink");
        nsipPartnerPaymentReviewActivity.IconCompatParcelizer(this.$this_toRequestBody);
    }
}
