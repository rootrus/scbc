package com.kofax.kmc.ken.engines.ocr;

public class OcrCompleteStatus {

    /* renamed from: hu */
    OcrFailureData f3369hu;

    /* renamed from: hv */
    OcrFailureData f3370hv;

    /* renamed from: hw */
    OcrFailureData f3371hw;

    public void setOCRStatus(int i) {
        if (i < 0) {
            this.f3371hw = this.f3369hu;
        } else {
            this.f3371hw = this.f3370hv;
        }
    }

    public OcrFailureData getOCRStatus() {
        return this.f3371hw;
    }
}
