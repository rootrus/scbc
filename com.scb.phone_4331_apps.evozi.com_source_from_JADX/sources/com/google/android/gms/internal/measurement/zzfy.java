package com.google.android.gms.internal.measurement;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public enum zzfy {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzeg.class, zzeg.class, zzeg.zza),
    ENUM(Integer.TYPE, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    
    private final Class<?> zzk;
    private final Class<?> zzl;
    private final Object zzm;

    private zzfy(Class<?> cls, Class<?> cls2, Object obj) {
        this.zzk = cls;
        this.zzl = cls2;
        this.zzm = obj;
    }

    public final Class<?> zza() {
        return this.zzl;
    }
}
