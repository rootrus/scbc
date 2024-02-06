package com.google.android.gms.internal.vision;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public enum zzji {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.valueOf(0.0d)),
    zzact(false),
    STRING(""),
    BYTE_STRING(zzeo.zzrx),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzyd;

    private zzji(Object obj) {
        this.zzyd = obj;
    }
}
