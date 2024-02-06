package com.kofax.mobile.sdk.capture.creditcard;

import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.capture.parameter.IParameters;
import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import p040o.HmlRepaymentMethodAboutActivity;

public class CreditCardCaptureModule {
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._credit_card_parameters_")
    public ExtractionParameters getExtractionParameters(ExtractionParameters extractionParameters) {
        return extractionParameters;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._credit_card_parameters_")
    public IParameters getIParameters(CreditCardParameters creditCardParameters) {
        return creditCardParameters;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._credit_card_parameters_")
    public LookAndFeelParameters getLookAndFeelParameters(LookAndFeelParameters lookAndFeelParameters) {
        return lookAndFeelParameters;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._credit_card_parameters_")
    public ProcessingParameters getProcessingParameters(ProcessingParameters processingParameters) {
        return processingParameters;
    }
}
