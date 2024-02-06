package p040o;

import com.google.android.gms.common.api.Api;
import com.google.zxing.WriterException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import p040o.ScriptGroup;
import p040o.setAccount;
import p040o.zzge;

/* renamed from: o.getField */
public final class getField {
    private static final int[] read = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0113 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0104 A[LOOP:1: B:62:0x00d9->B:75:0x0104, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040o.FragmentBuilder_BindEEasycashFeaturesLoanInformationFragment MediaBrowserCompat$ItemReceiver(java.lang.String r13, p040o.execute r14, java.util.Map<p040o.rsnIncObjDestroy, ?> r15) throws com.google.zxing.WriterException {
        /*
            r0 = 0
            r1 = 1
            if (r15 == 0) goto L_0x000e
            o.rsnIncObjDestroy r2 = p040o.rsnIncObjDestroy.CHARACTER_SET
            boolean r2 = r15.containsKey(r2)
            if (r2 == 0) goto L_0x000e
            r2 = r1
            goto L_0x000f
        L_0x000e:
            r2 = r0
        L_0x000f:
            java.lang.String r3 = "ISO-8859-1"
            if (r2 == 0) goto L_0x001e
            o.rsnIncObjDestroy r4 = p040o.rsnIncObjDestroy.CHARACTER_SET
            java.lang.Object r4 = r15.get(r4)
            java.lang.String r4 = r4.toString()
            goto L_0x001f
        L_0x001e:
            r4 = r3
        L_0x001f:
            java.lang.String r5 = "Shift_JIS"
            boolean r6 = r5.equals(r4)
            r7 = -1
            if (r6 == 0) goto L_0x0031
            boolean r6 = write(r13)
            if (r6 == 0) goto L_0x0031
            o.access$002 r6 = p040o.access$002.KANJI
            goto L_0x0066
        L_0x0031:
            r6 = r0
            r8 = r6
            r9 = r8
        L_0x0034:
            int r10 = r13.length()
            if (r6 >= r10) goto L_0x005a
            char r10 = r13.charAt(r6)
            r11 = 48
            if (r10 < r11) goto L_0x0048
            r11 = 57
            if (r10 > r11) goto L_0x0048
            r9 = r1
            goto L_0x0054
        L_0x0048:
            int[] r8 = read
            int r11 = r8.length
            if (r10 >= r11) goto L_0x0050
            r8 = r8[r10]
            goto L_0x0051
        L_0x0050:
            r8 = r7
        L_0x0051:
            if (r8 == r7) goto L_0x0057
            r8 = r1
        L_0x0054:
            int r6 = r6 + 1
            goto L_0x0034
        L_0x0057:
            o.access$002 r6 = p040o.access$002.BYTE
            goto L_0x0066
        L_0x005a:
            if (r8 == 0) goto L_0x005f
            o.access$002 r6 = p040o.access$002.ALPHANUMERIC
            goto L_0x0066
        L_0x005f:
            if (r9 == 0) goto L_0x0064
            o.access$002 r6 = p040o.access$002.NUMERIC
            goto L_0x0066
        L_0x0064:
            o.access$002 r6 = p040o.access$002.BYTE
        L_0x0066:
            o.rsnScriptIntrinsicCreate r8 = new o.rsnScriptIntrinsicCreate
            r8.<init>()
            o.access$002 r9 = p040o.access$002.BYTE
            r10 = 8
            r11 = 4
            if (r6 != r9) goto L_0x008e
            if (r2 != 0) goto L_0x007a
            boolean r2 = r3.equals(r4)
            if (r2 != 0) goto L_0x008e
        L_0x007a:
            o.rsnScriptSetTimeZone r2 = p040o.rsnScriptSetTimeZone.write(r4)
            if (r2 == 0) goto L_0x008e
            o.access$002 r3 = p040o.access$002.ECI
            int r3 = r3.bits
            r8.write(r3, r11)
            int[] r2 = r2.values
            r2 = r2[r0]
            r8.write(r2, r10)
        L_0x008e:
            if (r15 == 0) goto L_0x009a
            o.rsnIncObjDestroy r2 = p040o.rsnIncObjDestroy.GS1_FORMAT
            boolean r2 = r15.containsKey(r2)
            if (r2 == 0) goto L_0x009a
            r2 = r1
            goto L_0x009b
        L_0x009a:
            r2 = r0
        L_0x009b:
            if (r2 == 0) goto L_0x00b8
            o.rsnIncObjDestroy r2 = p040o.rsnIncObjDestroy.GS1_FORMAT
            java.lang.Object r2 = r15.get(r2)
            java.lang.String r2 = r2.toString()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00b8
            o.access$002 r2 = p040o.access$002.FNC1_FIRST_POSITION
            int r2 = r2.bits
            r8.write(r2, r11)
        L_0x00b8:
            int r2 = r6.bits
            r8.write(r2, r11)
            o.rsnScriptIntrinsicCreate r2 = new o.rsnScriptIntrinsicCreate
            r2.<init>()
            int[] r3 = p040o.getField.C13352.write
            int r9 = r6.ordinal()
            r3 = r3[r9]
            r9 = 2
            if (r3 == r1) goto L_0x013e
            if (r3 == r9) goto L_0x013a
            r12 = 3
            if (r3 == r12) goto L_0x0136
            if (r3 != r11) goto L_0x0122
            byte[] r3 = r13.getBytes(r5)     // Catch:{ UnsupportedEncodingException -> 0x011b }
            int r4 = r3.length
        L_0x00d9:
            if (r0 >= r4) goto L_0x0141
            byte r5 = r3[r0]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << r10
            int r11 = r0 + 1
            byte r11 = r3[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r5 = r5 | r11
            r11 = 33088(0x8140, float:4.6366E-41)
            if (r5 < r11) goto L_0x00f2
            r12 = 40956(0x9ffc, float:5.7392E-41)
            if (r5 > r12) goto L_0x00f2
            goto L_0x00ff
        L_0x00f2:
            r11 = 57408(0xe040, float:8.0446E-41)
            if (r5 < r11) goto L_0x0101
            r11 = 60351(0xebbf, float:8.457E-41)
            if (r5 > r11) goto L_0x0101
            r11 = 49472(0xc140, float:6.9325E-41)
        L_0x00ff:
            int r5 = r5 - r11
            goto L_0x0102
        L_0x0101:
            r5 = r7
        L_0x0102:
            if (r5 == r7) goto L_0x0113
            int r11 = r5 >> 8
            int r11 = r11 * 192
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r11 = r11 + r5
            r5 = 13
            r2.write(r11, r5)
            int r0 = r0 + 2
            goto L_0x00d9
        L_0x0113:
            com.google.zxing.WriterException r13 = new com.google.zxing.WriterException
            java.lang.String r14 = "Invalid byte sequence"
            r13.<init>((java.lang.String) r14)
            throw r13
        L_0x011b:
            r13 = move-exception
            com.google.zxing.WriterException r14 = new com.google.zxing.WriterException
            r14.<init>((java.lang.Throwable) r13)
            throw r14
        L_0x0122:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Invalid mode: "
            r13.<init>(r14)
            r13.append(r6)
            com.google.zxing.WriterException r14 = new com.google.zxing.WriterException
            java.lang.String r13 = r13.toString()
            r14.<init>((java.lang.String) r13)
            throw r14
        L_0x0136:
            read(r13, r2, r4)
            goto L_0x0141
        L_0x013a:
            MediaBrowserCompat$CustomActionResultReceiver((java.lang.CharSequence) r13, (p040o.rsnScriptIntrinsicCreate) r2)
            goto L_0x0141
        L_0x013e:
            IconCompatParcelizer((java.lang.CharSequence) r13, (p040o.rsnScriptIntrinsicCreate) r2)
        L_0x0141:
            if (r15 == 0) goto L_0x0176
            o.rsnIncObjDestroy r0 = p040o.rsnIncObjDestroy.QR_VERSION
            boolean r0 = r15.containsKey(r0)
            if (r0 == 0) goto L_0x0176
            o.rsnIncObjDestroy r0 = p040o.rsnIncObjDestroy.QR_VERSION
            java.lang.Object r15 = r15.get(r0)
            java.lang.String r15 = r15.toString()
            int r15 = java.lang.Integer.parseInt(r15)
            o.ScriptGroup$Binding r15 = p040o.ScriptGroup.Binding.MediaBrowserCompat$ItemReceiver(r15)
            int r0 = r8.read
            int r1 = r6.MediaBrowserCompat$CustomActionResultReceiver(r15)
            int r0 = r0 + r1
            int r1 = r2.read
            int r0 = r0 + r1
            boolean r0 = write(r0, r15, r14)
            if (r0 == 0) goto L_0x016e
            goto L_0x0196
        L_0x016e:
            com.google.zxing.WriterException r13 = new com.google.zxing.WriterException
            java.lang.String r14 = "Data too big for requested version"
            r13.<init>((java.lang.String) r14)
            throw r13
        L_0x0176:
            o.ScriptGroup$Binding r15 = p040o.ScriptGroup.Binding.MediaBrowserCompat$ItemReceiver(r1)
            int r0 = r8.read
            int r15 = r6.MediaBrowserCompat$CustomActionResultReceiver(r15)
            int r0 = r0 + r15
            int r15 = r2.read
            int r0 = r0 + r15
            o.ScriptGroup$Binding r15 = read(r0, r14)
            int r0 = r8.read
            int r15 = r6.MediaBrowserCompat$CustomActionResultReceiver(r15)
            int r0 = r0 + r15
            int r15 = r2.read
            int r0 = r0 + r15
            o.ScriptGroup$Binding r15 = read(r0, r14)
        L_0x0196:
            o.rsnScriptIntrinsicCreate r0 = new o.rsnScriptIntrinsicCreate
            r0.<init>()
            r0.MediaBrowserCompat$ItemReceiver((p040o.rsnScriptIntrinsicCreate) r8)
            o.access$002 r1 = p040o.access$002.BYTE
            if (r6 != r1) goto L_0x01a8
            int r13 = r2.read
            int r13 = r13 + 7
            int r13 = r13 / r10
            goto L_0x01ac
        L_0x01a8:
            int r13 = r13.length()
        L_0x01ac:
            write((int) r13, (p040o.ScriptGroup.Binding) r15, (p040o.access$002) r6, (p040o.rsnScriptIntrinsicCreate) r0)
            r0.MediaBrowserCompat$ItemReceiver((p040o.rsnScriptIntrinsicCreate) r2)
            o.ScriptGroup$Binding$write[] r13 = r15.IconCompatParcelizer
            int r1 = r14.ordinal()
            r13 = r13[r1]
            int r1 = r15.write
            int r2 = r13.MediaBrowserCompat$ItemReceiver()
            int r1 = r1 - r2
            MediaBrowserCompat$CustomActionResultReceiver((int) r1, (p040o.rsnScriptIntrinsicCreate) r0)
            int r2 = r15.write
            int r13 = r13.write()
            o.rsnScriptIntrinsicCreate r13 = write((p040o.rsnScriptIntrinsicCreate) r0, (int) r2, (int) r1, (int) r13)
            o.FragmentBuilder_BindEEasycashFeaturesLoanInformationFragment r0 = new o.FragmentBuilder_BindEEasycashFeaturesLoanInformationFragment
            r0.<init>()
            r0.MediaBrowserCompat$CustomActionResultReceiver = r14
            r0.MediaBrowserCompat$ItemReceiver = r6
            r0.read = r15
            int r1 = r15.read
            int r1 = r1 << r9
            int r1 = r1 + 17
            o.zzge$zzf$read r2 = new o.zzge$zzf$read
            r2.<init>(r1, r1)
            int r1 = write((p040o.rsnScriptIntrinsicCreate) r13, (p040o.execute) r14, (p040o.ScriptGroup.Binding) r15, (p040o.zzge.zzf.read) r2)
            r0.write = r1
            p040o.calcOrderRecurse.MediaBrowserCompat$CustomActionResultReceiver(r13, r14, r15, r1, r2)
            r0.IconCompatParcelizer = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getField.MediaBrowserCompat$ItemReceiver(java.lang.String, o.execute, java.util.Map):o.FragmentBuilder_BindEEasycashFeaturesLoanInformationFragment");
    }

    private static boolean write(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                byte b = bytes[i] & 255;
                if ((b < 129 || b > 159) && (b < 224 || b > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static int write(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, execute execute, ScriptGroup.Binding binding, zzge.zzf.read read2) throws WriterException {
        zzge.zzf.read read3 = read2;
        boolean z = false;
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i2 = -1;
        int i3 = 0;
        while (i3 < 8) {
            calcOrderRecurse.MediaBrowserCompat$CustomActionResultReceiver(rsnscriptintrinsiccreate, execute, binding, i3, read3);
            int write = AlertController$RecycleListView.write(read3, true) + AlertController$RecycleListView.write(read3, z);
            byte[][] bArr = read3.MediaBrowserCompat$CustomActionResultReceiver;
            int i4 = read3.read;
            int i5 = read3.MediaBrowserCompat$ItemReceiver;
            int i6 = z;
            int i7 = i6;
            boolean z2 = z;
            while (i6 < i5 - 1) {
                byte[] bArr2 = bArr[i6];
                int i8 = z2;
                while (i8 < i4 - 1) {
                    byte b = bArr2[i8];
                    int i9 = i8 + 1;
                    if (b == bArr2[i9]) {
                        int i10 = i6 + 1;
                        if (b == bArr[i10][i8] && b == bArr[i10][i9]) {
                            i7++;
                        }
                    }
                    i8 = i9;
                }
                i6++;
                z2 = false;
                rsnScriptIntrinsicCreate rsnscriptintrinsiccreate2 = rsnscriptintrinsiccreate;
            }
            int i11 = i7 * 3;
            byte[][] bArr3 = read3.MediaBrowserCompat$CustomActionResultReceiver;
            int i12 = read3.read;
            int i13 = read3.MediaBrowserCompat$ItemReceiver;
            int i14 = 0;
            int i15 = 0;
            while (i14 < i13) {
                int i16 = 0;
                while (i16 < i12) {
                    byte[] bArr4 = bArr3[i14];
                    int i17 = i16 + 6;
                    int i18 = i12;
                    if (i17 < i12 && bArr4[i16] == 1 && bArr4[i16 + 1] == 0 && bArr4[i16 + 2] == 1 && bArr4[i16 + 3] == 1 && bArr4[i16 + 4] == 1 && bArr4[i16 + 5] == 0 && bArr4[i17] == 1 && (AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(bArr4, i16 - 4, i16) || AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(bArr4, i16 + 7, i16 + 11))) {
                        i15++;
                    }
                    int i19 = i14 + 6;
                    if (i19 < i13 && bArr3[i14][i16] == 1 && bArr3[i14 + 1][i16] == 0 && bArr3[i14 + 2][i16] == 1 && bArr3[i14 + 3][i16] == 1 && bArr3[i14 + 4][i16] == 1 && bArr3[i14 + 5][i16] == 0 && bArr3[i19][i16] == 1 && (AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(bArr3, i16, i14 - 4, i14) || AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(bArr3, i16, i14 + 7, i14 + 11))) {
                        i15++;
                    }
                    i16++;
                    execute execute2 = execute;
                    i12 = i18;
                }
                int i20 = i12;
                i14++;
                execute execute3 = execute;
            }
            int i21 = write + i11 + (i15 * 40);
            byte[][] bArr5 = read3.MediaBrowserCompat$CustomActionResultReceiver;
            int i22 = read3.read;
            int i23 = read3.MediaBrowserCompat$ItemReceiver;
            int i24 = 0;
            for (int i25 = 0; i25 < i23; i25++) {
                byte[] bArr6 = bArr5[i25];
                for (int i26 = 0; i26 < i22; i26++) {
                    if (bArr6[i26] == 1) {
                        i24++;
                    }
                }
            }
            int i27 = read3.MediaBrowserCompat$ItemReceiver * read3.read;
            int abs = i21 + (((Math.abs((i24 << 1) - i27) * 10) / i27) * 10);
            if (abs < i) {
                i2 = i3;
                i = abs;
            }
            i3++;
            z = false;
        }
        return i2;
    }

    private static ScriptGroup.Binding read(int i, execute execute) throws WriterException {
        for (int i2 = 1; i2 <= 40; i2++) {
            ScriptGroup.Binding MediaBrowserCompat$ItemReceiver = ScriptGroup.Binding.MediaBrowserCompat$ItemReceiver(i2);
            if (write(i, MediaBrowserCompat$ItemReceiver, execute)) {
                return MediaBrowserCompat$ItemReceiver;
            }
        }
        throw new WriterException("Data too big");
    }

    private static byte[] IconCompatParcelizer(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[(length + i)];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new setAccount.write(rsnScriptSetVarObj.MediaDescriptionCompat).read(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    private static void write(int i, ScriptGroup.Binding binding, access$002 access_002, rsnScriptIntrinsicCreate rsnscriptintrinsiccreate) throws WriterException {
        int MediaBrowserCompat$CustomActionResultReceiver = access_002.MediaBrowserCompat$CustomActionResultReceiver(binding);
        int i2 = 1 << MediaBrowserCompat$CustomActionResultReceiver;
        if (i < i2) {
            rsnscriptintrinsiccreate.write(i, MediaBrowserCompat$CustomActionResultReceiver);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is bigger than ");
        sb.append(i2 - 1);
        throw new WriterException(sb.toString());
    }

    /* renamed from: o.getField$2 */
    static /* synthetic */ class C13352 {
        static final /* synthetic */ int[] write;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.access$002[] r0 = p040o.access$002.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                write = r0
                o.access$002 r1 = p040o.access$002.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x001d }
                o.access$002 r1 = p040o.access$002.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.access$002 r1 = p040o.access$002.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.access$002 r1 = p040o.access$002.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.getField.C13352.<clinit>():void");
        }
    }

