package p040o;

import java.util.List;
import p040o.CrashlyticsReport;
import p040o.CycleDetector;

/* renamed from: o.IdCaptureModule */
public interface IdCaptureModule extends IIdExtractorListener, IdCaptureActivity {

    /* renamed from: o.IdCaptureModule$KtaExceptionResponseDeserializer */
    public interface KtaExceptionResponseDeserializer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$CustomActionResultReceiver(CycleDetector.ComponentNode componentNode);

        void read();

        void write();
    }

    /* renamed from: o.IdCaptureModule$OnDeviceExceptionResponseDeserializer */
    public interface OnDeviceExceptionResponseDeserializer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {

        /* renamed from: o.IdCaptureModule$OnDeviceExceptionResponseDeserializer$1 */
        public interface C69031 extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
            void write(List<addDependent> list);
        }

        /* renamed from: o.IdCaptureModule$OnDeviceExceptionResponseDeserializer$a */
        public interface C6904a extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
            void IconCompatParcelizer();

            void MediaBrowserCompat$CustomActionResultReceiver(removeFirst removefirst);

            void read();
        }

        void IconCompatParcelizer(boolean z);

        void MediaBrowserCompat$CustomActionResultReceiver(boolean z);

        void MediaBrowserCompat$ItemReceiver();
    }

    /* renamed from: o.IdCaptureModule$RttiExceptionResponseDeserializer */
    public interface RttiExceptionResponseDeserializer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void IconCompatParcelizer(List<removeFirst> list);

        void MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* renamed from: o.IdCaptureModule$a */
    public interface C6905a extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$CustomActionResultReceiver(getComponent getcomponent);

        void MediaBrowserCompat$CustomActionResultReceiver(getComponent getcomponent, boolean z, boolean z2);

        void read(getComponent getcomponent, boolean z);

        void write();

        void write(String str);

        void write(boolean z);
    }

    /* renamed from: o.IdCaptureModule$b */
    public interface C6906b extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(CrashlyticsReport.FilesPayload.File.Builder builder);

        void MediaBrowserCompat$ItemReceiver();

        void read();
    }

    /* renamed from: o.IdCaptureModule$c */
    public interface C6907c extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void read();
    }

    void IconCompatParcelizer(Integer num);

    void IconCompatParcelizer(getDependencies getdependencies);

    void IconCompatParcelizer(isEagerInDefaultApp iseagerindefaultapp);

    void MediaBrowserCompat$CustomActionResultReceiver();

    void MediaBrowserCompat$CustomActionResultReceiver(getDependencies getdependencies);

    void MediaBrowserCompat$ItemReceiver();

    void MediaBrowserCompat$SearchResultReceiver();

    void read(String str);

    void write(isEagerInDefaultApp iseagerindefaultapp);
}
