package p040o;

import com.google.zxing.NotFoundException;

/* renamed from: o.rsnScriptSetVarD */
public class rsnScriptSetVarD extends rsnElementCreate2 {
    private static final byte[] IconCompatParcelizer = new byte[0];
    private final int[] MediaBrowserCompat$ItemReceiver = new int[32];
    private byte[] write = IconCompatParcelizer;

    public rsnScriptSetVarD(rsnIncElementCreate rsnincelementcreate) {
        super(rsnincelementcreate);
    }

    public rsnElementCreate2 MediaBrowserCompat$CustomActionResultReceiver(rsnIncElementCreate rsnincelementcreate) {
        return new rsnScriptSetVarD(rsnincelementcreate);
    }

    private void write(int i) {
        if (this.write.length < i) {
            this.write = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.MediaBrowserCompat$ItemReceiver[i2] = 0;
        }
    }

    private static int write(int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (iArr[i4] > i) {
                i = iArr[i4];
                i3 = i4;
            }
            if (iArr[i4] > i2) {
                i2 = iArr[i4];
            }
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 - i3;
            int i9 = iArr[i7] * i8 * i8;
            if (i9 > i6) {
                i5 = i7;
                i6 = i9;
            }
        }
        if (i3 <= i5) {
            int i10 = i3;
            i3 = i5;
            i5 = i10;
        }
        if (i3 - i5 > length / 16) {
            int i11 = i3 - 1;
            int i12 = -1;
            int i13 = i11;
            while (i11 > i5) {
                int i14 = i11 - i5;
                int i15 = i14 * i14 * (i3 - i11) * (i2 - iArr[i11]);
                if (i15 > i12) {
                    i13 = i11;
                    i12 = i15;
                }
                i11--;
            }
            return i13 << 3;
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public rsnScriptSetVarI read() throws NotFoundException {
        rsnIncElementCreate rsnincelementcreate = this.read;
        int i = rsnincelementcreate.IconCompatParcelizer;
        int i2 = rsnincelementcreate.MediaBrowserCompat$ItemReceiver;
        rsnScriptSetVarI rsnscriptsetvari = new rsnScriptSetVarI(i, i2);
        write(i);
        int[] iArr = this.MediaBrowserCompat$ItemReceiver;
        for (int i3 = 1; i3 < 5; i3++) {
            byte[] read = rsnincelementcreate.read((i2 * i3) / 5, this.write);
            int i4 = (i << 2) / 5;
            for (int i5 = i / 5; i5 < i4; i5++) {
                int i6 = (read[i5] & 255) >> 3;
                iArr[i6] = iArr[i6] + 1;
            }
        }
        int write2 = write(iArr);
        byte[] MediaBrowserCompat$ItemReceiver2 = rsnincelementcreate.MediaBrowserCompat$ItemReceiver();
        for (int i7 = 0; i7 < i2; i7++) {
            for (int i8 = 0; i8 < i; i8++) {
                if ((MediaBrowserCompat$ItemReceiver2[(i7 * i) + i8] & 255) < write2) {
                    int i9 = (rsnscriptsetvari.read * i7) + (i8 / 32);
                    int[] iArr2 = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver;
                    iArr2[i9] = (1 << (i8 & 31)) | iArr2[i9];
                }
            }
        }
        return rsnscriptsetvari;
    }

    public final rsnScriptIntrinsicCreate IconCompatParcelizer(int i, rsnScriptIntrinsicCreate rsnscriptintrinsiccreate) throws NotFoundException {
        rsnIncElementCreate rsnincelementcreate = this.read;
        int i2 = rsnincelementcreate.IconCompatParcelizer;
        if (rsnscriptintrinsiccreate == null || rsnscriptintrinsiccreate.read < i2) {
            rsnscriptintrinsiccreate = new rsnScriptIntrinsicCreate(i2);
        } else {
            int length = rsnscriptintrinsiccreate.write.length;
            for (int i3 = 0; i3 < length; i3++) {
                rsnscriptintrinsiccreate.write[i3] = 0;
            }
        }
        write(i2);
        byte[] read = rsnincelementcreate.read(i, this.write);
        int[] iArr = this.MediaBrowserCompat$ItemReceiver;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = (read[i4] & 255) >> 3;
            iArr[i5] = iArr[i5] + 1;
        }
        int write2 = write(iArr);
        if (i2 < 3) {
            for (int i6 = 0; i6 < i2; i6++) {
                if ((read[i6] & 255) < write2) {
                    int[] iArr2 = rsnscriptintrinsiccreate.write;
                    int i7 = i6 / 32;
                    iArr2[i7] = (1 << (i6 & 31)) | iArr2[i7];
                }
            }
        } else {
            int i8 = 1;
            byte b = read[0] & 255;
            byte b2 = read[1] & 255;
            while (i8 < i2 - 1) {
                int i9 = i8 + 1;
                byte b3 = read[i9] & 255;
                if ((((b2 << 2) - b) - b3) / 2 < write2) {
                    int[] iArr3 = rsnscriptintrinsiccreate.write;
                    int i10 = i8 / 32;
                    iArr3[i10] = (1 << (i8 & 31)) | iArr3[i10];
                }
                b = b2;
                i8 = i9;
                b2 = b3;
            }
        }
        return rsnscriptintrinsiccreate;
    }
}
