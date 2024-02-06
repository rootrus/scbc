package p040o;

import com.drew.lang.BufferBoundsException;
import java.io.IOException;

/* renamed from: o.StaggeredGridLayoutManager */
public final class StaggeredGridLayoutManager extends C10820Allocation {
    private final int MediaBrowserCompat$ItemReceiver;
    private final byte[] write;

    public StaggeredGridLayoutManager(byte[] bArr) {
        this(bArr, (byte) 0);
    }

    private StaggeredGridLayoutManager(byte[] bArr, byte b) {
        if (bArr != null) {
            this.write = bArr;
            this.MediaBrowserCompat$ItemReceiver = 0;
            return;
        }
        throw null;
    }

    public final long MediaBrowserCompat$ItemReceiver() {
        return (long) this.write.length;
    }

    /* access modifiers changed from: protected */
    public final void write(int i, int i2) throws IOException {
        if (!read(i, i2)) {
            throw new BufferBoundsException(i, i2, (long) this.write.length);
        }
    }

    public final byte read(int i) throws IOException {
        if (read(i, 1)) {
            return this.write[i];
        }
        throw new BufferBoundsException(i, 1, (long) this.write.length);
    }

    public final byte[] MediaBrowserCompat$ItemReceiver(int i, int i2) throws IOException {
        if (read(i, i2)) {
            byte[] bArr = new byte[i2];
            System.arraycopy(this.write, i, bArr, 0, i2);
            return bArr;
        }
        throw new BufferBoundsException(i, i2, (long) this.write.length);
    }

    /* access modifiers changed from: protected */
    public final boolean read(int i, int i2) throws IOException {
        return i2 >= 0 && i >= 0 && (((long) i) + ((long) i2)) - 1 < ((long) this.write.length);
    }
}
