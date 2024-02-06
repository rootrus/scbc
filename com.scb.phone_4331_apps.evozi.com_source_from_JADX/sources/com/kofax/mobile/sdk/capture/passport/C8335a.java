package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk._internal.C7922i;
import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import com.kofax.mobile.sdk._internal.extraction.p004id.IIdFieldNameConvention;
import com.kofax.mobile.sdk.capture.model.Field;
import com.kofax.mobile.sdk.capture.model.Passport;

/* renamed from: com.kofax.mobile.sdk.capture.passport.a */
class C8335a extends Passport implements C7922i {

    /* renamed from: ZW */
    private final IJsonExactionHelper f4875ZW;

    /* renamed from: ZX */
    private String f4876ZX;
    private final IIdFieldNameConvention acl;

    C8335a(IIdFieldNameConvention iIdFieldNameConvention, IJsonExactionHelper iJsonExactionHelper, String str) {
        if (str == null) {
            throw new IllegalArgumentException("json cannot be null");
        } else if (iIdFieldNameConvention == null) {
            throw new IllegalArgumentException("convention cannot be null");
        } else if (iJsonExactionHelper != null) {
            this.f4875ZW = iJsonExactionHelper;
            iJsonExactionHelper.init(str);
            this.acl = iIdFieldNameConvention;
            setJson(str);
        } else {
            throw new IllegalArgumentException("helper cannot be null");
        }
    }

    public void setJson(String str) {
        this.f4876ZX = str;
    }

    public Field<String> getFirstName() {
        return this.f4875ZW.getString(this.acl.getFirstNameFieldName());
    }

    public Field<String> getMiddleName() {
        return this.f4875ZW.getString(this.acl.getMiddleNameFieldName());
    }

    public Field<String> getLastName() {
        return this.f4875ZW.getString(this.acl.getLastNameFieldName());
    }

    public Field<String> getDateOfBirth() {
        return this.f4875ZW.getString(this.acl.getDateOfBirthFieldName());
    }

    public Field<String> getGender() {
        return this.f4875ZW.getString(this.acl.getGenderFieldName());
    }

    public Field<String> getIssueDate() {
        return this.f4875ZW.getString(this.acl.getDateOfIssueFieldName());
    }

    public Field<String> getExpirationDate() {
        return this.f4875ZW.getString(this.acl.getDateOfExpirationFieldName());
    }

    public Field<String> getPassportNumber() {
        return this.f4875ZW.getString("PassportNumber");
    }

    public Field<String> getCountry() {
        return this.f4875ZW.getString(this.acl.getCountryShortFieldName());
    }

    public Field<String> getCountryLong() {
        return this.f4875ZW.getString(this.acl.getCountryFieldName());
    }

    public Field<String> getNationality() {
        return this.f4875ZW.getString(this.acl.getNationalityFieldName());
    }

    public Field<String> getPersonalNumber() {
        return this.f4875ZW.getString("PersonalNumber");
    }

    public Field<String> getMRZ1() {
        return this.f4875ZW.getString("MRZ1");
    }

    public Field<String> getMRZ2() {
        return this.f4875ZW.getString("MRZ2");
    }

    public String getRawData() {
        return this.f4876ZX;
    }
}
