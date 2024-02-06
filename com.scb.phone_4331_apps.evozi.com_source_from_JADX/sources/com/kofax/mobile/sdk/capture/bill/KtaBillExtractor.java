package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk._internal.IImageToByteArray;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.C8005e;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.IKtaSessionIdProviderFactory;
import p040o.HmlPinActivity;

public class KtaBillExtractor extends C8005e {
    public String getProcessName() {
        return "KofaxBillPaySync";
    }

    @HmlPinActivity
    public KtaBillExtractor(IKtaSessionIdProviderFactory iKtaSessionIdProviderFactory, IImageToByteArray iImageToByteArray) {
        super(iKtaSessionIdProviderFactory, iImageToByteArray);
    }
}
