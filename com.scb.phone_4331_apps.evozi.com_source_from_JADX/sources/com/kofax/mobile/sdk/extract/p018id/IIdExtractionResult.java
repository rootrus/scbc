package com.kofax.mobile.sdk.extract.p018id;

import java.io.Serializable;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk.extract.id.IIdExtractionResult */
public interface IIdExtractionResult extends Serializable {
    String classification();

    float classificationConfidence();

    double getDocumentVerificationConfidenceRating();

    ImageField getFaceImageField();

    List<DataField> getFields();

    ImageField getSignatureImageField();

    boolean isBarcodeRead();

    boolean isOcrRead();
}
