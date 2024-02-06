package com.kofax.mobile.sdk.capture.check;

import android.content.Context;
import com.kofax.kmc.ken.engines.data.CheckSide;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.capture.model.Check;
import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.capture.parameter.IParameters;
import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

public class CheckParameters implements IParameters {
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._check_parameters_")
    @HmlPinActivity

    /* renamed from: ZO */
    ExtractionParameters f4687ZO;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._check_parameters_")
    @HmlPinActivity

    /* renamed from: ZP */
    LookAndFeelParameters f4688ZP;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._check_parameters_")
    @HmlPinActivity

    /* renamed from: ZQ */
    ProcessingParameters f4689ZQ;
    public CheckCountry country = CheckCountry.NOT_SPECIFIED;
    public Check reverseSideCheck;
    public CheckSide side = CheckSide.FRONT;

    public enum CheckCountry {
        NOT_SPECIFIED,
        UNITED_STATES,
        CANADA,
        SINGAPORE,
        HONG_KONG,
        AUSTRALIA,
        UNITED_KINGDOM
    }

    @HmlPinActivity
    CheckParameters() {
    }

    public CheckParameters(Context context) {
        Injector.getInjector(context.getApplicationContext()).injectMembers(this);
    }

    public ProcessingParameters getProcessingParameters() {
        return this.f4689ZQ;
    }

    public ExtractionParameters getExtractionParameters() {
        return this.f4687ZO;
    }

    public LookAndFeelParameters getLookAndFeelParameters() {
        return this.f4688ZP;
    }
}
