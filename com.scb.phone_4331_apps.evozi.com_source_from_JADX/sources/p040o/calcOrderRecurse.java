package p040o;

import com.google.zxing.WriterException;
import java.util.Arrays;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.jmrtd.cbeff.ISO781611;
import p040o.ScriptGroup;
import p040o.zzge;

/* renamed from: o.calcOrderRecurse */
final class calcOrderRecurse {
    private static final int[][] IconCompatParcelizer = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] MediaBrowserCompat$CustomActionResultReceiver = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, ISO781611.BIOMETRIC_SUBTYPE_TAG, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, -1}, new int[]{6, 30, 54, 78, 102, 126, CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA}, new int[]{6, 24, 50, 76, 102, 128, CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256}, new int[]{6, 26, 54, 82, 110, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256}, new int[]{6, 30, 58, 86, 114, 142, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256}};
    private static final int[][] read = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] write = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    private static void write(int i, int i2, zzge.zzf.read read2) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = IconCompatParcelizer[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                read2.MediaBrowserCompat$CustomActionResultReceiver[i2 + i3][i + i4] = (byte) iArr[i4];
            }
        }
    }

    static void MediaBrowserCompat$CustomActionResultReceiver(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, execute execute, ScriptGroup.Binding binding, int i, zzge.zzf.read read2) throws WriterException {
        byte b;
        ScriptGroup.Binding binding2 = binding;
        int i2 = i;
        zzge.zzf.read read3 = read2;
        byte[][] bArr = read3.MediaBrowserCompat$CustomActionResultReceiver;
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            b = -1;
            if (i4 >= length) {
                break;
            }
            Arrays.fill(bArr[i4], (byte) -1);
            i4++;
        }
        int length2 = IconCompatParcelizer[0].length;
        write(0, 0, read3);
        write(read3.read - length2, 0, read3);
        write(0, read3.read - length2, read3);
        read(0, 7, read3);
        read(read3.read - 8, 7, read3);
        read(0, read3.read - 8, read3);
        MediaBrowserCompat$ItemReceiver(7, 0, read3);
        int i5 = 1;
        MediaBrowserCompat$ItemReceiver((read3.MediaBrowserCompat$ItemReceiver - 7) - 1, 0, read3);
        MediaBrowserCompat$ItemReceiver(7, read3.MediaBrowserCompat$ItemReceiver - 7, read3);
        if (read3.MediaBrowserCompat$CustomActionResultReceiver[read3.MediaBrowserCompat$ItemReceiver - 8][8] != 0) {
            read3.MediaBrowserCompat$CustomActionResultReceiver[read3.MediaBrowserCompat$ItemReceiver - 8][8] = (byte) 1;
            int i6 = 5;
            if (binding2.read >= 2) {
                int[] iArr = MediaBrowserCompat$CustomActionResultReceiver[binding2.read - 1];
                int length3 = iArr.length;
                int i7 = 0;
                while (i7 < length3) {
                    int i8 = iArr[i7];
                    if (i8 >= 0) {
                        int length4 = iArr.length;
                        int i9 = i3;
                        while (i9 < length4) {
                            int i10 = iArr[i9];
                            if (i10 >= 0) {
                                if ((read3.MediaBrowserCompat$CustomActionResultReceiver[i8][i10] == b ? i5 : i3) != 0) {
                                    int i11 = i10 - 2;
                                    int i12 = i8 - 2;
                                    while (i3 < i6) {
                                        int[] iArr2 = read[i3];
                                        int i13 = 0;
                                        while (i13 < i6) {
                                            read3.MediaBrowserCompat$CustomActionResultReceiver[i12 + i3][i11 + i13] = (byte) iArr2[i13];
                                            i13++;
                                            i6 = 5;
                                        }
                                        i3++;
                                        i6 = 5;
                                    }
                                }
                            }
                            i9++;
                            i3 = 0;
                            b = -1;
                            i5 = 1;
                            i6 = 5;
                        }
                    }
                    i7++;
                    i3 = 0;
                    b = -1;
                    i5 = 1;
                    i6 = 5;
                }
            }
            int i14 = 8;
            while (i14 < read3.read - 8) {
                int i15 = i14 + 1;
                int i16 = i15 % 2;
                if (read3.MediaBrowserCompat$CustomActionResultReceiver[6][i14] == -1) {
                    read3.MediaBrowserCompat$CustomActionResultReceiver[6][i14] = (byte) i16;
                }
                if (read3.MediaBrowserCompat$CustomActionResultReceiver[i14][6] == -1) {
                    read3.MediaBrowserCompat$CustomActionResultReceiver[i14][6] = (byte) i16;
                }
                i14 = i15;
            }
            rsnScriptIntrinsicCreate rsnscriptintrinsiccreate2 = new rsnScriptIntrinsicCreate();
            if (i2 >= 0 && i2 < 8) {
                int i17 = (execute.bits << 3) | i2;
                rsnscriptintrinsiccreate2.write(i17, 5);
                rsnscriptintrinsiccreate2.write(read(i17, 1335), 10);
                rsnScriptIntrinsicCreate rsnscriptintrinsiccreate3 = new rsnScriptIntrinsicCreate();
                rsnscriptintrinsiccreate3.write(21522, 15);
                if (rsnscriptintrinsiccreate2.read == rsnscriptintrinsiccreate3.read) {
                    int i18 = 0;
                    while (true) {
                        int[] iArr3 = rsnscriptintrinsiccreate2.write;
                        if (i18 >= iArr3.length) {
                            break;
                        }
                        iArr3[i18] = iArr3[i18] ^ rsnscriptintrinsiccreate3.write[i18];
                        i18++;
                    }
                    if (rsnscriptintrinsiccreate2.read == 15) {
                        for (int i19 = 0; i19 < rsnscriptintrinsiccreate2.read; i19++) {
                            int i20 = (rsnscriptintrinsiccreate2.read - 1) - i19;
                            int i21 = (rsnscriptintrinsiccreate2.write[i20 / 32] & (1 << (i20 & 31))) != 0 ? 1 : 0;
                            int[] iArr4 = write[i19];
                            byte b2 = (byte) i21;
                            read3.MediaBrowserCompat$CustomActionResultReceiver[iArr4[1]][iArr4[0]] = b2;
                            if (i19 < 8) {
                                read3.MediaBrowserCompat$CustomActionResultReceiver[8][(read3.read - i19) - 1] = b2;
                            } else {
                                read3.MediaBrowserCompat$CustomActionResultReceiver[(read3.MediaBrowserCompat$ItemReceiver - 7) + (i19 - 8)][8] = b2;
                            }
                        }
                        MediaBrowserCompat$ItemReceiver(binding2, read3);
                        IconCompatParcelizer(rsnscriptintrinsiccreate, i2, read3);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("should not happen but we got: ");
                    sb.append(rsnscriptintrinsiccreate2.read);
                    throw new WriterException(sb.toString());
                }
                throw new IllegalArgumentException("Sizes don't match");
            }
            throw new WriterException("Invalid mask pattern");
        }
        throw new WriterException();
    }

    private static int read(int i, int i2) {
        if (i2 != 0) {
            int numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i2);
            int i3 = i << (numberOfLeadingZeros - 1);
            while (32 - Integer.numberOfLeadingZeros(i3) >= numberOfLeadingZeros) {
                i3 ^= i2 << ((32 - Integer.numberOfLeadingZeros(i3)) - numberOfLeadingZeros);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0085, code lost:
        r10 = r10 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0086, code lost:
        r10 = r10 & 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0087, code lost:
        if (r10 != 0) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0089, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008b, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008c, code lost:
        if (r10 == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008e, code lost:
        r9 = r9 ^ 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void IconCompatParcelizer(p040o.rsnScriptIntrinsicCreate r12, int r13, p040o.zzge.zzf.read r14) throws com.google.zxing.WriterException {
        /*
            int r0 = r14.read
            r1 = 1
            int r0 = r0 - r1
            int r2 = r14.MediaBrowserCompat$ItemReceiver
            int r2 = r2 - r1
            r3 = -1
            r4 = 0
            r6 = r3
            r5 = r4
        L_0x000b:
            if (r0 <= 0) goto L_0x00a4
            r7 = 6
            if (r0 != r7) goto L_0x0012
            int r0 = r0 + -1
        L_0x0012:
            if (r2 < 0) goto L_0x009e
            int r7 = r14.MediaBrowserCompat$ItemReceiver
            if (r2 >= r7) goto L_0x009e
            r7 = r4
        L_0x0019:
            r8 = 2
            if (r7 >= r8) goto L_0x009b
            int r8 = r0 - r7
            byte[][] r9 = r14.MediaBrowserCompat$CustomActionResultReceiver
            r9 = r9[r2]
            byte r9 = r9[r8]
            if (r9 != r3) goto L_0x0028
            r9 = r1
            goto L_0x0029
        L_0x0028:
            r9 = r4
        L_0x0029:
            if (r9 == 0) goto L_0x0097
            int r9 = r12.read
            if (r5 >= r9) goto L_0x0042
            r9 = r5 & 31
            int r9 = r1 << r9
            int[] r10 = r12.write
            int r11 = r5 / 32
            r10 = r10[r11]
            r9 = r9 & r10
            if (r9 == 0) goto L_0x003e
            r9 = r1
            goto L_0x003f
        L_0x003e:
            r9 = r4
        L_0x003f:
            int r5 = r5 + 1
            goto L_0x0043
        L_0x0042:
            r9 = r4
        L_0x0043:
            if (r13 == r3) goto L_0x0090
            switch(r13) {
                case 0: goto L_0x0083;
                case 1: goto L_0x0081;
                case 2: goto L_0x007e;
                case 3: goto L_0x0079;
                case 4: goto L_0x0074;
                case 5: goto L_0x006c;
                case 6: goto L_0x0064;
                case 7: goto L_0x005c;
                default: goto L_0x0048;
            }
        L_0x0048:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r14 = "Invalid mask pattern: "
            r12.<init>(r14)
            r12.append(r13)
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
        L_0x005c:
            int r10 = r2 * r8
            int r10 = r10 % 3
            int r11 = r2 + r8
            r11 = r11 & r1
            goto L_0x0085
        L_0x0064:
            int r10 = r2 * r8
            r11 = r10 & 1
            int r10 = r10 % 3
            int r10 = r10 + r11
            goto L_0x0086
        L_0x006c:
            int r10 = r2 * r8
            r11 = r10 & 1
            int r10 = r10 % 3
            int r10 = r10 + r11
            goto L_0x0087
        L_0x0074:
            int r10 = r2 / 2
            int r11 = r8 / 3
            goto L_0x0085
        L_0x0079:
            int r10 = r2 + r8
            int r10 = r10 % 3
            goto L_0x0087
        L_0x007e:
            int r10 = r8 % 3
            goto L_0x0087
        L_0x0081:
            r10 = r2
            goto L_0x0086
        L_0x0083:
            r10 = r2
            r11 = r8
        L_0x0085:
            int r10 = r10 + r11
        L_0x0086:
            r10 = r10 & r1
        L_0x0087:
            if (r10 != 0) goto L_0x008b
            r10 = r1
            goto L_0x008c
        L_0x008b:
            r10 = r4
        L_0x008c:
            if (r10 == 0) goto L_0x0090
            r9 = r9 ^ 1
        L_0x0090:
            byte[][] r10 = r14.MediaBrowserCompat$CustomActionResultReceiver
            r10 = r10[r2]
            byte r9 = (byte) r9
            r10[r8] = r9
        L_0x0097:
            int r7 = r7 + 1
            goto L_0x0019
        L_0x009b:
            int r2 = r2 + r6
            goto L_0x0012
        L_0x009e:
            int r6 = -r6
            int r2 = r2 + r6
            int r0 = r0 + -2
            goto L_0x000b
        L_0x00a4:
            int r13 = r12.read
            if (r5 != r13) goto L_0x00a9
            return
        L_0x00a9:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Not all bits consumed: "
            r13.<init>(r14)
            r13.append(r5)
            r14 = 47
            r13.append(r14)
            int r12 = r12.read
            r13.append(r12)
            com.google.zxing.WriterException r12 = new com.google.zxing.WriterException
            java.lang.String r13 = r13.toString()
            r12.<init>((java.lang.String) r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.calcOrderRecurse.IconCompatParcelizer(o.rsnScriptIntrinsicCreate, int, o.zzge$zzf$read):void");
    }

    private static void read(int i, int i2, zzge.zzf.read read2) throws WriterException {
        int i3 = 0;
        while (i3 < 8) {
            int i4 = i + i3;
            if (read2.MediaBrowserCompat$CustomActionResultReceiver[i2][i4] == -1) {
                read2.MediaBrowserCompat$CustomActionResultReceiver[i2][i4] = (byte) 0;
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }

    private static void MediaBrowserCompat$ItemReceiver(int i, int i2, zzge.zzf.read read2) throws WriterException {
        int i3 = 0;
        while (i3 < 7) {
            int i4 = i2 + i3;
            if (read2.MediaBrowserCompat$CustomActionResultReceiver[i4][i] == -1) {
                read2.MediaBrowserCompat$CustomActionResultReceiver[i4][i] = (byte) 0;
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }

    private static void MediaBrowserCompat$ItemReceiver(ScriptGroup.Binding binding, zzge.zzf.read read2) throws WriterException {
        if (binding.read >= 7) {
            rsnScriptIntrinsicCreate rsnscriptintrinsiccreate = new rsnScriptIntrinsicCreate();
            rsnscriptintrinsiccreate.write(binding.read, 6);
            rsnscriptintrinsiccreate.write(read(binding.read, 7973), 12);
            if (rsnscriptintrinsiccreate.read == 18) {
                int i = 17;
                for (int i2 = 0; i2 < 6; i2++) {
                    for (int i3 = 0; i3 < 3; i3++) {
                        int i4 = 1;
                        if (((1 << (i & 31)) & rsnscriptintrinsiccreate.write[i / 32]) == 0) {
                            i4 = 0;
                        }
                        i--;
                        byte b = (byte) i4;
                        read2.MediaBrowserCompat$CustomActionResultReceiver[(read2.MediaBrowserCompat$ItemReceiver - 11) + i3][i2] = b;
                        read2.MediaBrowserCompat$CustomActionResultReceiver[i2][(read2.MediaBrowserCompat$ItemReceiver - 11) + i3] = b;
                    }
                }
                return;
            }
            StringBuilder sb = new StringBuilder("should not happen but we got: ");
            sb.append(rsnscriptintrinsiccreate.read);
            throw new WriterException(sb.toString());
        }
    }
}
