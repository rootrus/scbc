package com.kofax.mobile.sdk.capture.model;

import android.graphics.Bitmap;

/* renamed from: com.kofax.mobile.sdk.capture.model.Id */
public abstract class C8328Id extends CaptureData {
    public abstract Field<String> getAddress();

    public abstract Field<String> getAddress2();

    public abstract Field<String> getAddress3();

    public abstract Field<String> getAddress4();

    public abstract Field<String> getAddress5();

    public abstract Field<String> getAddress6();

    public abstract Field<String> getCity();

    public abstract Field<String> getCountry();

    public abstract Field<String> getCountryShort();

    public abstract Field<String> getDateOfBirth();

    public abstract Field<String> getDocumentVerificationConfidenceRating();

    public abstract Field<String> getExpirationDate();

    public abstract Field<String> getEyes();

    public abstract Bitmap getFaceImage();

    public abstract Field<String> getFirstName();

    public abstract Field<String> getGender();

    public abstract Field<String> getHair();

    public abstract Field<String> getHeight();

    public abstract Field<String> getIdClass();

    public abstract Field<String> getIdNumber();

    public abstract Field<String> getIssueDate();

    public abstract Field<String> getLastName();

    public abstract Field<String> getLicense();

    public abstract Field<String> getMiddleName();

    public abstract Field<String> getNameSuffix();

    public abstract Field<String> getNationality();

    public abstract String getRawData();

    public abstract Bitmap getSignatureImage();

    public abstract Field<String> getState();

    public abstract Field<String> getWeight();

    public abstract Field<String> getZip();

    public abstract Field<String> isBarcodeRead();

    public abstract Field<String> isOcrRead();

    public Field<String> getDocumentType() {
        return new Field("DocumentType", "ID", 1.0d, FieldLocation.UNDEFINED);
    }

    public Field<String> getDocumentState() {
        return getState();
    }
}
