package p040o;

import com.bumptech.glide.load.engine.GlideException;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.AutoValue_CrashlyticsReport_FilesPayload;
import p040o.CrashlyticsController;

/* renamed from: o.KtaJsonCheck */
public interface KtaJsonCheck {

    /* renamed from: o.KtaJsonCheck$1 */
    public interface C69271 {

        /* renamed from: o.KtaJsonCheck$1$IconCompatParcelizer */
        public interface IconCompatParcelizer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
            void IconCompatParcelizer();

            void IconCompatParcelizer(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver);

            void MediaBrowserCompat$CustomActionResultReceiver();

            void MediaBrowserCompat$ItemReceiver();

            void MediaBrowserCompat$ItemReceiver(List<access$lambda$0> list);

            void MediaBrowserCompat$MediaItem();

            void MediaBrowserCompat$SearchResultReceiver();

            /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
            void mo38821x50fd9e4a();

            void MediaDescriptionCompat();

            void MediaMetadataCompat();

            void MediaSessionCompat$QueueItem();

            void MediaSessionCompat$ResultReceiverWrapper();

            void RatingCompat();

            void read();

            void write();
        }

        /* renamed from: o.KtaJsonCheck$1$write */
        public interface write extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
            void MediaBrowserCompat$ItemReceiver(int i);

            void closeIntroduction();
        }

        void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2);
    }

    /* renamed from: o.KtaJsonCheck$IconCompatParcelizer */
    public interface IconCompatParcelizer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void IconCompatParcelizer(String str);

        void MediaBrowserCompat$CustomActionResultReceiver(boolean z);

        void MediaBrowserCompat$CustomActionResultReceiver(boolean z, String str);

        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$ItemReceiver(String str, String str2, String str3);

        void MediaBrowserCompat$ItemReceiver(List<MoreExecutors> list);

        void read();

        void write(boolean z);
    }

    /* renamed from: o.KtaJsonCheck$MediaDescriptionCompat */
    public interface MediaDescriptionCompat extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        String read();

        void read(String str, AutoValue_CrashlyticsReport_CustomAttribute.Builder builder);
    }

    /* renamed from: o.KtaJsonCheck$MediaMetadataCompat */
    public interface MediaMetadataCompat extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(String str);

        void read(List<setFiles> list, List<setFiles> list2, List<setFiles> list3, List<setFiles> list4);
    }

    /* renamed from: o.KtaJsonCheck$ParcelableVolumeInfo */
    public interface ParcelableVolumeInfo extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(String str);

        void MediaBrowserCompat$ItemReceiver();

        void read();

        void write();

        void write(String str);

        void write(String str, String str2, String str3, String str4);
    }

    /* renamed from: o.KtaJsonCheck$RatingCompat */
    public interface RatingCompat extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void IconCompatParcelizer(boolean z);

        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$ItemReceiver(List<access$lambda$0> list);

        void MediaBrowserCompat$ItemReceiver(access$2200 access_2200);

        void MediaBrowserCompat$SearchResultReceiver();

        void MediaDescriptionCompat();

        void MediaMetadataCompat();

        void RatingCompat();

        void read();

        void write();
    }

    /* renamed from: o.KtaJsonCheck$a */
    public interface C6928a extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$CustomActionResultReceiver(String str, int i);

        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$ItemReceiver(boolean z);

        void read();

        void read(String str, int i);

        void read(AutoValue_CrashlyticsReport_FilesPayload.Builder builder);

        void read(boolean z);

        void write(AutoValue_CrashlyticsReport_FilesPayload.Builder builder);
    }

    /* renamed from: o.KtaJsonCheck$b */
    public interface C6929b extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(zzwd zzwd, zzwf zzwf);

        void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsController.C32367 r1);
    }

    /* renamed from: o.KtaJsonCheck$read */
    public interface read extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(String str);

        void IconCompatParcelizer(AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute, boolean z);

        void MediaBrowserCompat$CustomActionResultReceiver(List<MoreExecutors> list);

        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$MediaItem(String str);

        void MediaDescriptionCompat(String str);

        void read();

        void read(String str);

        void write();

        void write(String str);
    }

    /* renamed from: o.KtaJsonCheck$write */
    public interface write extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void MediaBrowserCompat$CustomActionResultReceiver(setDisplayVersion setdisplayversion);

        void MediaBrowserCompat$ItemReceiver(boolean z);

        void write(String str, String str2);
    }

    Object RatingCompat();

    void read(performOptionsMenuClosed<?> performoptionsmenuclosed, isPostponed ispostponed);

    void write(GlideException glideException);
}
