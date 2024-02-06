package p040o;

import com.google.common.base.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.NumberFormat;

/* renamed from: o.rsnAllocationIoReceive */
public class rsnAllocationIoReceive extends ByteArrayOutputStream {
    private final int IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private boolean write;

    public void write(int i) {
        synchronized (this) {
            Preconditions.checkArgument(!this.write);
            this.MediaBrowserCompat$CustomActionResultReceiver++;
            if (this.count < this.IconCompatParcelizer) {
                super.write(i);
            }
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        synchronized (this) {
            Preconditions.checkArgument(!this.write);
            this.MediaBrowserCompat$CustomActionResultReceiver += i2;
            if (this.count < this.IconCompatParcelizer) {
                int i3 = this.count + i2;
                if (i3 > this.IconCompatParcelizer) {
                    i2 += this.IconCompatParcelizer - i3;
                }
                super.write(bArr, i, i2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.util.logging.Logger, java.util.logging.Level] */
    public void close() throws IOException {
        synchronized (this) {
            if (!this.write) {
                if (this.MediaBrowserCompat$CustomActionResultReceiver != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Total: ");
                    MediaBrowserCompat$ItemReceiver(sb, this.MediaBrowserCompat$CustomActionResultReceiver);
                    if (this.count != 0 && this.count < this.MediaBrowserCompat$CustomActionResultReceiver) {
                        sb.append(" (logging first ");
                        MediaBrowserCompat$ItemReceiver(sb, this.count);
                        sb.append(")");
                    }
                    ? r1 = 0;
                    r1.config(sb.toString());
                    if (this.count != 0) {
                        r1.log(r1, toString("UTF-8").replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", " "));
                    }
                }
                this.write = true;
            }
        }
    }

    private static void MediaBrowserCompat$ItemReceiver(StringBuilder sb, int i) {
        if (i == 1) {
            sb.append("1 byte");
            return;
        }
        sb.append(NumberFormat.getInstance().format((long) i));
        sb.append(" bytes");
    }
}
