package p040o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p040o.CheckParameters;

/* renamed from: o.onStateNotSaved */
public final class onStateNotSaved extends FilterInputStream {
    private final CheckParameters.CheckCountry IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    private int MediaMetadataCompat;
    int read;
    volatile byte[] write;

    public final boolean markSupported() {
        return true;
    }

    public onStateNotSaved(InputStream inputStream, CheckParameters.CheckCountry checkCountry) {
        this(inputStream, checkCountry, (byte) 0);
    }

    private onStateNotSaved(InputStream inputStream, CheckParameters.CheckCountry checkCountry, byte b) {
        super(inputStream);
        this.MediaBrowserCompat$CustomActionResultReceiver = -1;
        this.IconCompatParcelizer = checkCountry;
        this.write = (byte[]) checkCountry.read(65536, byte[].class);
    }

    public final int available() throws IOException {
        int i;
        int i2;
        int available;
        synchronized (this) {
            InputStream inputStream = this.in;
            if (this.write == null || inputStream == null) {
                throw new IOException("BufferedInputStream is closed");
            }
            i = this.MediaBrowserCompat$ItemReceiver;
            i2 = this.MediaMetadataCompat;
            available = inputStream.available();
        }
        return (i - i2) + available;
    }

    public final void IconCompatParcelizer() {
        synchronized (this) {
            if (this.write != null) {
                this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.write);
                this.write = null;
            }
        }
    }

    public final void close() throws IOException {
        if (this.write != null) {
            this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.write);
            this.write = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    private int IconCompatParcelizer(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i != -1) {
            int i2 = this.MediaMetadataCompat;
            int i3 = this.read;
            if (i2 - i < i3) {
                if (i == 0 && i3 > bArr.length && this.MediaBrowserCompat$ItemReceiver == bArr.length) {
                    int length = bArr.length << 1;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.IconCompatParcelizer.read(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.write = bArr2;
                    this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(bArr);
                    bArr = bArr2;
                } else {
                    int i4 = this.MediaBrowserCompat$CustomActionResultReceiver;
                    if (i4 > 0) {
                        System.arraycopy(bArr, i4, bArr, 0, bArr.length - i4);
                    }
                }
                int i5 = this.MediaMetadataCompat - this.MediaBrowserCompat$CustomActionResultReceiver;
                this.MediaMetadataCompat = i5;
                this.MediaBrowserCompat$CustomActionResultReceiver = 0;
                this.MediaBrowserCompat$ItemReceiver = 0;
                int read2 = inputStream.read(bArr, i5, bArr.length - i5);
                int i6 = this.MediaMetadataCompat;
                if (read2 > 0) {
                    i6 += read2;
                }
                this.MediaBrowserCompat$ItemReceiver = i6;
                return read2;
            }
        }
        int read3 = inputStream.read(bArr);
        if (read3 > 0) {
            this.MediaBrowserCompat$CustomActionResultReceiver = -1;
            this.MediaMetadataCompat = 0;
            this.MediaBrowserCompat$ItemReceiver = read3;
        }
        return read3;
    }

    public final void mark(int i) {
        synchronized (this) {
            this.read = Math.max(this.read, i);
            this.MediaBrowserCompat$CustomActionResultReceiver = this.MediaMetadataCompat;
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0018=Splitter:B:11:0x0018, B:27:0x003e=Splitter:B:27:0x003e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read() throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.write     // Catch:{ all -> 0x0046 }
            java.io.InputStream r1 = r5.in     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x003e
            if (r1 == 0) goto L_0x003e
            int r2 = r5.MediaMetadataCompat     // Catch:{ all -> 0x0046 }
            int r3 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0046 }
            r4 = -1
            if (r2 < r3) goto L_0x0018
            int r1 = r5.IconCompatParcelizer(r1, r0)     // Catch:{ all -> 0x0046 }
            if (r1 != r4) goto L_0x0018
            monitor-exit(r5)
            return r4
        L_0x0018:
            byte[] r1 = r5.write     // Catch:{ all -> 0x0046 }
            if (r0 == r1) goto L_0x0029
            byte[] r0 = r5.write     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0021
            goto L_0x0029
        L_0x0021:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = "BufferedInputStream is closed"
            r0.<init>(r1)     // Catch:{ all -> 0x0046 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0029:
            int r1 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0046 }
            int r2 = r5.MediaMetadataCompat     // Catch:{ all -> 0x0046 }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x003c
            int r1 = r5.MediaMetadataCompat     // Catch:{ all -> 0x0046 }
            int r2 = r1 + 1
            r5.MediaMetadataCompat = r2     // Catch:{ all -> 0x0046 }
            byte r0 = r0[r1]     // Catch:{ all -> 0x0046 }
            monitor-exit(r5)
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
        L_0x003c:
            monitor-exit(r5)
            return r4
        L_0x003e:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = "BufferedInputStream is closed"
            r0.<init>(r1)     // Catch:{ all -> 0x0046 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onStateNotSaved.read():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004e, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005a, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(byte[] r6, int r7, int r8) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.write     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x009c
            if (r8 != 0) goto L_0x000a
            monitor-exit(r5)
            r6 = 0
            return r6
        L_0x000a:
            java.io.InputStream r1 = r5.in     // Catch:{ all -> 0x00a4 }
            if (r1 == 0) goto L_0x0094
            int r2 = r5.MediaMetadataCompat     // Catch:{ all -> 0x00a4 }
            int r3 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x00a4 }
            if (r2 >= r3) goto L_0x003a
            int r2 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x00a4 }
            int r3 = r5.MediaMetadataCompat     // Catch:{ all -> 0x00a4 }
            int r2 = r2 - r3
            if (r2 < r8) goto L_0x001d
            r2 = r8
            goto L_0x0022
        L_0x001d:
            int r2 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x00a4 }
            int r3 = r5.MediaMetadataCompat     // Catch:{ all -> 0x00a4 }
            int r2 = r2 - r3
        L_0x0022:
            int r3 = r5.MediaMetadataCompat     // Catch:{ all -> 0x00a4 }
            java.lang.System.arraycopy(r0, r3, r6, r7, r2)     // Catch:{ all -> 0x00a4 }
            int r3 = r5.MediaMetadataCompat     // Catch:{ all -> 0x00a4 }
            int r3 = r3 + r2
            r5.MediaMetadataCompat = r3     // Catch:{ all -> 0x00a4 }
            if (r2 == r8) goto L_0x0038
            int r3 = r1.available()     // Catch:{ all -> 0x00a4 }
            if (r3 == 0) goto L_0x0038
            int r7 = r7 + r2
            int r2 = r8 - r2
            goto L_0x003b
        L_0x0038:
            monitor-exit(r5)
            return r2
        L_0x003a:
            r2 = r8
        L_0x003b:
            int r3 = r5.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00a4 }
            r4 = -1
            if (r3 != r4) goto L_0x004f
            int r3 = r0.length     // Catch:{ all -> 0x00a4 }
            if (r2 < r3) goto L_0x004f
            int r3 = r1.read(r6, r7, r2)     // Catch:{ all -> 0x00a4 }
            if (r3 != r4) goto L_0x0084
            if (r2 == r8) goto L_0x004d
            int r4 = r8 - r2
        L_0x004d:
            monitor-exit(r5)
            return r4
        L_0x004f:
            int r3 = r5.IconCompatParcelizer(r1, r0)     // Catch:{ all -> 0x00a4 }
            if (r3 != r4) goto L_0x005b
            if (r2 == r8) goto L_0x0059
            int r4 = r8 - r2
        L_0x0059:
            monitor-exit(r5)
            return r4
        L_0x005b:
            byte[] r3 = r5.write     // Catch:{ all -> 0x00a4 }
            if (r0 == r3) goto L_0x006c
            byte[] r0 = r5.write     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ all -> 0x00a4 }
            java.lang.String r7 = "BufferedInputStream is closed"
            r6.<init>(r7)     // Catch:{ all -> 0x00a4 }
            throw r6     // Catch:{ all -> 0x00a4 }
        L_0x006c:
            int r3 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x00a4 }
            int r4 = r5.MediaMetadataCompat     // Catch:{ all -> 0x00a4 }
            int r3 = r3 - r4
            if (r3 < r2) goto L_0x0075
            r3 = r2
            goto L_0x007a
        L_0x0075:
            int r3 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x00a4 }
            int r4 = r5.MediaMetadataCompat     // Catch:{ all -> 0x00a4 }
            int r3 = r3 - r4
        L_0x007a:
            int r4 = r5.MediaMetadataCompat     // Catch:{ all -> 0x00a4 }
            java.lang.System.arraycopy(r0, r4, r6, r7, r3)     // Catch:{ all -> 0x00a4 }
            int r4 = r5.MediaMetadataCompat     // Catch:{ all -> 0x00a4 }
            int r4 = r4 + r3
            r5.MediaMetadataCompat = r4     // Catch:{ all -> 0x00a4 }
        L_0x0084:
            int r2 = r2 - r3
            if (r2 != 0) goto L_0x0089
            monitor-exit(r5)
            return r8
        L_0x0089:
            int r4 = r1.available()     // Catch:{ all -> 0x00a4 }
            if (r4 != 0) goto L_0x0092
            monitor-exit(r5)
            int r8 = r8 - r2
            return r8
        L_0x0092:
            int r7 = r7 + r3
            goto L_0x003b
        L_0x0094:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ all -> 0x00a4 }
            java.lang.String r7 = "BufferedInputStream is closed"
            r6.<init>(r7)     // Catch:{ all -> 0x00a4 }
            throw r6     // Catch:{ all -> 0x00a4 }
        L_0x009c:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ all -> 0x00a4 }
            java.lang.String r7 = "BufferedInputStream is closed"
            r6.<init>(r7)     // Catch:{ all -> 0x00a4 }
            throw r6     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onStateNotSaved.read(byte[], int, int):int");
    }

    public final void reset() throws IOException {
        synchronized (this) {
            if (this.write == null) {
                throw new IOException("Stream is closed");
            } else if (-1 != this.MediaBrowserCompat$CustomActionResultReceiver) {
                this.MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Mark has been invalidated, pos: ");
                sb.append(this.MediaMetadataCompat);
                sb.append(" markLimit: ");
                sb.append(this.read);
                throw new onStateNotSaved$MediaBrowserCompat$ItemReceiver(sb.toString());
            }
        }
    }

    public final long skip(long j) throws IOException {
        synchronized (this) {
            if (j < 1) {
                return 0;
            }
            byte[] bArr = this.write;
            if (bArr != null) {
                InputStream inputStream = this.in;
                if (inputStream == null) {
                    throw new IOException("BufferedInputStream is closed");
                } else if (((long) (this.MediaBrowserCompat$ItemReceiver - this.MediaMetadataCompat)) >= j) {
                    this.MediaMetadataCompat = (int) (((long) this.MediaMetadataCompat) + j);
                    return j;
                } else {
                    long j2 = ((long) this.MediaBrowserCompat$ItemReceiver) - ((long) this.MediaMetadataCompat);
                    this.MediaMetadataCompat = this.MediaBrowserCompat$ItemReceiver;
                    if (this.MediaBrowserCompat$CustomActionResultReceiver == -1 || j > ((long) this.read)) {
                        long skip = inputStream.skip(j - j2);
                        return j2 + skip;
                    } else if (IconCompatParcelizer(inputStream, bArr) == -1) {
                        return j2;
                    } else {
                        if (((long) (this.MediaBrowserCompat$ItemReceiver - this.MediaMetadataCompat)) >= j - j2) {
                            this.MediaMetadataCompat = (int) ((((long) this.MediaMetadataCompat) + j) - j2);
                            return j;
                        }
                        long j3 = (long) this.MediaBrowserCompat$ItemReceiver;
                        long j4 = (long) this.MediaMetadataCompat;
                        this.MediaMetadataCompat = this.MediaBrowserCompat$ItemReceiver;
                        return (j2 + j3) - j4;
                    }
                }
            } else {
                throw new IOException("BufferedInputStream is closed");
            }
        }
    }
}
