package okhttp3.repackaged.internal.framed;

import com.google.android.gms.location.places.Place;
import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.asn1.eac.EACTags;

/* renamed from: okhttp3.repackaged.internal.framed.b */
class C10260b {
    private static final int[] akC = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, Place.TYPE_POSTAL_CODE_PREFIX, Place.TYPE_POSTAL_TOWN, 4090, 8185, 21, 248, 2042, Place.TYPE_PREMISE, Place.TYPE_ROOM, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, Place.TYPE_ROUTE, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, EACTags.SECURITY_ENVIRONMENT_TEMPLATE, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};
    private static final byte[] akD = {13, Ascii.ETB, 28, 28, 28, 28, 28, 28, 28, Ascii.CAN, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, Ascii.DC4, Ascii.SYN, Ascii.DC4, Ascii.DC4, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.CAN, Ascii.ETB, Ascii.CAN, Ascii.CAN, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.CAN, Ascii.SYN, Ascii.NAK, Ascii.DC4, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.NAK, Ascii.ETB, Ascii.SYN, Ascii.SYN, Ascii.CAN, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.NAK, Ascii.NAK, Ascii.SYN, Ascii.NAK, Ascii.ETB, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.DC4, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.SUB, Ascii.SUB, Ascii.DC4, 19, Ascii.SYN, Ascii.ETB, Ascii.SYN, Ascii.f3248EM, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.ESC, Ascii.ESC, Ascii.SUB, Ascii.CAN, Ascii.f3248EM, 19, Ascii.NAK, Ascii.SUB, Ascii.ESC, Ascii.ESC, Ascii.SUB, Ascii.ESC, Ascii.CAN, Ascii.NAK, Ascii.NAK, Ascii.SUB, Ascii.SUB, 28, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.DC4, Ascii.CAN, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.NAK, Ascii.NAK, Ascii.ETB, Ascii.SYN, Ascii.SYN, Ascii.f3248EM, Ascii.f3248EM, Ascii.CAN, Ascii.CAN, Ascii.SUB, Ascii.ETB, Ascii.SUB, Ascii.ESC, Ascii.SUB, Ascii.SUB, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, 28, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.SUB};
    private static final C10260b akE = new C10260b();
    private final C10261a akF = new C10261a();

    /* renamed from: uO */
    public static C10260b m6099uO() {
        return akE;
    }

    private C10260b() {
        m6100uP();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo58815a(byte[] r9, java.io.OutputStream r10) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = r1
            r1 = r0
        L_0x0005:
            int r4 = r9.length
            r5 = 8
            r6 = 255(0xff, float:3.57E-43)
            if (r0 >= r4) goto L_0x0029
            byte r4 = r9[r0]
            r4 = r4 & r6
            int[] r6 = akC
            r6 = r6[r4]
            byte[] r7 = akD
            byte r4 = r7[r4]
            long r2 = r2 << r4
            long r6 = (long) r6
            long r2 = r2 | r6
            int r1 = r1 + r4
        L_0x001b:
            if (r1 < r5) goto L_0x0026
            int r1 = r1 + -8
            long r6 = r2 >> r1
            int r4 = (int) r6
            r10.write(r4)
            goto L_0x001b
        L_0x0026:
            int r0 = r0 + 1
            goto L_0x0005
        L_0x0029:
            if (r1 <= 0) goto L_0x0036
            int r9 = r6 >>> r1
            long r6 = (long) r9
            int r5 = r5 - r1
            long r0 = r2 << r5
            long r0 = r0 | r6
            int r9 = (int) r0
            r10.write(r9)
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.internal.framed.C10260b.mo58815a(byte[], java.io.OutputStream):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo58817l(byte[] bArr) {
        long j = 0;
        for (byte b : bArr) {
            j += (long) akD[b & 255];
        }
        return (int) ((j + 7) >> 3);
    }

    /* access modifiers changed from: package-private */
    public byte[] decode(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C10261a aVar = this.akF;
        int i = 0;
        byte b = 0;
        for (byte b2 : bArr) {
            b = (b << 8) | (b2 & 255);
            i += 8;
            while (i >= 8) {
                aVar = aVar.akG[(b >>> (i - 8)) & 255];
                if (aVar.akG == null) {
                    byteArrayOutputStream.write(aVar.symbol);
                    i -= aVar.terminalBits;
                    aVar = this.akF;
                } else {
                    i -= 8;
                }
            }
        }
        while (i > 0) {
            C10261a aVar2 = aVar.akG[(b << (8 - i)) & 255];
            if (aVar2.akG != null || aVar2.terminalBits > i) {
                break;
            }
            byteArrayOutputStream.write(aVar2.symbol);
            i -= aVar2.terminalBits;
            aVar = this.akF;
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: uP */
    private void m6100uP() {
        int i = 0;
        while (true) {
            byte[] bArr = akD;
            if (i < bArr.length) {
                m6098a(i, akC[i], bArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m6098a(int i, int i2, byte b) {
        C10261a aVar = new C10261a(i, b);
        C10261a aVar2 = this.akF;
        while (b > 8) {
            b = (byte) (b - 8);
            int i3 = (i2 >>> b) & 255;
            if (aVar2.akG != null) {
                if (aVar2.akG[i3] == null) {
                    aVar2.akG[i3] = new C10261a();
                }
                aVar2 = aVar2.akG[i3];
            } else {
                throw new IllegalStateException("invalid dictionary: prefix not unique");
            }
        }
        int i4 = 8 - b;
        int i5 = (i2 << i4) & 255;
        for (int i6 = i5; i6 < (1 << i4) + i5; i6++) {
            aVar2.akG[i6] = aVar;
        }
    }

    /* renamed from: okhttp3.repackaged.internal.framed.b$a */
    static final class C10261a {
        /* access modifiers changed from: private */
        public final C10261a[] akG;
        /* access modifiers changed from: private */
        public final int symbol;
        /* access modifiers changed from: private */
        public final int terminalBits;

        C10261a() {
            this.akG = new C10261a[256];
            this.symbol = 0;
            this.terminalBits = 0;
        }

        C10261a(int i, int i2) {
            this.akG = null;
            this.symbol = i;
            int i3 = i2 & 7;
            this.terminalBits = i3 == 0 ? 8 : i3;
        }
    }
}