    private static void IconCompatParcelizer(CharSequence charSequence, rsnScriptIntrinsicCreate rsnscriptintrinsiccreate) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                rsnscriptintrinsiccreate.write((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    rsnscriptintrinsiccreate.write((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    rsnscriptintrinsiccreate.write(charAt, 4);
                }
            }
        }
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(CharSequence charSequence, rsnScriptIntrinsicCreate rsnscriptintrinsiccreate) throws WriterException {
        int i;
        int i2;
        int length = charSequence.length();
        int i3 = 0;
        while (i3 < length) {
            char charAt = charSequence.charAt(i3);
            int[] iArr = read;
            if (charAt < iArr.length) {
                i = iArr[charAt];
            } else {
                i = -1;
            }
            if (i != -1) {
                int i4 = i3 + 1;
                if (i4 < length) {
                    char charAt2 = charSequence.charAt(i4);
                    int[] iArr2 = read;
                    if (charAt2 < iArr2.length) {
                        i2 = iArr2[charAt2];
                    } else {
                        i2 = -1;
                    }
                    if (i2 != -1) {
                        rsnscriptintrinsiccreate.write((i * 45) + i2, 11);
                        i3 += 2;
                    } else {
                        throw new WriterException();
                    }
                } else {
                    rsnscriptintrinsiccreate.write(i, 6);
                    i3 = i4;
                }
            } else {
                throw new WriterException();
            }
        }
    }

    private static void read(String str, rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, String str2) throws WriterException {
        try {
            for (byte write : str.getBytes(str2)) {
                rsnscriptintrinsiccreate.write(write, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException((Throwable) e);
        }
    }

    private static rsnScriptIntrinsicCreate write(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, int i, int i2, int i3) throws WriterException {
        char c;
        rsnScriptIntrinsicCreate rsnscriptintrinsiccreate2 = rsnscriptintrinsiccreate;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if ((rsnscriptintrinsiccreate2.read + 7) / 8 == i5) {
            ArrayList<zzga$MediaBrowserCompat$ItemReceiver> arrayList = new ArrayList<>(i6);
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i7 < i6) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                if (i7 < i6) {
                    int i11 = i4 % i6;
                    int i12 = i6 - i11;
                    int i13 = i4 / i6;
                    int i14 = i5 / i6;
                    int i15 = i14 + 1;
                    int i16 = i13 - i14;
                    int i17 = (i13 + 1) - i15;
                    if (i16 != i17) {
                        throw new WriterException("EC bytes mismatch");
                    } else if (i6 != i12 + i11) {
                        throw new WriterException("RS blocks mismatch");
                    } else if (i4 == ((i14 + i16) * i12) + ((i15 + i17) * i11)) {
                        if (i7 < i12) {
                            c = 0;
                            iArr[0] = i14;
                            iArr2[0] = i16;
                        } else {
                            c = 0;
                            iArr[0] = i15;
                            iArr2[0] = i17;
                        }
                        int i18 = iArr[c];
                        byte[] bArr = new byte[i18];
                        rsnscriptintrinsiccreate2.read(i8 << 3, bArr, i18);
                        byte[] IconCompatParcelizer = IconCompatParcelizer(bArr, iArr2[c]);
                        arrayList.add(new zzga$MediaBrowserCompat$ItemReceiver(bArr, IconCompatParcelizer));
                        i9 = Math.max(i9, i18);
                        i10 = Math.max(i10, IconCompatParcelizer.length);
                        i8 += iArr[c];
                        i7++;
                    } else {
                        throw new WriterException("Total bytes mismatch");
                    }
                } else {
                    throw new WriterException("Block ID too large");
                }
            }
            if (i5 == i8) {
                rsnScriptIntrinsicCreate rsnscriptintrinsiccreate3 = new rsnScriptIntrinsicCreate();
                for (int i19 = 0; i19 < i9; i19++) {
                    for (zzga$MediaBrowserCompat$ItemReceiver zzga_mediabrowsercompat_itemreceiver : arrayList) {
                        byte[] bArr2 = zzga_mediabrowsercompat_itemreceiver.IconCompatParcelizer;
                        if (i19 < bArr2.length) {
                            rsnscriptintrinsiccreate3.write(bArr2[i19], 8);
                        }
                    }
                }
                for (int i20 = 0; i20 < i10; i20++) {
                    for (zzga$MediaBrowserCompat$ItemReceiver zzga_mediabrowsercompat_itemreceiver2 : arrayList) {
                        byte[] bArr3 = zzga_mediabrowsercompat_itemreceiver2.MediaBrowserCompat$CustomActionResultReceiver;
                        if (i20 < bArr3.length) {
                            rsnscriptintrinsiccreate3.write(bArr3[i20], 8);
                        }
                    }
                }
                if (i4 == (rsnscriptintrinsiccreate3.read + 7) / 8) {
                    return rsnscriptintrinsiccreate3;
                }
                StringBuilder sb = new StringBuilder("Interleaving error: ");
                sb.append(i4);
                sb.append(" and ");
                sb.append((rsnscriptintrinsiccreate3.read + 7) / 8);
                sb.append(" differ.");
                throw new WriterException(sb.toString());
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(int i, rsnScriptIntrinsicCreate rsnscriptintrinsiccreate) throws WriterException {
        int i2 = i << 3;
        if (rsnscriptintrinsiccreate.read <= i2) {
            for (int i3 = 0; i3 < 4 && rsnscriptintrinsiccreate.read < i2; i3++) {
                rsnscriptintrinsiccreate.read(false);
            }
            int i4 = rsnscriptintrinsiccreate.read & 7;
            if (i4 > 0) {
                while (i4 < 8) {
                    rsnscriptintrinsiccreate.read(false);
                    i4++;
                }
            }
            int i5 = (rsnscriptintrinsiccreate.read + 7) / 8;
            for (int i6 = 0; i6 < i - i5; i6++) {
                rsnscriptintrinsiccreate.write((i6 & 1) == 0 ? 236 : 17, 8);
            }
            if (rsnscriptintrinsiccreate.read != i2) {
                throw new WriterException("Bits size does not equal capacity");
            }
            return;
        }
        StringBuilder sb = new StringBuilder("data bits cannot fit in the QR Code");
        sb.append(rsnscriptintrinsiccreate.read);
        sb.append(" > ");
        sb.append(i2);
        throw new WriterException(sb.toString());
    }

    private static boolean write(int i, ScriptGroup.Binding binding, execute execute) {
        int i2 = binding.write;
        ScriptGroup.Binding.write write = binding.IconCompatParcelizer[execute.ordinal()];
        return i2 - (write.MediaBrowserCompat$CustomActionResultReceiver * write.write()) >= (i + 7) / 8;
    }
}
