package p040o;

import java.util.Arrays;

/* renamed from: o.getChildFragmentManager$MediaBrowserCompat$CustomActionResultReceiver */
public abstract class C1323x727ec744<E, T_ARR, T_CONS> implements Iterable<E> {
    int IconCompatParcelizer;
    long[] MediaBrowserCompat$CustomActionResultReceiver;
    public T_ARR MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver(16);
    T_ARR[] read;
    public int write;

    /* access modifiers changed from: protected */
    public abstract int MediaBrowserCompat$CustomActionResultReceiver(T_ARR t_arr);

    /* access modifiers changed from: protected */
    public abstract T_ARR MediaBrowserCompat$CustomActionResultReceiver(int i);

    /* access modifiers changed from: protected */
    public abstract T_ARR[] MediaBrowserCompat$ItemReceiver();

    C1323x727ec744() {
    }

    public final long write() {
        int i = this.IconCompatParcelizer;
        return i == 0 ? (long) this.write : this.MediaBrowserCompat$CustomActionResultReceiver[i] + ((long) this.write);
    }

    private long MediaMetadataCompat() {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            return (long) MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
        }
        return ((long) MediaBrowserCompat$CustomActionResultReceiver(this.read[i])) + this.MediaBrowserCompat$CustomActionResultReceiver[i];
    }

    private void read() {
        if (this.read == null) {
            T_ARR[] MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
            this.read = MediaBrowserCompat$ItemReceiver2;
            this.MediaBrowserCompat$CustomActionResultReceiver = new long[8];
            MediaBrowserCompat$ItemReceiver2[0] = this.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* access modifiers changed from: package-private */
    public final int read(long j) {
        if (this.IconCompatParcelizer == 0) {
            if (j < ((long) this.write)) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        } else if (j < write()) {
            for (int i = 0; i <= this.IconCompatParcelizer; i++) {
                if (j < this.MediaBrowserCompat$CustomActionResultReceiver[i] + ((long) MediaBrowserCompat$CustomActionResultReceiver(this.read[i]))) {
                    return i;
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
    }

    public final T_ARR IconCompatParcelizer() {
        long write2 = write();
        if (write2 < 2147483639) {
            T_ARR MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver((int) write2);
            long write3 = write();
            if (write3 > ((long) MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2)) || write3 < 0) {
                throw new IndexOutOfBoundsException("does not fit");
            }
            if (this.IconCompatParcelizer == 0) {
                System.arraycopy(this.MediaBrowserCompat$ItemReceiver, 0, MediaBrowserCompat$CustomActionResultReceiver2, 0, this.write);
            } else {
                int i = 0;
                for (int i2 = 0; i2 < this.IconCompatParcelizer; i2++) {
                    T_ARR[] t_arrArr = this.read;
                    System.arraycopy(t_arrArr[i2], 0, MediaBrowserCompat$CustomActionResultReceiver2, i, MediaBrowserCompat$CustomActionResultReceiver(t_arrArr[i2]));
                    i += MediaBrowserCompat$CustomActionResultReceiver(this.read[i2]);
                }
                int i3 = this.write;
                if (i3 > 0) {
                    System.arraycopy(this.MediaBrowserCompat$ItemReceiver, 0, MediaBrowserCompat$CustomActionResultReceiver2, i, i3);
                }
            }
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        int i;
        if (this.write == MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver)) {
            read();
            int i2 = this.IconCompatParcelizer;
            T_ARR[] t_arrArr = this.read;
            int i3 = i2 + 1;
            if (i3 >= t_arrArr.length || t_arrArr[i3] == null) {
                long MediaMetadataCompat = MediaMetadataCompat() + 1;
                long MediaMetadataCompat2 = MediaMetadataCompat();
                if (MediaMetadataCompat > MediaMetadataCompat2) {
                    read();
                    int i4 = this.IconCompatParcelizer;
                    while (true) {
                        i4++;
                        if (MediaMetadataCompat <= MediaMetadataCompat2) {
                            break;
                        }
                        T_ARR[] t_arrArr2 = this.read;
                        if (i4 >= t_arrArr2.length) {
                            int length = t_arrArr2.length << 1;
                            this.read = Arrays.copyOf(t_arrArr2, length);
                            this.MediaBrowserCompat$CustomActionResultReceiver = Arrays.copyOf(this.MediaBrowserCompat$CustomActionResultReceiver, length);
                        }
                        if (i4 == 0 || i4 == 1) {
                            i = 4;
                        } else {
                            i = Math.min((i4 + 4) - 1, 30);
                        }
                        int i5 = 1 << i;
                        this.read[i4] = MediaBrowserCompat$CustomActionResultReceiver(i5);
                        long[] jArr = this.MediaBrowserCompat$CustomActionResultReceiver;
                        int i6 = i4 - 1;
                        jArr[i4] = jArr[i6] + ((long) MediaBrowserCompat$CustomActionResultReceiver(this.read[i6]));
                        MediaMetadataCompat2 += (long) i5;
                    }
                }
            }
            this.write = 0;
            int i7 = this.IconCompatParcelizer + 1;
            this.IconCompatParcelizer = i7;
            this.MediaBrowserCompat$ItemReceiver = this.read[i7];
        }
    }
}
