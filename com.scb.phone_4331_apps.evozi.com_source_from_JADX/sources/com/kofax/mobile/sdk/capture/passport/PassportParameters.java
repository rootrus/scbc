package com.kofax.mobile.sdk.capture.passport;

import android.content.Context;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.capture.parameter.IParameters;
import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

public class PassportParameters implements IParameters {
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._passport_parameters_")
    @HmlPinActivity

    /* renamed from: ZO */
    ExtractionParameters f4859ZO;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._passport_parameters_")
    @HmlPinActivity

    /* renamed from: ZP */
    LookAndFeelParameters f4860ZP;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._passport_parameters_")
    @HmlPinActivity

    /* renamed from: ZQ */
    ProcessingParameters f4861ZQ;

    @HmlPinActivity
    PassportParameters() {
    }

    public PassportParameters(Context context) {
        Injector.getInjector(context.getApplicationContext()).injectMembers(this);
    }

    public ProcessingParameters getProcessingParameters() {
        return this.f4861ZQ;
    }

    public ExtractionParameters getExtractionParameters() {
        return this.f4859ZO;
    }

    public LookAndFeelParameters getLookAndFeelParameters() {
        return this.f4860ZP;
    }
}
