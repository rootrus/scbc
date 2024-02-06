package okhttp3.repackaged;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okhttp3.repackaged.internal.Util;
import p040o.ModifyQuickTopUpActivity;
import p040o.PinLoginActivity;
import p040o.onMenuPromptPayClick;

public abstract class ResponseBody implements Closeable {
    private Reader aiI;

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract PinLoginActivity source();

    public final InputStream byteStream() {
        return source().MediaBrowserCompat$SearchResultReceiver();
    }

    /* JADX INFO: finally extract failed */
    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            PinLoginActivity source = source();
            try {
                byte[] MediaDescriptionCompat = source.MediaDescriptionCompat();
                Util.closeQuietly((Closeable) source);
                if (contentLength == -1 || contentLength == ((long) MediaDescriptionCompat.length)) {
                    return MediaDescriptionCompat;
                }
                throw new IOException("Content-Length and stream length disagree");
            } catch (Throwable th) {
                Util.closeQuietly((Closeable) source);
                throw th;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot buffer entire body for content length: ");
            sb.append(contentLength);
            throw new IOException(sb.toString());
        }
    }

    public final Reader charStream() {
        Reader reader = this.aiI;
        if (reader != null) {
            return reader;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(byteStream(), charset());
        this.aiI = inputStreamReader;
        return inputStreamReader;
    }

    public final String string() throws IOException {
        return new String(bytes(), charset().name());
    }

    private Charset charset() {
        MediaType contentType = contentType();
        return contentType != null ? contentType.charset(Util.UTF_8) : Util.UTF_8;
    }

    public void close() {
        Util.closeQuietly((Closeable) source());
    }

    public static ResponseBody create(MediaType mediaType, String str) {
        onMenuPromptPayClick onmenupromptpayclick;
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            StringBuilder sb = new StringBuilder();
            sb.append(mediaType);
            sb.append("; charset=utf-8");
            mediaType = MediaType.parse(sb.toString());
        }
        onMenuPromptPayClick onmenupromptpayclick2 = new onMenuPromptPayClick();
        int length = str.length();
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (length < 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex < beginIndex: ");
            sb2.append(length);
            sb2.append(" < ");
            sb2.append(0);
            throw new IllegalArgumentException(sb2.toString());
        } else if (length > str.length()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("endIndex > string.length: ");
            sb3.append(length);
            sb3.append(" > ");
            sb3.append(str.length());
            throw new IllegalArgumentException(sb3.toString());
        } else if (charset != null) {
            if (charset.equals(ModifyQuickTopUpActivity.MediaBrowserCompat$ItemReceiver)) {
                onmenupromptpayclick = onmenupromptpayclick2.read(str, 0, str.length());
            } else {
                byte[] bytes = str.substring(0, length).getBytes(charset);
                onmenupromptpayclick = onmenupromptpayclick2.MediaBrowserCompat$CustomActionResultReceiver(bytes, 0, bytes.length);
            }
            return create(mediaType, onmenupromptpayclick.IconCompatParcelizer, onmenupromptpayclick);
        } else {
            throw new IllegalArgumentException("charset == null");
        }
    }

    public static ResponseBody create(MediaType mediaType, byte[] bArr) {
        onMenuPromptPayClick onmenupromptpayclick = new onMenuPromptPayClick();
        if (bArr != null) {
            return create(mediaType, (long) bArr.length, onmenupromptpayclick.MediaBrowserCompat$CustomActionResultReceiver(bArr, 0, bArr.length));
        }
        throw new IllegalArgumentException("source == null");
    }

    public static ResponseBody create(final MediaType mediaType, final long j, final PinLoginActivity pinLoginActivity) {
        if (pinLoginActivity != null) {
            return new ResponseBody() {
                public final MediaType contentType() {
                    return mediaType;
                }

                public final long contentLength() {
                    return j;
                }

                public final PinLoginActivity source() {
                    return pinLoginActivity;
                }
            };
        }
        throw new NullPointerException("source == null");
    }
}
