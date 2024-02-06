package p040o;

import java.util.List;

/* renamed from: o.CheckCaptureModule_GetLookAndFeelParametersFactory */
public interface CheckCaptureModule_GetLookAndFeelParametersFactory {

    /* renamed from: o.CheckCaptureModule_GetLookAndFeelParametersFactory$IconCompatParcelizer */
    public interface IconCompatParcelizer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$CustomActionResultReceiver(List<doWriteNonFatal> list);

        void write();
    }

    /* renamed from: o.CheckCaptureModule_GetLookAndFeelParametersFactory$MediaDescriptionCompat */
    public interface MediaDescriptionCompat extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void IconCompatParcelizer(access$2200 access_2200);

        void MediaBrowserCompat$CustomActionResultReceiver(int i);

        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$ItemReceiver(List<writeSessionApp> list, String str);

        void read();

        void read(boolean z);

        void write();

        void write(String str);

        void write(List<writeSessionApp> list, String str);
    }

    /* renamed from: o.CheckCaptureModule_GetLookAndFeelParametersFactory$read */
    public interface read extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void MediaBrowserCompat$CustomActionResultReceiver(List<doWriteNonFatal> list);
    }

    /* renamed from: o.CheckCaptureModule_GetLookAndFeelParametersFactory$write */
    public interface write extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(immediateCheckedFuture immediatecheckedfuture, MissingNativeComponent missingNativeComponent);

        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$CustomActionResultReceiver(List<String> list);

        void MediaBrowserCompat$CustomActionResultReceiver(immediateCheckedFuture immediatecheckedfuture);

        void read();

        void write();

        void write(int i);
    }

    trimToSize getViewModelStore();
}
