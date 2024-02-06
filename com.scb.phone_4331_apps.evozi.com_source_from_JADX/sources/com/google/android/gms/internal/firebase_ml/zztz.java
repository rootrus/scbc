package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.Type;

public enum zztz {
    DOUBLE(0, zzub.SCALAR, zzuq.DOUBLE),
    FLOAT(1, zzub.SCALAR, zzuq.FLOAT),
    INT64(2, zzub.SCALAR, zzuq.LONG),
    UINT64(3, zzub.SCALAR, zzuq.LONG),
    INT32(4, zzub.SCALAR, zzuq.INT),
    FIXED64(5, zzub.SCALAR, zzuq.LONG),
    FIXED32(6, zzub.SCALAR, zzuq.INT),
    BOOL(7, zzub.SCALAR, zzuq.zzbpn),
    STRING(8, zzub.SCALAR, zzuq.STRING),
    MESSAGE(9, zzub.SCALAR, zzuq.MESSAGE),
    BYTES(10, zzub.SCALAR, zzuq.BYTE_STRING),
    UINT32(11, zzub.SCALAR, zzuq.INT),
    ENUM(12, zzub.SCALAR, zzuq.ENUM),
    SFIXED32(13, zzub.SCALAR, zzuq.INT),
    SFIXED64(14, zzub.SCALAR, zzuq.LONG),
    SINT32(15, zzub.SCALAR, zzuq.INT),
    SINT64(16, zzub.SCALAR, zzuq.LONG),
    GROUP(17, zzub.SCALAR, zzuq.MESSAGE),
    DOUBLE_LIST(18, zzub.VECTOR, zzuq.DOUBLE),
    FLOAT_LIST(19, zzub.VECTOR, zzuq.FLOAT),
    INT64_LIST(20, zzub.VECTOR, zzuq.LONG),
    UINT64_LIST(21, zzub.VECTOR, zzuq.LONG),
    INT32_LIST(22, zzub.VECTOR, zzuq.INT),
    FIXED64_LIST(23, zzub.VECTOR, zzuq.LONG),
    FIXED32_LIST(24, zzub.VECTOR, zzuq.INT),
    BOOL_LIST(25, zzub.VECTOR, zzuq.zzbpn),
    STRING_LIST(26, zzub.VECTOR, zzuq.STRING),
    MESSAGE_LIST(27, zzub.VECTOR, zzuq.MESSAGE),
    BYTES_LIST(28, zzub.VECTOR, zzuq.BYTE_STRING),
    UINT32_LIST(29, zzub.VECTOR, zzuq.INT),
    ENUM_LIST(30, zzub.VECTOR, zzuq.ENUM),
    SFIXED32_LIST(31, zzub.VECTOR, zzuq.INT),
    SFIXED64_LIST(32, zzub.VECTOR, zzuq.LONG),
    SINT32_LIST(33, zzub.VECTOR, zzuq.INT),
    SINT64_LIST(34, zzub.VECTOR, zzuq.LONG),
    DOUBLE_LIST_PACKED(35, zzub.PACKED_VECTOR, zzuq.DOUBLE),
    FLOAT_LIST_PACKED(36, zzub.PACKED_VECTOR, zzuq.FLOAT),
    INT64_LIST_PACKED(37, zzub.PACKED_VECTOR, zzuq.LONG),
    UINT64_LIST_PACKED(38, zzub.PACKED_VECTOR, zzuq.LONG),
    INT32_LIST_PACKED(39, zzub.PACKED_VECTOR, zzuq.INT),
    FIXED64_LIST_PACKED(40, zzub.PACKED_VECTOR, zzuq.LONG),
    FIXED32_LIST_PACKED(41, zzub.PACKED_VECTOR, zzuq.INT),
    BOOL_LIST_PACKED(42, zzub.PACKED_VECTOR, zzuq.zzbpn),
    UINT32_LIST_PACKED(43, zzub.PACKED_VECTOR, zzuq.INT),
    ENUM_LIST_PACKED(44, zzub.PACKED_VECTOR, zzuq.ENUM),
    SFIXED32_LIST_PACKED(45, zzub.PACKED_VECTOR, zzuq.INT),
    SFIXED64_LIST_PACKED(46, zzub.PACKED_VECTOR, zzuq.LONG),
    SINT32_LIST_PACKED(47, zzub.PACKED_VECTOR, zzuq.INT),
    SINT64_LIST_PACKED(48, zzub.PACKED_VECTOR, zzuq.LONG),
    GROUP_LIST(49, zzub.VECTOR, zzuq.MESSAGE),
    MAP(50, zzub.MAP, zzuq.VOID);
    
    private static final zztz[] zzbnt = null;
    private static final Type[] zzbnu = null;

    /* renamed from: id */
    private final int f3236id;
    private final zzuq zzbnp;
    private final zzub zzbnq;
    private final Class<?> zzbnr;
    private final boolean zzbns;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r1 = com.google.android.gms.internal.firebase_ml.zzua.zzbnx[r5.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zztz(int r3, com.google.android.gms.internal.firebase_ml.zzub r4, com.google.android.gms.internal.firebase_ml.zzuq r5) {
        /*
            r0 = this;
            r0.<init>(r1, r2)
            r0.f3236id = r3
            r0.zzbnq = r4
            r0.zzbnp = r5
            int[] r1 = com.google.android.gms.internal.firebase_ml.zzua.zzbnw
            int r2 = r4.ordinal()
            r1 = r1[r2]
            r2 = 2
            r3 = 1
            if (r1 == r3) goto L_0x0022
            if (r1 == r2) goto L_0x001b
            r1 = 0
            r0.zzbnr = r1
            goto L_0x0028
        L_0x001b:
            java.lang.Class r1 = r5.zzrs()
            r0.zzbnr = r1
            goto L_0x0028
        L_0x0022:
            java.lang.Class r1 = r5.zzrs()
            r0.zzbnr = r1
        L_0x0028:
            com.google.android.gms.internal.firebase_ml.zzub r1 = com.google.android.gms.internal.firebase_ml.zzub.SCALAR
            if (r4 != r1) goto L_0x003c
            int[] r1 = com.google.android.gms.internal.firebase_ml.zzua.zzbnx
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
            r0.zzbns = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zztz.<init>(java.lang.String, int, int, com.google.android.gms.internal.firebase_ml.zzub, com.google.android.gms.internal.firebase_ml.zzuq):void");
    }

    /* renamed from: id */
    public final int mo48826id() {
        return this.f3236id;
    }

    static {
        int i;
        zzbnu = new Type[0];
        zztz[] values = values();
        zzbnt = new zztz[values.length];
        for (zztz zztz : values) {
            zzbnt[zztz.f3236id] = zztz;
        }
    }
}
