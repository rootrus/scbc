package com.kofax.mobile.sdk.capture.check;

import android.content.Context;
import com.kofax.kmc.ken.engines.CheckDetector;
import com.kofax.kmc.ken.engines.ICheckDetector;
import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.C8007g;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.RttiJsonExactionHelper;
import com.kofax.mobile.sdk.capture.extraction.ExceptionResponse;
import com.kofax.mobile.sdk.capture.model.Check;
import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.capture.parameter.IParameters;
import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import p040o.HmlRepaymentMethodAboutActivity;

public class CheckCaptureModule {
    public static final String DEFAULT_PROCESS_STRING_BACK = "_DeviceType_2__DoSkewCorrectionPage__DoCropCorrection__Do90DegreeRotation_9__DoScaleImageToDPI_200__DoFindTextHP__ProcessCheckBack__DoBinarization__LoadSetting_<Property Name=\"CSkewDetect.convert_to_gray.Bool\" Value=\"1\" Comment=\"DEFAULT 0 \" />_LoadSetting_<Property Name=\"CSkewDetect.scale_image_down.Bool\" Value=\"1\" Comment=\"DEFAULT 0 \" />_LoadSetting_<Property Name=\"CSkewDetect.scale_down_factor.Int\" Value=\"80\"  Comment=\"DEFAULT  80:60 or  4:3 \" />_LoadSetting_<Property Name=\"CSkewDetect.document_size.Int\" Value=\"2\" Comment=\"MEDIUM, DEFAULT  0\" />_LoadSetting_<Property Name=\"CSkewDetect.correct_illumination.Bool\" Value = \"0\"/>_LoadSetting_<Property Name=\"CSkewDetect.thr_crop_crop\" Value=\"3\" Comment=\"DEFAULT 18 \" />_LoadInlineSetting_[CDetectMpHp.RegionOfInterestPercX2.Int=96]_LoadInlineSetting_[CDetectMpHp.RegionOfInterestPercY1.Int=4]_LoadInlineSetting_[CDetectMpHp.RegionOfInterestPercY2.Int=96]_LoadInlineSetting_[CBinarize.Contrast_Slider_Pos.Int=4]_LoadInlineSetting_[CBinarize.Cleanup_Slider_Pos.Int=4]_LoadInlineSetting_[CDetectMpHp.RegionOfInterestPercX1.Int=4]";
    public static final String DEFAULT_PROCESS_STRING_FRONT = "_DeviceType_2__DoSkewCorrectionPage__DoCropCorrection__Do90DegreeRotation_4__DoScaleImageToDPI_200__DoFindTextHP__ProcessCheckFront__DoBinarization__LoadSetting_<Property Name=\"CSkewDetect.convert_to_gray.Bool\" Value=\"1\" Comment=\"DEFAULT 0 \" />_LoadSetting_<Property Name=\"CSkewDetect.scale_image_down.Bool\" Value=\"1\" Comment=\"DEFAULT 0 \" />_LoadSetting_<Property Name=\"CSkewDetect.scale_down_factor.Int\" Value=\"80\"  Comment=\"DEFAULT  80:60 or  4:3 \" />_LoadSetting_<Property Name=\"CSkewDetect.document_size.Int\" Value=\"2\" Comment=\"MEDIUM, DEFAULT  0\" />_LoadSetting_<Property Name=\"CSkewDetect.correct_illumination.Bool\" Value = \"0\"/>_LoadSetting_<Property Name=\"CSkewDetect.thr_crop_crop\" Value=\"3\" Comment=\"DEFAULT 18 \" />_LoadInlineSetting_<Property Name=\"CDetectMpHp.RegionOfInterestPercX1.Int\" Value=\"50\" Comment=\"DEFAULT 10 \" />_LoadInlineSetting_<Property Name=\"CDetectMpHp.RegionOfInterestPercX2.Int\" Value=\"95\" Comment=\"DEFAULT 90 \" />_LoadInlineSetting_<Property Name=\"CDetectMpHp.RegionOfInterestPercY1.Int\" Value=\"60\" Comment=\"DEFAULT 50 \" />_LoadInlineSetting_<Property Name=\"CDetectMpHp.RegionOfInterestPercY2.Int\" Value=\"90\" Comment=\"DEFAULT 80 \" />_LoadInlineSetting_<Property Name=\"CBinarize.Contrast_Slider_Pos.Int\" Value=\"4\" Comment=\"DEFAULT 10 \" />_LoadInlineSetting_<Property Name=\"CBinarize.Cleanup_Slider_Pos.Int\" Value=\"4\" Comment=\"DEFAULT 10 \" />";

