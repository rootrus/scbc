package p040o;

import com.google.zxing.WriterException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import net.p088sf.scuba.smartcards.ISO7816;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: o.internalStringCreate */
public final class internalStringCreate {
    private static final byte[] IconCompatParcelizer = new byte[128];
    private static final byte[] MediaBrowserCompat$CustomActionResultReceiver = {ISO7816.INS_DECREASE, 49, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55, 56, 57, 38, 13, 9, ISO7816.INS_UNBLOCK_CHV, 58, 35, 45, 46, ISO7816.INS_CHANGE_CHV, 47, 43, 37, ISO7816.INS_PSO, 61, 94, 0, 32, 0, 0, 0};
    private static final Charset MediaBrowserCompat$ItemReceiver = StandardCharsets.ISO_8859_1;
    private static final byte[] read = new byte[128];
    private static final byte[] write = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, ISO7816.INS_UNBLOCK_CHV, 58, 10, 45, 46, ISO7816.INS_CHANGE_CHV, 47, ISO7816.INS_MSE, 124, ISO7816.INS_PSO, 40, 41, 63, 123, 125, 39, 0};

    static {
        Arrays.fill(read, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = MediaBrowserCompat$CustomActionResultReceiver;
            if (i2 >= bArr.length) {
                break;
            }
            byte b = bArr[i2];
            if (b > 0) {
                read[b] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(IconCompatParcelizer, (byte) -1);
        while (true) {
            byte[] bArr2 = write;
            if (i < bArr2.length) {
                byte b2 = bArr2[i];
                if (b2 > 0) {
                    IconCompatParcelizer[b2] = (byte) i;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public static String read(String str, getYStart getystart, Charset charset) throws WriterException {
        rsnScriptSetTimeZone write2;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = MediaBrowserCompat$ItemReceiver;
        } else if (!MediaBrowserCompat$ItemReceiver.equals(charset) && (write2 = rsnScriptSetTimeZone.write(charset.name())) != null) {
            int i = write2.values[0];
            if (i >= 0 && i < 900) {
                sb.append(927);
                sb.append((char) i);
            } else if (i < 810900) {
                sb.append(926);
                sb.append((char) ((i / 900) - 1));
                sb.append((char) (i % 900));
            } else if (i < 811800) {
                sb.append(925);
                sb.append((char) (810900 - i));
            } else {
                StringBuilder sb2 = new StringBuilder("ECI number not in valid range from 0..811799, but was ");
                sb2.append(i);
                throw new WriterException(sb2.toString());
            }
        }
        int length = str.length();
        int i2 = C13564.MediaBrowserCompat$CustomActionResultReceiver[getystart.ordinal()];
        if (i2 == 1) {
            IconCompatParcelizer(str, 0, length, sb, 0);
        } else if (i2 == 2) {
            byte[] bytes = str.getBytes(charset);
            IconCompatParcelizer(bytes, bytes.length, 1, sb);
        } else if (i2 != 3) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < length) {
                int write3 = write(str, i3);
                if (write3 >= 13) {
                    sb.append(902);
                    MediaBrowserCompat$CustomActionResultReceiver(str, i3, write3, sb);
                    i3 += write3;
                    i4 = 0;
                    i5 = 2;
                } else {
                    int MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(str, i3);
                    if (MediaBrowserCompat$CustomActionResultReceiver2 >= 5 || write3 == length) {
                        if (i5 != 0) {
                            sb.append(900);
                            i4 = 0;
                            i5 = 0;
                        }
                        i4 = IconCompatParcelizer(str, i3, MediaBrowserCompat$CustomActionResultReceiver2, sb, i4);
                        i3 += MediaBrowserCompat$CustomActionResultReceiver2;
                    } else {
                        int read2 = read(str, i3, charset);
                        if (read2 == 0) {
                            read2 = 1;
                        }
                        int i6 = read2 + i3;
                        byte[] bytes2 = str.substring(i3, i6).getBytes(charset);
                        if (bytes2.length == 1 && i5 == 0) {
                            IconCompatParcelizer(bytes2, 1, 0, sb);
                        } else {
                            IconCompatParcelizer(bytes2, bytes2.length, i5, sb);
                            i5 = 1;
                            i4 = 0;
                        }
                        i3 = i6;
                    }
                }
            }
        } else {
            sb.append(902);
            MediaBrowserCompat$CustomActionResultReceiver(str, 0, length, sb);
        }
        return sb.toString();
    }

    /* renamed from: o.internalStringCreate$4 */
    static /* synthetic */ class C13564 {
        static final /* synthetic */ int[] MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                o.getYStart[] r0 = p040o.getYStart.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$CustomActionResultReceiver = r0
                o.getYStart r1 = p040o.getYStart.TEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.getYStart r1 = p040o.getYStart.BYTE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.getYStart r1 = p040o.getYStart.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.internalStringCreate.C13564.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x0148 A[EDGE_INSN: B:114:0x0148->B:98:0x0148 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int IconCompatParcelizer(java.lang.CharSequence r17, int r18, int r19, java.lang.StringBuilder r20, int r21) {
        /*
            r0 = r17
            r1 = r19
            r2 = r20
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r4 = 2
            r6 = 1
            r7 = r21
            r8 = 0
        L_0x0010:
            int r9 = r18 + r8
            char r10 = r0.charAt(r9)
            r12 = 28
            r15 = 90
            r11 = 29
            r13 = -1
            r14 = 65
            r5 = 32
            if (r7 == 0) goto L_0x00f7
            if (r7 == r6) goto L_0x00a4
            if (r7 == r4) goto L_0x0040
            byte[] r5 = IconCompatParcelizer
            byte r5 = r5[r10]
            if (r5 == r13) goto L_0x002f
            r5 = r6
            goto L_0x0030
        L_0x002f:
            r5 = 0
        L_0x0030:
            if (r5 == 0) goto L_0x003c
            byte[] r5 = IconCompatParcelizer
            byte r5 = r5[r10]
            char r5 = (char) r5
            r3.append(r5)
            goto L_0x0144
        L_0x003c:
            r3.append(r11)
            goto L_0x0063
        L_0x0040:
            byte[] r16 = read
            byte r6 = r16[r10]
            if (r6 == r13) goto L_0x0048
            r6 = 1
            goto L_0x0049
        L_0x0048:
            r6 = 0
        L_0x0049:
            if (r6 == 0) goto L_0x0055
            byte[] r5 = read
            byte r5 = r5[r10]
            char r5 = (char) r5
            r3.append(r5)
            goto L_0x0144
        L_0x0055:
            if (r10 == r5) goto L_0x005d
            if (r10 < r14) goto L_0x005b
            if (r10 <= r15) goto L_0x005d
        L_0x005b:
            r6 = 0
            goto L_0x005e
        L_0x005d:
            r6 = 1
        L_0x005e:
            if (r6 == 0) goto L_0x0066
            r3.append(r12)
        L_0x0063:
            r6 = 1
            r7 = 0
            goto L_0x0010
        L_0x0066:
            if (r10 == r5) goto L_0x0072
            r5 = 97
            if (r10 < r5) goto L_0x0070
            r5 = 122(0x7a, float:1.71E-43)
            if (r10 <= r5) goto L_0x0072
        L_0x0070:
            r5 = 0
            goto L_0x0073
        L_0x0072:
            r5 = 1
        L_0x0073:
            if (r5 == 0) goto L_0x007c
            r5 = 27
            r3.append(r5)
            goto L_0x0125
        L_0x007c:
            int r9 = r9 + 1
            if (r9 >= r1) goto L_0x0097
            char r5 = r0.charAt(r9)
            byte[] r6 = IconCompatParcelizer
            byte r5 = r6[r5]
            if (r5 == r13) goto L_0x008c
            r5 = 1
            goto L_0x008d
        L_0x008c:
            r5 = 0
        L_0x008d:
            if (r5 == 0) goto L_0x0097
            r7 = 3
            r5 = 25
            r3.append(r5)
            goto L_0x0177
        L_0x0097:
            r3.append(r11)
            byte[] r5 = IconCompatParcelizer
            byte r5 = r5[r10]
            char r5 = (char) r5
            r3.append(r5)
            goto L_0x0144
        L_0x00a4:
            if (r10 == r5) goto L_0x00b0
            r6 = 97
            if (r10 < r6) goto L_0x00ae
            r6 = 122(0x7a, float:1.71E-43)
            if (r10 <= r6) goto L_0x00b0
        L_0x00ae:
            r6 = 0
            goto L_0x00b1
        L_0x00b0:
            r6 = 1
        L_0x00b1:
            if (r6 == 0) goto L_0x00c4
            if (r10 != r5) goto L_0x00bc
            r5 = 26
            r3.append(r5)
            goto L_0x0144
        L_0x00bc:
            int r10 = r10 + -97
            char r5 = (char) r10
            r3.append(r5)
            goto L_0x0144
        L_0x00c4:
            if (r10 == r5) goto L_0x00cc
            if (r10 < r14) goto L_0x00ca
            if (r10 <= r15) goto L_0x00cc
        L_0x00ca:
            r5 = 0
            goto L_0x00cd
        L_0x00cc:
            r5 = 1
        L_0x00cd:
            if (r5 == 0) goto L_0x00dc
            r5 = 27
            r3.append(r5)
            int r10 = r10 + -65
            char r5 = (char) r10
            r3.append(r5)
            goto L_0x0144
        L_0x00dc:
            byte[] r5 = read
            byte r5 = r5[r10]
            if (r5 == r13) goto L_0x00e4
            r5 = 1
            goto L_0x00e5
        L_0x00e4:
            r5 = 0
        L_0x00e5:
            if (r5 == 0) goto L_0x00eb
            r3.append(r12)
            goto L_0x0137
        L_0x00eb:
            r3.append(r11)
            byte[] r5 = IconCompatParcelizer
            byte r5 = r5[r10]
            char r5 = (char) r5
            r3.append(r5)
            goto L_0x0144
        L_0x00f7:
            if (r10 == r5) goto L_0x00ff
            if (r10 < r14) goto L_0x00fd
            if (r10 <= r15) goto L_0x00ff
        L_0x00fd:
            r6 = 0
            goto L_0x0100
        L_0x00ff:
            r6 = 1
        L_0x0100:
            if (r6 == 0) goto L_0x0111
            if (r10 != r5) goto L_0x010a
            r5 = 26
            r3.append(r5)
            goto L_0x0144
        L_0x010a:
            int r10 = r10 + -65
            char r5 = (char) r10
            r3.append(r5)
            goto L_0x0144
        L_0x0111:
            if (r10 == r5) goto L_0x011d
            r5 = 97
            if (r10 < r5) goto L_0x011b
            r5 = 122(0x7a, float:1.71E-43)
            if (r10 <= r5) goto L_0x011d
        L_0x011b:
            r5 = 0
            goto L_0x011e
        L_0x011d:
            r5 = 1
        L_0x011e:
            if (r5 == 0) goto L_0x0129
            r5 = 27
            r3.append(r5)
        L_0x0125:
            r6 = 1
            r7 = 1
            goto L_0x0010
        L_0x0129:
            byte[] r5 = read
            byte r5 = r5[r10]
            if (r5 == r13) goto L_0x0131
            r5 = 1
            goto L_0x0132
        L_0x0131:
            r5 = 0
        L_0x0132:
            if (r5 == 0) goto L_0x0139
            r3.append(r12)
        L_0x0137:
            r7 = r4
            goto L_0x0177
        L_0x0139:
            r3.append(r11)
            byte[] r5 = IconCompatParcelizer
            byte r5 = r5[r10]
            char r5 = (char) r5
            r3.append(r5)
        L_0x0144:
            int r8 = r8 + 1
            if (r8 < r1) goto L_0x0177
            int r0 = r3.length()
            r1 = 0
            r5 = 0
        L_0x014e:
            if (r1 >= r0) goto L_0x016c
            int r6 = r1 % 2
            if (r6 == 0) goto L_0x0156
            r6 = 1
            goto L_0x0157
        L_0x0156:
            r6 = 0
        L_0x0157:
            if (r6 == 0) goto L_0x0165
            int r5 = r5 * 30
            char r6 = r3.charAt(r1)
            int r5 = r5 + r6
            char r5 = (char) r5
            r2.append(r5)
            goto L_0x0169
        L_0x0165:
            char r5 = r3.charAt(r1)
        L_0x0169:
            int r1 = r1 + 1
            goto L_0x014e
        L_0x016c:
            int r0 = r0 % r4
            if (r0 == 0) goto L_0x0176
            int r5 = r5 * 30
            int r5 = r5 + r11
            char r0 = (char) r5
            r2.append(r0)
        L_0x0176:
            return r7
        L_0x0177:
            r6 = 1
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.internalStringCreate.IconCompatParcelizer(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    private static void IconCompatParcelizer(byte[] bArr, int i, int i2, StringBuilder sb) {
        if (i == 1 && i2 == 0) {
            sb.append(913);
        } else if (i % 6 == 0) {
            sb.append(924);
        } else {
            sb.append(901);
        }
        int i3 = 0;
        if (i >= 6) {
            char[] cArr = new char[5];
            int i4 = 0;
            while (i - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + ((long) (bArr[i4 + i5] & 255));
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) ((int) (j % 900));
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
            i3 = i4;
        }
        while (i3 < i) {
            sb.append((char) (bArr[i3] & 255));
            i3++;
        }
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(String str, int i, int i2, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900);
        BigInteger valueOf2 = BigInteger.valueOf(0);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int min = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder(DiskLruCache.VERSION_1);
            int i4 = i + i3;
            sb3.append(str.substring(i4, i4 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i3 += min;
        }
    }

    private static int write(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return 0;
        }
        char charAt = charSequence.charAt(i);
        int i2 = 0;
        while (true) {
            if ((charAt >= '0' && charAt <= '9') && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    private static int MediaBrowserCompat$CustomActionResultReceiver(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = i;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            boolean z = false;
            int i3 = 0;
            while (i3 < 13) {
                if (!(charAt >= '0' && charAt <= '9') || i2 >= length) {
                    break;
                }
                i3++;
                i2++;
                if (i2 < length) {
                    charAt = charSequence.charAt(i2);
                }
            }
            if (i3 < 13) {
                if (i3 <= 0) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 == 9 || charAt2 == 10 || charAt2 == 13 || (charAt2 >= ' ' && charAt2 <= '~')) {
                        z = true;
                    }
                    if (!z) {
                        break;
                    }
                    i2++;
                }
            } else {
                return (i2 - i) - i3;
            }
        }
        return i2 - i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        r4 = r4 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int read(java.lang.String r7, int r8, java.nio.charset.Charset r9) throws com.google.zxing.WriterException {
        /*
            java.nio.charset.CharsetEncoder r9 = r9.newEncoder()
            int r0 = r7.length()
            r1 = r8
        L_0x0009:
            if (r1 >= r0) goto L_0x005f
            char r2 = r7.charAt(r1)
            r3 = 0
            r4 = r3
        L_0x0011:
            r5 = 13
            if (r4 >= r5) goto L_0x002d
            r6 = 48
            if (r2 < r6) goto L_0x001f
            r6 = 57
            if (r2 > r6) goto L_0x001f
            r2 = 1
            goto L_0x0020
        L_0x001f:
            r2 = r3
        L_0x0020:
            if (r2 == 0) goto L_0x002d
            int r4 = r4 + 1
            int r2 = r1 + r4
            if (r2 >= r0) goto L_0x002d
            char r2 = r7.charAt(r2)
            goto L_0x0011
        L_0x002d:
            if (r4 < r5) goto L_0x0031
            int r1 = r1 - r8
            return r1
        L_0x0031:
            char r2 = r7.charAt(r1)
            boolean r3 = r9.canEncode(r2)
            if (r3 == 0) goto L_0x003e
            int r1 = r1 + 1
            goto L_0x0009
        L_0x003e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Non-encodable character detected: "
            r7.<init>(r8)
            r7.append(r2)
            java.lang.String r8 = " (Unicode: "
            r7.append(r8)
            r7.append(r2)
            r8 = 41
            r7.append(r8)
            com.google.zxing.WriterException r8 = new com.google.zxing.WriterException
            java.lang.String r7 = r7.toString()
            r8.<init>((java.lang.String) r7)
            throw r8
        L_0x005f:
            int r1 = r1 - r8
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.internalStringCreate.read(java.lang.String, int, java.nio.charset.Charset):int");
    }
}
