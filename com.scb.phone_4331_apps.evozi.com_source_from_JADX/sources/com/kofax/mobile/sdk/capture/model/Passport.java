package com.kofax.mobile.sdk.capture.model;

public abstract class Passport extends CaptureData {
    public abstract Field<String> getCountry();

    public abstract Field<String> getCountryLong();

    public abstract Field<String> getDateOfBirth();

    public abstract Field<String> getExpirationDate();

    public abstract Field<String> getFirstName();

    public abstract Field<String> getGender();

    public abstract Field<String> getIssueDate();

    public abstract Field<String> getLastName();

    public abstract Field<String> getMRZ1();

    public abstract Field<String> getMRZ2();

    public abstract Field<String> getMiddleName();

    public abstract Field<String> getNationality();

    public abstract Field<String> getPassportNumber();

    public abstract Field<String> getPersonalNumber();

    public abstract String getRawData();
}