    /* renamed from: Zq */
    private final String f2069Zq = "";

    /* renamed from: Zr */
    private final String f2070Zr = "";

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._check_parameters_")
    public ExtractionParameters getExtractionParameters(ExtractionParameters extractionParameters) {
        return extractionParameters;
    }

    public ICheckDetector getICheckDetector(CheckDetector checkDetector) {
        return checkDetector;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_check_extract_kta_")
    public IExceptionResponseDeserializer getIExceptionResponseDeserializerKta(KtaExceptionResponseDeserializer ktaExceptionResponseDeserializer) {
        return ktaExceptionResponseDeserializer;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_check_extract_rtti_")
    public IExceptionResponseDeserializer getIExceptionResponseDeserializerRtti(RttiExceptionResponseDeserializer rttiExceptionResponseDeserializer) {
        return rttiExceptionResponseDeserializer;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_check_extract_kta_")
    public ICheckExtractionServer getIExtractionServerKta(KtaCheckExtractor ktaCheckExtractor) {
        return ktaCheckExtractor;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_check_extract_rtti_")
    public ICheckExtractionServer getIExtractionServerRtti(RttiCheckExtractor rttiCheckExtractor) {
        return rttiCheckExtractor;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_check_extract_kta_")
    public IJsonExactionHelper getIJsonExactionHelperKta(KtaJsonExactionHelper ktaJsonExactionHelper) {
        return ktaJsonExactionHelper;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_check_extract_rtti_")
    public IJsonExactionHelper getIJsonExactionHelperRtti(RttiJsonExactionHelper rttiJsonExactionHelper) {
        return rttiJsonExactionHelper;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._check_parameters_")
    public IParameters getIParameters(CheckParameters checkParameters) {
        return checkParameters;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._check_parameters_")
    public LookAndFeelParameters getLookAndFeelParameters(LookAndFeelParameters lookAndFeelParameters) {
        return lookAndFeelParameters;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._check_parameters_")
    public ProcessingParameters getProcessingParameters(ProcessingParameters processingParameters) {
        return processingParameters;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_check_extract_kta_")
    public String getUriKta() {
        return "";
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_check_extract_rtti_")
    public String getUriRtti() {
        return "";
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_check_extract_rtti_")
    public ICheckDeserializer getICheckDeserializerRtti(Context context, RttiCheckExtractor rttiCheckExtractor) {
        return new C0867b(context);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_check_extract_kta_")
    public ICheckDeserializer getICheckDeserializerKta(Context context, RttiCheckExtractor rttiCheckExtractor) {
        return new C0866a(context);
    }

    /* renamed from: com.kofax.mobile.sdk.capture.check.CheckCaptureModule$b */
    class C0867b implements ICheckDeserializer {

        /* renamed from: V */
        private Context f2072V;

        public C0867b(Context context) {
            this.f2072V = context;
        }

        /* renamed from: aJ */
        public Check deserialize(String str) {
            return new RttiJsonCheck(this.f2072V, str);
        }
    }

    static class RttiExceptionResponseDeserializer implements IExceptionResponseDeserializer {
        public ExceptionResponse deserialize(String str) {
            return new C8183f(str);
        }
    }

    /* renamed from: com.kofax.mobile.sdk.capture.check.CheckCaptureModule$a */
    class C0866a implements ICheckDeserializer {

        /* renamed from: V */
        private Context f2071V;

        public C0866a(Context context) {
            this.f2071V = context;
        }

        /* renamed from: aJ */
        public Check deserialize(String str) {
            return new KtaJsonCheck(this.f2071V, str);
        }
    }

    static class KtaExceptionResponseDeserializer implements IExceptionResponseDeserializer {
        public ExceptionResponse deserialize(String str) {
            return new C8007g(str);
        }
    }
}
