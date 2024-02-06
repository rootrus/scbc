package p040o;

import com.google.zxing.FormatException;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import p040o.fromDataField;
import p040o.getMaskAnimations;

/* renamed from: o.access$500 */
final class access$500 {
    private static final char[] IconCompatParcelizer = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();
    private static final char[] read = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
    private static final BigInteger[] write;

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        write = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900);
        write[1] = valueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = write;
            if (i < bigIntegerArr2.length) {
                bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(valueOf);
                i++;
            } else {
                return;
            }
        }
    }

    static getMaskAnimations.read read(int[] iArr, String str) throws FormatException {
        int i;
        StringBuilder sb = new StringBuilder(iArr.length << 1);
        Charset charset = StandardCharsets.ISO_8859_1;
        int i2 = iArr[1];
        fromDataField.read.write write2 = new fromDataField.read.write();
        int i3 = 2;
        while (i3 < iArr[0]) {
            if (i2 != 913) {
                switch (i2) {
                    case 900:
                        i = MediaBrowserCompat$ItemReceiver(iArr, i3, sb);
                        break;
                    case 901:
                        i = IconCompatParcelizer(i2, iArr, charset, i3, sb);
                        break;
                    case 902:
                        i = IconCompatParcelizer(iArr, i3, sb);
                        break;
                    default:
                        switch (i2) {
                            case 922:
                            case 923:
                                throw FormatException.read();
                            case 924:
                                break;
                            case 925:
                                i = i3 + 1;
                                break;
                            case 926:
                                i = i3 + 2;
                                break;
                            case 927:
                                i = i3 + 1;
                                charset = Charset.forName(rsnScriptSetTimeZone.IconCompatParcelizer(iArr[i3]).name());
                                break;
                            case 928:
                                i = MediaBrowserCompat$CustomActionResultReceiver(iArr, i3);
                                break;
                            default:
                                i = MediaBrowserCompat$ItemReceiver(iArr, i3 - 1, sb);
                                break;
                        }
                        i = IconCompatParcelizer(i2, iArr, charset, i3, sb);
                        break;
                }
            } else {
                i = i3 + 1;
                sb.append((char) iArr[i3]);
            }
            if (i < iArr.length) {
                i3 = i + 1;
                i2 = iArr[i];
            } else {
                throw FormatException.read();
            }
        }
        if (sb.length() != 0) {
            getMaskAnimations.read read2 = new getMaskAnimations.read((byte[]) null, sb.toString(), (List<byte[]>) null, str);
            read2.write = write2;
            return read2;
        }
        throw FormatException.read();
    }

    private static int MediaBrowserCompat$CustomActionResultReceiver(int[] iArr, int i) throws FormatException {
        if (i + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            int i2 = 0;
            while (i2 < 2) {
                iArr2[i2] = iArr[i];
                i2++;
                i++;
            }
            Integer.parseInt(MediaBrowserCompat$ItemReceiver(iArr2, 2));
            int MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(iArr, i, new StringBuilder());
            int i3 = iArr[MediaBrowserCompat$ItemReceiver];
            if (i3 == 922) {
                return MediaBrowserCompat$ItemReceiver + 1;
            }
            if (i3 != 923) {
                return MediaBrowserCompat$ItemReceiver;
            }
            int i4 = MediaBrowserCompat$ItemReceiver + 1;
            int[] iArr3 = new int[(iArr[0] - i4)];
            boolean z = false;
            int i5 = 0;
            while (i4 < iArr[0] && !z) {
                int i6 = i4 + 1;
                int i7 = iArr[i4];
                if (i7 < 900) {
                    iArr3[i5] = i7;
                    i5++;
                    i4 = i6;
                } else if (i7 == 922) {
                    i4 = i6 + 1;
                    z = true;
                } else {
                    throw FormatException.read();
                }
            }
            Arrays.copyOf(iArr3, i5);
            return i4;
        }
        throw FormatException.read();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0095, code lost:
        if (r11 == 900) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0099, code lost:
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009c, code lost:
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x010e, code lost:
        r13 = (char) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x011a, code lost:
        r13 = 0;
        r16 = r6;
        r6 = r3;
        r3 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x012e, code lost:
        r3 = p040o.access$500$MediaBrowserCompat$ItemReceiver.ALPHA;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0131, code lost:
        if (r13 == 0) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0133, code lost:
        r0.append(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0136, code lost:
        r8 = r8 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int MediaBrowserCompat$ItemReceiver(int[] r17, int r18, java.lang.StringBuilder r19) {
        /*
            r0 = r19
            r1 = 0
            r2 = r17[r1]
            int r2 = r2 - r18
            r3 = 1
            int r2 = r2 << r3
            int[] r2 = new int[r2]
            r4 = r17[r1]
            int r4 = r4 - r18
            int r4 = r4 << r3
            int[] r4 = new int[r4]
            r5 = r18
            r6 = r1
            r7 = r6
        L_0x0016:
            r8 = r17[r1]
            r9 = 913(0x391, float:1.28E-42)
            r10 = 900(0x384, float:1.261E-42)
            if (r5 >= r8) goto L_0x0055
            if (r6 != 0) goto L_0x0055
            int r8 = r5 + 1
            r5 = r17[r5]
            if (r5 >= r10) goto L_0x0033
            int r9 = r5 / 30
            r2[r7] = r9
            int r9 = r7 + 1
            int r5 = r5 % 30
            r2[r9] = r5
            int r7 = r7 + 2
            goto L_0x0044
        L_0x0033:
            if (r5 == r9) goto L_0x004a
            r9 = 928(0x3a0, float:1.3E-42)
            if (r5 == r9) goto L_0x0046
            switch(r5) {
                case 900: goto L_0x0040;
                case 901: goto L_0x0046;
                case 902: goto L_0x0046;
                default: goto L_0x003c;
            }
        L_0x003c:
            switch(r5) {
                case 922: goto L_0x0046;
                case 923: goto L_0x0046;
                case 924: goto L_0x0046;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x0044
        L_0x0040:
            r2[r7] = r10
            int r7 = r7 + 1
        L_0x0044:
            r5 = r8
            goto L_0x0016
        L_0x0046:
            int r5 = r8 + -1
            r6 = r3
            goto L_0x0016
        L_0x004a:
            r2[r7] = r9
            int r5 = r8 + 1
            r8 = r17[r8]
            r4[r7] = r8
            int r7 = r7 + 1
            goto L_0x0016
        L_0x0055:
            o.access$500$MediaBrowserCompat$ItemReceiver r3 = p040o.access$500$MediaBrowserCompat$ItemReceiver.ALPHA
            o.access$500$MediaBrowserCompat$ItemReceiver r6 = p040o.access$500$MediaBrowserCompat$ItemReceiver.ALPHA
            r8 = r1
        L_0x005a:
            if (r8 >= r7) goto L_0x013a
            r11 = r2[r8]
            int[] r12 = p040o.access$500.C13002.MediaBrowserCompat$ItemReceiver
            int r13 = r3.ordinal()
            r12 = r12[r13]
            r13 = 32
            r14 = 29
            r15 = 26
            switch(r12) {
                case 1: goto L_0x010a;
                case 2: goto L_0x00ea;
                case 3: goto L_0x00bf;
                case 4: goto L_0x009f;
                case 5: goto L_0x008d;
                case 6: goto L_0x0071;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x0130
        L_0x0071:
            if (r11 >= r14) goto L_0x0078
            char[] r3 = read
            char r13 = r3[r11]
            goto L_0x009c
        L_0x0078:
            if (r11 == r14) goto L_0x0089
            if (r11 == r10) goto L_0x0085
            if (r11 != r9) goto L_0x0099
            r3 = r4[r8]
            char r3 = (char) r3
            r0.append(r3)
            goto L_0x0099
        L_0x0085:
            o.access$500$MediaBrowserCompat$ItemReceiver r3 = p040o.access$500$MediaBrowserCompat$ItemReceiver.ALPHA
            goto L_0x0130
        L_0x0089:
            o.access$500$MediaBrowserCompat$ItemReceiver r3 = p040o.access$500$MediaBrowserCompat$ItemReceiver.ALPHA
            goto L_0x0130
        L_0x008d:
            if (r11 >= r15) goto L_0x0093
            int r11 = r11 + 65
            char r13 = (char) r11
            goto L_0x009c
        L_0x0093:
            if (r11 == r15) goto L_0x009c
            if (r11 != r10) goto L_0x0099
            goto L_0x012e
        L_0x0099:
            r3 = r6
            goto L_0x0130
        L_0x009c:
            r3 = r6
            goto L_0x0131
        L_0x009f:
            if (r11 >= r14) goto L_0x00a7
            char[] r12 = read
            char r13 = r12[r11]
            goto L_0x0131
        L_0x00a7:
            if (r11 == r14) goto L_0x00bb
            if (r11 == r10) goto L_0x00b7
            if (r11 == r9) goto L_0x00af
            goto L_0x0130
        L_0x00af:
            r11 = r4[r8]
            char r11 = (char) r11
            r0.append(r11)
            goto L_0x0130
        L_0x00b7:
            o.access$500$MediaBrowserCompat$ItemReceiver r3 = p040o.access$500$MediaBrowserCompat$ItemReceiver.ALPHA
            goto L_0x0130
        L_0x00bb:
            o.access$500$MediaBrowserCompat$ItemReceiver r3 = p040o.access$500$MediaBrowserCompat$ItemReceiver.ALPHA
            goto L_0x0130
        L_0x00bf:
            r12 = 25
            if (r11 >= r12) goto L_0x00c9
            char[] r12 = IconCompatParcelizer
            char r13 = r12[r11]
            goto L_0x0131
        L_0x00c9:
            if (r11 == r10) goto L_0x00e7
            if (r11 == r9) goto L_0x00e0
            switch(r11) {
                case 25: goto L_0x00dd;
                case 26: goto L_0x0131;
                case 27: goto L_0x00d9;
                case 28: goto L_0x00d5;
                case 29: goto L_0x00d2;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            goto L_0x0130
        L_0x00d2:
            o.access$500$MediaBrowserCompat$ItemReceiver r6 = p040o.access$500$MediaBrowserCompat$ItemReceiver.PUNCT_SHIFT
            goto L_0x011a
        L_0x00d5:
            o.access$500$MediaBrowserCompat$ItemReceiver r3 = p040o.access$500$MediaBrowserCompat$ItemReceiver.ALPHA
            goto L_0x0130
        L_0x00d9:
            o.access$500$MediaBrowserCompat$ItemReceiver r3 = p040o.access$500$MediaBrowserCompat$ItemReceiver.LOWER
            goto L_0x0130
        L_0x00dd:
            o.access$500$MediaBrowserCompat$ItemReceiver r3 = p040o.access$500$MediaBrowserCompat$ItemReceiver.PUNCT
            goto L_0x0130
        L_0x00e0:
            r11 = r4[r8]
            char r11 = (char) r11
            r0.append(r11)
            goto L_0x0130
        L_0x00e7:
            o.access$500$MediaBrowserCompat$ItemReceiver r3 = p040o.access$500$MediaBrowserCompat$ItemReceiver.ALPHA
            goto L_0x0130
        L_0x00ea:
            if (r11 >= r15) goto L_0x00ef
            int r11 = r11 + 97
            goto L_0x010e
        L_0x00ef:
            if (r11 == r10) goto L_0x0107
            if (r11 == r9) goto L_0x0100
            switch(r11) {
                case 26: goto L_0x0131;
                case 27: goto L_0x00fd;
                case 28: goto L_0x00fa;
                case 29: goto L_0x00f7;
                default: goto L_0x00f6;
            }
        L_0x00f6:
            goto L_0x0130
        L_0x00f7:
            o.access$500$MediaBrowserCompat$ItemReceiver r6 = p040o.access$500$MediaBrowserCompat$ItemReceiver.PUNCT_SHIFT
            goto L_0x011a
        L_0x00fa:
            o.access$500$MediaBrowserCompat$ItemReceiver r3 = p040o.access$500$MediaBrowserCompat$ItemReceiver.MIXED
            goto L_0x0130
        L_0x00fd:
            o.access$500$MediaBrowserCompat$ItemReceiver r6 = p040o.access$500$MediaBrowserCompat$ItemReceiver.ALPHA_SHIFT
            goto L_0x011a
        L_0x0100:
            r11 = r4[r8]
            char r11 = (char) r11
            r0.append(r11)
            goto L_0x0130
        L_0x0107:
            o.access$500$MediaBrowserCompat$ItemReceiver r3 = p040o.access$500$MediaBrowserCompat$ItemReceiver.ALPHA
            goto L_0x0130
        L_0x010a:
            if (r11 >= r15) goto L_0x0110
            int r11 = r11 + 65
        L_0x010e:
            char r13 = (char) r11
            goto L_0x0131
        L_0x0110:
            if (r11 == r10) goto L_0x012e
            if (r11 == r9) goto L_0x0127
            switch(r11) {
                case 26: goto L_0x0131;
                case 27: goto L_0x0124;
                case 28: goto L_0x0121;
                case 29: goto L_0x0118;
                default: goto L_0x0117;
            }
        L_0x0117:
            goto L_0x0130
        L_0x0118:
            o.access$500$MediaBrowserCompat$ItemReceiver r6 = p040o.access$500$MediaBrowserCompat$ItemReceiver.PUNCT_SHIFT
        L_0x011a:
            r13 = r1
            r16 = r6
            r6 = r3
            r3 = r16
            goto L_0x0131
        L_0x0121:
            o.access$500$MediaBrowserCompat$ItemReceiver r3 = p040o.access$500$MediaBrowserCompat$ItemReceiver.MIXED
            goto L_0x0130
        L_0x0124:
            o.access$500$MediaBrowserCompat$ItemReceiver r3 = p040o.access$500$MediaBrowserCompat$ItemReceiver.LOWER
            goto L_0x0130
        L_0x0127:
            r11 = r4[r8]
            char r11 = (char) r11
            r0.append(r11)
            goto L_0x0130
        L_0x012e:
            o.access$500$MediaBrowserCompat$ItemReceiver r3 = p040o.access$500$MediaBrowserCompat$ItemReceiver.ALPHA
        L_0x0130:
            r13 = r1
        L_0x0131:
            if (r13 == 0) goto L_0x0136
            r0.append(r13)
        L_0x0136:
            int r8 = r8 + 1
            goto L_0x005a
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.access$500.MediaBrowserCompat$ItemReceiver(int[], int, java.lang.StringBuilder):int");
    }

    /* renamed from: o.access$500$2 */
    static /* synthetic */ class C13002 {
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.access$500$MediaBrowserCompat$ItemReceiver[] r0 = p040o.access$500$MediaBrowserCompat$ItemReceiver.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                o.access$500$MediaBrowserCompat$ItemReceiver r1 = p040o.access$500$MediaBrowserCompat$ItemReceiver.ALPHA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.access$500$MediaBrowserCompat$ItemReceiver r1 = p040o.access$500$MediaBrowserCompat$ItemReceiver.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.access$500$MediaBrowserCompat$ItemReceiver r1 = p040o.access$500$MediaBrowserCompat$ItemReceiver.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.access$500$MediaBrowserCompat$ItemReceiver r1 = p040o.access$500$MediaBrowserCompat$ItemReceiver.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x003e }
                o.access$500$MediaBrowserCompat$ItemReceiver r1 = p040o.access$500$MediaBrowserCompat$ItemReceiver.ALPHA_SHIFT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.access$500$MediaBrowserCompat$ItemReceiver r1 = p040o.access$500$MediaBrowserCompat$ItemReceiver.PUNCT_SHIFT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.access$500.C13002.<clinit>():void");
        }
    }

    private static int IconCompatParcelizer(int i, int[] iArr, Charset charset, int i2, StringBuilder sb) {
        int i3;
        int i4;
        long j;
        int i5;
        int i6 = i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        long j2 = 900;
        if (i6 == 901) {
            int[] iArr2 = new int[6];
            int i7 = i2 + 1;
            int i8 = iArr[i2];
            boolean z = false;
            while (true) {
                i5 = 0;
                long j3 = 0;
                while (i4 < iArr[0] && !z) {
                    int i9 = i5 + 1;
                    iArr2[i5] = i8;
                    j3 = (j3 * j) + ((long) i8);
                    int i10 = i4 + 1;
                    i8 = iArr[i4];
                    if (i8 != 928) {
                        switch (i8) {
                            case 900:
                            case 901:
                            case 902:
                                break;
                            default:
                                switch (i8) {
                                    case 922:
                                    case 923:
                                    case 924:
                                        break;
                                    default:
                                        if (i9 % 5 != 0 || i9 <= 0) {
                                            i4 = i10;
                                            i5 = i9;
                                            j = 900;
                                            break;
                                        } else {
                                            for (int i11 = 0; i11 < 6; i11++) {
                                                byteArrayOutputStream.write((byte) ((int) (j3 >> ((5 - i11) << 3))));
                                            }
                                            i7 = i10;
                                            j2 = 900;
                                        }
                                }
                                break;
                        }
                    }
                    i4 = i10 - 1;
                    i5 = i9;
                    j = 900;
                    z = true;
                }
            }
            if (i4 == iArr[0] && i8 < 900) {
                iArr2[i5] = i8;
                i5++;
            }
            for (int i12 = 0; i12 < i5; i12++) {
                byteArrayOutputStream.write((byte) iArr2[i12]);
            }
            i3 = i4;
        } else if (i6 != 924) {
            i3 = i2;
        } else {
            i3 = i2;
            boolean z2 = false;
            while (true) {
                int i13 = 0;
                long j4 = 0;
                while (i3 < iArr[0] && !z2) {
                    int i14 = i3 + 1;
                    int i15 = iArr[i3];
                    if (i15 < 900) {
                        i13++;
                        j4 = (j4 * 900) + ((long) i15);
                    } else {
                        if (i15 != 928) {
                            switch (i15) {
                                case 900:
                                case 901:
                                case 902:
                                    break;
                                default:
                                    switch (i15) {
                                        case 922:
                                        case 923:
                                        case 924:
                                            break;
                                    }
                            }
                        }
                        i3 = i14 - 1;
                        z2 = true;
                        if (i13 % 5 == 0 || i13 <= 0) {
                            z2 = z2;
                        } else {
                            int i16 = 0;
                            while (i16 < 6) {
                                byteArrayOutputStream.write((byte) ((int) (j4 >> ((5 - i16) << 3))));
                                i16++;
                                z2 = z2;
                            }
                            boolean z3 = z2;
                        }
                    }
                    i3 = i14;
                    if (i13 % 5 == 0) {
                    }
                    z2 = z2;
                }
            }
        }
        sb.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return i3;
    }

    private static int IconCompatParcelizer(int[] iArr, int i, StringBuilder sb) throws FormatException {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i3 == iArr[0]) {
                z = true;
            }
            if (i4 < 900) {
                iArr2[i2] = i4;
                i2++;
            } else {
                if (!(i4 == 900 || i4 == 901 || i4 == 928)) {
                    switch (i4) {
                        case 922:
                        case 923:
                        case 924:
                            break;
                    }
                }
                i3--;
                z = true;
            }
            if ((i2 % 15 == 0 || i4 == 902 || z) && i2 > 0) {
                sb.append(MediaBrowserCompat$ItemReceiver(iArr2, i2));
                i2 = 0;
            }
            i = i3;
        }
        return i;
    }

    private static String MediaBrowserCompat$ItemReceiver(int[] iArr, int i) throws FormatException {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(write[(i - i2) - 1].multiply(BigInteger.valueOf((long) iArr[i2])));
        }
        String obj = bigInteger.toString();
        if (obj.charAt(0) == '1') {
            return obj.substring(1);
        }
        throw FormatException.read();
    }
}
