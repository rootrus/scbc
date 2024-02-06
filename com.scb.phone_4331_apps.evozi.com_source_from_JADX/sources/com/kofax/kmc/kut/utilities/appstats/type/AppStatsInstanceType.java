package com.kofax.kmc.kut.utilities.appstats.type;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7908c;

public enum AppStatsInstanceType {
    INST_TYPE_UNUSED("Unused"),
    INST_TYPE_IMAGE_PROCESSOR("ImageProcessor"),
    INST_TYPE_BARCODE_READER("BarcodeReader"),
    INST_TYPE_IMAGE_CAPTURE("ImageCapture"),
    INST_TYPE_IMAGE_REVIEW_EDIT("ImageReviewEdit"),
    INST_TYPE_BARCODE_CAPTURE("BarcodeCapture"),
    INST_TYPE_KFS_SERVER("FrontOfficeServer"),
    INST_TYPE_KTA_SERVER("TotalAgilityServer"),
    INST_TYPE_FIELDS_CHANGED("FieldsChanged"),
    INST_TYPE_IMAGE_CREATED("Image"),
    INST_TYPE_OCR(C7908c.f3661vL);
    
    private static final String TAG = null;

    /* renamed from: sk */
    private final String f1001sk;

    static {
        TAG = AppStatsInstanceType.class.getSimpleName();
    }

    private AppStatsInstanceType(String str) {
        this.f1001sk = str;
    }

    public final String getInstTypeDescrip() {
        return this.f1001sk;
    }
}
