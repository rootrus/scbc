package com.kofax.kmc.ken.engines.ocr;

public class OcrRegion {

    /* renamed from: hM */
    int f3389hM = 0;

    /* renamed from: hN */
    int f3390hN = 0;

    /* renamed from: hO */
    int f3391hO = 0;

    /* renamed from: hP */
    int f3392hP = 0;

    /* renamed from: hQ */
    private RegionType f3393hQ = null;

    public enum RegionType {
        REGION_PERCENT,
        REGION_PIXELS
    }

    public int getRegionTop() {
        return this.f3389hM;
    }

    public void setRegionTop(int i) {
        this.f3389hM = i;
    }

    public int getRegionLeft() {
        return this.f3390hN;
    }

    public void setRegionLeft(int i) {
        this.f3390hN = i;
    }

    public int getRegionWidth() {
        return this.f3391hO;
    }

    public void setRegionWidth(int i) {
        this.f3391hO = i;
    }

    public int getRegionHeight() {
        return this.f3392hP;
    }

    public void setRegionHeight(int i) {
        this.f3392hP = i;
    }

    public RegionType getRegionType() {
        return this.f3393hQ;
    }

    public void setRegionType(RegionType regionType) {
        this.f3393hQ = regionType;
    }
}
