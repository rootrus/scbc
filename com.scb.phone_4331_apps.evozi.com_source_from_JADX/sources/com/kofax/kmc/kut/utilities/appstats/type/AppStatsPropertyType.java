package com.kofax.kmc.kut.utilities.appstats.type;

public enum AppStatsPropertyType {
    PROP_TYPE_UNUSED("Unused");
    
    private static final String TAG = null;

    /* renamed from: sp */
    private final String f1003sp;

    static {
        TAG = AppStatsInstanceType.class.getSimpleName();
    }

    private AppStatsPropertyType(String str) {
        this.f1003sp = str;
    }

    public final String getPropTypeDescrip() {
        return this.f1003sp;
    }
}
