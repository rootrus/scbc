package com.kofax.mobile.sdk.capture.p017id;

import android.graphics.Bitmap;
import com.kofax.mobile.sdk._internal.C7922i;
import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import com.kofax.mobile.sdk._internal.extraction.p004id.IIdFieldNameConvention;
import com.kofax.mobile.sdk._internal.impl.IBase64ImageDecoder;
import com.kofax.mobile.sdk.capture.model.C8328Id;
import com.kofax.mobile.sdk.capture.model.Field;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.kofax.mobile.sdk.capture.id.ConventionBasedJsonIdDeserializer */
public class ConventionBasedJsonIdDeserializer extends C8328Id implements C7922i {

    /* renamed from: ZW */
    private IJsonExactionHelper f4721ZW;

    /* renamed from: ZX */
    private String f4722ZX;
    private IIdFieldNameConvention acl;
    private IBase64ImageDecoder acm;
    private transient Map<String, Bitmap> acn = new HashMap();

    public ConventionBasedJsonIdDeserializer(IIdFieldNameConvention iIdFieldNameConvention, IJsonExactionHelper iJsonExactionHelper, IBase64ImageDecoder iBase64ImageDecoder, String str) {
        if (str == null) {
            throw new IllegalArgumentException("json cannot be null");
        } else if (iIdFieldNameConvention == null) {
            throw new IllegalArgumentException("convention cannot be null");
        } else if (iJsonExactionHelper != null) {
            this.f4721ZW = iJsonExactionHelper;
            iJsonExactionHelper.init(str);
            this.acl = iIdFieldNameConvention;
            this.acm = iBase64ImageDecoder;
            setJson(str);
        } else {
            throw new IllegalArgumentException("helper cannot be null");
        }
    }

    public String getRawData() {
        return this.f4722ZX;
    }

    public void setJson(String str) {
        this.f4722ZX = str;
    }

    public Field<String> getDocumentType() {
        return this.f4721ZW.getString(this.acl.getDocumentTypeFieldName());
    }

    public Field<String> getFirstName() {
        return this.f4721ZW.getString(this.acl.getFirstNameFieldName());
    }

    public Field<String> getMiddleName() {
        return this.f4721ZW.getString(this.acl.getMiddleNameFieldName());
    }

    public Field<String> getLastName() {
        return this.f4721ZW.getString(this.acl.getLastNameFieldName());
    }

    public Field<String> getIdNumber() {
        return this.f4721ZW.getString(this.acl.getIdNumberFieldName());
    }

    public Field<String> getDateOfBirth() {
        return this.f4721ZW.getString(this.acl.getDateOfBirthFieldName());
    }

    public Field<String> getAddress() {
        return this.f4721ZW.getString(this.acl.getAddress1FieldName());
    }

    public Field<String> getGender() {
        return this.f4721ZW.getString(this.acl.getGenderFieldName());
    }

    public Field<String> getZip() {
        return this.f4721ZW.getString(this.acl.getZipFieldName());
    }

    public Field<String> getState() {
        return this.f4721ZW.getString(this.acl.getStateFieldName());
    }

    public Field<String> getCity() {
        return this.f4721ZW.getString(this.acl.getCityFieldName());
    }

    public Field<String> getNameSuffix() {
        return this.f4721ZW.getString(this.acl.getNameSuffixFieldName());
    }

    public Field<String> getAddress2() {
        return this.f4721ZW.getString(this.acl.getAddress2FieldName());
    }

    public Field<String> getAddress3() {
        return this.f4721ZW.getString(this.acl.getAddress3FieldName());
    }

    public Field<String> getAddress4() {
        return this.f4721ZW.getString(this.acl.getAddress4FieldName());
    }

    public Field<String> getAddress5() {
        return this.f4721ZW.getString(this.acl.getAddress5FieldName());
    }

    public Field<String> getAddress6() {
        return this.f4721ZW.getString(this.acl.getAddress6FieldName());
    }

    public Field<String> getIdClass() {
        return this.f4721ZW.getString(this.acl.getIdClassFieldName());
    }

    public Field<String> getCountryShort() {
        return this.f4721ZW.getString(this.acl.getCountryShortFieldName());
    }

    public Field<String> getCountry() {
        return this.f4721ZW.getString(this.acl.getCountryFieldName());
    }

    public Field<String> getExpirationDate() {
        return this.f4721ZW.getString(this.acl.getDateOfExpirationFieldName());
    }

    public Field<String> getEyes() {
        return this.f4721ZW.getString(this.acl.getEyesFieldName());
    }

    public Field<String> getHair() {
        return this.f4721ZW.getString(this.acl.getHairFieldName());
    }

    public Field<String> getHeight() {
        return this.f4721ZW.getString(this.acl.getHeightFieldName());
    }

    public Field<String> getIssueDate() {
        return this.f4721ZW.getString(this.acl.getDateOfIssueFieldName());
    }

    public Field<String> getNationality() {
        return this.f4721ZW.getString(this.acl.getNationalityFieldName());
    }

    public Field<String> getWeight() {
        return this.f4721ZW.getString(this.acl.getWeightFieldName());
    }

    public Field<String> getLicense() {
        return this.f4721ZW.getString(this.acl.getLicenseFieldName());
    }

    public Field<String> isBarcodeRead() {
        return this.f4721ZW.getString(this.acl.getIsBarcodeReadFieldName());
    }

    public Field<String> isOcrRead() {
        return this.f4721ZW.getString(this.acl.getIsOcrReadFieldName());
    }

    public Field<String> getDocumentVerificationConfidenceRating() {
        return this.f4721ZW.getString(this.acl.getDocumentVerificationConfidenceFieldName());
    }

    public Bitmap getSignatureImage() {
        return getBitmap(this.acl.getSignatureImageFieldName());
    }

    public Bitmap getFaceImage() {
        return getBitmap(this.acl.getFaceImageFieldName());
    }

    /* access modifiers changed from: package-private */
    public Bitmap getBitmap(String str) {
        if (this.acn.containsKey(str)) {
            return this.acn.get(str);
        }
        Bitmap bitmap = null;
        Field<String> string = this.f4721ZW.getString(str);
        if (string != null) {
            bitmap = this.acm.decode(string.getObject());
        }
        this.acn.put(str, bitmap);
        return bitmap;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.acn = new HashMap();
    }
}
