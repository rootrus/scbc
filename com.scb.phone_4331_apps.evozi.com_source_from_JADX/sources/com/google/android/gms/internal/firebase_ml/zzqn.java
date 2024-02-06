package com.google.android.gms.internal.firebase_ml;

import com.google.gson.Gson;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

public final class zzqn implements Closeable {
    private static final char[] zzazx = Gson.JSON_NON_EXECUTABLE_PREFIX.toCharArray();

    /* renamed from: in */
    private final Reader f3235in;
    private int limit = 0;
    private int pos = 0;
    private boolean zzazy = false;
    private final char[] zzazz = new char[1024];
    private int zzbaa = 0;
    private int zzbab = 0;
    private int zzbac = 0;
    private long zzbad;
    private int zzbae;
    private String zzbaf;
    private int[] zzbag;
    private int zzbah;
    private String[] zzbai;
    private int[] zzbaj;

    public zzqn(Reader reader) {
        int[] iArr = new int[32];
        this.zzbag = iArr;
        this.zzbah = 0;
        this.zzbah = 1;
        iArr[0] = 6;
        this.zzbai = new String[32];
        this.zzbaj = new int[32];
        if (reader != null) {
            this.f3235in = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    public final void setLenient(boolean z) {
        this.zzazy = true;
    }

    public final void beginArray() throws IOException {
        int i = this.zzbac;
        if (i == 0) {
            i = zznr();
        }
        if (i == 3) {
            zzbs(1);
            this.zzbaj[this.zzbah - 1] = 0;
            this.zzbac = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + zznq() + zznv());
    }

    public final void endArray() throws IOException {
        int i = this.zzbac;
        if (i == 0) {
            i = zznr();
        }
        if (i == 4) {
            int i2 = this.zzbah - 1;
            this.zzbah = i2;
            int[] iArr = this.zzbaj;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.zzbac = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + zznq() + zznv());
    }

    public final void beginObject() throws IOException {
        int i = this.zzbac;
        if (i == 0) {
            i = zznr();
        }
        if (i == 1) {
            zzbs(3);
            this.zzbac = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + zznq() + zznv());
    }

    public final void endObject() throws IOException {
        int i = this.zzbac;
        if (i == 0) {
            i = zznr();
        }
        if (i == 2) {
            int i2 = this.zzbah - 1;
            this.zzbah = i2;
            this.zzbai[i2] = null;
            int[] iArr = this.zzbaj;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.zzbac = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + zznq() + zznv());
    }

    public final zzqp zznq() throws IOException {
        int i = this.zzbac;
        if (i == 0) {
            i = zznr();
        }
        switch (i) {
            case 1:
                return zzqp.BEGIN_OBJECT;
            case 2:
                return zzqp.END_OBJECT;
            case 3:
                return zzqp.BEGIN_ARRAY;
            case 4:
                return zzqp.END_ARRAY;
            case 5:
            case 6:
                return zzqp.zzbar;
            case 7:
                return zzqp.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return zzqp.STRING;
            case 12:
            case 13:
            case 14:
                return zzqp.NAME;
            case 15:
            case 16:
                return zzqp.NUMBER;
            case 17:
                return zzqp.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01f8, code lost:
        if (zze(r13) == false) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01fb, code lost:
        if (r9 != 2) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x01fd, code lost:
        if (r10 == false) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0203, code lost:
        if (r5 != Long.MIN_VALUE) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0205, code lost:
        if (r11 == false) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0207, code lost:
        if (r11 == false) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x020a, code lost:
        r5 = -r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x020b, code lost:
        r0.zzbad = r5;
        r0.pos += r8;
        r13 = 15;
        r0.zzbac = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0219, code lost:
        if (r9 == 2) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x021c, code lost:
        if (r9 == 4) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x021f, code lost:
        if (r9 != 7) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0221, code lost:
        r0.zzbae = r8;
        r13 = 16;
        r0.zzbac = 16;
     */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0170 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0171  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zznr() throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            int[] r1 = r0.zzbag
            int r2 = r0.zzbah
            r3 = 1
            int r2 = r2 - r3
            r4 = r1[r2]
            r5 = 93
            r8 = 8
            r9 = 59
            r10 = 44
            r11 = 6
            r12 = 3
            r13 = 0
            r14 = 7
            r15 = 5
            r6 = 4
            r7 = 2
            if (r4 != r3) goto L_0x001f
            r1[r2] = r7
            goto L_0x00cd
        L_0x001f:
            if (r4 != r7) goto L_0x003a
            int r1 = r0.zzaf(r3)
            if (r1 == r10) goto L_0x00cd
            if (r1 == r9) goto L_0x0035
            if (r1 != r5) goto L_0x002e
            r0.zzbac = r6
            return r6
        L_0x002e:
            java.lang.String r1 = "Unterminated array"
            java.io.IOException r1 = r0.zzci(r1)
            throw r1
        L_0x0035:
            r18.zznt()
            goto L_0x00cd
        L_0x003a:
            if (r4 == r12) goto L_0x029f
            if (r4 != r15) goto L_0x0040
            goto L_0x029f
        L_0x0040:
            if (r4 != r6) goto L_0x0074
            r1[r2] = r15
            int r1 = r0.zzaf(r3)
            r2 = 58
            if (r1 == r2) goto L_0x00cd
            r2 = 61
            if (r1 != r2) goto L_0x006d
            r18.zznt()
            int r1 = r0.pos
            int r2 = r0.limit
            if (r1 < r2) goto L_0x005f
            boolean r1 = r0.zzbt(r3)
            if (r1 == 0) goto L_0x00cd
        L_0x005f:
            char[] r1 = r0.zzazz
            int r2 = r0.pos
            char r1 = r1[r2]
            r6 = 62
            if (r1 != r6) goto L_0x00cd
            int r2 = r2 + r3
            r0.pos = r2
            goto L_0x00cd
        L_0x006d:
            java.lang.String r1 = "Expected ':'"
            java.io.IOException r1 = r0.zzci(r1)
            throw r1
        L_0x0074:
            if (r4 != r11) goto L_0x00b4
            boolean r1 = r0.zzazy
            if (r1 == 0) goto L_0x00ac
            r0.zzaf(r3)
            int r1 = r0.pos
            int r1 = r1 - r3
            r0.pos = r1
            char[] r2 = zzazx
            int r6 = r2.length
            int r1 = r1 + r6
            int r6 = r0.limit
            if (r1 <= r6) goto L_0x0091
            int r1 = r2.length
            boolean r1 = r0.zzbt(r1)
            if (r1 == 0) goto L_0x00ac
        L_0x0091:
            r1 = r13
        L_0x0092:
            char[] r2 = zzazx
            int r6 = r2.length
            if (r1 >= r6) goto L_0x00a6
            char[] r6 = r0.zzazz
            int r11 = r0.pos
            int r11 = r11 + r1
            char r6 = r6[r11]
            char r2 = r2[r1]
            if (r6 != r2) goto L_0x00ac
            int r1 = r1 + 1
            r11 = 6
            goto L_0x0092
        L_0x00a6:
            int r1 = r0.pos
            int r2 = r2.length
            int r1 = r1 + r2
            r0.pos = r1
        L_0x00ac:
            int[] r1 = r0.zzbag
            int r2 = r0.zzbah
            int r2 = r2 - r3
            r1[r2] = r14
            goto L_0x00cd
        L_0x00b4:
            if (r4 != r14) goto L_0x00cb
            int r1 = r0.zzaf(r13)
            r2 = -1
            if (r1 != r2) goto L_0x00c2
            r1 = 17
            r0.zzbac = r1
            return r1
        L_0x00c2:
            r18.zznt()
            int r1 = r0.pos
            int r1 = r1 - r3
            r0.pos = r1
            goto L_0x00cd
        L_0x00cb:
            if (r4 == r8) goto L_0x0297
        L_0x00cd:
            int r1 = r0.zzaf(r3)
            r2 = 34
            if (r1 == r2) goto L_0x0292
            r2 = 39
            if (r1 == r2) goto L_0x028c
            if (r1 == r10) goto L_0x0274
            if (r1 == r9) goto L_0x0274
            r2 = 91
            if (r1 == r2) goto L_0x0271
            if (r1 == r5) goto L_0x026b
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x0268
            int r1 = r0.pos
            int r1 = r1 - r3
            r0.pos = r1
            char[] r2 = r0.zzazz
            char r1 = r2[r1]
            r2 = 116(0x74, float:1.63E-43)
            if (r1 == r2) goto L_0x0116
            r2 = 84
            if (r1 != r2) goto L_0x00f9
            goto L_0x0116
        L_0x00f9:
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L_0x0110
            r2 = 70
            if (r1 != r2) goto L_0x0102
            goto L_0x0110
        L_0x0102:
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 == r2) goto L_0x010a
            r2 = 78
            if (r1 != r2) goto L_0x0165
        L_0x010a:
            java.lang.String r1 = "null"
            java.lang.String r2 = "NULL"
            r4 = r14
            goto L_0x011b
        L_0x0110:
            java.lang.String r1 = "false"
            java.lang.String r2 = "FALSE"
            r4 = 6
            goto L_0x011b
        L_0x0116:
            java.lang.String r1 = "true"
            java.lang.String r2 = "TRUE"
            r4 = r15
        L_0x011b:
            int r5 = r1.length()
            r6 = r3
        L_0x0120:
            if (r6 >= r5) goto L_0x0149
            int r8 = r0.pos
            int r8 = r8 + r6
            int r9 = r0.limit
            if (r8 < r9) goto L_0x0132
            int r8 = r6 + 1
            boolean r8 = r0.zzbt(r8)
            if (r8 != 0) goto L_0x0132
            goto L_0x0165
        L_0x0132:
            char[] r8 = r0.zzazz
            int r9 = r0.pos
            int r9 = r9 + r6
            char r8 = r8[r9]
            char r9 = r1.charAt(r6)
            if (r8 == r9) goto L_0x0146
            char r9 = r2.charAt(r6)
            if (r8 == r9) goto L_0x0146
            goto L_0x0165
        L_0x0146:
            int r6 = r6 + 1
            goto L_0x0120
        L_0x0149:
            int r1 = r0.pos
            int r1 = r1 + r5
            int r2 = r0.limit
            if (r1 < r2) goto L_0x0158
            int r1 = r5 + 1
            boolean r1 = r0.zzbt(r1)
            if (r1 == 0) goto L_0x0167
        L_0x0158:
            char[] r1 = r0.zzazz
            int r2 = r0.pos
            int r2 = r2 + r5
            char r1 = r1[r2]
            boolean r1 = r0.zze(r1)
            if (r1 == 0) goto L_0x0167
        L_0x0165:
            r4 = r13
            goto L_0x016e
        L_0x0167:
            int r1 = r0.pos
            int r1 = r1 + r5
            r0.pos = r1
            r0.zzbac = r4
        L_0x016e:
            if (r4 == 0) goto L_0x0171
            return r4
        L_0x0171:
            char[] r1 = r0.zzazz
            int r2 = r0.pos
            int r4 = r0.limit
            r5 = 0
            r10 = r3
            r8 = r13
            r9 = r8
            r11 = r9
        L_0x017d:
            int r13 = r2 + r8
            if (r13 != r4) goto L_0x0190
            int r2 = r1.length
            if (r8 == r2) goto L_0x0249
            int r2 = r8 + 1
            boolean r2 = r0.zzbt(r2)
            if (r2 == 0) goto L_0x01fb
            int r2 = r0.pos
            int r4 = r0.limit
        L_0x0190:
            int r13 = r2 + r8
            char r13 = r1[r13]
            r14 = 43
            if (r13 == r14) goto L_0x0240
            r14 = 69
            if (r13 == r14) goto L_0x0238
            r14 = 101(0x65, float:1.42E-43)
            if (r13 == r14) goto L_0x0238
            r14 = 45
            if (r13 == r14) goto L_0x022f
            r14 = 46
            if (r13 == r14) goto L_0x022a
            r14 = 48
            if (r13 < r14) goto L_0x01f4
            r14 = 57
            if (r13 <= r14) goto L_0x01b1
            goto L_0x01f4
        L_0x01b1:
            if (r9 == r3) goto L_0x01ed
            if (r9 != 0) goto L_0x01b6
            goto L_0x01ed
        L_0x01b6:
            if (r9 != r7) goto L_0x01df
            r16 = 0
            int r14 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r14 == 0) goto L_0x0249
            r16 = 10
            long r16 = r16 * r5
            int r13 = r13 + -48
            long r13 = (long) r13
            long r16 = r16 - r13
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r13 > 0) goto L_0x01d9
            if (r13 != 0) goto L_0x01d7
            int r5 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x01d7
            goto L_0x01d9
        L_0x01d7:
            r5 = 0
            goto L_0x01da
        L_0x01d9:
            r5 = r3
        L_0x01da:
            r5 = r5 & r10
            r10 = r5
            r5 = r16
            goto L_0x01e2
        L_0x01df:
            if (r9 != r12) goto L_0x01e5
            r9 = 4
        L_0x01e2:
            r14 = 6
            goto L_0x0244
        L_0x01e5:
            r14 = 6
            if (r9 == r15) goto L_0x01ea
            if (r9 != r14) goto L_0x0244
        L_0x01ea:
            r9 = 7
            goto L_0x0244
        L_0x01ed:
            r14 = 6
            int r13 = r13 + -48
            int r5 = -r13
            long r5 = (long) r5
            r9 = r7
            goto L_0x0244
        L_0x01f4:
            boolean r1 = r0.zze(r13)
            if (r1 == 0) goto L_0x01fb
            goto L_0x0249
        L_0x01fb:
            if (r9 != r7) goto L_0x0219
            if (r10 == 0) goto L_0x0219
            r1 = -9223372036854775808
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0207
            if (r11 == 0) goto L_0x0219
        L_0x0207:
            if (r11 == 0) goto L_0x020a
            goto L_0x020b
        L_0x020a:
            long r5 = -r5
        L_0x020b:
            r0.zzbad = r5
            int r1 = r0.pos
            int r1 = r1 + r8
            r0.pos = r1
            r13 = 15
            r1 = 15
            r0.zzbac = r1
            goto L_0x024a
        L_0x0219:
            if (r9 == r7) goto L_0x0221
            r1 = 4
            if (r9 == r1) goto L_0x0221
            r1 = 7
            if (r9 != r1) goto L_0x0249
        L_0x0221:
            r0.zzbae = r8
            r13 = 16
            r1 = 16
            r0.zzbac = r1
            goto L_0x024a
        L_0x022a:
            r14 = 6
            if (r9 != r7) goto L_0x0249
            r9 = r12
            goto L_0x0244
        L_0x022f:
            r14 = 6
            if (r9 != 0) goto L_0x0235
            r9 = r3
            r11 = r9
            goto L_0x0244
        L_0x0235:
            if (r9 != r15) goto L_0x0249
            goto L_0x0243
        L_0x0238:
            r14 = 6
            if (r9 == r7) goto L_0x023e
            r13 = 4
            if (r9 != r13) goto L_0x0249
        L_0x023e:
            r9 = r15
            goto L_0x0244
        L_0x0240:
            r14 = 6
            if (r9 != r15) goto L_0x0249
        L_0x0243:
            r9 = r14
        L_0x0244:
            int r8 = r8 + 1
            r14 = 7
            goto L_0x017d
        L_0x0249:
            r13 = 0
        L_0x024a:
            if (r13 == 0) goto L_0x024d
            return r13
        L_0x024d:
            char[] r1 = r0.zzazz
            int r2 = r0.pos
            char r1 = r1[r2]
            boolean r1 = r0.zze(r1)
            if (r1 == 0) goto L_0x0261
            r18.zznt()
            r1 = 10
            r0.zzbac = r1
            return r1
        L_0x0261:
            java.lang.String r1 = "Expected value"
            java.io.IOException r1 = r0.zzci(r1)
            throw r1
        L_0x0268:
            r0.zzbac = r3
            return r3
        L_0x026b:
            if (r4 != r3) goto L_0x0274
            r1 = 4
            r0.zzbac = r1
            return r1
        L_0x0271:
            r0.zzbac = r12
            return r12
        L_0x0274:
            if (r4 == r3) goto L_0x0280
            if (r4 != r7) goto L_0x0279
            goto L_0x0280
        L_0x0279:
            java.lang.String r1 = "Unexpected value"
            java.io.IOException r1 = r0.zzci(r1)
            throw r1
        L_0x0280:
            r18.zznt()
            int r1 = r0.pos
            int r1 = r1 - r3
            r0.pos = r1
            r1 = 7
            r0.zzbac = r1
            return r1
        L_0x028c:
            r18.zznt()
            r0.zzbac = r8
            return r8
        L_0x0292:
            r1 = 9
            r0.zzbac = r1
            return r1
        L_0x0297:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x029f:
            int[] r1 = r0.zzbag
            int r2 = r0.zzbah
            int r2 = r2 - r3
            r5 = 4
            r1[r2] = r5
            r1 = 125(0x7d, float:1.75E-43)
            if (r4 != r15) goto L_0x02c2
            int r2 = r0.zzaf(r3)
            if (r2 == r10) goto L_0x02c2
            if (r2 == r9) goto L_0x02bf
            if (r2 != r1) goto L_0x02b8
            r0.zzbac = r7
            return r7
        L_0x02b8:
            java.lang.String r1 = "Unterminated object"
            java.io.IOException r1 = r0.zzci(r1)
            throw r1
        L_0x02bf:
            r18.zznt()
        L_0x02c2:
            int r2 = r0.zzaf(r3)
            r5 = 34
            if (r2 == r5) goto L_0x02fd
            r5 = 39
            if (r2 == r5) goto L_0x02f5
            java.lang.String r5 = "Expected name"
            if (r2 == r1) goto L_0x02eb
            r18.zznt()
            int r1 = r0.pos
            int r1 = r1 - r3
            r0.pos = r1
            char r1 = (char) r2
            boolean r1 = r0.zze(r1)
            if (r1 == 0) goto L_0x02e6
            r1 = 14
            r0.zzbac = r1
            return r1
        L_0x02e6:
            java.io.IOException r1 = r0.zzci(r5)
            throw r1
        L_0x02eb:
            if (r4 == r15) goto L_0x02f0
            r0.zzbac = r7
            return r7
        L_0x02f0:
            java.io.IOException r1 = r0.zzci(r5)
            throw r1
        L_0x02f5:
            r18.zznt()
            r1 = 12
            r0.zzbac = r1
            return r1
        L_0x02fd:
            r1 = 13
            r0.zzbac = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzqn.zznr():int");
    }

