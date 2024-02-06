package p040o;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: o.createFromBitmap */
public final class createFromBitmap {
    public final byte[] MediaBrowserCompat$ItemReceiver;
    private final Charset write;

    public createFromBitmap(byte[] bArr, Charset charset) {
        this.MediaBrowserCompat$ItemReceiver = bArr;
        this.write = charset;
    }

    public final String toString() {
        return MediaBrowserCompat$ItemReceiver(this.write);
    }

    private String MediaBrowserCompat$ItemReceiver(Charset charset) {
        if (charset != null) {
            try {
                return new String(this.MediaBrowserCompat$ItemReceiver, charset.name());
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return new String(this.MediaBrowserCompat$ItemReceiver);
    }
}
