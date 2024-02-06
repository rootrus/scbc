package com.kofax.mobile.sdk.capture.check;

import com.kofax.mobile.sdk._internal.extraction.IDataUnitProcessedListener;
import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import com.kofax.mobile.sdk.capture.check.CheckParameters;
import com.kofax.mobile.sdk.capture.extraction.ExceptionResponse;
import com.kofax.mobile.sdk.capture.extraction.Extractor;
import com.kofax.mobile.sdk.capture.extraction.ExtractorResponse;
import com.kofax.mobile.sdk.capture.model.Check;
import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import java.util.HashMap;
import java.util.Map;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

public class CheckExtractor extends Extractor<Check> implements IDataUnitProcessedListener {
    public static final String CHECK_EXTRACT_KTA = "_check_extract_kta_";
    public static final String CHECK_EXTRACT_RTTI = "_check_extract_rtti_";
    static final Map<CheckParameters.CheckCountry, String> aaq = new HashMap<CheckParameters.CheckCountry, String>() {
        {
            put(CheckParameters.CheckCountry.NOT_SPECIFIED, (Object) null);
            put(CheckParameters.CheckCountry.UNITED_STATES, "US");
            put(CheckParameters.CheckCountry.CANADA, "CA");
            put(CheckParameters.CheckCountry.SINGAPORE, "SI");
            put(CheckParameters.CheckCountry.HONG_KONG, "HK");
            put(CheckParameters.CheckCountry.AUSTRALIA, "AU");
            put(CheckParameters.CheckCountry.UNITED_KINGDOM, "UK");
        }
    };
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_check_extract_rtti_")
    @HmlPinActivity

    /* renamed from: ZB */
    IExceptionResponseDeserializer f4671ZB;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_check_extract_kta_")
    @HmlPinActivity

    /* renamed from: ZC */
    String f4672ZC;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_check_extract_kta_")
    @HmlPinActivity

    /* renamed from: ZF */
    IExceptionResponseDeserializer f4673ZF;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_check_extract_rtti_")
    @HmlPinActivity

    /* renamed from: Zy */
    String f4674Zy;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_check_extract_rtti_")
    @HmlPinActivity
    ICheckExtractionServer aar;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_check_extract_rtti_")
    @HmlPinActivity
    ICheckDeserializer aas;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_check_extract_kta_")
    @HmlPinActivity
    ICheckExtractionServer aat;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_check_extract_kta_")
    @HmlPinActivity
    ICheckDeserializer aau;

    public void setParameters(CheckParameters checkParameters) {
        if (CheckParameters.CheckCountry.NOT_SPECIFIED.equals(checkParameters.country)) {
            checkParameters.country = CheckParameters.CheckCountry.UNITED_STATES;
        }
        super.setParameters(checkParameters.getExtractionParameters());
        if (ExtractionParameters.ExtractionType.RTTI.equals(checkParameters.getExtractionParameters().getExtractionType())) {
            this.aar.setParameters(checkParameters.getExtractionParameters());
            this.aar.setCheckParameters(checkParameters);
            setExtractionServer(this.aar);
            setResultDeserializer(this.aas);
            setExceptionResponseDeserializer(this.f4671ZB);
            return;
        }
        this.aat.setParameters(checkParameters.getExtractionParameters());
        this.aat.setCheckParameters(checkParameters);
        setExtractionServer(this.aat);
        setResultDeserializer(this.aau);
        setExceptionResponseDeserializer(this.f4673ZF);
    }

    /* access modifiers changed from: protected */
    public ExtractorResponse<Check> createResponse(Check check, ExceptionResponse exceptionResponse) {
        return new CheckExtractorResponse(check, exceptionResponse);
    }

    public String getDefaultServerUrl(ExtractionParameters.ExtractionType extractionType) {
        if (ExtractionParameters.ExtractionType.RTTI.equals(extractionType)) {
            return this.f4674Zy;
        }
        if (ExtractionParameters.ExtractionType.KTA.equals(extractionType)) {
            return this.f4672ZC;
        }
        return null;
    }
}
