package com.google.android.gms.internal.vision;

import java.lang.reflect.Type;

public enum zzfs {
    DOUBLE(0, zzfu.SCALAR, zzgh.DOUBLE),
    FLOAT(1, zzfu.SCALAR, zzgh.FLOAT),
    INT64(2, zzfu.SCALAR, zzgh.LONG),
    UINT64(3, zzfu.SCALAR, zzgh.LONG),
    INT32(4, zzfu.SCALAR, zzgh.INT),
    FIXED64(5, zzfu.SCALAR, zzgh.LONG),
    FIXED32(6, zzfu.SCALAR, zzgh.INT),
    BOOL(7, zzfu.SCALAR, zzgh.zzxw),
    STRING(8, zzfu.SCALAR, zzgh.STRING),
    MESSAGE(9, zzfu.SCALAR, zzgh.MESSAGE),
    BYTES(10, zzfu.SCALAR, zzgh.BYTE_STRING),
    UINT32(11, zzfu.SCALAR, zzgh.INT),
    ENUM(12, zzfu.SCALAR, zzgh.ENUM),
    SFIXED32(13, zzfu.SCALAR, zzgh.INT),
    SFIXED64(14, zzfu.SCALAR, zzgh.LONG),
    SINT32(15, zzfu.SCALAR, zzgh.INT),
    SINT64(16, zzfu.SCALAR, zzgh.LONG),
    GROUP(17, zzfu.SCALAR, zzgh.MESSAGE),
    DOUBLE_LIST(18, zzfu.VECTOR, zzgh.DOUBLE),
    FLOAT_LIST(19, zzfu.VECTOR, zzgh.FLOAT),
    INT64_LIST(20, zzfu.VECTOR, zzgh.LONG),
    UINT64_LIST(21, zzfu.VECTOR, zzgh.LONG),
    INT32_LIST(22, zzfu.VECTOR, zzgh.INT),
    FIXED64_LIST(23, zzfu.VECTOR, zzgh.LONG),
    FIXED32_LIST(24, zzfu.VECTOR, zzgh.INT),
    BOOL_LIST(25, zzfu.VECTOR, zzgh.zzxw),
    STRING_LIST(26, zzfu.VECTOR, zzgh.STRING),
    MESSAGE_LIST(27, zzfu.VECTOR, zzgh.MESSAGE),
    BYTES_LIST(28, zzfu.VECTOR, zzgh.BYTE_STRING),
    UINT32_LIST(29, zzfu.VECTOR, zzgh.INT),
    ENUM_LIST(30, zzfu.VECTOR, zzgh.ENUM),
    SFIXED32_LIST(31, zzfu.VECTOR, zzgh.INT),
    SFIXED64_LIST(32, zzfu.VECTOR, zzgh.LONG),
    SINT32_LIST(33, zzfu.VECTOR, zzgh.INT),
    SINT64_LIST(34, zzfu.VECTOR, zzgh.LONG),
    DOUBLE_LIST_PACKED(35, zzfu.PACKED_VECTOR, zzgh.DOUBLE),
    FLOAT_LIST_PACKED(36, zzfu.PACKED_VECTOR, zzgh.FLOAT),
    INT64_LIST_PACKED(37, zzfu.PACKED_VECTOR, zzgh.LONG),
    UINT64_LIST_PACKED(38, zzfu.PACKED_VECTOR, zzgh.LONG),
    INT32_LIST_PACKED(39, zzfu.PACKED_VECTOR, zzgh.INT),
    FIXED64_LIST_PACKED(40, zzfu.PACKED_VECTOR, zzgh.LONG),
    FIXED32_LIST_PACKED(41, zzfu.PACKED_VECTOR, zzgh.INT),
    BOOL_LIST_PACKED(42, zzfu.PACKED_VECTOR, zzgh.zzxw),
    UINT32_LIST_PACKED(43, zzfu.PACKED_VECTOR, zzgh.INT),
    ENUM_LIST_PACKED(44, zzfu.PACKED_VECTOR, zzgh.ENUM),
    SFIXED32_LIST_PACKED(45, zzfu.PACKED_VECTOR, zzgh.INT),
    SFIXED64_LIST_PACKED(46, zzfu.PACKED_VECTOR, zzgh.LONG),
    SINT32_LIST_PACKED(47, zzfu.PACKED_VECTOR, zzgh.INT),
    SINT64_LIST_PACKED(48, zzfu.PACKED_VECTOR, zzgh.LONG),
    GROUP_LIST(49, zzfu.VECTOR, zzgh.MESSAGE),
    MAP(50, zzfu.MAP, zzgh.VOID);
    
    private static final zzfs[] zzvu = null;
    private static final Type[] zzvv = null;

    /* renamed from: id */
    private final int f3238id;
    private final zzgh zzvq;
    private final zzfu zzvr;
    private final Class<?> zzvs;
    private final boolean zzvt;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r1 = com.google.android.gms.internal.vision.zzft.zzvy[r5.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzfs(int r3, com.google.android.gms.internal.vision.zzfu r4, com.google.android.gms.internal.vision.zzgh r5) {
        /*
            r0 = this;
            r0.<init>(r1, r2)
            r0.f3238id = r3
            r0.zzvr = r4
            r0.zzvq = r5
            int[] r1 = com.google.android.gms.internal.vision.zzft.zzvx
            int r2 = r4.ordinal()
            r1 = r1[r2]
            r2 = 2
            r3 = 1
            if (r1 == r3) goto L_0x0022
            if (r1 == r2) goto L_0x001b
            r1 = 0
            r0.zzvs = r1
            goto L_0x0028
        L_0x001b:
            java.lang.Class r1 = r5.zzfq()
            r0.zzvs = r1
            goto L_0x0028
        L_0x0022:
            java.lang.Class r1 = r5.zzfq()
            r0.zzvs = r1
        L_0x0028:
            com.google.android.gms.internal.vision.zzfu r1 = com.google.android.gms.internal.vision.zzfu.SCALAR
            if (r4 != r1) goto L_0x003c
            int[] r1 = com.google.android.gms.internal.vision.zzft.zzvy
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
            r0.zzvt = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzfs.<init>(java.lang.String, int, int, com.google.android.gms.internal.vision.zzfu, com.google.android.gms.internal.vision.zzgh):void");
    }

    /* renamed from: id */
    public final int mo49974id() {
        return this.f3238id;
    }

    static {
        int i;
        zzvv = new Type[0];
        zzfs[] values = values();
        zzvu = new zzfs[values.length];
        for (zzfs zzfs : values) {
            zzvu[zzfs.f3238id] = zzfs;
        }
    }
}
