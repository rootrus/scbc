package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk._internal.extraction.IDataUnitProcessedListener;
import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import com.kofax.mobile.sdk._internal.extraction.IExtractionServer;
import com.kofax.mobile.sdk.capture.extraction.ExceptionResponse;
import com.kofax.mobile.sdk.capture.extraction.Extractor;
import com.kofax.mobile.sdk.capture.extraction.ExtractorResponse;
import com.kofax.mobile.sdk.capture.model.Passport;
import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

public class PassportExtractor extends Extractor<Passport> implements IDataUnitProcessedListener {
    public static final String PASSPORT_EXTRACT_KTA = "_passport_extract_kta_";
    public static final String PASSPORT_EXTRACT_ON_DEVICE = "_passport_extract_on_device_";
    public static final String PASSPORT_EXTRACT_RTTI = "_passport_extract_rtti_";
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_rtti_")
    @HmlPinActivity

    /* renamed from: ZB */
    IExceptionResponseDeserializer f4837ZB;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_kta_")
    @HmlPinActivity

    /* renamed from: ZC */
    String f4838ZC;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_kta_")
    @HmlPinActivity

    /* renamed from: ZD */
    IExtractionServer f4839ZD;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_kta_")
    @HmlPinActivity

    /* renamed from: ZF */
    IExceptionResponseDeserializer f4840ZF;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_rtti_")
    @HmlPinActivity

    /* renamed from: Zy */
    String f4841Zy;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_rtti_")
    @HmlPinActivity

    /* renamed from: Zz */
    IExtractionServer f4842Zz;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_on_device_")
    @HmlPinActivity
    IExceptionResponseDeserializer acK;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_rtti_")
    @HmlPinActivity
    IPassportDeserializer adA;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_kta_")
    @HmlPinActivity
    IPassportDeserializer adB;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_on_device_")
    @HmlPinActivity
    IExtractionServer adC;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_on_device_")
    @HmlPinActivity
    IPassportDeserializer adD;

    public void setParameters(ExtractionParameters extractionParameters) {
        super.setParameters(extractionParameters);
        if (ExtractionParameters.ExtractionType.RTTI.equals(extractionParameters.getExtractionType())) {
            this.f4842Zz.setParameters(extractionParameters);
            setExtractionServer(this.f4842Zz);
            setResultDeserializer(this.adA);
            setExceptionResponseDeserializer(this.f4837ZB);
        } else if (ExtractionParameters.ExtractionType.KTA.equals(extractionParameters.getExtractionType())) {
            this.f4839ZD.setParameters(extractionParameters);
            setExtractionServer(this.f4839ZD);
            setResultDeserializer(this.adB);
            setExceptionResponseDeserializer(this.f4840ZF);
        } else if (ExtractionParameters.ExtractionType.ON_DEVICE.equals(extractionParameters.getExtractionType())) {
            this.adC.setParameters(extractionParameters);
            setExtractionServer(this.adC);
            setResultDeserializer(this.adD);
            setExceptionResponseDeserializer(this.acK);
        }
    }

    /* access modifiers changed from: protected */
    public ExtractorResponse<Passport> createResponse(Passport passport, ExceptionResponse exceptionResponse) {
        return new PassportExtractorResponse(passport, exceptionResponse);
    }

    public String getDefaultServerUrl(ExtractionParameters.ExtractionType extractionType) {
        if (ExtractionParameters.ExtractionType.RTTI.equals(extractionType)) {
            return this.f4841Zy;
        }
        if (ExtractionParameters.ExtractionType.KTA.equals(extractionType)) {
            return this.f4838ZC;
        }
        return null;
    }
}
