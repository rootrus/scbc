package com.google.android.datatransport.runtime.time;

import p040o.CreditCardCaptureModule_GetIParametersFactory;
import p040o.ZHER2K;

public abstract class TimeModule {
    public static CreditCardCaptureModule_GetIParametersFactory read() {
        return new ZHER2K.write();
    }

    public static CreditCardCaptureModule_GetIParametersFactory write() {
        return new ZHER2K();
    }
}
