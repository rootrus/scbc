package p040o;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.FragmentBuilder_BindFindUsFragment */
final class FragmentBuilder_BindFindUsFragment extends InputStream {
    boolean IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private long MediaBrowserCompat$ItemReceiver;
    private long MediaBrowserCompat$MediaItem;
    private long MediaMetadataCompat;
    private final InputStream read;
    private long write;

    FragmentBuilder_BindFindUsFragment(InputStream inputStream) {
        this(inputStream, (byte) 0);
    }

    private FragmentBuilder_BindFindUsFragment(InputStream inputStream, byte b) {
        this(inputStream, 4096);
    }

    private FragmentBuilder_BindFindUsFragment(InputStream inputStream, int i) {
        this.MediaBrowserCompat$ItemReceiver = -1;
        this.IconCompatParcelizer = true;
        this.MediaBrowserCompat$CustomActionResultReceiver = -1;
        this.read = !inputStream.markSupported() ? new BufferedInputStream(inputStream, 4096) : inputStream;
        this.MediaBrowserCompat$CustomActionResultReceiver = 1024;
    }

    public final void mark(int i) {
        this.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(i);
    }

    public final long MediaBrowserCompat$ItemReceiver(int i) {
        long j = this.MediaMetadataCompat + ((long) i);
        if (this.write < j) {
            read(j);
        }
        return this.MediaMetadataCompat;
    }

    private void read(long j) {
        try {
            if (this.MediaBrowserCompat$MediaItem >= this.MediaMetadataCompat || this.MediaMetadataCompat > this.write) {
                this.MediaBrowserCompat$MediaItem = this.MediaMetadataCompat;
                this.read.mark((int) (j - this.MediaMetadataCompat));
            } else {
                this.read.reset();
                this.read.mark((int) (j - this.MediaBrowserCompat$MediaItem));
                MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem, this.MediaMetadataCompat);
            }
            this.write = j;
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to mark: ");
            sb.append(e);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void reset() throws IOException {
        write(this.MediaBrowserCompat$ItemReceiver);
    }

    public final void write(long j) throws IOException {
        if (this.MediaMetadataCompat > this.write || j < this.MediaBrowserCompat$MediaItem) {
            throw new IOException("Cannot reset");
        }
        this.read.reset();
        MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem, j);
        this.MediaMetadataCompat = j;
    }

    private void MediaBrowserCompat$ItemReceiver(long j, long j2) throws IOException {
        while (j < j2) {
            long skip = this.read.skip(j2 - j);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j += skip;
        }
    }

    public final int read() throws IOException {
        if (!this.IconCompatParcelizer) {
            long j = this.MediaMetadataCompat;
            long j2 = this.write;
            if (j + 1 > j2) {
                read(j2 + ((long) this.MediaBrowserCompat$CustomActionResultReceiver));
            }
        }
        int read2 = this.read.read();
        if (read2 != -1) {
            this.MediaMetadataCompat++;
        }
        return read2;
    }

    public final int read(byte[] bArr) throws IOException {
        if (!this.IconCompatParcelizer) {
            long j = this.MediaMetadataCompat;
            if (((long) bArr.length) + j > this.write) {
                read(j + ((long) bArr.length) + ((long) this.MediaBrowserCompat$CustomActionResultReceiver));
            }
        }
        int read2 = this.read.read(bArr);
        if (read2 != -1) {
            this.MediaMetadataCompat += (long) read2;
        }
        return read2;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.IconCompatParcelizer) {
            long j = this.MediaMetadataCompat + ((long) i2);
            if (j > this.write) {
                read(j + ((long) this.MediaBrowserCompat$CustomActionResultReceiver));
            }
        }
        int read2 = this.read.read(bArr, i, i2);
        if (read2 != -1) {
            this.MediaMetadataCompat += (long) read2;
        }
        return read2;
    }

    public final long skip(long j) throws IOException {
        if (!this.IconCompatParcelizer) {
            long j2 = this.MediaMetadataCompat + j;
            if (j2 > this.write) {
                read(j2 + ((long) this.MediaBrowserCompat$CustomActionResultReceiver));
            }
        }
        long skip = this.read.skip(j);
        this.MediaMetadataCompat += skip;
        return skip;
    }

    public final int available() throws IOException {
        return this.read.available();
    }

    public final void close() throws IOException {
        this.read.close();
    }

    public final boolean markSupported() {
        return this.read.markSupported();
    }
}
