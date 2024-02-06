package p040o;

import java.util.Arrays;
import okhttp3.internal.p089ws.WebSocketProtocol;

/* renamed from: o.rsnScriptIntrinsicCreate */
public final class rsnScriptIntrinsicCreate implements Cloneable {
    public int read;
    public int[] write;

    public rsnScriptIntrinsicCreate() {
        this.read = 0;
        this.write = new int[1];
    }

    public rsnScriptIntrinsicCreate(int i) {
        this.read = i;
        this.write = new int[((i + 31) / 32)];
    }

    private rsnScriptIntrinsicCreate(int[] iArr, int i) {
        this.write = iArr;
        this.read = i;
    }

    private void MediaBrowserCompat$ItemReceiver(int i) {
        int[] iArr = this.write;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[((i + 31) / 32)];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.write = iArr2;
        }
    }

    public final int read(int i) {
        int i2 = this.read;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & this.write[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.write;
            if (i3 == iArr.length) {
                return this.read;
            }
            i4 = iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.read;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    public final int write(int i) {
        int i2 = this.read;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & (~this.write[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.write;
            if (i3 == iArr.length) {
                return this.read;
            }
            i4 = ~iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.read;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    public final boolean IconCompatParcelizer(int i, int i2) {
        if (i2 < i || i < 0 || i2 > this.read) {
            throw new IllegalArgumentException();
        } else if (i2 == i) {
            return true;
        } else {
            int i3 = i2 - 1;
            int i4 = i / 32;
            int i5 = i3 / 32;
            int i6 = i4;
            while (i6 <= i5) {
                int i7 = 31;
                int i8 = i6 > i4 ? 0 : i & 31;
                if (i6 >= i5) {
                    i7 = 31 & i3;
                }
                if ((((2 << i7) - (1 << i8)) & this.write[i6]) != 0) {
                    return false;
                }
                i6++;
            }
            return true;
        }
    }

    public final void read(boolean z) {
        MediaBrowserCompat$ItemReceiver(this.read + 1);
        if (z) {
            int[] iArr = this.write;
            int i = this.read;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.read++;
    }

    public final void write(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        MediaBrowserCompat$ItemReceiver(this.read + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            read(z);
            i2--;
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate) {
        int i = rsnscriptintrinsiccreate.read;
        MediaBrowserCompat$ItemReceiver(this.read + i);
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = true;
            if (((1 << (i2 & 31)) & rsnscriptintrinsiccreate.write[i2 / 32]) == 0) {
                z = false;
            }
            read(z);
        }
    }

    public final void IconCompatParcelizer() {
        int[] iArr = new int[this.write.length];
        int i = (this.read - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = (long) this.write[i3];
            long j2 = ((j >> 1) & 1431655765) | ((j & 1431655765) << 1);
            long j3 = ((j2 >> 2) & 858993459) | ((j2 & 858993459) << 2);
            long j4 = ((j3 >> 4) & 252645135) | ((j3 & 252645135) << 4);
            long j5 = ((j4 >> 8) & 16711935) | ((j4 & 16711935) << 8);
            iArr[i - i3] = (int) (((j5 >> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX) | ((j5 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16));
        }
        int i4 = this.read;
        int i5 = i2 << 5;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i2 - 1] = i7;
        }
        this.write = iArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rsnScriptIntrinsicCreate)) {
            return false;
        }
        rsnScriptIntrinsicCreate rsnscriptintrinsiccreate = (rsnScriptIntrinsicCreate) obj;
        if (this.read != rsnscriptintrinsiccreate.read || !Arrays.equals(this.write, rsnscriptintrinsiccreate.write)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.read * 31) + Arrays.hashCode(this.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.read);
        for (int i = 0; i < this.read; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            boolean z = true;
            if (((1 << (i & 31)) & this.write[i / 32]) == 0) {
                z = false;
            }
            sb.append(z ? 'X' : '.');
        }
        return sb.toString();
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new rsnScriptIntrinsicCreate((int[]) this.write.clone(), this.read);
    }

    public final void read(int i, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < 8; i5++) {
                if (((1 << (i & 31)) & this.write[i / 32]) != 0) {
                    i4 |= 1 << (7 - i5);
                }
                i++;
            }
            bArr[i3] = (byte) i4;
        }
    }
}
