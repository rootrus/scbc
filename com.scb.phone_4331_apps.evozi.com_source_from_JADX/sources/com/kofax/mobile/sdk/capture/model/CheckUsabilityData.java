package com.kofax.mobile.sdk.capture.model;

import java.io.Serializable;

public abstract class CheckUsabilityData implements Serializable {
    public abstract Field<String> gePayeeName();

    public abstract Field<String> getCAR();

    public abstract Field<String> getCodeline();

    public abstract Field<String> getDate();

    public abstract Field<String> getLAR();

    public abstract Field<String> getPayeeEndorsement();

    public abstract Field<String> getSignature();
}
