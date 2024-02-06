package com.google.android.gms.internal.gtm;

import java.lang.reflect.Type;

public enum zzqw {
    DOUBLE(0, zzqy.SCALAR, zzrm.DOUBLE),
    FLOAT(1, zzqy.SCALAR, zzrm.FLOAT),
    INT64(2, zzqy.SCALAR, zzrm.LONG),
    UINT64(3, zzqy.SCALAR, zzrm.LONG),
    INT32(4, zzqy.SCALAR, zzrm.INT),
    FIXED64(5, zzqy.SCALAR, zzrm.LONG),
    FIXED32(6, zzqy.SCALAR, zzrm.INT),
    BOOL(7, zzqy.SCALAR, zzrm.zzbbq),
    STRING(8, zzqy.SCALAR, zzrm.STRING),
    MESSAGE(9, zzqy.SCALAR, zzrm.MESSAGE),
    BYTES(10, zzqy.SCALAR, zzrm.BYTE_STRING),
    UINT32(11, zzqy.SCALAR, zzrm.INT),
    ENUM(12, zzqy.SCALAR, zzrm.ENUM),
    SFIXED32(13, zzqy.SCALAR, zzrm.INT),
    SFIXED64(14, zzqy.SCALAR, zzrm.LONG),
    SINT32(15, zzqy.SCALAR, zzrm.INT),
    SINT64(16, zzqy.SCALAR, zzrm.LONG),
    GROUP(17, zzqy.SCALAR, zzrm.MESSAGE),
    DOUBLE_LIST(18, zzqy.VECTOR, zzrm.DOUBLE),
    FLOAT_LIST(19, zzqy.VECTOR, zzrm.FLOAT),
    INT64_LIST(20, zzqy.VECTOR, zzrm.LONG),
    UINT64_LIST(21, zzqy.VECTOR, zzrm.LONG),
    INT32_LIST(22, zzqy.VECTOR, zzrm.INT),
    FIXED64_LIST(23, zzqy.VECTOR, zzrm.LONG),
    FIXED32_LIST(24, zzqy.VECTOR, zzrm.INT),
    BOOL_LIST(25, zzqy.VECTOR, zzrm.zzbbq),
    STRING_LIST(26, zzqy.VECTOR, zzrm.STRING),
    MESSAGE_LIST(27, zzqy.VECTOR, zzrm.MESSAGE),
    BYTES_LIST(28, zzqy.VECTOR, zzrm.BYTE_STRING),
    UINT32_LIST(29, zzqy.VECTOR, zzrm.INT),
    ENUM_LIST(30, zzqy.VECTOR, zzrm.ENUM),
    SFIXED32_LIST(31, zzqy.VECTOR, zzrm.INT),
    SFIXED64_LIST(32, zzqy.VECTOR, zzrm.LONG),
    SINT32_LIST(33, zzqy.VECTOR, zzrm.INT),
    SINT64_LIST(34, zzqy.VECTOR, zzrm.LONG),
    DOUBLE_LIST_PACKED(35, zzqy.PACKED_VECTOR, zzrm.DOUBLE),
    FLOAT_LIST_PACKED(36, zzqy.PACKED_VECTOR, zzrm.FLOAT),
    INT64_LIST_PACKED(37, zzqy.PACKED_VECTOR, zzrm.LONG),
    UINT64_LIST_PACKED(38, zzqy.PACKED_VECTOR, zzrm.LONG),
    INT32_LIST_PACKED(39, zzqy.PACKED_VECTOR, zzrm.INT),
    FIXED64_LIST_PACKED(40, zzqy.PACKED_VECTOR, zzrm.LONG),
    FIXED32_LIST_PACKED(41, zzqy.PACKED_VECTOR, zzrm.INT),
    BOOL_LIST_PACKED(42, zzqy.PACKED_VECTOR, zzrm.zzbbq),
    UINT32_LIST_PACKED(43, zzqy.PACKED_VECTOR, zzrm.INT),
    ENUM_LIST_PACKED(44, zzqy.PACKED_VECTOR, zzrm.ENUM),
    SFIXED32_LIST_PACKED(45, zzqy.PACKED_VECTOR, zzrm.INT),
    SFIXED64_LIST_PACKED(46, zzqy.PACKED_VECTOR, zzrm.LONG),
    SINT32_LIST_PACKED(47, zzqy.PACKED_VECTOR, zzrm.INT),
    SINT64_LIST_PACKED(48, zzqy.PACKED_VECTOR, zzrm.LONG),
    GROUP_LIST(49, zzqy.VECTOR, zzrm.MESSAGE),
    MAP(50, zzqy.MAP, zzrm.VOID);
    
    private static final zzqw[] zzazv = null;
    private static final Type[] zzazw = null;

    /* renamed from: id */
    private final int f3237id;
    private final zzrm zzazr;
    private final zzqy zzazs;
    private final Class<?> zzazt;
    private final boolean zzazu;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r1 = com.google.android.gms.internal.gtm.zzqx.zzazz[r5.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzqw(int r3, com.google.android.gms.internal.gtm.zzqy r4, com.google.android.gms.internal.gtm.zzrm r5) {
        /*
            r0 = this;
            r0.<init>(r1, r2)
            r0.f3237id = r3
            r0.zzazs = r4
            r0.zzazr = r5
            int[] r1 = com.google.android.gms.internal.gtm.zzqx.zzazy
            int r2 = r4.ordinal()
            r1 = r1[r2]
            r2 = 2
            r3 = 1
            if (r1 == r3) goto L_0x0022
            if (r1 == r2) goto L_0x001b
            r1 = 0
            r0.zzazt = r1
            goto L_0x0028
        L_0x001b:
            java.lang.Class r1 = r5.zzpx()
            r0.zzazt = r1
            goto L_0x0028
        L_0x0022:
            java.lang.Class r1 = r5.zzpx()
            r0.zzazt = r1
        L_0x0028:
            com.google.android.gms.internal.gtm.zzqy r1 = com.google.android.gms.internal.gtm.zzqy.SCALAR
            if (r4 != r1) goto L_0x003c
            int[] r1 = com.google.android.gms.internal.gtm.zzqx.zzazz
            int r4 = r5.ordinal()
            r1 = r1[r4]
            if (r1 == r3) goto L_0x003c
            if (r1 == r2) goto L_0x003c
            r2 = 3
            if (r1 == r2) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r3 = 0
        L_0x003d:
            r0.zzazu = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzqw.<init>(java.lang.String, int, int, com.google.android.gms.internal.gtm.zzqy, com.google.android.gms.internal.gtm.zzrm):void");
    }

    /* renamed from: id */
    public final int mo49298id() {
        return this.f3237id;
    }

    static {
        int i;
        zzazw = new Type[0];
        zzqw[] values = values();
        zzazv = new zzqw[values.length];
        for (zzqw zzqw : values) {
            zzazv[zzqw.f3237id] = zzqw;
        }
    }
}
