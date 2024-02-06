package p040o;

import java.io.IOException;
import java.io.OutputStream;
import p040o.CheckParameters;

/* renamed from: o.onAttachFragment */
public final class onAttachFragment extends OutputStream {
    private int IconCompatParcelizer;
    private CheckParameters.CheckCountry MediaBrowserCompat$CustomActionResultReceiver;
    private final OutputStream MediaBrowserCompat$ItemReceiver;
    private byte[] write;

    public onAttachFragment(OutputStream outputStream, CheckParameters.CheckCountry checkCountry) {
        this(outputStream, checkCountry, (byte) 0);
    }

    private onAttachFragment(OutputStream outputStream, CheckParameters.CheckCountry checkCountry, byte b) {
        this.MediaBrowserCompat$ItemReceiver = outputStream;
        this.MediaBrowserCompat$CustomActionResultReceiver = checkCountry;
        this.write = (byte[]) checkCountry.read(65536, byte[].class);
    }

    public final void write(int i) throws IOException {
        byte[] bArr = this.write;
        int i2 = this.IconCompatParcelizer;
        this.IconCompatParcelizer = i2 + 1;
        bArr[i2] = (byte) i;
        write();
    }

    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            if (this.IconCompatParcelizer != 0 || i4 < this.write.length) {
                int min = Math.min(i4, this.write.length - this.IconCompatParcelizer);
                System.arraycopy(bArr, i5, this.write, this.IconCompatParcelizer, min);
                this.IconCompatParcelizer += min;
                i3 += min;
                write();
            } else {
                this.MediaBrowserCompat$ItemReceiver.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }

    private void write() throws IOException {
        int i = this.IconCompatParcelizer;
        byte[] bArr = this.write;
        if (i == bArr.length && i > 0) {
            this.MediaBrowserCompat$ItemReceiver.write(bArr, 0, i);
            this.IconCompatParcelizer = 0;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void close() throws IOException {
        try {
            flush();
            this.MediaBrowserCompat$ItemReceiver.close();
            byte[] bArr = this.write;
            if (bArr != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(bArr);
                this.write = null;
            }
        } catch (Throwable th) {
            this.MediaBrowserCompat$ItemReceiver.close();
            throw th;
        }
    }

    public final void flush() throws IOException {
        int i = this.IconCompatParcelizer;
        if (i > 0) {
            this.MediaBrowserCompat$ItemReceiver.write(this.write, 0, i);
            this.IconCompatParcelizer = 0;
        }
        this.MediaBrowserCompat$ItemReceiver.flush();
    }
}