    private final boolean zze(char c) throws IOException {
        if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        zznt();
        return false;
    }

    public final String nextName() throws IOException {
        String str;
        int i = this.zzbac;
        if (i == 0) {
            i = zznr();
        }
        if (i == 14) {
            str = zzns();
        } else if (i == 12) {
            str = zzf('\'');
        } else if (i == 13) {
            str = zzf('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + zznq() + zznv());
        }
        this.zzbac = 0;
        this.zzbai[this.zzbah - 1] = str;
        return str;
    }

    public final String nextString() throws IOException {
        int i = this.zzbac;
        if (i == 0) {
            i = zznr();
        }
        String str = null;
        if (i == 10) {
            str = zzns();
        } else if (i == 8) {
            str = zzf('\'');
        } else if (i == 9) {
            str = zzf('\"');
        } else if (i == 11) {
            this.zzbaf = null;
        } else if (i == 15) {
            str = Long.toString(this.zzbad);
        } else if (i == 16) {
            str = new String(this.zzazz, this.pos, this.zzbae);
            this.pos += this.zzbae;
        } else {
            throw new IllegalStateException("Expected a string but was " + zznq() + zznv());
        }
        this.zzbac = 0;
        int[] iArr = this.zzbaj;
        int i2 = this.zzbah - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public final boolean nextBoolean() throws IOException {
        int i = this.zzbac;
        if (i == 0) {
            i = zznr();
        }
        if (i == 5) {
            this.zzbac = 0;
            int[] iArr = this.zzbaj;
            int i2 = this.zzbah - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.zzbac = 0;
            int[] iArr2 = this.zzbaj;
            int i3 = this.zzbah - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + zznq() + zznv());
        }
    }

    public final void nextNull() throws IOException {
        int i = this.zzbac;
        if (i == 0) {
            i = zznr();
        }
        if (i == 7) {
            this.zzbac = 0;
            int[] iArr = this.zzbaj;
            int i2 = this.zzbah - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + zznq() + zznv());
    }

    private final String zzf(char c) throws IOException {
        char[] cArr = this.zzazz;
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = this.pos;
            int i2 = this.limit;
            int i3 = i;
            while (true) {
                if (i3 < i2) {
                    int i4 = i3 + 1;
                    char c2 = cArr[i3];
                    if (c2 == c) {
                        this.pos = i4;
                        sb.append(cArr, i, (i4 - i) - 1);
                        return sb.toString();
                    } else if (c2 == '\\') {
                        this.pos = i4;
                        sb.append(cArr, i, (i4 - i) - 1);
                        sb.append(zznw());
                        break;
                    } else {
                        if (c2 == 10) {
                            this.zzbaa++;
                            this.zzbab = i4;
                        }
                        i3 = i4;
                    }
                } else {
                    sb.append(cArr, i, i3 - i);
                    this.pos = i3;
                    if (!zzbt(1)) {
                        throw zzci("Unterminated string");
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
        zznt();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String zzns() throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r1 = 0
            r2 = r1
        L_0x0003:
            int r3 = r5.pos
            int r3 = r3 + r2
            int r4 = r5.limit
            if (r3 >= r4) goto L_0x004c
            char[] r4 = r5.zzazz
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005a
            r4 = 10
            if (r3 == r4) goto L_0x005a
            r4 = 12
            if (r3 == r4) goto L_0x005a
            r4 = 13
            if (r3 == r4) goto L_0x005a
            r4 = 32
            if (r3 == r4) goto L_0x005a
            r4 = 35
            if (r3 == r4) goto L_0x0048
            r4 = 44
            if (r3 == r4) goto L_0x005a
            r4 = 47
            if (r3 == r4) goto L_0x0048
            r4 = 61
            if (r3 == r4) goto L_0x0048
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005a
            r4 = 58
            if (r3 == r4) goto L_0x005a
            r4 = 59
            if (r3 == r4) goto L_0x0048
            switch(r3) {
                case 91: goto L_0x005a;
                case 92: goto L_0x0048;
                case 93: goto L_0x005a;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x0048:
            r5.zznt()
            goto L_0x005a
        L_0x004c:
            char[] r3 = r5.zzazz
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005c
            int r3 = r2 + 1
            boolean r3 = r5.zzbt(r3)
            if (r3 == 0) goto L_0x005a
            goto L_0x0003
        L_0x005a:
            r1 = r2
            goto L_0x0076
        L_0x005c:
            if (r0 != 0) goto L_0x0063
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x0063:
            char[] r3 = r5.zzazz
            int r4 = r5.pos
            r0.append(r3, r4, r2)
            int r3 = r5.pos
            int r3 = r3 + r2
            r5.pos = r3
            r2 = 1
            boolean r2 = r5.zzbt(r2)
            if (r2 != 0) goto L_0x0001
        L_0x0076:
            if (r0 != 0) goto L_0x0082
            java.lang.String r0 = new java.lang.String
            char[] r2 = r5.zzazz
            int r3 = r5.pos
            r0.<init>(r2, r3, r1)
            goto L_0x008d
        L_0x0082:
            char[] r2 = r5.zzazz
            int r3 = r5.pos
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L_0x008d:
            int r2 = r5.pos
            int r2 = r2 + r1
            r5.pos = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzqn.zzns():java.lang.String");
    }

    private final void zzg(char c) throws IOException {
        char[] cArr = this.zzazz;
        while (true) {
            int i = this.pos;
            int i2 = this.limit;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.pos = i3;
                        return;
                    } else if (c2 == '\\') {
                        this.pos = i3;
                        zznw();
                        break;
                    } else {
                        if (c2 == 10) {
                            this.zzbaa++;
                            this.zzbab = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.pos = i;
                    if (!zzbt(1)) {
                        throw zzci("Unterminated string");
                    }
                }
            }
        }
    }

    public final void close() throws IOException {
        this.zzbac = 0;
        this.zzbag[0] = 8;
        this.zzbah = 1;
        this.f3235in.close();
    }

    public final void skipValue() throws IOException {
        int i;
        int i2 = 0;
        do {
            int i3 = this.zzbac;
            if (i3 == 0) {
                i3 = zznr();
            }
            if (i3 == 3) {
                zzbs(1);
            } else if (i3 == 1) {
                zzbs(3);
            } else {
                if (i3 == 4) {
                    this.zzbah--;
                } else if (i3 == 2) {
                    this.zzbah--;
                } else if (i3 == 14 || i3 == 10) {
                    while (true) {
                        i = 0;
                        while (true) {
                            int i4 = this.pos + i;
                            if (i4 < this.limit) {
                                char c = this.zzazz[i4];
                                if (!(c == 9 || c == 10 || c == 12 || c == 13 || c == ' ')) {
                                    if (c != '#') {
                                        if (c != ',') {
                                            if (!(c == '/' || c == '=')) {
                                                if (!(c == '{' || c == '}' || c == ':')) {
                                                    if (c != ';') {
                                                        switch (c) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.pos = i4;
                                if (!zzbt(1)) {
                                }
                            }
                        }
                    }
                    zznt();
                    this.pos += i;
                    this.zzbac = 0;
                } else if (i3 == 8 || i3 == 12) {
                    zzg('\'');
                    this.zzbac = 0;
                } else if (i3 == 9 || i3 == 13) {
                    zzg('\"');
                    this.zzbac = 0;
                } else {
                    if (i3 == 16) {
                        this.pos += this.zzbae;
                    }
                    this.zzbac = 0;
                }
                i2--;
                this.zzbac = 0;
            }
            i2++;
            this.zzbac = 0;
        } while (i2 != 0);
        int[] iArr = this.zzbaj;
        int i5 = this.zzbah - 1;
        iArr[i5] = iArr[i5] + 1;
        this.zzbai[i5] = "null";
    }

    private final void zzbs(int i) {
        int i2 = this.zzbah;
        int[] iArr = this.zzbag;
        if (i2 == iArr.length) {
            int i3 = i2 << 1;
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            String[] strArr = new String[i3];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.zzbaj, 0, iArr3, 0, this.zzbah);
            System.arraycopy(this.zzbai, 0, strArr, 0, this.zzbah);
            this.zzbag = iArr2;
            this.zzbaj = iArr3;
            this.zzbai = strArr;
        }
        int[] iArr4 = this.zzbag;
        int i4 = this.zzbah;
        this.zzbah = i4 + 1;
        iArr4[i4] = i;
    }

    private final boolean zzbt(int i) throws IOException {
        int i2;
        char[] cArr = this.zzazz;
        int i3 = this.zzbab;
        int i4 = this.pos;
        this.zzbab = i3 - i4;
        int i5 = this.limit;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.limit = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.limit = 0;
        }
        this.pos = 0;
        do {
            Reader reader = this.f3235in;
            int i7 = this.limit;
            int read = reader.read(cArr, i7, cArr.length - i7);
            if (read == -1) {
                return false;
            }
            int i8 = this.limit + read;
            this.limit = i8;
            if (this.zzbaa == 0 && (i2 = this.zzbab) == 0 && i8 > 0 && cArr[0] == 65279) {
                this.pos++;
                this.zzbab = i2 + 1;
                i++;
            }
        } while (this.limit < i);
        return true;
    }

    private final int zzaf(boolean z) throws IOException {
        char[] cArr = this.zzazz;
        int i = this.pos;
        int i2 = this.limit;
        while (true) {
            boolean z2 = true;
            if (i == i2) {
                this.pos = i;
                if (zzbt(1)) {
                    i = this.pos;
                    i2 = this.limit;
                } else if (!z) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + zznv());
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == 10) {
                this.zzbaa++;
                this.zzbab = i3;
            } else if (!(c == ' ' || c == 13 || c == 9)) {
                if (c == '/') {
                    this.pos = i3;
                    if (i3 == i2) {
                        this.pos = i3 - 1;
                        boolean zzbt = zzbt(2);
                        this.pos++;
                        if (!zzbt) {
                            return c;
                        }
                    }
                    zznt();
                    int i4 = this.pos;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.pos = i4 + 1;
                        while (true) {
                            int i5 = 0;
                            if (this.pos + 2 > this.limit && !zzbt(2)) {
                                z2 = false;
                                break;
                            }
                            char[] cArr2 = this.zzazz;
                            int i6 = this.pos;
                            if (cArr2[i6] != 10) {
                                while (i5 < 2) {
                                    if (this.zzazz[this.pos + i5] == "*/".charAt(i5)) {
                                        i5++;
                                    }
                                }
                                break;
                            }
                            this.zzbaa++;
                            this.zzbab = i6 + 1;
                            this.pos++;
                        }
                        if (z2) {
                            i = this.pos + 2;
                            i2 = this.limit;
                        } else {
                            throw zzci("Unterminated comment");
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.pos = i4 + 1;
                        zznu();
                        i = this.pos;
                        i2 = this.limit;
                    }
                } else if (c == '#') {
                    this.pos = i3;
                    zznt();
                    zznu();
                    i = this.pos;
                    i2 = this.limit;
                } else {
                    this.pos = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    private final void zznt() throws IOException {
        if (!this.zzazy) {
            throw zzci("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private final void zznu() throws IOException {
        char c;
        do {
            if (this.pos < this.limit || zzbt(1)) {
                char[] cArr = this.zzazz;
                int i = this.pos;
                int i2 = i + 1;
                this.pos = i2;
                c = cArr[i];
                if (c == 10) {
                    this.zzbaa++;
                    this.zzbab = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    public final String toString() {
        return getClass().getSimpleName() + zznv();
    }

    private final String zznv() {
        int i = this.zzbaa;
        int i2 = this.pos;
        int i3 = this.zzbab;
        StringBuilder sb = new StringBuilder(" at line ");
        sb.append(i + 1);
        sb.append(" column ");
        sb.append((i2 - i3) + 1);
        sb.append(" path ");
        StringBuilder sb2 = new StringBuilder("$");
        int i4 = this.zzbah;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = this.zzbag[i5];
            if (i6 == 1 || i6 == 2) {
                sb2.append('[');
                sb2.append(this.zzbaj[i5]);
                sb2.append(']');
            } else if (i6 == 3 || i6 == 4 || i6 == 5) {
                sb2.append('.');
                String[] strArr = this.zzbai;
                if (strArr[i5] != null) {
                    sb2.append(strArr[i5]);
                }
            }
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    private final char zznw() throws IOException {
        int i;
        int i2;
        if (this.pos != this.limit || zzbt(1)) {
            char[] cArr = this.zzazz;
            int i3 = this.pos;
            int i4 = i3 + 1;
            this.pos = i4;
            char c = cArr[i3];
            if (c == 10) {
                this.zzbaa++;
                this.zzbab = i4;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    throw zzci("Invalid escape sequence");
                } else if (i4 + 4 <= this.limit || zzbt(4)) {
                    char c2 = 0;
                    int i5 = this.pos;
                    for (int i6 = i5; i6 < i5 + 4; i6++) {
                        char c3 = this.zzazz[i6];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i2 = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.zzazz, this.pos, 4));
                            } else {
                                i2 = c3 - 'A';
                            }
                            i = i2 + 10;
                        } else {
                            i = c3 - '0';
                        }
                        c2 = (char) (c4 + i);
                    }
                    this.pos += 4;
                    return c2;
                } else {
                    throw zzci("Unterminated escape sequence");
                }
            }
            return c;
        }
        throw zzci("Unterminated escape sequence");
    }

    private final IOException zzci(String str) throws IOException {
        throw new zzqr(str + zznv());
    }

    static {
        zzqm.zzazw = new zzqo();
    }
}
