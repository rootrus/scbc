package com.kofax.mobile.sdk.extract.p018id;

/* renamed from: com.kofax.mobile.sdk.extract.id.IdRegion */
public enum IdRegion {
    US("USIDs"),
    ASIA("AsianIDs"),
    AUSTRALIA("AustralianIDs"),
    CANADA("CanadianIDs"),
    AFRICA("AfricanIDs"),
    EUROPE("EuropeanIDs"),
    LATIN_AMERICA("LatinAmericanIDs");
    
    String adS;

    private IdRegion(String str) {
        this.adS = str;
    }

    public final String getRegionName() {
        return this.adS;
    }
}
