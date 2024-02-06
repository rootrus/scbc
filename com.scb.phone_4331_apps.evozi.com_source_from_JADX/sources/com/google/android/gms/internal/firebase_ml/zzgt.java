package com.google.android.gms.internal.firebase_ml;

import net.p088sf.scuba.smartcards.ISO7816;
import net.p088sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.eac.EACTags;
import org.jmrtd.lds.CVCAFile;

public final class zzgt extends zzgu {
    private static final byte[] zzxh = {13, 10};
    private static final byte[] zzxi = {65, CVCAFile.CAR_TAG, 67, ISO7816.INS_REHABILITATE_CHV, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, ISOFileInfo.FCP_BYTE, 99, ISOFileInfo.FMD_BYTE, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, ISOFileInfo.FCI_BYTE, ISO7816.INS_MANAGE_CHANNEL, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, ISO7816.INS_DECREASE, 49, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] zzxj = {65, CVCAFile.CAR_TAG, 67, ISO7816.INS_REHABILITATE_CHV, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, ISOFileInfo.FCP_BYTE, 99, ISOFileInfo.FMD_BYTE, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, ISOFileInfo.FCI_BYTE, ISO7816.INS_MANAGE_CHANNEL, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, ISO7816.INS_DECREASE, 49, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] zzxk;
    private final byte[] zzxl;
    private final byte[] zzxm;
    private final byte[] zzxn;
    private final int zzxo;
    private final int zzxp;

    public zzgt() {
        this(0);
    }

    private zzgt(int i) {
        this(0, zzxh);
    }

