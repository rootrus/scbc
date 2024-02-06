package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.IIdFieldNameConvention;
import com.kofax.mobile.sdk.capture.check.KtaCheckExtractor;
import com.kofax.mobile.sdk.p075e.C8340a;
import java.io.Serializable;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.eh */
public class C8135eh implements IIdFieldNameConvention, Serializable {
    public String getAddress1FieldName() {
        return "Address";
    }

    public String getAddress2FieldName() {
        return "Address2";
    }

    public String getAddress3FieldName() {
        return "Address3";
    }

    public String getAddress4FieldName() {
        return "Address4";
    }

    public String getAddress5FieldName() {
        return "Address5";
    }

    public String getAddress6FieldName() {
        return "Address6";
    }

    public String getCityFieldName() {
        return "City";
    }

    public String getCountryFieldName() {
        return KtaCheckExtractor.COUNTRY;
    }

    public String getCountryShortFieldName() {
        return "CountryShort";
    }

    public String getDateOfBirthFieldName() {
        return "DateOfBirth";
    }

    public String getDateOfExpirationFieldName() {
        return "ExpirationDate";
    }

    public String getDateOfIssueFieldName() {
        return "IssueDate";
    }

    public String getDocumentStateFieldName() {
        return "DocumentState";
    }

    public String getDocumentTypeFieldName() {
        return "DocumentType";
    }

    public String getDocumentVerificationConfidenceFieldName() {
        return "DocumentVerificationConfidenceRating";
    }

    public String getEyesFieldName() {
        return "Eyes";
    }

    public String getFaceImageFieldName() {
        return "FaceImage64";
    }

    public String getFirstNameFieldName() {
        return "FirstName";
    }

    public String getGenderFieldName() {
        return "Gender";
    }

    public String getHairFieldName() {
        return "Hair";
    }

    public String getHeightFieldName() {
        return "Height";
    }

    public String getIdClassFieldName() {
        return "Class";
    }

    public String getIdNumberFieldName() {
        return C8340a.f4878vN;
    }

    public String getIsBarcodeReadFieldName() {
        return "IsBarcodeRead";
    }

    public String getIsOcrReadFieldName() {
        return "IsOcrRead";
    }

    public String getLastNameFieldName() {
        return "LastName";
    }

    public String getLicenseFieldName() {
        return C8340a.f4879vO;
    }

    public String getMiddleNameFieldName() {
        return "MiddleName";
    }

    public String getNameSuffixFieldName() {
        return "NameSuffix";
    }

    public String getNationalityFieldName() {
        return "Nationality";
    }

    public String getSignatureImageFieldName() {
        return "SignatureImage64";
    }

    public String getStateFieldName() {
        return "State";
    }

    public String getWeightFieldName() {
        return "Weight";
    }

    public String getZipFieldName() {
        return "ZIP";
    }
}
