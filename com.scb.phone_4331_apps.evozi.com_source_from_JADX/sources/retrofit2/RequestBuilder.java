package retrofit2;

import java.io.IOException;
import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import p040o.GroupFavoriteActivity;
import p040o.NsipPartnerPaymentReviewActivity;
import p040o.SCBUniversalWebViewActivity;

final class RequestBuilder {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final String PATH_SEGMENT_ALWAYS_ENCODE_SET = " \"<>^`{}|\\?#";
    private static final Pattern PATH_TRAVERSAL = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    private final HttpUrl baseUrl;
    private RequestBody body;
    private MediaType contentType;
    private FormBody.Builder formBuilder;
    private final boolean hasBody;
    private final Headers.Builder headersBuilder;
    private final String method;
    private MultipartBody.Builder multipartBuilder;
    private String relativeUrl;
    private final Request.Builder requestBuilder = new Request.Builder();
    private HttpUrl.Builder urlBuilder;

    RequestBuilder(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.method = str;
        this.baseUrl = httpUrl;
        this.relativeUrl = str2;
        this.contentType = mediaType;
        this.hasBody = z;
        if (headers != null) {
            this.headersBuilder = headers.newBuilder();
        } else {
            this.headersBuilder = new Headers.Builder();
        }
        if (z2) {
            this.formBuilder = new FormBody.Builder();
        } else if (z3) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.multipartBuilder = builder;
            builder.setType(MultipartBody.FORM);
        }
    }

    /* access modifiers changed from: package-private */
    public final void setRelativeUrl(Object obj) {
        this.relativeUrl = obj.toString();
    }

    /* access modifiers changed from: package-private */
    public final void addHeader(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.contentType = MediaType.get(str2);
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Malformed content type: ");
                sb.append(str2);
                throw new IllegalArgumentException(sb.toString(), e);
            }
        } else {
            this.headersBuilder.add(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void addHeaders(Headers headers) {
        this.headersBuilder.addAll(headers);
    }

    /* access modifiers changed from: package-private */
    public final void addPathParam(String str, String str2, boolean z) {
        if (this.relativeUrl != null) {
            String canonicalizeForPath = canonicalizeForPath(str2, z);
            String str3 = this.relativeUrl;
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            sb.append(str);
            sb.append("}");
            String replace = str3.replace(sb.toString(), canonicalizeForPath);
            if (!PATH_TRAVERSAL.matcher(replace).matches()) {
                this.relativeUrl = replace;
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("@Path parameters shouldn't perform path traversal ('.' or '..'): ");
            sb2.append(str2);
            throw new IllegalArgumentException(sb2.toString());
        }
        throw new AssertionError();
    }

    private static String canonicalizeForPath(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
                sCBUniversalWebViewActivity.write(str, 0, i);
                canonicalizeForPath(sCBUniversalWebViewActivity, str, i, length, z);
                return sCBUniversalWebViewActivity.IconCompatParcelizer(sCBUniversalWebViewActivity.read, GroupFavoriteActivity.IconCompatParcelizer);
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    private static void canonicalizeForPath(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, String str, int i, int i2, boolean z) {
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (sCBUniversalWebViewActivity2 == null) {
                        sCBUniversalWebViewActivity2 = new SCBUniversalWebViewActivity();
                    }
                    sCBUniversalWebViewActivity2.MediaDescriptionCompat(codePointAt);
                    while (true) {
                        if (sCBUniversalWebViewActivity2.read == 0) {
                            break;
                        }
                        byte MediaBrowserCompat$SearchResultReceiver = sCBUniversalWebViewActivity2.MediaBrowserCompat$SearchResultReceiver() & 255;
                        sCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver(37);
                        sCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver((int) HEX_DIGITS[(MediaBrowserCompat$SearchResultReceiver >> 4) & 15]);
                        sCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver((int) HEX_DIGITS[MediaBrowserCompat$SearchResultReceiver & 15]);
                    }
                } else {
                    sCBUniversalWebViewActivity.MediaDescriptionCompat(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* access modifiers changed from: package-private */
    public final void addQueryParam(String str, String str2, boolean z) {
        String str3 = this.relativeUrl;
        if (str3 != null) {
            HttpUrl.Builder newBuilder = this.baseUrl.newBuilder(str3);
            this.urlBuilder = newBuilder;
            if (newBuilder != null) {
                this.relativeUrl = null;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Malformed URL. Base: ");
                sb.append(this.baseUrl);
                sb.append(", Relative: ");
                sb.append(this.relativeUrl);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (z) {
            this.urlBuilder.addEncodedQueryParameter(str, str2);
        } else {
            this.urlBuilder.addQueryParameter(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void addFormField(String str, String str2, boolean z) {
        if (z) {
            this.formBuilder.addEncoded(str, str2);
        } else {
            this.formBuilder.add(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void addPart(Headers headers, RequestBody requestBody) {
        this.multipartBuilder.addPart(headers, requestBody);
    }

    /* access modifiers changed from: package-private */
    public final void addPart(MultipartBody.Part part) {
        this.multipartBuilder.addPart(part);
    }

    /* access modifiers changed from: package-private */
    public final void setBody(RequestBody requestBody) {
        this.body = requestBody;
    }

    /* access modifiers changed from: package-private */
    public final <T> void addTag(Class<T> cls, T t) {
        this.requestBuilder.tag(cls, t);
    }

    /* access modifiers changed from: package-private */
    public final Request.Builder get() {
        HttpUrl httpUrl;
        HttpUrl.Builder builder = this.urlBuilder;
        if (builder != null) {
            httpUrl = builder.build();
        } else {
            httpUrl = this.baseUrl.resolve(this.relativeUrl);
            if (httpUrl == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Malformed URL. Base: ");
                sb.append(this.baseUrl);
                sb.append(", Relative: ");
                sb.append(this.relativeUrl);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        ContentTypeOverridingRequestBody contentTypeOverridingRequestBody = this.body;
        if (contentTypeOverridingRequestBody == null) {
            FormBody.Builder builder2 = this.formBuilder;
            if (builder2 != null) {
                contentTypeOverridingRequestBody = builder2.build();
            } else {
                MultipartBody.Builder builder3 = this.multipartBuilder;
                if (builder3 != null) {
                    contentTypeOverridingRequestBody = builder3.build();
                } else if (this.hasBody) {
                    contentTypeOverridingRequestBody = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = this.contentType;
        if (mediaType != null) {
            if (contentTypeOverridingRequestBody != null) {
                contentTypeOverridingRequestBody = new ContentTypeOverridingRequestBody(contentTypeOverridingRequestBody, mediaType);
            } else {
                this.headersBuilder.add("Content-Type", mediaType.toString());
            }
        }
        return this.requestBuilder.url(httpUrl).headers(this.headersBuilder.build()).method(this.method, contentTypeOverridingRequestBody);
    }

    static class ContentTypeOverridingRequestBody extends RequestBody {
        private final MediaType contentType;
        private final RequestBody delegate;

        ContentTypeOverridingRequestBody(RequestBody requestBody, MediaType mediaType) {
            this.delegate = requestBody;
            this.contentType = mediaType;
        }

        public MediaType contentType() {
            return this.contentType;
        }

        public long contentLength() throws IOException {
            return this.delegate.contentLength();
        }

        public void writeTo(NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity) throws IOException {
            this.delegate.writeTo(nsipPartnerPaymentReviewActivity);
        }
    }
}
