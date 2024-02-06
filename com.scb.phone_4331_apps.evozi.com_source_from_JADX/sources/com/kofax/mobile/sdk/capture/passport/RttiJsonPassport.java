package com.kofax.mobile.sdk.capture.passport;

import android.content.Context;
import com.kofax.mobile.sdk._internal.C7922i;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import com.kofax.mobile.sdk.capture.check.KtaCheckExtractor;
import com.kofax.mobile.sdk.capture.model.Field;
import com.kofax.mobile.sdk.capture.model.Passport;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

public class RttiJsonPassport extends Passport implements C7922i {
    private final String COUNTRY = KtaCheckExtractor.COUNTRY;

    /* renamed from: Rx */
    private final String f4870Rx = "MRZ1";

    /* renamed from: Ry */
    private final String f4871Ry = "MRZ2";
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_rtti_")
    @HmlPinActivity

    /* renamed from: ZW */
    IJsonExactionHelper f4872ZW;

    /* renamed from: ZX */
    private String f4873ZX;
    private final String adi = "FirstName";
    private final String adj = "MiddleName";
    private final String adk = "LastName";
    private final String adl = "DateOfBirth";
    private final String adm = "Gender";
    private final String adn = "IssueDate";
    private final String ado = "ExpirationDate";
    private final String adp = "PassportNumber";
    private final String adq = "CountryLong";
    private final String adr = "Nationality";
    private final String ads = "PersonalNumber";

    public RttiJsonPassport(Context context, String str) {
        if (str != null) {
            Injector.getInjector(context).injectMembers(this);
            this.f4872ZW.init(str);
            setJson(str);
            return;
        }
        throw new IllegalArgumentException("json cannot be null");
    }

    public void setJson(String str) {
        this.f4873ZX = str;
    }

    public Field<String> getFirstName() {
        return this.f4872ZW.getString("FirstName");
    }

    public Field<String> getMiddleName() {
        return this.f4872ZW.getString("MiddleName");
    }

    public Field<String> getLastName() {
        return this.f4872ZW.getString("LastName");
    }

    public Field<String> getDateOfBirth() {
        return this.f4872ZW.getString("DateOfBirth");
    }

    public Field<String> getGender() {
        return this.f4872ZW.getString("Gender");
    }

    public Field<String> getIssueDate() {
        return this.f4872ZW.getString("IssueDate");
    }

    public Field<String> getExpirationDate() {
        return this.f4872ZW.getString("ExpirationDate");
    }

    public Field<String> getPassportNumber() {
        return this.f4872ZW.getString("PassportNumber");
    }

    public Field<String> getCountry() {
        return this.f4872ZW.getString(KtaCheckExtractor.COUNTRY);
    }

    public Field<String> getCountryLong() {
        return this.f4872ZW.getString("CountryLong");
    }

    public Field<String> getNationality() {
        return this.f4872ZW.getString("Nationality");
    }

    public Field<String> getPersonalNumber() {
        return this.f4872ZW.getString("PersonalNumber");
    }

    public Field<String> getMRZ1() {
        return this.f4872ZW.getString("MRZ1");
    }

    public Field<String> getMRZ2() {
        return this.f4872ZW.getString("MRZ2");
    }

    public String getRawData() {
        return this.f4873ZX;
    }
}
