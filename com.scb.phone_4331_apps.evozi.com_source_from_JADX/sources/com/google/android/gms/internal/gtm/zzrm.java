package com.google.android.gms.internal.gtm;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public enum zzrm {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    zzbbq(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzps.class, zzps.class, zzps.zzavx),
    ENUM(Integer.TYPE, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    
    private final Class<?> zzbbv;
    private final Class<?> zzbbw;
    private final Object zzbbx;

    private zzrm(Class<?> cls, Class<?> cls2, Object obj) {
        this.zzbbv = cls;
        this.zzbbw = cls2;
        this.zzbbx = obj;
    }

    public final Class<?> zzpx() {
        return this.zzbbw;
    }
}
