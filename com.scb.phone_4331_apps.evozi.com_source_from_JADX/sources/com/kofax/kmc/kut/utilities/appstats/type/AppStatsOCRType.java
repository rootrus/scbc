package com.kofax.kmc.kut.utilities.appstats.type;

public enum AppStatsOCRType {
    OCR_ZONAL("Zonal OCR"),
    OCR_FULLPAGE("Full Page OCR");
    
    private static final String TAG = null;

    /* renamed from: sn */
    private final String f3644sn;

    static {
        TAG = AppStatsOCRType.class.getSimpleName();
    }

    private AppStatsOCRType(String str) {
        this.f3644sn = str;
    }

    public final String getOCRDescription() {
        return this.f3644sn;
    }
}
