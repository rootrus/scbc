package com.kofax.mobile.sdk.capture.model;

public abstract class Bill extends CaptureData {
    public abstract Field getAccountNumber();

    public abstract Field getAddressLine1();

    public abstract Field getAddressLine2();

    public abstract Field getAmount();

    public abstract Field getBillers();

    public abstract Field getCity();

    public abstract Field getDueDate();

    public abstract Field getName();

    public abstract Field getPhoneNumber();

    public abstract String getRawData();

    public abstract Field getSource();

    public abstract Field getState();

    public abstract Field getZip();
}
