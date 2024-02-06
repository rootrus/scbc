package com.kofax.mobile.sdk.capture.p017id;

import android.content.Context;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.capture.model.C8328Id;
import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.capture.parameter.IParameters;
import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import com.kofax.mobile.sdk.extract.p018id.IdRegion;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdParameters */
public class IdParameters implements IParameters {
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._id_parameters_")
    @HmlPinActivity

    /* renamed from: ZO */
    ExtractionParameters f4782ZO;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._id_parameters_")
    @HmlPinActivity

    /* renamed from: ZP */
    LookAndFeelParameters f4783ZP;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._id_parameters_")
    @HmlPinActivity

    /* renamed from: ZQ */
    ProcessingParameters f4784ZQ;
    public String barcode;
    public C8328Id reverseSideId;
    public IdSide side = IdSide.FRONT;
    public IdState state = IdState.NOT_SPECIFIED;

    /* renamed from: com.kofax.mobile.sdk.capture.id.IdParameters$IdSide */
    public enum IdSide {
        FRONT,
        BACK
    }

    /* renamed from: com.kofax.mobile.sdk.capture.id.IdParameters$IdState */
    public enum IdState {
        NOT_SPECIFIED((String) null),
        UNITED_STATES(IdRegion.US),
        CANADA(IdRegion.CANADA),
        CAMEROON(IdRegion.AFRICA),
        AFRICA_OTHER(IdRegion.AFRICA),
        CHINA(IdRegion.ASIA),
        INDIA(IdRegion.ASIA),
        SINGAPORE(IdRegion.ASIA),
        SOUTH_KOREA(IdRegion.ASIA),
        JAPAN(IdRegion.ASIA),
        ASIA_OTHER(IdRegion.ASIA),
        KEY_PASS(IdRegion.AUSTRALIA),
        AUSTRALIA_OTHER(IdRegion.AUSTRALIA),
        ALBANIA(IdRegion.EUROPE),
        GERMANY(IdRegion.EUROPE),
        LITHUANIA(IdRegion.EUROPE),
        LUXEMBOURG(IdRegion.EUROPE),
        EUROPE_OTHER(IdRegion.EUROPE),
        BRAZIL(IdRegion.LATIN_AMERICA),
        ECUADOR(IdRegion.LATIN_AMERICA),
        EL_SALVADOR(IdRegion.LATIN_AMERICA),
        GUATEMALA(IdRegion.LATIN_AMERICA),
        ST_CHRIST_NEVIS(IdRegion.LATIN_AMERICA),
        LATIN_AMERICA_OTHER(IdRegion.LATIN_AMERICA);
        
        public final IdRegion region;

        private IdState(IdRegion idRegion) {
            this.region = idRegion;
        }
    }

    @HmlPinActivity
    IdParameters() {
    }

    public IdParameters(Context context) {
        Injector.getInjector(context.getApplicationContext()).injectMembers(this);
    }

    public ProcessingParameters getProcessingParameters() {
        if (this.side == IdSide.FRONT) {
            return this.f4784ZQ;
        }
        return new C8324a();
    }

    public ExtractionParameters getExtractionParameters() {
        return this.f4782ZO;
    }

    public LookAndFeelParameters getLookAndFeelParameters() {
        return this.f4783ZP;
    }

    /* renamed from: com.kofax.mobile.sdk.capture.id.IdParameters$a */
    static class C8324a extends ProcessingParameters {
        public C8324a() {
            this.processingType = ProcessingParameters.ProcessingType.OFF;
        }
    }
}
