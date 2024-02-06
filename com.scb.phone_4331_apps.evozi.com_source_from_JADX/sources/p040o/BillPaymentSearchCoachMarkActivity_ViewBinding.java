package p040o;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* renamed from: o.BillPaymentSearchCoachMarkActivity_ViewBinding */
final class BillPaymentSearchCoachMarkActivity_ViewBinding extends OutputStream {
    private boolean IconCompatParcelizer;
    private final MessageDigest MediaBrowserCompat$CustomActionResultReceiver;
    byte[] write;

    BillPaymentSearchCoachMarkActivity_ViewBinding(MessageDigest messageDigest) {
        this.MediaBrowserCompat$CustomActionResultReceiver = messageDigest;
        messageDigest.reset();
    }

    public final void write(int i) throws IOException {
        if (!this.IconCompatParcelizer) {
            this.MediaBrowserCompat$CustomActionResultReceiver.update((byte) i);
            return;
        }
        throw new IOException("Stream has been already closed");
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.IconCompatParcelizer) {
            this.MediaBrowserCompat$CustomActionResultReceiver.update(bArr, i, i2);
            return;
        }
        throw new IOException("Stream has been already closed");
    }

    public final void close() throws IOException {
        if (!this.IconCompatParcelizer) {
            this.IconCompatParcelizer = true;
            this.write = this.MediaBrowserCompat$CustomActionResultReceiver.digest();
            super.close();
        }
    }
}
