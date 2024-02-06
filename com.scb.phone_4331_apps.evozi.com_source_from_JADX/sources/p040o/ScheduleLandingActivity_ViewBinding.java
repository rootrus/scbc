package p040o;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.ScheduleLandingActivity_ViewBinding */
public final class ScheduleLandingActivity_ViewBinding extends InputStream implements SummaryDetailActivity {
    private boolean IconCompatParcelizer = false;
    private final ScheduleBulkTransferActivity MediaBrowserCompat$CustomActionResultReceiver;
    private InputStream read;

    public ScheduleLandingActivity_ViewBinding(InputStream inputStream, ScheduleBulkTransferActivity scheduleBulkTransferActivity) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(inputStream, "Wrapped stream");
        this.read = inputStream;
        this.MediaBrowserCompat$CustomActionResultReceiver = scheduleBulkTransferActivity;
    }

    private boolean MediaBrowserCompat$CustomActionResultReceiver() throws IOException {
        if (!this.IconCompatParcelizer) {
            return this.read != null;
        }
        throw new IOException("Attempted read on closed stream.");
    }

    public final int read() throws IOException {
        if (!MediaBrowserCompat$CustomActionResultReceiver()) {
            return -1;
        }
        try {
            int read2 = this.read.read();
            MediaBrowserCompat$ItemReceiver(read2);
            return read2;
        } catch (IOException e) {
            MediaBrowserCompat$ItemReceiver();
            throw e;
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (!MediaBrowserCompat$CustomActionResultReceiver()) {
            return -1;
        }
        try {
            int read2 = this.read.read(bArr, i, i2);
            MediaBrowserCompat$ItemReceiver(read2);
            return read2;
        } catch (IOException e) {
            MediaBrowserCompat$ItemReceiver();
            throw e;
        }
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final int available() throws IOException {
        if (!MediaBrowserCompat$CustomActionResultReceiver()) {
            return 0;
        }
        try {
            return this.read.available();
        } catch (IOException e) {
            MediaBrowserCompat$ItemReceiver();
            throw e;
        }
    }

    public final void close() throws IOException {
        boolean z = true;
        this.IconCompatParcelizer = true;
        InputStream inputStream = this.read;
        if (inputStream != null) {
            try {
                if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                    z = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(inputStream);
                }
                if (z) {
                    inputStream.close();
                }
            } finally {
                this.read = null;
            }
        }
    }

    private void MediaBrowserCompat$ItemReceiver(int i) throws IOException {
        InputStream inputStream = this.read;
        if (inputStream != null && i < 0) {
            boolean z = true;
            try {
                if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                    z = this.MediaBrowserCompat$CustomActionResultReceiver.read(inputStream);
                }
                if (z) {
                    inputStream.close();
                }
            } finally {
                this.read = null;
            }
        }
    }

    private void MediaBrowserCompat$ItemReceiver() throws IOException {
        InputStream inputStream = this.read;
        if (inputStream != null) {
            boolean z = true;
            try {
                if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                    z = this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat();
                }
                if (z) {
                    inputStream.close();
                }
            } finally {
                this.read = null;
            }
        }
    }

    public final void MediaMetadataCompat() throws IOException {
        close();
    }

    public final void RatingCompat() throws IOException {
        this.IconCompatParcelizer = true;
        MediaBrowserCompat$ItemReceiver();
    }
}
