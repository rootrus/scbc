package okhttp3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.internal.Util;
import p040o.GroupFavoriteActivity;
import p040o.NsipPartnerPaymentReviewActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.SCBUniversalWebViewActivity_ViewBinding;
import p040o.onGetStartedClick;

public abstract class RequestBody {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);

    public static final RequestBody create(File file, MediaType mediaType) {
        return Companion.create(file, mediaType);
    }

    public static final RequestBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final RequestBody create(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, MediaType mediaType) {
        return Companion.create(sCBUniversalWebViewActivity_ViewBinding, mediaType);
    }

    public static final RequestBody create(MediaType mediaType, File file) {
        return Companion.create(mediaType, file);
    }

    public static final RequestBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final RequestBody create(MediaType mediaType, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
        return Companion.create(mediaType, sCBUniversalWebViewActivity_ViewBinding);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create$default(Companion, mediaType, bArr, 0, 0, 12, (Object) null);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i) {
        return Companion.create$default(Companion, mediaType, bArr, i, 0, 8, (Object) null);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i, int i2) {
        return Companion.create(mediaType, bArr, i, i2);
    }

    public static final RequestBody create(byte[] bArr) {
        return Companion.create$default(Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create$default(Companion, bArr, mediaType, 0, 0, 6, (Object) null);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i) {
        return Companion.create$default(Companion, bArr, mediaType, i, 0, 4, (Object) null);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i, int i2) {
        return Companion.create(bArr, mediaType, i, i2);
    }

    public long contentLength() throws IOException {
        return -1;
    }

    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity) throws IOException;

    public static final class Companion {
        public final RequestBody create(MediaType mediaType, byte[] bArr) {
            return create$default(this, mediaType, bArr, 0, 0, 12, (Object) null);
        }

        public final RequestBody create(MediaType mediaType, byte[] bArr, int i) {
            return create$default(this, mediaType, bArr, i, 0, 8, (Object) null);
        }

        public final RequestBody create(byte[] bArr) {
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType) {
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType, int i) {
            return create$default(this, bArr, mediaType, i, 0, 4, (Object) null);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final RequestBody create(String str, MediaType mediaType) {
            onGetStartedClick.write((Object) str, "$this$toRequestBody");
            Charset charset = GroupFavoriteActivity.IconCompatParcelizer;
            if (mediaType != null && (charset = MediaType.charset$default(mediaType, (Charset) null, 1, (Object) null)) == null) {
                charset = GroupFavoriteActivity.IconCompatParcelizer;
                MediaType.Companion companion = MediaType.Companion;
                StringBuilder sb = new StringBuilder();
                sb.append(mediaType);
                sb.append("; charset=utf-8");
                mediaType = companion.parse(sb.toString());
            }
            byte[] bytes = str.getBytes(charset);
            onGetStartedClick.IconCompatParcelizer((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            return create(bytes, mediaType, 0, bytes.length);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(sCBUniversalWebViewActivity_ViewBinding, mediaType);
        }

        public final RequestBody create(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, MediaType mediaType) {
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "$this$toRequestBody");
            return new RequestBody$Companion$toRequestBody$1(sCBUniversalWebViewActivity_ViewBinding, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                mediaType = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return companion.create(bArr, mediaType, i, i2);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType, int i, int i2) {
            onGetStartedClick.write((Object) bArr, "$this$toRequestBody");
            Util.checkOffsetAndCount((long) bArr.length, (long) i, (long) i2);
            return new RequestBody$Companion$toRequestBody$2(bArr, mediaType, i2, i);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        public final RequestBody create(File file, MediaType mediaType) {
            onGetStartedClick.write((Object) file, "$this$asRequestBody");
            return new RequestBody$Companion$asRequestBody$1(file, mediaType);
        }

        public final RequestBody create(MediaType mediaType, String str) {
            onGetStartedClick.write((Object) str, "content");
            return create(str, mediaType);
        }

        public final RequestBody create(MediaType mediaType, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "content");
            return create(sCBUniversalWebViewActivity_ViewBinding, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return companion.create(mediaType, bArr, i, i2);
        }

        public final RequestBody create(MediaType mediaType, byte[] bArr, int i, int i2) {
            onGetStartedClick.write((Object) bArr, "content");
            return create(bArr, mediaType, i, i2);
        }

        public final RequestBody create(MediaType mediaType, File file) {
            onGetStartedClick.write((Object) file, "file");
            return create(file, mediaType);
        }
    }
}
