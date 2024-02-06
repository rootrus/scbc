package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk._internal.IImageToByteArray;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.C8005e;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.IKtaSessionIdProviderFactory;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.kmd.JobService;
import p040o.HmlPinActivity;

public class KtaPassportExtractor extends C8005e {
    private static final String acT = "IDType";

    public String getProcessName() {
        return "KofaxMobileIDCaptureSync";
    }

    @HmlPinActivity
    public KtaPassportExtractor(IKtaSessionIdProviderFactory iKtaSessionIdProviderFactory, IImageToByteArray iImageToByteArray) {
        super(iKtaSessionIdProviderFactory, iImageToByteArray);
    }

    public void updateKTARequest(JobService jobService) {
        jobService.updateJsonDocuments(acT, "Passport");
    }
}
