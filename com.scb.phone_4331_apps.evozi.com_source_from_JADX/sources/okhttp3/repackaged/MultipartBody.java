package okhttp3.repackaged;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import okhttp3.repackaged.internal.Util;
import p040o.ModifyQuickTopUpActivity;
import p040o.PinLoginActivity_ViewBinding;
import p040o.onLoginButtonClick;
import p040o.onMenuPromptPayClick;

public final class MultipartBody extends RequestBody {
    public static final MediaType ALTERNATIVE = MediaType.parse("multipart/alternative");
    public static final MediaType DIGEST = MediaType.parse("multipart/digest");
    public static final MediaType FORM = MediaType.parse("multipart/form-data");
    public static final MediaType MIXED = MediaType.parse("multipart/mixed");
    public static final MediaType PARALLEL = MediaType.parse("multipart/parallel");
    private static final byte[] aia = {58, 32};
    private static final byte[] aib = {13, 10};
    private static final byte[] aic = {45, 45};
    private final PinLoginActivity_ViewBinding aid;
    private final MediaType aie;
    private final MediaType aif;
    private final List<Part> aig;
    private long contentLength = -1;

    MultipartBody(PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding, MediaType mediaType, List<Part> list) {
        this.aid = pinLoginActivity_ViewBinding;
        this.aie = mediaType;
        StringBuilder sb = new StringBuilder();
        sb.append(mediaType);
        sb.append("; boundary=");
        String str = pinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null) {
            str = new String(pinLoginActivity_ViewBinding.write, ModifyQuickTopUpActivity.MediaBrowserCompat$ItemReceiver);
            pinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = str;
        }
        sb.append(str);
        this.aif = MediaType.parse(sb.toString());
        this.aig = Util.immutableList(list);
    }

    public final MediaType type() {
        return this.aie;
    }

    public final String boundary() {
        PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding = this.aid;
        String str = pinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
        if (str != null) {
            return str;
        }
        String str2 = new String(pinLoginActivity_ViewBinding.write, ModifyQuickTopUpActivity.MediaBrowserCompat$ItemReceiver);
        pinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = str2;
        return str2;
    }

    public final int size() {
        return this.aig.size();
    }

    public final List<Part> parts() {
        return this.aig;
    }

    public final Part part(int i) {
        return this.aig.get(i);
    }

    public final MediaType contentType() {
        return this.aif;
    }

    public final long contentLength() throws IOException {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long a = m5867a((onLoginButtonClick) null, true);
        this.contentLength = a;
        return a;
    }

    public final void writeTo(onLoginButtonClick onloginbuttonclick) throws IOException {
        m5867a(onloginbuttonclick, false);
    }

    /* renamed from: a */
    private long m5867a(onLoginButtonClick onloginbuttonclick, boolean z) throws IOException {
        onMenuPromptPayClick onmenupromptpayclick;
        onMenuPromptPayClick onmenupromptpayclick2;
        if (z) {
            onmenupromptpayclick = new onMenuPromptPayClick();
            onmenupromptpayclick2 = onmenupromptpayclick;
        } else {
            onmenupromptpayclick2 = onloginbuttonclick;
            onmenupromptpayclick = null;
        }
        int size = this.aig.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Part part = this.aig.get(i);
            Headers a = part.aii;
            RequestBody b = part.aij;
            onmenupromptpayclick2.write(aic);
            onmenupromptpayclick2.IconCompatParcelizer(this.aid);
            onmenupromptpayclick2.write(aib);
            if (a != null) {
                int size2 = a.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    onmenupromptpayclick2.IconCompatParcelizer(a.name(i2)).write(aia).IconCompatParcelizer(a.value(i2)).write(aib);
                }
            }
            MediaType contentType = b.contentType();
            if (contentType != null) {
                onmenupromptpayclick2.IconCompatParcelizer("Content-Type: ").IconCompatParcelizer(contentType.toString()).write(aib);
            }
            long contentLength2 = b.contentLength();
            if (contentLength2 != -1) {
                onmenupromptpayclick2.IconCompatParcelizer("Content-Length: ").RatingCompat(contentLength2).write(aib);
            } else if (z) {
                try {
                    onmenupromptpayclick.MediaMetadataCompat(onmenupromptpayclick.IconCompatParcelizer);
                    return -1;
                } catch (EOFException e) {
                    throw new AssertionError(e);
                }
            }
            onmenupromptpayclick2.write(aib);
            if (z) {
                j += contentLength2;
            } else {
                b.writeTo(onmenupromptpayclick2);
            }
            onmenupromptpayclick2.write(aib);
        }
        onmenupromptpayclick2.write(aic);
        onmenupromptpayclick2.IconCompatParcelizer(this.aid);
        onmenupromptpayclick2.write(aic);
        onmenupromptpayclick2.write(aib);
        if (z) {
            j += onmenupromptpayclick.IconCompatParcelizer;
            try {
                onmenupromptpayclick.MediaMetadataCompat(onmenupromptpayclick.IconCompatParcelizer);
            } catch (EOFException e2) {
                throw new AssertionError(e2);
            }
        }
        return j;
    }

    static StringBuilder appendQuotedString(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 10) {
                sb.append("%0A");
            } else if (charAt == 13) {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
        return sb;
    }

    public static final class Part {
        /* access modifiers changed from: private */
        public final Headers aii;
        /* access modifiers changed from: private */
        public final RequestBody aij;

        public static Part create(RequestBody requestBody) {
            return create((Headers) null, requestBody);
        }

        public static Part create(Headers headers, RequestBody requestBody) {
            if (requestBody == null) {
                throw new NullPointerException("body == null");
            } else if (headers != null && headers.get("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (headers == null || headers.get("Content-Length") == null) {
                return new Part(headers, requestBody);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }

        public static Part createFormData(String str, String str2) {
            return createFormData(str, (String) null, RequestBody.create((MediaType) null, str2));
        }

        public static Part createFormData(String str, String str2, RequestBody requestBody) {
            if (str != null) {
                StringBuilder sb = new StringBuilder("form-data; name=");
                MultipartBody.appendQuotedString(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    MultipartBody.appendQuotedString(sb, str2);
                }
                return create(Headers.m5835of("Content-Disposition", sb.toString()), requestBody);
            }
            throw new NullPointerException("name == null");
        }

        private Part(Headers headers, RequestBody requestBody) {
            this.aii = headers;
            this.aij = requestBody;
        }
    }

    public static final class Builder {
        private final PinLoginActivity_ViewBinding aid;
        private final List<Part> aig;
        private MediaType aih;

        public Builder() {
            this(UUID.randomUUID().toString());
        }

        public Builder(String str) {
            this.aih = MultipartBody.MIXED;
            this.aig = new ArrayList();
            this.aid = PinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(str);
        }

        public final Builder setType(MediaType mediaType) {
            if (mediaType == null) {
                throw new NullPointerException("type == null");
            } else if (mediaType.type().equals("multipart")) {
                this.aih = mediaType;
                return this;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("multipart != ");
                sb.append(mediaType);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        public final Builder addPart(RequestBody requestBody) {
            return addPart(Part.create(requestBody));
        }

        public final Builder addPart(Headers headers, RequestBody requestBody) {
            return addPart(Part.create(headers, requestBody));
        }

        public final Builder addFormDataPart(String str, String str2) {
            return addPart(Part.createFormData(str, str2));
        }

        public final Builder addFormDataPart(String str, String str2, RequestBody requestBody) {
            return addPart(Part.createFormData(str, str2, requestBody));
        }

        public final Builder addPart(Part part) {
            if (part != null) {
                this.aig.add(part);
                return this;
            }
            throw new NullPointerException("part == null");
        }

        public final MultipartBody build() {
            if (!this.aig.isEmpty()) {
                return new MultipartBody(this.aid, this.aih, this.aig);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
    }
}
