package com.kofax.mobile.sdk.capture.creditcard;

import android.content.Context;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.capture.parameter.IParameters;
import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

public class CreditCardParameters implements IParameters {
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._credit_card_parameters_")
    @HmlPinActivity

    /* renamed from: ZO */
    ExtractionParameters f4711ZO;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._credit_card_parameters_")
    @HmlPinActivity

    /* renamed from: ZP */
    LookAndFeelParameters f4712ZP;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._credit_card_parameters_")
    @HmlPinActivity

    /* renamed from: ZQ */
    ProcessingParameters f4713ZQ;
    public CardStyle cardStyle = CardStyle.EMBOSSED;
    public long extraTimeForExpiry = 1000;

    public enum CardStyle {
        EMBOSSED,
        FLAT
    }

    @HmlPinActivity
    CreditCardParameters() {
    }

    public CreditCardParameters(Context context) {
        Injector.getInjector(context.getApplicationContext()).injectMembers(this);
    }

    public ProcessingParameters getProcessingParameters() {
        return this.f4713ZQ;
    }

    public ExtractionParameters getExtractionParameters() {
        return this.f4711ZO;
    }

    public LookAndFeelParameters getLookAndFeelParameters() {
        return this.f4712ZP;
    }
}
