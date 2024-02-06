package com.kofax.mobile.sdk.capture.p017id;

import android.content.Context;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.GsonBuilder;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import com.kofax.mobile.sdk._internal.impl.IBase64ImageDecoder;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.C8007g;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8131ee;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceExtractionServer;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.RttiJsonExactionHelper;
import com.kofax.mobile.sdk.capture.extraction.ExceptionResponse;
import com.kofax.mobile.sdk.capture.model.C8328Id;
import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.capture.parameter.IParameters;
import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import com.kofax.mobile.sdk.extract.p018id.AggregateException;
import java.io.Serializable;
import p040o.HmlRepaymentMethodAboutActivity;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule */
public class IdCaptureModule {
    public static final String DEFAULT_PROCESS_STRING = "_DeviceType_2_Do90DegreeRotation_4_DoCropCorrection__DoScaleImageToDPI_500_DoSkewCorrectionPage__DocDimLarge_3.375_DocDimSmall_2.125_LoadSetting_<Property Name=\"CSkewDetect.correct_illumination.Bool\" Value=\"0\" />";

    /* renamed from: Zq */
    private static final String f2073Zq = "";

    /* renamed from: Zr */
    private static final String f2074Zr = "";

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._id_parameters_")
    public ExtractionParameters getExtractionParameters(ExtractionParameters extractionParameters) {
        return extractionParameters;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_id_extract_kta_")
    public IExceptionResponseDeserializer getIExceptionResponseDeserializerKta(KtaExceptionResponseDeserializer ktaExceptionResponseDeserializer) {
        return ktaExceptionResponseDeserializer;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_id_extract_on_device_")
    public IExceptionResponseDeserializer getIExceptionResponseDeserializerOnDevice(OnDeviceExceptionResponseDeserializer onDeviceExceptionResponseDeserializer) {
        return onDeviceExceptionResponseDeserializer;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_id_extract_rtti_")
    public IExceptionResponseDeserializer getIExceptionResponseDeserializerRtti(RttiExceptionResponseDeserializer rttiExceptionResponseDeserializer) {
        return rttiExceptionResponseDeserializer;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_id_extract_kta_")
    public IIdExtractionServer getIIdExtractionServerKta(KtaIdExtractor ktaIdExtractor) {
        return ktaIdExtractor;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_id_extract_on_device_")
    public IIdExtractionServer getIIdExtractionServerOnDevice(OnDeviceExtractionServer onDeviceExtractionServer) {
        return onDeviceExtractionServer;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_id_extract_rtti_")
    public IIdExtractionServer getIIdExtractionServerRtti(RttiIdExtractor rttiIdExtractor) {
        return rttiIdExtractor;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_id_extract_kta_")
    public IJsonExactionHelper getIJsonExactionHelperKta(KtaJsonExactionHelper ktaJsonExactionHelper) {
        return ktaJsonExactionHelper;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_id_extract_rtti_")
    public IJsonExactionHelper getIJsonExactionHelperRtti(RttiJsonExactionHelper rttiJsonExactionHelper) {
        return rttiJsonExactionHelper;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._id_parameters_")
    public IParameters getIParameters(IdParameters idParameters) {
        return idParameters;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._id_parameters_")
    public LookAndFeelParameters getLookAndFeelParameters(LookAndFeelParameters lookAndFeelParameters) {
        return lookAndFeelParameters;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_id_extract_kta_")
    public String getUriKta() {
        return "";
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_id_extract_rtti_")
    public String getUriRtti() {
        return "";
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_id_extract_on_device_")
    public IIdDeserializer getIIdDeserializerOnDevice(Context context) {
        return new C0871b(context);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_id_extract_kta_")
    public IIdDeserializer getIIdDeserializerKta(Context context) {
        return new C0870a(context);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_id_extract_rtti_")
    public IIdDeserializer getIIdDeserializerRtti(Context context) {
        return new C0872c(context);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._id_parameters_")
    public ProcessingParameters getProcessingParameters(ProcessingParameters processingParameters) {
        processingParameters.useTargetFrameCrop = true;
        return processingParameters;
    }

    /* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule$c */
    class C0872c implements IIdDeserializer {

        /* renamed from: V */
        private Context f2077V;

        public C0872c(Context context) {
            this.f2077V = context;
        }

        /* renamed from: aK */
        public C8328Id deserialize(String str) {
            IBase64ImageDecoder iBase64ImageDecoder = Injector.getInjector(this.f2077V).getIBase64ImageDecoder();
            return new ConventionBasedJsonIdDeserializer(Injector.getInjector(this.f2077V).getIIdFieldNameConvention(), new RttiJsonExactionHelper(), iBase64ImageDecoder, str);
        }
    }

    /* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule$RttiExceptionResponseDeserializer */
    static class RttiExceptionResponseDeserializer implements IExceptionResponseDeserializer {
        public ExceptionResponse deserialize(String str) {
            return new C8183f(str);
        }
    }

    /* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule$a */
    class C0870a implements IIdDeserializer {

        /* renamed from: V */
        private Context f2075V;

        public C0870a(Context context) {
            this.f2075V = context;
        }

        /* renamed from: aK */
        public C8328Id deserialize(String str) {
            return new ConventionBasedJsonIdDeserializer(Injector.getInjector(this.f2075V).getIIdFieldNameConvention(), new KtaJsonExactionHelper(), Injector.getInjector(this.f2075V).getIBase64ImageDecoder(), str);
        }
    }

    /* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule$KtaExceptionResponseDeserializer */
    static class KtaExceptionResponseDeserializer implements IExceptionResponseDeserializer {
        public ExceptionResponse deserialize(String str) {
            return new C8007g(str);
        }
    }

    /* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule$b */
    class C0871b implements IIdDeserializer {

        /* renamed from: V */
        private Context f2076V;

        public C0871b(Context context) {
            this.f2076V = context;
        }

        /* renamed from: aK */
        public C8328Id deserialize(String str) {
            try {
                return new ConventionBasedJsonIdDeserializer(Injector.getInjector(this.f2076V).getIIdFieldNameConvention(), new C8131ee(), Injector.getInjector(this.f2076V).getIBase64ImageDecoder(), str);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule$OnDeviceExceptionResponseDeserializer */
    public static class OnDeviceExceptionResponseDeserializer implements IExceptionResponseDeserializer {
        public ExceptionResponse deserialize(String str) {
            return new C0869a((AggregateException) new GsonBuilder().setExclusionStrategies(new ExclusionStrategy() {
                public boolean shouldSkipClass(Class<?> cls) {
                    return false;
                }

                public boolean shouldSkipField(FieldAttributes fieldAttributes) {
                    return fieldAttributes.getName().equalsIgnoreCase("stackState");
                }
            }).create().fromJson(str, AggregateException.class));
        }

        /* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule$OnDeviceExceptionResponseDeserializer$a */
        static class C0869a implements ExceptionResponse, Serializable {
            private final AggregateException act;

            public ExceptionResponse innerException() {
                return null;
            }

            public C0869a(AggregateException aggregateException) {
                this.act = aggregateException;
            }

            public String exceptionMessage() {
                Exception exception = getException();
                if (exception != null) {
                    return exception.getMessage();
                }
                return null;
            }

            public String exceptionType() {
                Exception exception = getException();
                if (exception != null) {
                    return exception.toString();
                }
                return null;
            }

            public String message() {
                return exceptionMessage();
            }

            public String stackTrace() {
                Exception exception = getException();
                if (exception == null) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                for (StackTraceElement obj : exception.getStackTrace()) {
                    sb.append(obj.toString());
                }
                return sb.toString();
            }

            private Exception getException() {
                if (this.act.getFrontException() != null) {
                    return this.act.getFrontException();
                }
                return this.act.getBackException();
            }
        }
    }
}
