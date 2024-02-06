package com.kofax.kmc.ken.engines.ocr;

import com.google.android.gms.auth.api.credentials.CredentialsApi;

public class OcrParameters {

    /* renamed from: hI */
    int f3385hI = CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;

    /* renamed from: hJ */
    private Font f3386hJ = Font.DEFAULT;

    /* renamed from: hK */
    private OcrRegion f3387hK;

    public enum Font {
        DEFAULT,
        GENERIC_MACHINE_PRINT,
        FARRINGTON_CREDIT_CARD,
        E13B_MICR
    }

    public int getOcrBufferSize() {
        return this.f3385hI;
    }

    public void setOcrBufferSize(int i) {
        this.f3385hI = i;
    }

    public void setFont(Font font) {
        this.f3386hJ = font;
    }

    public Font getFont() {
        return this.f3386hJ;
    }

    public OcrRegion getRegion() {
        return this.f3387hK;
    }

    public void setRegion(OcrRegion ocrRegion) {
        this.f3387hK = ocrRegion;
    }
}
