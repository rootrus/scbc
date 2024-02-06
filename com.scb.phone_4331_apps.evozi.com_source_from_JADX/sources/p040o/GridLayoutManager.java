package p040o;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: o.GridLayoutManager */
public final class GridLayoutManager extends InputStream {
    private static final Queue<GridLayoutManager> MediaBrowserCompat$CustomActionResultReceiver = LinearLayoutManager.IconCompatParcelizer(0);
    private InputStream MediaBrowserCompat$ItemReceiver;
    public IOException read;

    public static GridLayoutManager MediaBrowserCompat$ItemReceiver(InputStream inputStream) {
        GridLayoutManager poll;
        synchronized (MediaBrowserCompat$CustomActionResultReceiver) {
            poll = MediaBrowserCompat$CustomActionResultReceiver.poll();
        }
        if (poll == null) {
            poll = new GridLayoutManager();
        }
        poll.MediaBrowserCompat$ItemReceiver = inputStream;
        return poll;
    }

    GridLayoutManager() {
    }

    public final int available() throws IOException {
        return this.MediaBrowserCompat$ItemReceiver.available();
    }

    public final void close() throws IOException {
        this.MediaBrowserCompat$ItemReceiver.close();
    }

    public final void mark(int i) {
        this.MediaBrowserCompat$ItemReceiver.mark(i);
    }

    public final boolean markSupported() {
        return this.MediaBrowserCompat$ItemReceiver.markSupported();
    }

    public final int read(byte[] bArr) {
        try {
            return this.MediaBrowserCompat$ItemReceiver.read(bArr);
        } catch (IOException e) {
            this.read = e;
            return -1;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.MediaBrowserCompat$ItemReceiver.read(bArr, i, i2);
        } catch (IOException e) {
            this.read = e;
            return -1;
        }
    }

    public final void reset() throws IOException {
        synchronized (this) {
            this.MediaBrowserCompat$ItemReceiver.reset();
        }
    }

    public final long skip(long j) {
        try {
            return this.MediaBrowserCompat$ItemReceiver.skip(j);
        } catch (IOException e) {
            this.read = e;
            return 0;
        }
    }

    public final int read() {
        try {
            return this.MediaBrowserCompat$ItemReceiver.read();
        } catch (IOException e) {
            this.read = e;
            return -1;
        }
    }

    public final void IconCompatParcelizer() {
        this.read = null;
        this.MediaBrowserCompat$ItemReceiver = null;
        synchronized (MediaBrowserCompat$CustomActionResultReceiver) {
            MediaBrowserCompat$CustomActionResultReceiver.offer(this);
        }
    }
}
