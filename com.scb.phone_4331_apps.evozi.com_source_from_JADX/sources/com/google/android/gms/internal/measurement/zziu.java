package com.google.android.gms.internal.measurement;

public enum zziu {
    DOUBLE(zzjb.DOUBLE, 1),
    FLOAT(zzjb.FLOAT, 5),
    INT64(zzjb.LONG, 0),
    UINT64(zzjb.LONG, 0),
    INT32(zzjb.INT, 0),
    FIXED64(zzjb.LONG, 1),
    FIXED32(zzjb.INT, 5),
    BOOL(zzjb.BOOLEAN, 0),
    STRING(zzjb.STRING, 2),
    GROUP(zzjb.MESSAGE, 3),
    MESSAGE(zzjb.MESSAGE, 2),
    BYTES(zzjb.BYTE_STRING, 2),
    UINT32(zzjb.INT, 0),
    ENUM(zzjb.ENUM, 0),
    SFIXED32(zzjb.INT, 5),
    SFIXED64(zzjb.LONG, 1),
    SINT32(zzjb.INT, 0),
    SINT64(zzjb.LONG, 0);
    
    private final zzjb zzs;
    private final int zzt;

    private zziu(zzjb zzjb, int i) {
        this.zzs = zzjb;
        this.zzt = i;
    }

    public final zzjb zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}
