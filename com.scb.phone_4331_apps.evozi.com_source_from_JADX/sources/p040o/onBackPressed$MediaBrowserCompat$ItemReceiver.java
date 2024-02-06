package p040o;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.onBackPressed;

/* renamed from: o.onBackPressed$MediaBrowserCompat$ItemReceiver */
final class onBackPressed$MediaBrowserCompat$ItemReceiver implements onBackPressed.IconCompatParcelizer {
    private final InputStream MediaBrowserCompat$CustomActionResultReceiver;

    onBackPressed$MediaBrowserCompat$ItemReceiver(InputStream inputStream) {
        this.MediaBrowserCompat$CustomActionResultReceiver = inputStream;
    }

    public final int MediaBrowserCompat$ItemReceiver() throws IOException {
        return ((this.MediaBrowserCompat$CustomActionResultReceiver.read() << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) | (this.MediaBrowserCompat$CustomActionResultReceiver.read() & 255);
    }

    public final short IconCompatParcelizer() throws IOException {
        return (short) (this.MediaBrowserCompat$CustomActionResultReceiver.read() & 255);
    }

    public final long MediaBrowserCompat$ItemReceiver(long j) throws IOException {
        if (j < 0) {
            return 0;
        }
        long j2 = j;
        while (j2 > 0) {
            long skip = this.MediaBrowserCompat$CustomActionResultReceiver.skip(j2);
            if (skip <= 0) {
                if (this.MediaBrowserCompat$CustomActionResultReceiver.read() == -1) {
                    break;
                }
                skip = 1;
            }
            j2 -= skip;
        }
        return j - j2;
    }

    public final int write(byte[] bArr, int i) throws IOException {
        int i2 = i;
        while (i2 > 0) {
            int read = this.MediaBrowserCompat$CustomActionResultReceiver.read(bArr, i - i2, i2);
            if (read == -1) {
                break;
            }
            i2 -= read;
        }
        return i - i2;
    }

    public final int write() throws IOException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.read();
    }
}
