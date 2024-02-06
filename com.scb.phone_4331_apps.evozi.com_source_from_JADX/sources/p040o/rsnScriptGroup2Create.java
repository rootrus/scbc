package p040o;

import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import com.pingan.p031ai.C8677p;
import java.util.Arrays;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.getMaskAnimations;

/* renamed from: o.rsnScriptGroup2Create */
public final class rsnScriptGroup2Create {
    private static final String[] IconCompatParcelizer = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] MediaBrowserCompat$CustomActionResultReceiver = {"CTRL_PS", " ", "a", "b", "c", KtaJsonExactionHelper.OBJECT, "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", C8677p.f5438a, "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] MediaBrowserCompat$ItemReceiver = {"CTRL_PS", " ", "0", DiskLruCache.VERSION_1, "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};
    private static final String[] read = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    private static final String[] write = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};
    private rsnScriptForEachClipped MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: o.rsnScriptGroup2Create$write */
    enum write {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    public final getMaskAnimations.read MediaBrowserCompat$CustomActionResultReceiver(rsnScriptForEachClipped rsnscriptforeachclipped) throws FormatException {
        String str;
        int i;
        rsnScriptForEachClipped rsnscriptforeachclipped2 = rsnscriptforeachclipped;
        this.MediaBrowserCompat$SearchResultReceiver = rsnscriptforeachclipped2;
        rsnScriptSetVarI rsnscriptsetvari = rsnscriptforeachclipped2.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = this.MediaBrowserCompat$SearchResultReceiver.read;
        int i2 = this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver;
        int i3 = (z ? 11 : 14) + (i2 << 2);
        int[] iArr = new int[i3];
        boolean[] zArr = new boolean[(((z ? 88 : 112) + (i2 << 4)) * i2)];
        int i4 = 2;
        if (z) {
            for (int i5 = 0; i5 < i3; i5++) {
                iArr[i5] = i5;
            }
        } else {
            int i6 = i3 / 2;
            int i7 = ((i3 + 1) + (((i6 - 1) / 15) << 1)) / 2;
            for (int i8 = 0; i8 < i6; i8++) {
                int i9 = (i8 / 15) + i8;
                iArr[(i6 - i8) - 1] = (i7 - i9) - 1;
                iArr[i6 + i8] = i9 + i7 + 1;
            }
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < i2) {
            int i12 = ((i2 - i10) << i4) + (z ? 9 : 12);
            int i13 = i10 << 1;
            int i14 = (i3 - 1) - i13;
            int i15 = 0;
            while (i15 < i12) {
                int i16 = i15 << 1;
                int i17 = 0;
                while (i17 < i4) {
                    int i18 = i13 + i17;
                    int i19 = i13 + i15;
                    zArr[i11 + i16 + i17] = rsnscriptsetvari.MediaBrowserCompat$ItemReceiver(iArr[i18], iArr[i19]);
                    int i20 = i14 - i17;
                    zArr[(i12 << 1) + i11 + i16 + i17] = rsnscriptsetvari.MediaBrowserCompat$ItemReceiver(iArr[i19], iArr[i20]);
                    int i21 = i14 - i15;
                    zArr[(i12 << 2) + i11 + i16 + i17] = rsnscriptsetvari.MediaBrowserCompat$ItemReceiver(iArr[i20], iArr[i21]);
                    zArr[(i12 * 6) + i11 + i16 + i17] = rsnscriptsetvari.MediaBrowserCompat$ItemReceiver(iArr[i21], iArr[i18]);
                    i17++;
                    z = z;
                    i4 = 2;
                }
                boolean z2 = z;
                i15++;
                i4 = 2;
            }
            i11 += i12 << 3;
            i10++;
            z = z;
            i4 = 2;
        }
        boolean[] MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(zArr);
        int i22 = 8;
        int length = (MediaBrowserCompat$CustomActionResultReceiver2.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i23 = 0; i23 < length; i23++) {
            int i24 = i23 << 3;
            int length2 = MediaBrowserCompat$CustomActionResultReceiver2.length - i24;
            if (length2 >= 8) {
                i = write(MediaBrowserCompat$CustomActionResultReceiver2, i24, 8);
            } else {
                i = write(MediaBrowserCompat$CustomActionResultReceiver2, i24, length2) << (8 - length2);
            }
            bArr[i23] = (byte) i;
        }
        int length3 = MediaBrowserCompat$CustomActionResultReceiver2.length;
        write write2 = write.UPPER;
        write write3 = write.UPPER;
        StringBuilder sb = new StringBuilder(20);
        int i25 = 0;
        loop6:
        while (true) {
            write write4 = write3;
            write3 = write2;
            write2 = write4;
            while (i25 < length3) {
                if (write2 == write.BINARY) {
                    if (length3 - i25 < 5) {
                        break loop6;
                    }
                    int write5 = write(MediaBrowserCompat$CustomActionResultReceiver2, i25, 5);
                    i25 += 5;
                    if (write5 == 0) {
                        if (length3 - i25 < 11) {
                            break loop6;
                        }
                        write5 = write(MediaBrowserCompat$CustomActionResultReceiver2, i25, 11) + 31;
                        i25 += 11;
                    }
                    int i26 = 0;
                    while (true) {
                        if (i26 >= write5) {
                            break;
                        } else if (length3 - i25 < i22) {
                            i25 = length3;
                            break;
                        } else {
                            sb.append((char) write(MediaBrowserCompat$CustomActionResultReceiver2, i25, i22));
                            i25 += 8;
                            i26++;
                        }
                    }
                } else {
                    int i27 = write2 == write.DIGIT ? 4 : 5;
                    if (length3 - i25 < i27) {
                        break loop6;
                    }
                    int write6 = write(MediaBrowserCompat$CustomActionResultReceiver2, i25, i27);
                    i25 += i27;
                    int i28 = C14403.read[write2.ordinal()];
                    if (i28 == 1) {
                        str = IconCompatParcelizer[write6];
                    } else if (i28 == 2) {
                        str = MediaBrowserCompat$CustomActionResultReceiver[write6];
                    } else if (i28 == 3) {
                        str = read[write6];
                    } else if (i28 == 4) {
                        str = write[write6];
                    } else if (i28 == 5) {
                        str = MediaBrowserCompat$ItemReceiver[write6];
                    } else {
                        throw new IllegalStateException("Bad table");
                    }
                    if (str.startsWith("CTRL_")) {
                        char charAt = str.charAt(5);
                        if (charAt == 'B') {
                            write3 = write.BINARY;
                        } else if (charAt == 'D') {
                            write3 = write.DIGIT;
                        } else if (charAt == 'P') {
                            write3 = write.PUNCT;
                        } else if (charAt == 'L') {
                            write3 = write.LOWER;
                        } else if (charAt != 'M') {
                            write3 = write.UPPER;
                        } else {
                            write3 = write.MIXED;
                        }
                        if (str.charAt(6) != 'L') {
                            i22 = 8;
                        }
                    } else {
                        sb.append(str);
                    }
                }
                write2 = write3;
                i22 = 8;
            }
            break loop6;
        }
        getMaskAnimations.read read2 = new getMaskAnimations.read(bArr, sb.toString(), (List<byte[]>) null, (String) null);
        read2.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver2.length;
        return read2;
    }

    /* renamed from: o.rsnScriptGroup2Create$3 */
    static /* synthetic */ class C14403 {
        static final /* synthetic */ int[] read;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.rsnScriptGroup2Create$write[] r0 = p040o.rsnScriptGroup2Create.write.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                read = r0
                o.rsnScriptGroup2Create$write r1 = p040o.rsnScriptGroup2Create.write.UPPER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x001d }
                o.rsnScriptGroup2Create$write r1 = p040o.rsnScriptGroup2Create.write.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.rsnScriptGroup2Create$write r1 = p040o.rsnScriptGroup2Create.write.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.rsnScriptGroup2Create$write r1 = p040o.rsnScriptGroup2Create.write.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x003e }
                o.rsnScriptGroup2Create$write r1 = p040o.rsnScriptGroup2Create.write.DIGIT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.rsnScriptGroup2Create.C14403.<clinit>():void");
        }
    }

    private boolean[] MediaBrowserCompat$CustomActionResultReceiver(boolean[] zArr) throws FormatException {
        rsnScriptSetVarObj rsnscriptsetvarobj;
        int i = 8;
        if (this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver <= 2) {
            i = 6;
            rsnscriptsetvarobj = rsnScriptSetVarObj.MediaBrowserCompat$CustomActionResultReceiver;
        } else if (this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver <= 8) {
            rsnscriptsetvarobj = rsnScriptSetVarObj.write;
        } else if (this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver <= 22) {
            i = 10;
            rsnscriptsetvarobj = rsnScriptSetVarObj.MediaBrowserCompat$ItemReceiver;
        } else {
            i = 12;
            rsnscriptsetvarobj = rsnScriptSetVarObj.IconCompatParcelizer;
        }
        int i2 = this.MediaBrowserCompat$SearchResultReceiver.write;
        int length = zArr.length / i;
        if (length >= i2) {
            int length2 = zArr.length % i;
            int[] iArr = new int[length];
            int i3 = 0;
            while (i3 < length) {
                iArr[i3] = write(zArr, length2, i);
                i3++;
                length2 += i;
            }
            try {
                new setLogLevel$MediaBrowserCompat$ItemReceiver(rsnscriptsetvarobj).MediaBrowserCompat$ItemReceiver(iArr, length - i2);
                int i4 = (1 << i) - 1;
                int i5 = 0;
                for (int i6 = 0; i6 < i2; i6++) {
                    int i7 = iArr[i6];
                    if (i7 == 0 || i7 == i4) {
                        throw FormatException.read();
                    }
                    if (i7 == 1 || i7 == i4 - 1) {
                        i5++;
                    }
                }
                boolean[] zArr2 = new boolean[((i2 * i) - i5)];
                int i8 = 0;
                for (int i9 = 0; i9 < i2; i9++) {
                    int i10 = iArr[i9];
                    if (i10 == 1 || i10 == i4 - 1) {
                        Arrays.fill(zArr2, i8, (i8 + i) - 1, i10 > 1);
                        i8 += i - 1;
                    } else {
                        int i11 = i - 1;
                        while (i11 >= 0) {
                            zArr2[i8] = ((1 << i11) & i10) != 0;
                            i11--;
                            i8++;
                        }
                    }
                }
                return zArr2;
            } catch (ReedSolomonException e) {
                throw FormatException.MediaBrowserCompat$CustomActionResultReceiver(e);
            }
        } else {
            throw FormatException.read();
        }
    }

    private static int write(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }
}
