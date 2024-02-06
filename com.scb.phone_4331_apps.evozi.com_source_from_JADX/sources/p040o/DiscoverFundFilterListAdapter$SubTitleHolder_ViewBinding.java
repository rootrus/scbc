package p040o;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.DiscoverFundFilterListAdapter$SubTitleHolder_ViewBinding */
final class DiscoverFundFilterListAdapter$SubTitleHolder_ViewBinding extends DiscoverFundsListAdapter$SuggestedFundHolder {
    private int IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver = false;
    private boolean MediaBrowserCompat$ItemReceiver = true;
    private int read;

    DiscoverFundFilterListAdapter$SubTitleHolder_ViewBinding(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this.IconCompatParcelizer = inputStream.read();
        int read2 = inputStream.read();
        this.read = read2;
        if (read2 >= 0) {
            MediaBrowserCompat$ItemReceiver();
            return;
        }
        throw new EOFException();
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.MediaBrowserCompat$ItemReceiver = z;
        MediaBrowserCompat$ItemReceiver();
    }

    private boolean MediaBrowserCompat$ItemReceiver() {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver && this.MediaBrowserCompat$ItemReceiver && this.IconCompatParcelizer == 0 && this.read == 0) {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            MediaBrowserCompat$CustomActionResultReceiver();
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.MediaBrowserCompat$ItemReceiver || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            return -1;
        }
        int read2 = this.write.read(bArr, i + 2, i2 - 2);
        if (read2 >= 0) {
            bArr[i] = (byte) this.IconCompatParcelizer;
            bArr[i + 1] = (byte) this.read;
            this.IconCompatParcelizer = this.write.read();
            int read3 = this.write.read();
            this.read = read3;
            if (read3 >= 0) {
                return read2 + 2;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final int read() throws IOException {
        if (MediaBrowserCompat$ItemReceiver()) {
            return -1;
        }
        int read2 = this.write.read();
        if (read2 >= 0) {
            int i = this.IconCompatParcelizer;
            this.IconCompatParcelizer = this.read;
            this.read = read2;
            return i;
        }
        throw new EOFException();
    }
}
