package com.kofax.mobile.sdk.capture.bill;

import android.content.Context;
import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import com.kofax.mobile.sdk._internal.extraction.IExtractionServer;
import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.C8007g;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.RttiJsonExactionHelper;
import com.kofax.mobile.sdk.capture.extraction.ExceptionResponse;
import com.kofax.mobile.sdk.capture.model.Bill;
import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.capture.parameter.IParameters;
import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import p040o.HmlRepaymentMethodAboutActivity;

public class BillCaptureModule {
    public static final String DEFAULT_PROCESS_STRING = "_DoBinarization__DoCropCorrection__DoSkewCorrectionAlt__Do90DegreeRotation_4_LoadSetting_<Property Name=\"CSkewDetect.convert_to_gray.Bool\" Value=\"1\" Comment=\"DEFAULT 0 \" />_LoadSetting_<Property Name=\"CSkewDetect.scale_image_down.Bool\" Value=\"1\" Comment=\"DEFAULT 0 \" />_LoadSetting_<Property Name=\"CSkewDetect.scale_down_factor.Int\" Value=\"80\"  Comment=\"DEFAULT  80:60 or  4:3 \" />_LoadSetting_<Property Name=\"CSkewDetect.document_size.Int\" Value=\"2\" Comment=\"MEDIUM, DEFAULT  0\" />_LoadSetting_<Property Name=\"CSkewDetect.correct_illumination.Bool\" Value = \"0\"/>_LoadSetting_<Property Name=\"CSkewDetect.thr_crop_crop\" Value=\"3\" Comment=\"DEFAULT 18 \" />";

    /* renamed from: Zq */
    private final String f2063Zq = "";

    /* renamed from: Zr */
    private final String f2064Zr = "";

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture.bill_parameters_")
    public ExtractionParameters getExtractionParameters(ExtractionParameters extractionParameters) {
        return extractionParameters;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_bill_extract_kta_")
    public IExceptionResponseDeserializer getIExceptionResponseDeserializerKta(KtaExceptionResponseDeserializer ktaExceptionResponseDeserializer) {
        return ktaExceptionResponseDeserializer;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_bill_extract_rtti_")
    public IExceptionResponseDeserializer getIExceptionResponseDeserializerRtti(RttiExceptionResponseDeserializer rttiExceptionResponseDeserializer) {
        return rttiExceptionResponseDeserializer;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_bill_extract_kta_")
    public IExtractionServer getIExtractionServerKta(KtaBillExtractor ktaBillExtractor) {
        return ktaBillExtractor;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_bill_extract_rtti_")
    public IExtractionServer getIExtractionServerRtti(RttiBillExtractor rttiBillExtractor) {
        return rttiBillExtractor;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_bill_extract_kta_")
    public IJsonExactionHelper getIJsonExactionHelperKta(KtaJsonExactionHelper ktaJsonExactionHelper) {
        return ktaJsonExactionHelper;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_bill_extract_rtti_")
    public IJsonExactionHelper getIJsonExactionHelperRtti(RttiJsonExactionHelper rttiJsonExactionHelper) {
        return rttiJsonExactionHelper;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture.bill_parameters_")
    public IParameters getIParameters(BillParameters billParameters) {
        return billParameters;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture.bill_parameters_")
    public LookAndFeelParameters getLookAndFeelParameters(LookAndFeelParameters lookAndFeelParameters) {
        return lookAndFeelParameters;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture.bill_parameters_")
    public ProcessingParameters getProcessingParameters(ProcessingParameters processingParameters) {
        return processingParameters;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_bill_extract_kta_")
    public String getUriKta() {
        return "";
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_bill_extract_rtti_")
    public String getUriRtti() {
        return "";
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_bill_extract_rtti_")
    public IBillDeserializer getIBillDeserializerRtti(Context context, RttiBillExtractor rttiBillExtractor) {
        return new C0865b(context);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_bill_extract_kta_")
    public IBillDeserializer getIBillDeserializerKta(Context context, RttiBillExtractor rttiBillExtractor) {
        return new C0864a(context);
    }

    /* renamed from: com.kofax.mobile.sdk.capture.bill.BillCaptureModule$b */
    class C0865b implements IBillDeserializer {

        /* renamed from: V */
        private Context f2067V;

        public C0865b(Context context) {
            this.f2067V = context;
        }

        /* renamed from: aI */
        public Bill deserialize(String str) {
            return new RttiJsonBill(this.f2067V, str);
        }
    }

    static class RttiExceptionResponseDeserializer implements IExceptionResponseDeserializer {
        public ExceptionResponse deserialize(String str) {
            return new C8183f(str);
        }
    }

    /* renamed from: com.kofax.mobile.sdk.capture.bill.BillCaptureModule$a */
    class C0864a implements IBillDeserializer {

        /* renamed from: V */
        private Context f2065V;

        public C0864a(Context context) {
            this.f2065V = context;
        }

        /* renamed from: aI */
        public Bill deserialize(String str) {
            return new KtaJsonBill(this.f2065V, str);
        }
    }

    static class KtaExceptionResponseDeserializer implements IExceptionResponseDeserializer {
        public ExceptionResponse deserialize(String str) {
            return new C8007g(str);
        }
    }
}
