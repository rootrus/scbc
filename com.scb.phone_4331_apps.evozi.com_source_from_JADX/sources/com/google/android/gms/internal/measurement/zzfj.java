package com.google.android.gms.internal.measurement;

import java.lang.reflect.Type;

public enum zzfj {
    DOUBLE(0, zzfl.SCALAR, zzfy.DOUBLE),
    FLOAT(1, zzfl.SCALAR, zzfy.FLOAT),
    INT64(2, zzfl.SCALAR, zzfy.LONG),
    UINT64(3, zzfl.SCALAR, zzfy.LONG),
    INT32(4, zzfl.SCALAR, zzfy.INT),
    FIXED64(5, zzfl.SCALAR, zzfy.LONG),
    FIXED32(6, zzfl.SCALAR, zzfy.INT),
    BOOL(7, zzfl.SCALAR, zzfy.BOOLEAN),
    STRING(8, zzfl.SCALAR, zzfy.STRING),
    MESSAGE(9, zzfl.SCALAR, zzfy.MESSAGE),
    BYTES(10, zzfl.SCALAR, zzfy.BYTE_STRING),
    UINT32(11, zzfl.SCALAR, zzfy.INT),
    ENUM(12, zzfl.SCALAR, zzfy.ENUM),
    SFIXED32(13, zzfl.SCALAR, zzfy.INT),
    SFIXED64(14, zzfl.SCALAR, zzfy.LONG),
    SINT32(15, zzfl.SCALAR, zzfy.INT),
    SINT64(16, zzfl.SCALAR, zzfy.LONG),
    GROUP(17, zzfl.SCALAR, zzfy.MESSAGE),
    DOUBLE_LIST(18, zzfl.VECTOR, zzfy.DOUBLE),
    FLOAT_LIST(19, zzfl.VECTOR, zzfy.FLOAT),
    INT64_LIST(20, zzfl.VECTOR, zzfy.LONG),
    UINT64_LIST(21, zzfl.VECTOR, zzfy.LONG),
    INT32_LIST(22, zzfl.VECTOR, zzfy.INT),
    FIXED64_LIST(23, zzfl.VECTOR, zzfy.LONG),
    FIXED32_LIST(24, zzfl.VECTOR, zzfy.INT),
    BOOL_LIST(25, zzfl.VECTOR, zzfy.BOOLEAN),
    STRING_LIST(26, zzfl.VECTOR, zzfy.STRING),
    MESSAGE_LIST(27, zzfl.VECTOR, zzfy.MESSAGE),
    BYTES_LIST(28, zzfl.VECTOR, zzfy.BYTE_STRING),
    UINT32_LIST(29, zzfl.VECTOR, zzfy.INT),
    ENUM_LIST(30, zzfl.VECTOR, zzfy.ENUM),
    SFIXED32_LIST(31, zzfl.VECTOR, zzfy.INT),
    SFIXED64_LIST(32, zzfl.VECTOR, zzfy.LONG),
    SINT32_LIST(33, zzfl.VECTOR, zzfy.INT),
    SINT64_LIST(34, zzfl.VECTOR, zzfy.LONG),
    DOUBLE_LIST_PACKED(35, zzfl.PACKED_VECTOR, zzfy.DOUBLE),
    FLOAT_LIST_PACKED(36, zzfl.PACKED_VECTOR, zzfy.FLOAT),
    INT64_LIST_PACKED(37, zzfl.PACKED_VECTOR, zzfy.LONG),
    UINT64_LIST_PACKED(38, zzfl.PACKED_VECTOR, zzfy.LONG),
    INT32_LIST_PACKED(39, zzfl.PACKED_VECTOR, zzfy.INT),
    FIXED64_LIST_PACKED(40, zzfl.PACKED_VECTOR, zzfy.LONG),
    FIXED32_LIST_PACKED(41, zzfl.PACKED_VECTOR, zzfy.INT),
    BOOL_LIST_PACKED(42, zzfl.PACKED_VECTOR, zzfy.BOOLEAN),
    UINT32_LIST_PACKED(43, zzfl.PACKED_VECTOR, zzfy.INT),
    ENUM_LIST_PACKED(44, zzfl.PACKED_VECTOR, zzfy.ENUM),
    SFIXED32_LIST_PACKED(45, zzfl.PACKED_VECTOR, zzfy.INT),
    SFIXED64_LIST_PACKED(46, zzfl.PACKED_VECTOR, zzfy.LONG),
    SINT32_LIST_PACKED(47, zzfl.PACKED_VECTOR, zzfy.INT),
    SINT64_LIST_PACKED(48, zzfl.PACKED_VECTOR, zzfy.LONG),
    GROUP_LIST(49, zzfl.VECTOR, zzfy.MESSAGE),
    MAP(50, zzfl.MAP, zzfy.VOID);
    
    private static final zzfj[] zzbe = null;
    private static final Type[] zzbf = null;
    private final zzfy zzaz;
    private final int zzba;
    private final zzfl zzbb;
    private final Class<?> zzbc;
    private final boolean zzbd;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r1 = com.google.android.gms.internal.measurement.zzfi.zzb[r5.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzfj(int r3, com.google.android.gms.internal.measurement.zzfl r4, com.google.android.gms.internal.measurement.zzfy r5) {
        /*
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzba = r3
            r0.zzbb = r4
            r0.zzaz = r5
            int[] r1 = com.google.android.gms.internal.measurement.zzfi.zza
            int r2 = r4.ordinal()
            r1 = r1[r2]
            r2 = 2
            r3 = 1
            if (r1 == r3) goto L_0x0022
            if (r1 == r2) goto L_0x001b
            r1 = 0
            r0.zzbc = r1
            goto L_0x0028
        L_0x001b:
            java.lang.Class r1 = r5.zza()
            r0.zzbc = r1
            goto L_0x0028
        L_0x0022:
            java.lang.Class r1 = r5.zza()
            r0.zzbc = r1
        L_0x0028:
            com.google.android.gms.internal.measurement.zzfl r1 = com.google.android.gms.internal.measurement.zzfl.SCALAR
            if (r4 != r1) goto L_0x003c
            int[] r1 = com.google.android.gms.internal.measurement.zzfi.zzb
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
            r0.zzbd = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzfj.<init>(java.lang.String, int, int, com.google.android.gms.internal.measurement.zzfl, com.google.android.gms.internal.measurement.zzfy):void");
    }

    public final int zza() {
        return this.zzba;
    }

    static {
        int i;
        zzbf = new Type[0];
        zzfj[] values = values();
        zzbe = new zzfj[values.length];
        for (zzfj zzfj : values) {
            zzbe[zzfj.zzba] = zzfj;
        }
    }
}