    private zzgt(int i, byte[] bArr) {
        this(0, bArr, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzgt(int r9, byte[] r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            if (r10 != 0) goto L_0x0005
            r1 = r0
            goto L_0x0006
        L_0x0005:
            int r1 = r10.length
        L_0x0006:
            r2 = 3
            r3 = 4
            r8.<init>(r2, r3, r9, r1)
            byte[] r1 = zzxk
            r8.zzxm = r1
            r1 = 0
            r2 = 1
            if (r10 == 0) goto L_0x0060
            if (r10 == 0) goto L_0x002b
            int r4 = r10.length
            r5 = r0
        L_0x0017:
            if (r5 >= r4) goto L_0x002b
            byte r6 = r10[r5]
            byte r7 = r8.zzxr
            if (r7 == r6) goto L_0x0029
            boolean r6 = r8.zza(r6)
            if (r6 == 0) goto L_0x0026
            goto L_0x0029
        L_0x0026:
            int r5 = r5 + 1
            goto L_0x0017
        L_0x0029:
            r4 = r2
            goto L_0x002c
        L_0x002b:
            r4 = r0
        L_0x002c:
            if (r4 != 0) goto L_0x0043
            if (r9 <= 0) goto L_0x003e
            int r9 = r10.length
            int r9 = r9 + r3
            r8.zzxp = r9
            int r9 = r10.length
            byte[] r9 = new byte[r9]
            r8.zzxn = r9
            int r1 = r10.length
            java.lang.System.arraycopy(r10, r0, r9, r0, r1)
            goto L_0x0064
        L_0x003e:
            r8.zzxp = r3
            r8.zzxn = r1
            goto L_0x0064
        L_0x0043:
            java.lang.String r9 = com.google.android.gms.internal.firebase_ml.zzgw.zzd(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "lineSeparator must not contain base64 characters: ["
            r10.<init>(r11)
            r10.append(r9)
            java.lang.String r9 = "]"
            r10.append(r9)
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0060:
            r8.zzxp = r3
            r8.zzxn = r1
        L_0x0064:
            int r9 = r8.zzxp
            int r9 = r9 - r2
            r8.zzxo = r9
            if (r11 == 0) goto L_0x006e
            byte[] r9 = zzxj
            goto L_0x0070
        L_0x006e:
            byte[] r9 = zzxi
        L_0x0070:
            r8.zzxl = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzgt.<init>(int, byte[], boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(byte[] r8, int r9, int r10, com.google.android.gms.internal.firebase_ml.zzgv r11) {
        /*
            r7 = this;
            boolean r0 = r11.eof
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r1 = 1
            if (r10 >= 0) goto L_0x00e3
            r11.eof = r1
            int r8 = r11.zzxz
            if (r8 != 0) goto L_0x0014
            int r8 = r7.zzxu
            if (r8 != 0) goto L_0x0014
            return
        L_0x0014:
            int r8 = r7.zzxp
            byte[] r8 = r7.zza(r8, r11)
            int r9 = r11.pos
            int r10 = r11.zzxz
            if (r10 == 0) goto L_0x00c0
            r2 = 2
            if (r10 == r1) goto L_0x0082
            if (r10 != r2) goto L_0x006c
            int r10 = r11.pos
            int r1 = r10 + 1
            r11.pos = r1
            byte[] r1 = r7.zzxl
            int r3 = r11.zzxw
            int r3 = r3 >> 10
            r3 = r3 & 63
            byte r1 = r1[r3]
            r8[r10] = r1
            int r10 = r11.pos
            int r1 = r10 + 1
            r11.pos = r1
            byte[] r1 = r7.zzxl
            int r3 = r11.zzxw
            int r3 = r3 >> 4
            r3 = r3 & 63
            byte r1 = r1[r3]
            r8[r10] = r1
            int r10 = r11.pos
            int r1 = r10 + 1
            r11.pos = r1
            byte[] r1 = r7.zzxl
            int r3 = r11.zzxw
            int r2 = r3 << 2
            r2 = r2 & 63
            byte r1 = r1[r2]
            r8[r10] = r1
            byte[] r10 = r7.zzxl
            byte[] r1 = zzxi
            if (r10 != r1) goto L_0x00c0
            int r10 = r11.pos
            int r1 = r10 + 1
            r11.pos = r1
            byte r1 = r7.zzxr
            r8[r10] = r1
            goto L_0x00c0
        L_0x006c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Impossible modulus "
            r8.<init>(r9)
            int r9 = r11.zzxz
            r8.append(r9)
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        L_0x0082:
            int r10 = r11.pos
            int r1 = r10 + 1
            r11.pos = r1
            byte[] r1 = r7.zzxl
            int r3 = r11.zzxw
            int r2 = r3 >> 2
            r2 = r2 & 63
            byte r1 = r1[r2]
            r8[r10] = r1
            int r10 = r11.pos
            int r1 = r10 + 1
            r11.pos = r1
            byte[] r1 = r7.zzxl
            int r2 = r11.zzxw
            int r2 = r2 << 4
            r2 = r2 & 63
            byte r1 = r1[r2]
            r8[r10] = r1
            byte[] r10 = r7.zzxl
            byte[] r1 = zzxi
            if (r10 != r1) goto L_0x00c0
            int r10 = r11.pos
            int r1 = r10 + 1
            r11.pos = r1
            byte r1 = r7.zzxr
            r8[r10] = r1
            int r10 = r11.pos
            int r1 = r10 + 1
            r11.pos = r1
            byte r1 = r7.zzxr
            r8[r10] = r1
        L_0x00c0:
            int r10 = r11.zzxy
            int r1 = r11.pos
            int r1 = r1 - r9
            int r10 = r10 + r1
            r11.zzxy = r10
            int r9 = r7.zzxu
            if (r9 <= 0) goto L_0x00e2
            int r9 = r11.zzxy
            if (r9 <= 0) goto L_0x00e2
            byte[] r9 = r7.zzxn
            int r10 = r11.pos
            byte[] r1 = r7.zzxn
            int r1 = r1.length
            java.lang.System.arraycopy(r9, r0, r8, r10, r1)
            int r8 = r11.pos
            byte[] r9 = r7.zzxn
            int r9 = r9.length
            int r8 = r8 + r9
            r11.pos = r8
        L_0x00e2:
            return
        L_0x00e3:
            r2 = r0
        L_0x00e4:
            if (r2 >= r10) goto L_0x0174
            int r3 = r7.zzxp
            byte[] r3 = r7.zza(r3, r11)
            int r4 = r11.zzxz
            int r4 = r4 + r1
            int r4 = r4 % 3
            r11.zzxz = r4
            byte r4 = r8[r9]
            if (r4 >= 0) goto L_0x00f9
            int r4 = r4 + 256
        L_0x00f9:
            int r5 = r11.zzxw
            int r5 = r5 << 8
            int r5 = r5 + r4
            r11.zzxw = r5
            int r4 = r11.zzxz
            if (r4 != 0) goto L_0x016e
            int r4 = r11.pos
            int r5 = r4 + 1
            r11.pos = r5
            byte[] r5 = r7.zzxl
            int r6 = r11.zzxw
            int r6 = r6 >> 18
            r6 = r6 & 63
            byte r5 = r5[r6]
            r3[r4] = r5
            int r4 = r11.pos
            int r5 = r4 + 1
            r11.pos = r5
            byte[] r5 = r7.zzxl
            int r6 = r11.zzxw
            int r6 = r6 >> 12
            r6 = r6 & 63
            byte r5 = r5[r6]
            r3[r4] = r5
            int r4 = r11.pos
            int r5 = r4 + 1
            r11.pos = r5
            byte[] r5 = r7.zzxl
            int r6 = r11.zzxw
            int r6 = r6 >> 6
            r6 = r6 & 63
            byte r5 = r5[r6]
            r3[r4] = r5
            int r4 = r11.pos
            int r5 = r4 + 1
            r11.pos = r5
            byte[] r5 = r7.zzxl
            int r6 = r11.zzxw
            r6 = r6 & 63
            byte r5 = r5[r6]
            r3[r4] = r5
            int r4 = r11.zzxy
            int r4 = r4 + 4
            r11.zzxy = r4
            int r4 = r7.zzxu
            if (r4 <= 0) goto L_0x016e
            int r4 = r7.zzxu
            int r5 = r11.zzxy
            if (r4 > r5) goto L_0x016e
            byte[] r4 = r7.zzxn
            int r5 = r11.pos
            byte[] r6 = r7.zzxn
            int r6 = r6.length
            java.lang.System.arraycopy(r4, r0, r3, r5, r6)
            int r3 = r11.pos
            byte[] r4 = r7.zzxn
            int r4 = r4.length
            int r3 = r3 + r4
            r11.pos = r3
            r11.zzxy = r0
        L_0x016e:
            int r2 = r2 + 1
            int r9 = r9 + 1
            goto L_0x00e4
        L_0x0174:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzgt.zza(byte[], int, int, com.google.android.gms.internal.firebase_ml.zzgv):void");
    }

    public static String zzb(byte[] bArr) {
        if (!(bArr == null || bArr.length == 0)) {
            zzgt zzgt = new zzgt(0, zzxh, true);
            long zzc = zzgt.zzc(bArr);
            if (zzc > 2147483647L) {
                throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + zzc + ") than the specified maximum size of 2147483647");
            } else if (!(bArr == null || bArr.length == 0)) {
                zzgv zzgv = new zzgv();
                zzgt.zza(bArr, 0, bArr.length, zzgv);
                zzgt.zza(bArr, 0, -1, zzgv);
                int i = zzgv.pos - zzgv.zzxx;
                byte[] bArr2 = new byte[i];
                if (zzgv.buffer != null) {
                    int min = Math.min(zzgv.buffer != null ? zzgv.pos - zzgv.zzxx : 0, i);
                    System.arraycopy(zzgv.buffer, zzgv.zzxx, bArr2, 0, min);
                    zzgv.zzxx += min;
                    if (zzgv.zzxx >= zzgv.pos) {
                        zzgv.buffer = null;
                    }
                } else {
                    boolean z = zzgv.eof;
                }
                bArr = bArr2;
            }
        }
        return zzgw.zzd(bArr);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(byte b) {
        if (b < 0) {
            return false;
        }
        byte[] bArr = this.zzxm;
        return b < bArr.length && bArr[b] != -1;
    }

    static {
        byte[] bArr = new byte[EACTags.SECURITY_ENVIRONMENT_TEMPLATE];
        // fill-array-data instruction
        bArr[0] = -1;
        bArr[1] = -1;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = -1;
        bArr[5] = -1;
        bArr[6] = -1;
        bArr[7] = -1;
        bArr[8] = -1;
        bArr[9] = -1;
        bArr[10] = -1;
        bArr[11] = -1;
        bArr[12] = -1;
        bArr[13] = -1;
        bArr[14] = -1;
        bArr[15] = -1;
        bArr[16] = -1;
        bArr[17] = -1;
        bArr[18] = -1;
        bArr[19] = -1;
        bArr[20] = -1;
        bArr[21] = -1;
        bArr[22] = -1;
        bArr[23] = -1;
        bArr[24] = -1;
        bArr[25] = -1;
        bArr[26] = -1;
        bArr[27] = -1;
        bArr[28] = -1;
        bArr[29] = -1;
        bArr[30] = -1;
        bArr[31] = -1;
        bArr[32] = -1;
        bArr[33] = -1;
        bArr[34] = -1;
        bArr[35] = -1;
        bArr[36] = -1;
        bArr[37] = -1;
        bArr[38] = -1;
        bArr[39] = -1;
        bArr[40] = -1;
        bArr[41] = -1;
        bArr[42] = -1;
        bArr[43] = 62;
        bArr[44] = -1;
        bArr[45] = 62;
        bArr[46] = -1;
        bArr[47] = 63;
        bArr[48] = 52;
        bArr[49] = 53;
        bArr[50] = 54;
        bArr[51] = 55;
        bArr[52] = 56;
        bArr[53] = 57;
        bArr[54] = 58;
        bArr[55] = 59;
        bArr[56] = 60;
        bArr[57] = 61;
        bArr[58] = -1;
        bArr[59] = -1;
        bArr[60] = -1;
        bArr[61] = -1;
        bArr[62] = -1;
        bArr[63] = -1;
        bArr[64] = -1;
        bArr[65] = 0;
        bArr[66] = 1;
        bArr[67] = 2;
        bArr[68] = 3;
        bArr[69] = 4;
        bArr[70] = 5;
        bArr[71] = 6;
        bArr[72] = 7;
        bArr[73] = 8;
        bArr[74] = 9;
        bArr[75] = 10;
        bArr[76] = 11;
        bArr[77] = 12;
        bArr[78] = 13;
        bArr[79] = 14;
        bArr[80] = 15;
        bArr[81] = 16;
        bArr[82] = 17;
        bArr[83] = 18;
        bArr[84] = 19;
        bArr[85] = 20;
        bArr[86] = 21;
        bArr[87] = 22;
        bArr[88] = 23;
        bArr[89] = 24;
        bArr[90] = 25;
        bArr[91] = -1;
        bArr[92] = -1;
        bArr[93] = -1;
        bArr[94] = -1;
        bArr[95] = 63;
        bArr[96] = -1;
        bArr[97] = 26;
        bArr[98] = 27;
        bArr[99] = 28;
        bArr[100] = 29;
        bArr[101] = 30;
        bArr[102] = 31;
        bArr[103] = 32;
        bArr[104] = 33;
        bArr[105] = 34;
        bArr[106] = 35;
        bArr[107] = 36;
        bArr[108] = 37;
        bArr[109] = 38;
        bArr[110] = 39;
        bArr[111] = 40;
        bArr[112] = 41;
        bArr[113] = 42;
        bArr[114] = 43;
        bArr[115] = 44;
        bArr[116] = 45;
        bArr[117] = 46;
        bArr[118] = 47;
        bArr[119] = 48;
        bArr[120] = 49;
        bArr[121] = 50;
        bArr[122] = 51;
        zzxk = bArr;
    }
}
