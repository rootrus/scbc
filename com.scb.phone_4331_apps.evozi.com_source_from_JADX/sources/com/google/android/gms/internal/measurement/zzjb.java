package com.google.android.gms.internal.measurement;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public enum zzjb {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(false),
    STRING(""),
    BYTE_STRING(zzeg.zza),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzj;

    private zzjb(Object obj) {
        this.zzj = obj;
    }
}
