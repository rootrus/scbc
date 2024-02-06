package p040o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.stopLoading */
public final class stopLoading {
    private static final AtomicReference<byte[]> MediaBrowserCompat$ItemReceiver = new AtomicReference<>();

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|(2:12|13)|14|15|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0051 A[SYNTHETIC, Splitter:B:30:0x0051] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0056 A[SYNTHETIC, Splitter:B:34:0x0056] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer read(java.io.File r9) throws java.io.IOException {
        /*
            r0 = 0
            long r5 = r9.length()     // Catch:{ all -> 0x004d }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0045
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x003d
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ all -> 0x004d }
            java.lang.String r1 = "r"
            r7.<init>(r9, r1)     // Catch:{ all -> 0x004d }
            java.nio.channels.FileChannel r9 = r7.getChannel()     // Catch:{ all -> 0x0035 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0033 }
            r3 = 0
            r1 = r9
            java.nio.MappedByteBuffer r0 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0033 }
            java.nio.MappedByteBuffer r0 = r0.load()     // Catch:{ all -> 0x0033 }
            if (r9 == 0) goto L_0x002f
            r9.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            r7.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r0
        L_0x0033:
            r0 = move-exception
            goto L_0x0039
        L_0x0035:
            r9 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
        L_0x0039:
            r8 = r0
            r0 = r9
            r9 = r8
            goto L_0x004f
        L_0x003d:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x004d }
            java.lang.String r1 = "File unsuitable for memory mapping"
            r9.<init>(r1)     // Catch:{ all -> 0x004d }
            throw r9     // Catch:{ all -> 0x004d }
        L_0x0045:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x004d }
            java.lang.String r1 = "File too large to map into memory"
            r9.<init>(r1)     // Catch:{ all -> 0x004d }
            throw r9     // Catch:{ all -> 0x004d }
        L_0x004d:
            r9 = move-exception
            r7 = r0
        L_0x004f:
            if (r0 == 0) goto L_0x0054
            r0.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            if (r7 == 0) goto L_0x0059
            r7.close()     // Catch:{ IOException -> 0x0059 }
        L_0x0059:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.stopLoading.read(java.io.File):java.nio.ByteBuffer");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|(2:8|9)|10|11|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0021 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002e A[SYNTHETIC, Splitter:B:19:0x002e] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0033 A[SYNTHETIC, Splitter:B:23:0x0033] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void MediaBrowserCompat$ItemReceiver(java.nio.ByteBuffer r4, java.io.File r5) throws java.io.IOException {
        /*
            r0 = 0
            r4.position(r0)
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x002a }
            java.lang.String r3 = "rw"
            r2.<init>(r5, r3)     // Catch:{ all -> 0x002a }
            java.nio.channels.FileChannel r5 = r2.getChannel()     // Catch:{ all -> 0x0028 }
            r5.write(r4)     // Catch:{ all -> 0x0025 }
            r5.force(r0)     // Catch:{ all -> 0x0025 }
            r5.close()     // Catch:{ all -> 0x0025 }
            r2.close()     // Catch:{ all -> 0x0025 }
            if (r5 == 0) goto L_0x0021
            r5.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            r2.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            return
        L_0x0025:
            r4 = move-exception
            r1 = r5
            goto L_0x002c
        L_0x0028:
            r4 = move-exception
            goto L_0x002c
        L_0x002a:
            r4 = move-exception
            r2 = r1
        L_0x002c:
            if (r1 == 0) goto L_0x0031
            r1.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            if (r2 == 0) goto L_0x0036
            r2.close()     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.stopLoading.MediaBrowserCompat$ItemReceiver(java.nio.ByteBuffer, java.io.File):void");
    }

    public static InputStream IconCompatParcelizer(ByteBuffer byteBuffer) {
        return new write(byteBuffer);
    }

    /* renamed from: o.stopLoading$write */
    static class write extends InputStream {
        private final ByteBuffer IconCompatParcelizer;
        private int MediaBrowserCompat$ItemReceiver = -1;

        public final boolean markSupported() {
            return true;
        }

        write(ByteBuffer byteBuffer) {
            this.IconCompatParcelizer = byteBuffer;
        }

        public final int available() {
            return this.IconCompatParcelizer.remaining();
        }

        public final int read() {
            if (!this.IconCompatParcelizer.hasRemaining()) {
                return -1;
            }
            return this.IconCompatParcelizer.get() & 255;
        }

        public final void mark(int i) {
            synchronized (this) {
                this.MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.position();
            }
        }

        public final int read(byte[] bArr, int i, int i2) throws IOException {
            if (!this.IconCompatParcelizer.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i2, available());
            this.IconCompatParcelizer.get(bArr, i, min);
            return min;
        }

        public final void reset() throws IOException {
            synchronized (this) {
                if (this.MediaBrowserCompat$ItemReceiver != -1) {
                    this.IconCompatParcelizer.position(this.MediaBrowserCompat$ItemReceiver);
                } else {
                    throw new IOException("Cannot reset to unset mark position");
                }
            }
        }

        public final long skip(long j) throws IOException {
            if (!this.IconCompatParcelizer.hasRemaining()) {
                return -1;
            }
            long min = Math.min(j, (long) available());
            ByteBuffer byteBuffer = this.IconCompatParcelizer;
            byteBuffer.position((int) (((long) byteBuffer.position()) + min));
            return min;
        }
    }

    public static byte[] read(ByteBuffer byteBuffer) {
        stopLoading$MediaBrowserCompat$ItemReceiver stoploading_mediabrowsercompat_itemreceiver = (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) ? null : new stopLoading$MediaBrowserCompat$ItemReceiver(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        if (stoploading_mediabrowsercompat_itemreceiver != null && stoploading_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver == 0 && stoploading_mediabrowsercompat_itemreceiver.IconCompatParcelizer == stoploading_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        asReadOnlyBuffer.position(0);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }
}
