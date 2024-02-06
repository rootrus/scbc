package com.kofax.mobile.sdk.capture.passport;

import android.content.Context;
import com.kofax.kmc.ken.engines.IPassportDetector;
import com.kofax.kmc.ken.engines.PassportDetector;
import com.kofax.kmc.ken.engines.data.BarCodeResult;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import com.kofax.mobile.sdk._internal.extraction.IExtractionServer;
import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.C8007g;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8131ee;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceExtractionServer;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.RttiJsonExactionHelper;
import com.kofax.mobile.sdk.capture.extraction.ExceptionResponse;
import com.kofax.mobile.sdk.capture.model.Passport;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureModule;
import com.kofax.mobile.sdk.capture.p017id.IdParameters;
import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.capture.parameter.IParameters;
import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import com.kofax.mobile.sdk.extract.p018id.IIdExtractionListener;
import com.kofax.mobile.sdk.extract.p018id.IIdExtractor;
import com.kofax.mobile.sdk.extract.p018id.IdExtractionParameters;
import com.kofax.mobile.sdk.extract.p018id.IdRegion;
import com.kofax.mobile.sdk.extract.p018id.IdType;
import java.util.List;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

public class PassportCaptureModule {
    public static final String DEFAULT_PROCESS_STRING = "_DoCropCorrection__DoSkewCorrectionAlt__Do90DegreeRotation_4_DoScaleImageToDPI_200";

    /* renamed from: Zq */
    private static final String f2078Zq = "";

    /* renamed from: Zr */
    private static final String f2079Zr = "";

    /* access modifiers changed from: package-private */
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_on_device_")
    /* renamed from: a */
    public IExtractionServer mo12195a(PassportOnDeviceExtractionServer passportOnDeviceExtractionServer) {
        return passportOnDeviceExtractionServer;
    }

    /* access modifiers changed from: package-private */
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_on_device_")
    /* renamed from: a */
    public IPassportDeserializer mo12196a(C0874b bVar) {
        return bVar;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._passport_parameters_")
    public ExtractionParameters getExtractionParameters(ExtractionParameters extractionParameters) {
        return extractionParameters;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_kta_")
    public IExceptionResponseDeserializer getIExceptionResponseDeserializerKta(KtaExceptionResponseDeserializer ktaExceptionResponseDeserializer) {
        return ktaExceptionResponseDeserializer;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_rtti_")
    public IExceptionResponseDeserializer getIExceptionResponseDeserializerRtti(RttiExceptionResponseDeserializer rttiExceptionResponseDeserializer) {
        return rttiExceptionResponseDeserializer;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_kta_")
    public IExtractionServer getIExtractionServerKta(KtaPassportExtractor ktaPassportExtractor) {
        return ktaPassportExtractor;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_rtti_")
    public IExtractionServer getIExtractionServerRtti(RttiPassportExtractor rttiPassportExtractor) {
        return rttiPassportExtractor;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_kta_")
    public IJsonExactionHelper getIJsonExactionHelperKta(KtaJsonExactionHelper ktaJsonExactionHelper) {
        return ktaJsonExactionHelper;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_rtti_")
    public IJsonExactionHelper getIJsonExactionHelperRtti(RttiJsonExactionHelper rttiJsonExactionHelper) {
        return rttiJsonExactionHelper;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._passport_parameters_")
    public IParameters getIParameters(PassportParameters passportParameters) {
        return passportParameters;
    }

    public IPassportDetector getIPassportDetector(PassportDetector passportDetector) {
        return passportDetector;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._passport_parameters_")
    public LookAndFeelParameters getLookAndFeelParameters(LookAndFeelParameters lookAndFeelParameters) {
        return lookAndFeelParameters;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_kta_")
    public String getUriKta() {
        return "";
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_rtti_")
    public String getUriRtti() {
        return "";
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._passport_parameters_")
    public ProcessingParameters getProcessingParameters(ProcessingParameters processingParameters) {
        processingParameters.useMrzPageDetection = true;
        return processingParameters;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_rtti_")
    public IPassportDeserializer getIPassportDeserializerRtti(Context context, RttiPassportExtractor rttiPassportExtractor) {
        return new C0875c(context);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_kta_")
    public IPassportDeserializer getIPassportDeserializerKta(Context context, RttiPassportExtractor rttiPassportExtractor) {
        return new C0873a(context);
    }

    /* access modifiers changed from: package-private */
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_passport_extract_on_device_")
    /* renamed from: tU */
    public IExceptionResponseDeserializer mo12212tU() {
        return new IdCaptureModule.OnDeviceExceptionResponseDeserializer();
    }

    /* renamed from: com.kofax.mobile.sdk.capture.passport.PassportCaptureModule$c */
    class C0875c implements IPassportDeserializer {

        /* renamed from: V */
        private Context f2082V;

        public C0875c(Context context) {
            this.f2082V = context;
        }

        /* renamed from: aL */
        public Passport deserialize(String str) {
            return new RttiJsonPassport(this.f2082V, str);
        }
    }

    static class RttiExceptionResponseDeserializer implements IExceptionResponseDeserializer {
        public ExceptionResponse deserialize(String str) {
            return new C8183f(str);
        }
    }

    /* renamed from: com.kofax.mobile.sdk.capture.passport.PassportCaptureModule$a */
    class C0873a implements IPassportDeserializer {

        /* renamed from: V */
        private Context f2080V;

        public C0873a(Context context) {
            this.f2080V = context;
        }

        /* renamed from: aL */
        public Passport deserialize(String str) {
            return new KtaJsonPassport(this.f2080V, str);
        }
    }

    static class KtaExceptionResponseDeserializer implements IExceptionResponseDeserializer {
        public ExceptionResponse deserialize(String str) {
            return new C8007g(str);
        }
    }

    static class PassportOnDeviceExtractionServer extends OnDeviceExtractionServer {
        @HmlPinActivity
        PassportOnDeviceExtractionServer(Context context) {
            IdParameters idParameters = new IdParameters(context);
            idParameters.state = IdParameters.IdState.UNITED_STATES;
            setIdParameters(idParameters);
        }

        public void delegateToExtractor(IIdExtractor iIdExtractor, IdRegion idRegion, Image image, Image image2, String str, IIdExtractionListener iIdExtractionListener) {
            iIdExtractor.extractFields(new IdExtractionParameters(idRegion, IdType.Passport, image, (List<BarCodeResult>) null, (Image) null, (List<BarCodeResult>) null, true, iIdExtractionListener));
        }
    }

    /* renamed from: com.kofax.mobile.sdk.capture.passport.PassportCaptureModule$b */
    static class C0874b implements IPassportDeserializer {

        /* renamed from: V */
        private final Context f2081V;

        @HmlPinActivity
        C0874b(Context context) {
            this.f2081V = context;
        }

        /* renamed from: aL */
        public Passport deserialize(String str) {
            try {
                return new C8335a(Injector.getInjector(this.f2081V).getIIdFieldNameConvention(), new C8131ee(), str);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
