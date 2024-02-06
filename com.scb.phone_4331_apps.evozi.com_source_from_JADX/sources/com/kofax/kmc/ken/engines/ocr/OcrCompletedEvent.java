package com.kofax.kmc.ken.engines.ocr;

import java.util.EventObject;

public class OcrCompletedEvent extends EventObject {
    private static final long serialVersionUID = 1;

    /* renamed from: hx */
    private OcrCompleteStatus f3372hx;

    public OcrCompletedEvent(Object obj, OcrCompleteStatus ocrCompleteStatus) {
        super(obj);
        this.f3372hx = ocrCompleteStatus;
    }

    public OcrCompleteStatus getOCRStatus() {
        return this.f3372hx;
    }
}
