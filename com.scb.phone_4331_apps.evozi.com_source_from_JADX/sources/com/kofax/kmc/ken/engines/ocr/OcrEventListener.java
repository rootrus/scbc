package com.kofax.kmc.ken.engines.ocr;

public interface OcrEventListener {
    void ocrFailed(OcrFailureData ocrFailureData);

    void ocrSucceeded(OcrResultData ocrResultData);
}
