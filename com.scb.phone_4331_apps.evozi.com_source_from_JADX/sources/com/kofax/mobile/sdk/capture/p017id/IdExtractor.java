package com.kofax.mobile.sdk.capture.p017id;

import com.kofax.mobile.sdk._internal.extraction.IDataUnitProcessedListener;
import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import com.kofax.mobile.sdk.capture.extraction.ExceptionResponse;
import com.kofax.mobile.sdk.capture.extraction.Extractor;
import com.kofax.mobile.sdk.capture.extraction.ExtractorResponse;
import com.kofax.mobile.sdk.capture.model.C8328Id;
import com.kofax.mobile.sdk.capture.p017id.IdParameters;
import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.extract.p018id.IdRegion;
import java.util.HashMap;
import java.util.Map;
import p039io.beid.beidk.definitions.LivenessStatus;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdExtractor */
public class IdExtractor extends Extractor<C8328Id> implements IDataUnitProcessedListener {
    public static final String ID_EXTRACT_KTA = "_id_extract_kta_";
    public static final String ID_EXTRACT_ON_DEVICE = "_id_extract_on_device_";
    public static final String ID_EXTRACT_RTTI = "_id_extract_rtti_";
    static final Map<IdRegion, String> acB = new HashMap<IdRegion, String>() {
        {
            put(IdRegion.US, "United States");
            put(IdRegion.CANADA, "Canada");
            put(IdRegion.AFRICA, "Africa");
            put(IdRegion.ASIA, "Asia");
            put(IdRegion.AUSTRALIA, "Australia");
            put(IdRegion.EUROPE, "Europe");
            put(IdRegion.LATIN_AMERICA, "Latin America");
        }
    };
    static final Map<IdParameters.IdState, String> acC = new HashMap<IdParameters.IdState, String>() {
        {
            put(IdParameters.IdState.CAMEROON, "1350");
            put(IdParameters.IdState.CHINA, "470");
            put(IdParameters.IdState.INDIA, "850");
            put(IdParameters.IdState.SINGAPORE, "180");
            put(IdParameters.IdState.SOUTH_KOREA, "2220");
            put(IdParameters.IdState.KEY_PASS, LivenessStatus.ERROR_UNKNOW);
            put(IdParameters.IdState.ALBANIA, "1010");
            put(IdParameters.IdState.GERMANY, "140");
            put(IdParameters.IdState.LITHUANIA, "19");
            put(IdParameters.IdState.LUXEMBOURG, "220");
            put(IdParameters.IdState.BRAZIL, "130");
            put(IdParameters.IdState.ECUADOR, "710");
            put(IdParameters.IdState.EL_SALVADOR, "380");
            put(IdParameters.IdState.GUATEMALA, "370");
            put(IdParameters.IdState.ST_CHRIST_NEVIS, "1000");
            put(IdParameters.IdState.JAPAN, "2100");
        }
    };
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_id_extract_rtti_")
    @HmlPinActivity

    /* renamed from: ZB */
    IExceptionResponseDeserializer f4761ZB;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_id_extract_kta_")
    @HmlPinActivity

    /* renamed from: ZC */
    String f4762ZC;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_id_extract_kta_")
    @HmlPinActivity

    /* renamed from: ZF */
    IExceptionResponseDeserializer f4763ZF;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_id_extract_rtti_")
    @HmlPinActivity

    /* renamed from: Zy */
    String f4764Zy;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_id_extract_rtti_")
    @HmlPinActivity
    IIdExtractionServer acD;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_id_extract_rtti_")
    @HmlPinActivity
    IIdDeserializer acE;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_id_extract_kta_")
    @HmlPinActivity
    IIdExtractionServer acF;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_id_extract_kta_")
    @HmlPinActivity
    IIdDeserializer acG;
    private String acH = null;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_id_extract_on_device_")
    @HmlPinActivity
    IIdExtractionServer acI;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_id_extract_on_device_")
    @HmlPinActivity
    IIdDeserializer acJ;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_id_extract_on_device_")
    @HmlPinActivity
    IExceptionResponseDeserializer acK;

    public void setParameters(IdParameters idParameters) {
        if (IdParameters.IdState.NOT_SPECIFIED.equals(idParameters.state)) {
            idParameters.state = IdParameters.IdState.UNITED_STATES;
        }
        super.setParameters(idParameters.getExtractionParameters());
        int i = C83233.f4765Yh[idParameters.getExtractionParameters().getExtractionType().ordinal()];
        if (i == 1) {
            m4726d(idParameters);
        } else if (i == 2) {
            m4725c(idParameters);
        } else if (i == 3) {
            m4724b(idParameters);
        }
    }

    /* renamed from: com.kofax.mobile.sdk.capture.id.IdExtractor$3 */
    static /* synthetic */ class C83233 {

        /* renamed from: Yh */
        static final /* synthetic */ int[] f4765Yh;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.kofax.mobile.sdk.capture.parameter.ExtractionParameters$ExtractionType[] r0 = com.kofax.mobile.sdk.capture.parameter.ExtractionParameters.ExtractionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4765Yh = r0
                com.kofax.mobile.sdk.capture.parameter.ExtractionParameters$ExtractionType r1 = com.kofax.mobile.sdk.capture.parameter.ExtractionParameters.ExtractionType.RTTI     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4765Yh     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.mobile.sdk.capture.parameter.ExtractionParameters$ExtractionType r1 = com.kofax.mobile.sdk.capture.parameter.ExtractionParameters.ExtractionType.KTA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4765Yh     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.mobile.sdk.capture.parameter.ExtractionParameters$ExtractionType r1 = com.kofax.mobile.sdk.capture.parameter.ExtractionParameters.ExtractionType.ON_DEVICE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.capture.p017id.IdExtractor.C83233.<clinit>():void");
        }
    }

    /* renamed from: b */
    private void m4724b(IdParameters idParameters) {
        this.acI.setParameters(idParameters.getExtractionParameters());
        this.acI.setIdParameters(idParameters);
        setExtractionServer(this.acI);
        setResultDeserializer(this.acJ);
        setExceptionResponseDeserializer(this.acK);
    }

    /* renamed from: c */
    private void m4725c(IdParameters idParameters) {
        this.acF.setParameters(idParameters.getExtractionParameters());
        this.acF.setIdParameters(idParameters);
        setExtractionServer(this.acF);
        setResultDeserializer(this.acG);
        setExceptionResponseDeserializer(this.f4763ZF);
    }

    /* renamed from: d */
    private void m4726d(IdParameters idParameters) {
        this.acD.setParameters(idParameters.getExtractionParameters());
        this.acD.setIdParameters(idParameters);
        setExtractionServer(this.acD);
        setResultDeserializer(this.acE);
        setExceptionResponseDeserializer(this.f4761ZB);
    }

    /* access modifiers changed from: protected */
    public ExtractorResponse<C8328Id> createResponse(C8328Id id, ExceptionResponse exceptionResponse) {
        return new IdExtractorResponse(id, exceptionResponse);
    }

    public String getDefaultServerUrl(ExtractionParameters.ExtractionType extractionType) {
        if (ExtractionParameters.ExtractionType.RTTI.equals(extractionType)) {
            return this.f4764Zy;
        }
        if (ExtractionParameters.ExtractionType.KTA.equals(extractionType)) {
            return this.f4762ZC;
        }
        return this.acH;
    }
}
