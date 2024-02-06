package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk._internal.extraction.IDataUnitProcessedListener;
import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import com.kofax.mobile.sdk._internal.extraction.IExtractionServer;
import com.kofax.mobile.sdk.capture.extraction.ExceptionResponse;
import com.kofax.mobile.sdk.capture.extraction.Extractor;
import com.kofax.mobile.sdk.capture.extraction.ExtractorResponse;
import com.kofax.mobile.sdk.capture.model.Bill;
import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

public class BillExtractor extends Extractor<Bill> implements IDataUnitProcessedListener {
    public static final String BILL_EXTRACT_KTA = "_bill_extract_kta_";
    public static final String BILL_EXTRACT_RTTI = "_bill_extract_rtti_";
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_bill_extract_rtti_")
    @HmlPinActivity

    /* renamed from: ZA */
    IBillDeserializer f4595ZA;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_bill_extract_rtti_")
    @HmlPinActivity

    /* renamed from: ZB */
    IExceptionResponseDeserializer f4596ZB;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_bill_extract_kta_")
    @HmlPinActivity

    /* renamed from: ZC */
    String f4597ZC;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_bill_extract_kta_")
    @HmlPinActivity

    /* renamed from: ZD */
    IExtractionServer f4598ZD;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_bill_extract_kta_")
    @HmlPinActivity

    /* renamed from: ZE */
    IBillDeserializer f4599ZE;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_bill_extract_kta_")
    @HmlPinActivity

    /* renamed from: ZF */
    IExceptionResponseDeserializer f4600ZF;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_bill_extract_rtti_")
    @HmlPinActivity

    /* renamed from: Zy */
    String f4601Zy;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_bill_extract_rtti_")
    @HmlPinActivity

    /* renamed from: Zz */
    IExtractionServer f4602Zz;

    public void setParameters(ExtractionParameters extractionParameters) {
        super.setParameters(extractionParameters);
        if (ExtractionParameters.ExtractionType.RTTI.equals(extractionParameters.getExtractionType())) {
            this.f4602Zz.setParameters(extractionParameters);
            setExtractionServer(this.f4602Zz);
            setResultDeserializer(this.f4595ZA);
            setExceptionResponseDeserializer(this.f4596ZB);
            return;
        }
        this.f4598ZD.setParameters(extractionParameters);
        setExtractionServer(this.f4598ZD);
        setResultDeserializer(this.f4599ZE);
        setExceptionResponseDeserializer(this.f4600ZF);
    }

    /* access modifiers changed from: protected */
    public ExtractorResponse<Bill> createResponse(Bill bill, ExceptionResponse exceptionResponse) {
        return new BillExtractorResponse(bill, exceptionResponse);
    }

    public String getDefaultServerUrl(ExtractionParameters.ExtractionType extractionType) {
        if (ExtractionParameters.ExtractionType.RTTI.equals(extractionType)) {
            return this.f4601Zy;
        }
        if (ExtractionParameters.ExtractionType.KTA.equals(extractionType)) {
            return this.f4597ZC;
        }
        return null;
    }
}
