package okhttp3;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import p040o.C7043xa484e06c;
import p040o.NsipPartnerPaymentReviewActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.PinChangeSuccessActivity;
import p040o.SCBUniversalWebViewActivity;
import p040o.SCBUniversalWebViewActivity_ViewBinding;
import p040o.onGetStartedClick;

public final class MultipartBody extends RequestBody {
    public static final MediaType ALTERNATIVE = MediaType.Companion.get("multipart/alternative");
    private static final byte[] COLONSPACE = {58, 32};
    private static final byte[] CRLF = {13, 10};
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    private static final byte[] DASHDASH = {45, 45};
    public static final MediaType DIGEST = MediaType.Companion.get("multipart/digest");
    public static final MediaType FORM = MediaType.Companion.get("multipart/form-data");
    public static final MediaType MIXED = MediaType.Companion.get("multipart/mixed");
    public static final MediaType PARALLEL = MediaType.Companion.get("multipart/parallel");
    private final SCBUniversalWebViewActivity_ViewBinding boundaryByteString;
    private long contentLength = -1;
    private final MediaType contentType;
    private final List<Part> parts;
    private final MediaType type;

    public final MediaType type() {
        return this.type;
    }

    public final List<Part> parts() {
        return this.parts;
    }

    public MultipartBody(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, MediaType mediaType, List<Part> list) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "boundaryByteString");
        onGetStartedClick.write((Object) mediaType, "type");
        onGetStartedClick.write((Object) list, "parts");
        this.boundaryByteString = sCBUniversalWebViewActivity_ViewBinding;
        this.type = mediaType;
        this.parts = list;
        MediaType.Companion companion = MediaType.Companion;
        StringBuilder sb = new StringBuilder();
        sb.append(this.type);
        sb.append("; boundary=");
        sb.append(boundary());
        this.contentType = companion.get(sb.toString());
    }

    public final String boundary() {
        return PinChangeSuccessActivity.MediaMetadataCompat(this.boundaryByteString);
    }

    public final int size() {
        return this.parts.size();
    }

    public final Part part(int i) {
        return this.parts.get(i);
    }

    public final MediaType contentType() {
        return this.contentType;
    }

    /* renamed from: -deprecated_type  reason: not valid java name */
    public final MediaType m6402deprecated_type() {
        return this.type;
    }

    /* renamed from: -deprecated_boundary  reason: not valid java name */
    public final String m6399deprecated_boundary() {
        return boundary();
    }

    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m6401deprecated_size() {
        return size();
    }

    /* renamed from: -deprecated_parts  reason: not valid java name */
    public final List<Part> m6400deprecated_parts() {
        return this.parts;
    }

    public final long contentLength() throws IOException {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long writeOrCountBytes = writeOrCountBytes((NsipPartnerPaymentReviewActivity) null, true);
        this.contentLength = writeOrCountBytes;
        return writeOrCountBytes;
    }

    public final void writeTo(NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity) throws IOException {
        onGetStartedClick.write((Object) nsipPartnerPaymentReviewActivity, "sink");
        writeOrCountBytes(nsipPartnerPaymentReviewActivity, false);
    }

    private final long writeOrCountBytes(NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity, boolean z) throws IOException {
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity;
        if (z) {
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity2 = new SCBUniversalWebViewActivity();
            sCBUniversalWebViewActivity = sCBUniversalWebViewActivity2;
            nsipPartnerPaymentReviewActivity = sCBUniversalWebViewActivity2;
        } else {
            sCBUniversalWebViewActivity = null;
        }
        int size = this.parts.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Part part = this.parts.get(i);
            Headers headers = part.headers();
            RequestBody body = part.body();
            if (nsipPartnerPaymentReviewActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            nsipPartnerPaymentReviewActivity.write(DASHDASH);
            nsipPartnerPaymentReviewActivity.IconCompatParcelizer(this.boundaryByteString);
            nsipPartnerPaymentReviewActivity.write(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    nsipPartnerPaymentReviewActivity.MediaBrowserCompat$CustomActionResultReceiver(headers.name(i2)).write(COLONSPACE).MediaBrowserCompat$CustomActionResultReceiver(headers.value(i2)).write(CRLF);
                }
            }
            MediaType contentType2 = body.contentType();
            if (contentType2 != null) {
                nsipPartnerPaymentReviewActivity.MediaBrowserCompat$CustomActionResultReceiver("Content-Type: ").MediaBrowserCompat$CustomActionResultReceiver(contentType2.toString()).write(CRLF);
            }
            long contentLength2 = body.contentLength();
            if (contentLength2 != -1) {
                nsipPartnerPaymentReviewActivity.MediaBrowserCompat$CustomActionResultReceiver("Content-Length: ").RatingCompat(contentLength2).write(CRLF);
            } else if (z) {
                if (sCBUniversalWebViewActivity == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                sCBUniversalWebViewActivity.MediaBrowserCompat$MediaItem(sCBUniversalWebViewActivity.read);
                return -1;
            }
            nsipPartnerPaymentReviewActivity.write(CRLF);
            if (z) {
                j += contentLength2;
            } else {
                body.writeTo(nsipPartnerPaymentReviewActivity);
            }
            nsipPartnerPaymentReviewActivity.write(CRLF);
        }
        if (nsipPartnerPaymentReviewActivity == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        nsipPartnerPaymentReviewActivity.write(DASHDASH);
        nsipPartnerPaymentReviewActivity.IconCompatParcelizer(this.boundaryByteString);
        nsipPartnerPaymentReviewActivity.write(DASHDASH);
        nsipPartnerPaymentReviewActivity.write(CRLF);
        if (!z) {
            return j;
        }
        if (sCBUniversalWebViewActivity == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        long j2 = j + sCBUniversalWebViewActivity.read;
        sCBUniversalWebViewActivity.MediaBrowserCompat$MediaItem(sCBUniversalWebViewActivity.read);
        return j2;
    }

    public static final class Part {
        public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
        private final RequestBody body;
        private final Headers headers;

        public static final Part create(Headers headers2, RequestBody requestBody) {
            return Companion.create(headers2, requestBody);
        }

        public static final Part create(RequestBody requestBody) {
            return Companion.create(requestBody);
        }

        public static final Part createFormData(String str, String str2) {
            return Companion.createFormData(str, str2);
        }

        public static final Part createFormData(String str, String str2, RequestBody requestBody) {
            return Companion.createFormData(str, str2, requestBody);
        }

        private Part(Headers headers2, RequestBody requestBody) {
            this.headers = headers2;
            this.body = requestBody;
        }

        public /* synthetic */ Part(Headers headers2, RequestBody requestBody, NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this(headers2, requestBody);
        }

        public final Headers headers() {
            return this.headers;
        }

        public final RequestBody body() {
            return this.body;
        }

        /* renamed from: -deprecated_headers  reason: not valid java name */
        public final Headers m6404deprecated_headers() {
            return this.headers;
        }

        /* renamed from: -deprecated_body  reason: not valid java name */
        public final RequestBody m6403deprecated_body() {
            return this.body;
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
                this();
            }

            public final Part create(RequestBody requestBody) {
                onGetStartedClick.write((Object) requestBody, "body");
                return create((Headers) null, requestBody);
            }

            public final Part create(Headers headers, RequestBody requestBody) {
                onGetStartedClick.write((Object) requestBody, "body");
                boolean z = true;
                if ((headers != null ? headers.get("Content-Type") : null) == null) {
                    if ((headers != null ? headers.get("Content-Length") : null) != null) {
                        z = false;
                    }
                    if (z) {
                        return new Part(headers, requestBody, (NtbDiscoverFundFilterActivity) null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }

            public final Part createFormData(String str, String str2) {
                onGetStartedClick.write((Object) str, "name");
                onGetStartedClick.write((Object) str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                return createFormData(str, (String) null, RequestBody.Companion.create$default(RequestBody.Companion, str2, (MediaType) null, 1, (Object) null));
            }

            public final Part createFormData(String str, String str2, RequestBody requestBody) {
                onGetStartedClick.write((Object) str, "name");
                onGetStartedClick.write((Object) requestBody, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                MultipartBody.Companion.appendQuotedString$okhttp(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    MultipartBody.Companion.appendQuotedString$okhttp(sb, str2);
                }
                String obj = sb.toString();
                onGetStartedClick.IconCompatParcelizer((Object) obj, "StringBuilder().apply(builderAction).toString()");
                return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", obj).build(), requestBody);
            }
        }
    }

    public static final class Builder {
        private final SCBUniversalWebViewActivity_ViewBinding boundary;
        private final List<Part> parts;
        private MediaType type;

        public Builder() {
            this((String) null, 1, (NtbDiscoverFundFilterActivity) null);
        }

        public Builder(String str) {
            onGetStartedClick.write((Object) str, "boundary");
            C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity_ViewBinding.write;
            onGetStartedClick.write((Object) str, "$receiver");
            this.boundary = PinChangeSuccessActivity.read(str);
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Builder(java.lang.String r1, int r2, p040o.NtbDiscoverFundFilterActivity r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L_0x0011
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "UUID.randomUUID().toString()"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r2)
            L_0x0011:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartBody.Builder.<init>(java.lang.String, int, o.NtbDiscoverFundFilterActivity):void");
        }

        public final Builder setType(MediaType mediaType) {
            onGetStartedClick.write((Object) mediaType, "type");
            Builder builder = this;
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) mediaType.type(), (Object) "multipart")) {
                builder.type = mediaType;
                return builder;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("multipart != ");
            sb.append(mediaType);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public final Builder addPart(RequestBody requestBody) {
            onGetStartedClick.write((Object) requestBody, "body");
            Builder builder = this;
            builder.addPart(Part.Companion.create(requestBody));
            return builder;
        }

        public final Builder addPart(Headers headers, RequestBody requestBody) {
            onGetStartedClick.write((Object) requestBody, "body");
            Builder builder = this;
            builder.addPart(Part.Companion.create(headers, requestBody));
            return builder;
        }

        public final Builder addFormDataPart(String str, String str2) {
            onGetStartedClick.write((Object) str, "name");
            onGetStartedClick.write((Object) str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            Builder builder = this;
            builder.addPart(Part.Companion.createFormData(str, str2));
            return builder;
        }

        public final Builder addFormDataPart(String str, String str2, RequestBody requestBody) {
            onGetStartedClick.write((Object) str, "name");
            onGetStartedClick.write((Object) requestBody, "body");
            Builder builder = this;
            builder.addPart(Part.Companion.createFormData(str, str2, requestBody));
            return builder;
        }

        public final Builder addPart(Part part) {
            onGetStartedClick.write((Object) part, "part");
            Builder builder = this;
            builder.parts.add(part);
            return builder;
        }

        public final MultipartBody build() {
            if (!this.parts.isEmpty()) {
                return new MultipartBody(this.boundary, this.type, Util.toImmutableList(this.parts));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final void appendQuotedString$okhttp(StringBuilder sb, String str) {
            onGetStartedClick.write((Object) sb, "$this$appendQuotedString");
            onGetStartedClick.write((Object) str, "key");
            sb.append('\"');
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == 10) {
                    sb.append("%0A");
                } else if (charAt == 13) {
                    sb.append("%0D");
                } else if (charAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(charAt);
                }
            }
            sb.append('\"');
        }
    }
}
