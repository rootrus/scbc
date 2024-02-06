package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public enum zzuq {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    zzbpn(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzsw.class, zzsw.class, zzsw.zzbkl),
    ENUM(Integer.TYPE, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    
    private final Class<?> zzbps;
    private final Class<?> zzbpt;
    private final Object zzbpu;

    private zzuq(Class<?> cls, Class<?> cls2, Object obj) {
        this.zzbps = cls;
        this.zzbpt = cls2;
        this.zzbpu = obj;
    }

    public final Class<?> zzrs() {
        return this.zzbpt;
    }
}
