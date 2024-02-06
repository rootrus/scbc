package com.kofax.mobile.sdk.capture.check;

import com.kofax.mobile.sdk._internal.IImageToByteArray;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.C8005e;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.IKtaSessionIdProviderFactory;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.kmd.JobService;
import p040o.HmlPinActivity;

public class KtaCheckExtractor extends C8005e implements ICheckExtractionServer {
    public static final String COUNTRY = "Country";
    private CheckParameters aay;

    public String getProcessName() {
        return "KofaxCheckDepositSync";
    }

    @HmlPinActivity
    public KtaCheckExtractor(IKtaSessionIdProviderFactory iKtaSessionIdProviderFactory, IImageToByteArray iImageToByteArray) {
        super(iKtaSessionIdProviderFactory, iImageToByteArray);
    }

    public void setCheckParameters(CheckParameters checkParameters) {
        this.aay = checkParameters;
    }

    public void updateKTARequest(JobService jobService) {
        jobService.updateJsonDocuments(COUNTRY, CheckExtractor.aaq.get(this.aay.country));
    }
}
