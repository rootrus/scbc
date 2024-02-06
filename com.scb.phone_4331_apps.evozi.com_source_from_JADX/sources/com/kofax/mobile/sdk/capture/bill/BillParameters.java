package com.kofax.mobile.sdk.capture.bill;

import android.content.Context;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.capture.parameter.IParameters;
import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

public class BillParameters implements IParameters {
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture.bill_parameters_")
    @HmlPinActivity

    /* renamed from: ZO */
    ExtractionParameters f4619ZO;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture.bill_parameters_")
    @HmlPinActivity

    /* renamed from: ZP */
    LookAndFeelParameters f4620ZP;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture.bill_parameters_")
    @HmlPinActivity

    /* renamed from: ZQ */
    ProcessingParameters f4621ZQ;

    @HmlPinActivity
    BillParameters() {
    }

    public BillParameters(Context context) {
        Injector.getInjector(context.getApplicationContext()).injectMembers(this);
    }

    public ProcessingParameters getProcessingParameters() {
        return this.f4621ZQ;
    }

    public ExtractionParameters getExtractionParameters() {
        return this.f4619ZO;
    }

    public LookAndFeelParameters getLookAndFeelParameters() {
        return this.f4620ZP;
    }
}
