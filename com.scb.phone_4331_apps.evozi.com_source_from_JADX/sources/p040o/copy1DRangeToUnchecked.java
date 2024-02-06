package p040o;

import com.drew.lang.BufferBoundsException;
import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* renamed from: o.copy1DRangeToUnchecked */
public final class copy1DRangeToUnchecked extends C10820Allocation {
    private final ArrayList<byte[]> IconCompatParcelizer;
    private final int MediaBrowserCompat$ItemReceiver;
    private long MediaBrowserCompat$MediaItem;
    private final InputStream read;
    private boolean write;

    public copy1DRangeToUnchecked(InputStream inputStream) {
        this(inputStream, -1);
    }

    public copy1DRangeToUnchecked(InputStream inputStream, long j) {
        this.IconCompatParcelizer = new ArrayList<>();
        if (inputStream != null) {
            this.MediaBrowserCompat$ItemReceiver = 2048;
            this.read = inputStream;
            this.MediaBrowserCompat$MediaItem = j;
            return;
        }
        throw null;
    }

    public final long MediaBrowserCompat$ItemReceiver() throws IOException {
        long j = this.MediaBrowserCompat$MediaItem;
        if (j != -1) {
            return j;
        }
        read(Api.BaseClientBuilder.API_PRIORITY_OTHER, 1);
        return this.MediaBrowserCompat$MediaItem;
    }

    /* access modifiers changed from: protected */
    public final void write(int i, int i2) throws IOException {
        if (i < 0) {
            throw new BufferBoundsException(String.format("Attempt to read from buffer using a negative index (%d)", new Object[]{Integer.valueOf(i)}));
        } else if (i2 < 0) {
            throw new BufferBoundsException("Number of requested bytes must be zero or greater");
        } else if ((((long) i) + ((long) i2)) - 1 > 2147483647L) {
            throw new BufferBoundsException(String.format("Number of requested bytes summed with starting index exceed maximum range of signed 32 bit integers (requested index: %d, requested count: %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        } else if (!read(i, i2)) {
            throw new BufferBoundsException(i, i2, this.MediaBrowserCompat$MediaItem);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean read(int i, int i2) throws IOException {
        if (i < 0 || i2 < 0) {
            return false;
        }
        long j = (((long) i) + ((long) i2)) - 1;
        if (j > 2147483647L) {
            return false;
        }
        int i3 = (int) j;
        if (!this.write) {
            int i4 = i3 / 2048;
            while (i4 >= this.IconCompatParcelizer.size()) {
                byte[] bArr = new byte[2048];
                int i5 = 0;
                while (!this.write && i5 != 2048) {
                    int read2 = this.read.read(bArr, i5, 2048 - i5);
                    if (read2 == -1) {
                        this.write = true;
                        int size = (this.IconCompatParcelizer.size() << 11) + i5;
                        if (this.MediaBrowserCompat$MediaItem == -1) {
                            this.MediaBrowserCompat$MediaItem = (long) size;
                        }
                        if (((long) i3) >= this.MediaBrowserCompat$MediaItem) {
                            this.IconCompatParcelizer.add(bArr);
                            return false;
                        }
                    } else {
                        i5 += read2;
                    }
                }
                this.IconCompatParcelizer.add(bArr);
            }
            return true;
        } else if (((long) i3) < this.MediaBrowserCompat$MediaItem) {
            return true;
        } else {
            return false;
        }
    }

    public final byte read(int i) throws IOException {
        return this.IconCompatParcelizer.get(i / 2048)[i % 2048];
    }

    public final byte[] MediaBrowserCompat$ItemReceiver(int i, int i2) throws IOException {
        write(i, i2);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i2 != 0) {
            int i4 = i % 2048;
            int min = Math.min(i2, 2048 - i4);
            System.arraycopy(this.IconCompatParcelizer.get(i / 2048), i4, bArr, i3, min);
            i2 -= min;
            i += min;
            i3 += min;
        }
        return bArr;
    }
}
