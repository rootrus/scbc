package com.kofax.mobile.sdk.capture.model;

public abstract class Check extends CaptureData {
    public abstract Field<String> getAmount();

    public abstract Field<String> getAuxiliaryOnUs();

    public abstract Field<String> getCar();

    public abstract CheckIQAData getCheckIQAData();

    public abstract Field<String> getCheckNumber();

    public abstract CheckUsabilityData getCheckUsabilityData();

    public abstract Field<String> getDate();

    public abstract Field<String> getEpc();

    public abstract Field<String> getLar();

    public abstract Field<String> getMicr();

    public abstract Field<String> getMicrAmount();

    public abstract Field<String> getOnUs1();

    public abstract Field<String> getOnUs2();

    public abstract Field<String> getPayee();

    public abstract String getRawData();

    public abstract Field<String> getReasonForRejection();

    public abstract Field<String> getRestrictiveEndorsement();

    public abstract Field<String> getRestrictiveEndorsementPresent();

    public abstract Field<String> getTransit();

    public abstract Field<String> getUsable();
}
