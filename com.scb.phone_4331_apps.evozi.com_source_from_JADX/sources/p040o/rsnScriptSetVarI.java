package p040o;

import java.util.Arrays;

/* renamed from: o.rsnScriptSetVarI */
public final class rsnScriptSetVarI implements Cloneable {
    public final int IconCompatParcelizer;
    public final int[] MediaBrowserCompat$CustomActionResultReceiver;
    public final int read;
    public final int write;

    public rsnScriptSetVarI(int i) {
        this(i, i);
    }

    public rsnScriptSetVarI(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.IconCompatParcelizer = i;
        this.write = i2;
        int i3 = (i + 31) / 32;
        this.read = i3;
        this.MediaBrowserCompat$CustomActionResultReceiver = new int[(i3 * i2)];
    }

    private rsnScriptSetVarI(int i, int i2, int i3, int[] iArr) {
        this.IconCompatParcelizer = i;
        this.write = i2;
        this.read = i3;
        this.MediaBrowserCompat$CustomActionResultReceiver = iArr;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(int i, int i2) {
        return ((this.MediaBrowserCompat$CustomActionResultReceiver[(i2 * this.read) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public final void IconCompatParcelizer(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.write || i5 > this.IconCompatParcelizer) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.read;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.MediaBrowserCompat$CustomActionResultReceiver;
                    int i9 = (i8 / 32) + (i7 * i2);
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    public final int[] IconCompatParcelizer() {
        int i = 0;
        while (true) {
            int[] iArr = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (i >= iArr.length || iArr[i] != 0) {
                int[] iArr2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            } else {
                i++;
            }
        }
        int[] iArr22 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i == iArr22.length) {
            return null;
        }
        int i2 = this.read;
        int i3 = i / i2;
        int i4 = 0;
        while ((iArr22[i] << (31 - i4)) == 0) {
            i4++;
        }
        return new int[]{((i % i2) << 5) + i4, i3};
    }

    public final int[] write() {
        int length = this.MediaBrowserCompat$CustomActionResultReceiver.length - 1;
        while (length >= 0 && this.MediaBrowserCompat$CustomActionResultReceiver[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.read;
        int i2 = length / i;
        int i3 = 31;
        while ((this.MediaBrowserCompat$CustomActionResultReceiver[length] >>> i3) == 0) {
            i3--;
        }
        return new int[]{((length % i) << 5) + i3, i2};
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rsnScriptSetVarI)) {
            return false;
        }
        rsnScriptSetVarI rsnscriptsetvari = (rsnScriptSetVarI) obj;
        if (this.IconCompatParcelizer == rsnscriptsetvari.IconCompatParcelizer && this.write == rsnscriptsetvari.write && this.read == rsnscriptsetvari.read && Arrays.equals(this.MediaBrowserCompat$CustomActionResultReceiver, rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        return (((((((i * 31) + i) * 31) + this.write) * 31) + this.read) * 31) + Arrays.hashCode(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final rsnScriptSetVarI MediaBrowserCompat$ItemReceiver() {
        return new rsnScriptSetVarI(this.IconCompatParcelizer, this.write, this.read, (int[]) this.MediaBrowserCompat$CustomActionResultReceiver.clone());
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new rsnScriptSetVarI(this.IconCompatParcelizer, this.write, this.read, (int[]) this.MediaBrowserCompat$CustomActionResultReceiver.clone());
    }

    public final rsnScriptIntrinsicCreate write(int i, rsnScriptIntrinsicCreate rsnscriptintrinsiccreate) {
        if (rsnscriptintrinsiccreate == null || rsnscriptintrinsiccreate.read < this.IconCompatParcelizer) {
            rsnscriptintrinsiccreate = new rsnScriptIntrinsicCreate(this.IconCompatParcelizer);
        } else {
            int length = rsnscriptintrinsiccreate.write.length;
            for (int i2 = 0; i2 < length; i2++) {
                rsnscriptintrinsiccreate.write[i2] = 0;
            }
        }
        int i3 = this.read;
        for (int i4 = 0; i4 < this.read; i4++) {
            rsnscriptintrinsiccreate.write[(i4 << 5) / 32] = this.MediaBrowserCompat$CustomActionResultReceiver[(i * i3) + i4];
        }
        return rsnscriptintrinsiccreate;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.write * (this.IconCompatParcelizer + 1));
        for (int i = 0; i < this.write; i++) {
            for (int i2 = 0; i2 < this.IconCompatParcelizer; i2++) {
                sb.append(MediaBrowserCompat$ItemReceiver(i2, i) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
