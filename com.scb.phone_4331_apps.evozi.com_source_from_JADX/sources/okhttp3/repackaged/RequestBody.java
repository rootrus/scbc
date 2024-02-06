package okhttp3.repackaged;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import okhttp3.repackaged.internal.Util;
import p040o.HowToAddAccountActivity;
import p040o.ModifyQuickBalanceActivity;
import p040o.PinLoginActivity_ViewBinding;
import p040o.onLoginButtonClick;

public abstract class RequestBody {
    public long contentLength() throws IOException {
        return -1;
    }

    public abstract MediaType contentType();

    public abstract void writeTo(onLoginButtonClick onloginbuttonclick) throws IOException;

    public static RequestBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            StringBuilder sb = new StringBuilder();
            sb.append(mediaType);
            sb.append("; charset=utf-8");
            mediaType = MediaType.parse(sb.toString());
        }
        return create(mediaType, str.getBytes(charset));
    }

    public static RequestBody create(final MediaType mediaType, final PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding) {
        return new RequestBody() {
            public final MediaType contentType() {
                return mediaType;
            }

            public final long contentLength() throws IOException {
                return (long) pinLoginActivity_ViewBinding.write.length;
            }

            public final void writeTo(onLoginButtonClick onloginbuttonclick) throws IOException {
                onloginbuttonclick.IconCompatParcelizer(pinLoginActivity_ViewBinding);
            }
        };
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(final MediaType mediaType, final byte[] bArr, final int i, final int i2) {
        if (bArr != null) {
            Util.checkOffsetAndCount((long) bArr.length, (long) i, (long) i2);
            return new RequestBody() {
                public final MediaType contentType() {
                    return mediaType;
                }

                public final long contentLength() {
                    return (long) i2;
                }

                public final void writeTo(onLoginButtonClick onloginbuttonclick) throws IOException {
                    onloginbuttonclick.MediaBrowserCompat$CustomActionResultReceiver(bArr, i, i2);
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    public static RequestBody create(final MediaType mediaType, final File file) {
        if (file != null) {
            return new RequestBody() {
                public final MediaType contentType() {
                    return mediaType;
                }

                public final long contentLength() {
                    return file.length();
                }

                public final void writeTo(onLoginButtonClick onloginbuttonclick) throws IOException {
                    HowToAddAccountActivity howToAddAccountActivity = null;
                    try {
                        howToAddAccountActivity = ModifyQuickBalanceActivity.write(file);
                        onloginbuttonclick.MediaBrowserCompat$ItemReceiver(howToAddAccountActivity);
                    } finally {
                        Util.closeQuietly((Closeable) howToAddAccountActivity);
                    }
                }
            };
        }
        throw new NullPointerException("content == null");
    }
}
