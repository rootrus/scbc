package p040o;

import java.util.List;

/* renamed from: o.injectRttiCheckDeserializer */
public interface injectRttiCheckDeserializer {

    /* renamed from: o.injectRttiCheckDeserializer$IconCompatParcelizer */
    public interface IconCompatParcelizer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$ItemReceiver();
    }

    /* renamed from: o.injectRttiCheckDeserializer$ParcelableVolumeInfo */
    public interface ParcelableVolumeInfo extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();
    }

    /* renamed from: o.injectRttiCheckDeserializer$MediaDescriptionCompat */
    public interface MediaDescriptionCompat extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void write(List<IdManager> list);
    }

    /* renamed from: o.injectRttiCheckDeserializer$MediaMetadataCompat */
    public interface MediaMetadataCompat extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void MediaBrowserCompat$CustomActionResultReceiver(List<setFiles> list);

        void MediaBrowserCompat$ItemReceiver();

        void write();

        void write(boolean z);
    }

    /* renamed from: o.injectRttiCheckDeserializer$RatingCompat */
    public interface RatingCompat extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(int i, int i2);

        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$CustomActionResultReceiver(int i);

        void MediaBrowserCompat$ItemReceiver(MoreExecutors moreExecutors);

        void read(boolean z);

        void write(getAppIdentifier getappidentifier);
    }

    /* renamed from: o.injectRttiCheckDeserializer$read */
    public interface read extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(boolean z);

        void MediaBrowserCompat$ItemReceiver();
    }

    /* renamed from: o.injectRttiCheckDeserializer$write */
    public interface write extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void write(List<getCrashlyticsInstallId> list);
    }

    void MediaBrowserCompat$ItemReceiver(performConfigurationChanged<?> performconfigurationchanged, isStateSaved isstatesaved, performDetach<?> performdetach);

    void read(performConfigurationChanged<?> performconfigurationchanged, isStateSaved isstatesaved);
}
