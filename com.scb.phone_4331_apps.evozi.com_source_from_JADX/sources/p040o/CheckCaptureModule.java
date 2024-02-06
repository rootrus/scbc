package p040o;

import android.app.Activity;
import android.content.Context;
import android.widget.ListView;
import com.scb.phone.data.network.service.MobileNumberService;
import com.scb.phone.data.network.service.ProfileService;
import java.util.List;
import p040o.Utils;

/* renamed from: o.CheckCaptureModule */
public final class CheckCaptureModule {
    public ProfileService IconCompatParcelizer;

    /* renamed from: o.CheckCaptureModule$b */
    public interface C1151b extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        /* renamed from: K_ */
        void mo13720K_();

        /* renamed from: L_ */
        void mo13721L_();

        /* renamed from: b_ */
        void mo13729b_(access$2200 access_2200);

        /* renamed from: i_ */
        void mo13730i_(String str);

        /* renamed from: v_ */
        void mo13731v_();
    }

    /* renamed from: o.CheckCaptureModule$RttiExceptionResponseDeserializer */
    public interface RttiExceptionResponseDeserializer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void IconCompatParcelizer(long j);

        void IconCompatParcelizer(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver);

        void MediaBrowserCompat$CustomActionResultReceiver(List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> list);

        void MediaBrowserCompat$CustomActionResultReceiver(Utils.C39323.C12941 r1);

        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$ItemReceiver(List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> list);

        void MediaBrowserCompat$ItemReceiver(getGeoDataClient getgeodataclient);

        void MediaBrowserCompat$MediaItem();

        void MediaBrowserCompat$SearchResultReceiver();

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        void mo36889x50fd9e4a();

        void MediaDescriptionCompat();

        void MediaMetadataCompat();

        void MediaSessionCompat$QueueItem();

        void MediaSessionCompat$ResultReceiverWrapper();

        void MediaSessionCompat$Token();

        void RatingCompat();

        void aN_();

        void read();

        void read(getGeoDataClient getgeodataclient);

        void write();

        void write(getGeoDataClient getgeodataclient);
    }

    /* renamed from: o.CheckCaptureModule$a */
    public interface C6375a {

        /* renamed from: o.CheckCaptureModule$a$RatingCompat */
        public interface RatingCompat extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
            void IconCompatParcelizer();

            void MediaBrowserCompat$CustomActionResultReceiver();

            void MediaBrowserCompat$ItemReceiver();

            void read();

            void write(boolean z);
        }

        /* renamed from: o.CheckCaptureModule$a$IconCompatParcelizer */
        public interface IconCompatParcelizer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
            void read(String str);

            void write();
        }

        /* renamed from: o.CheckCaptureModule$a$MediaDescriptionCompat */
        public interface MediaDescriptionCompat extends read {
            void IconCompatParcelizer();

            void write(SessionReportingCoordinator$$Lambda$2 sessionReportingCoordinator$$Lambda$2);
        }

        /* renamed from: o.CheckCaptureModule$a$MediaMetadataCompat */
        public interface MediaMetadataCompat extends C6378xfcd837d4 {
            void MediaBrowserCompat$CustomActionResultReceiver(List<doWriteToLog> list);
        }

        /* renamed from: o.CheckCaptureModule$a$read */
        public interface read extends C6378xfcd837d4 {
            void MediaBrowserCompat$ItemReceiver(String str, String str2);

            void read(String str, String str2, String str3);

            void read(immediateFuture immediatefuture);
        }

        /* renamed from: o.CheckCaptureModule$a$write */
        public interface write extends getTopRightCornerWidth {
            void IconCompatParcelizer();

            void MediaBrowserCompat$CustomActionResultReceiver();

            void MediaBrowserCompat$ItemReceiver();

            void MediaMetadataCompat();

            void RatingCompat();

            void read();

            void write();
        }

        void IconCompatParcelizer();

        boolean MediaBrowserCompat$CustomActionResultReceiver();

        void MediaDescriptionCompat();

        ListView write();
    }

    public CheckCaptureModule() {
    }

    /* renamed from: o.CheckCaptureModule$KtaExceptionResponseDeserializer */
    public final class KtaExceptionResponseDeserializer {
        public C6377x418fbbc1 MediaBrowserCompat$ItemReceiver;
        public final getAddress3 read;
        public final nScriptGroup2Create write = new C6376x33986d72(this);

        /* renamed from: o.CheckCaptureModule$KtaExceptionResponseDeserializer$IconCompatParcelizer */
        public static final class IconCompatParcelizer<ResultT> implements nScriptInvoke<nIncObjDestroy> {
            private /* synthetic */ int IconCompatParcelizer;
            private /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
            private /* synthetic */ Activity read;
            private /* synthetic */ KtaExceptionResponseDeserializer write;

            public IconCompatParcelizer(KtaExceptionResponseDeserializer ktaExceptionResponseDeserializer, int i, Activity activity, int i2) {
                this.write = ktaExceptionResponseDeserializer;
                this.MediaBrowserCompat$CustomActionResultReceiver = i;
                this.read = activity;
                this.IconCompatParcelizer = i2;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                nIncObjDestroy nincobjdestroy = (nIncObjDestroy) obj;
                if (nincobjdestroy.MediaDescriptionCompat() == 2) {
                    int i = this.MediaBrowserCompat$CustomActionResultReceiver;
                    boolean z = false;
                    if (i != 0 ? !(i != 1 || nincobjdestroy.MediaBrowserCompat$CustomActionResultReceiver() == null) : nincobjdestroy.write() != null) {
                        z = true;
                    }
                    if (z) {
                        KtaExceptionResponseDeserializer ktaExceptionResponseDeserializer = this.write;
                        Activity activity = this.read;
                        onGetStartedClick.IconCompatParcelizer((Object) nincobjdestroy, "appUpdateInfo");
                        KtaExceptionResponseDeserializer.read(ktaExceptionResponseDeserializer, activity, nincobjdestroy, this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer);
                        return;
                    }
                }
                if (this.MediaBrowserCompat$CustomActionResultReceiver == 1 && nincobjdestroy.MediaDescriptionCompat() == 3) {
                    KtaExceptionResponseDeserializer ktaExceptionResponseDeserializer2 = this.write;
                    Activity activity2 = this.read;
                    onGetStartedClick.IconCompatParcelizer((Object) nincobjdestroy, "appUpdateInfo");
                    KtaExceptionResponseDeserializer.read(ktaExceptionResponseDeserializer2, activity2, nincobjdestroy, this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer);
                    return;
                }
                KtaExceptionResponseDeserializer.MediaBrowserCompat$ItemReceiver(this.write, nincobjdestroy.IconCompatParcelizer());
            }
        }

        public KtaExceptionResponseDeserializer(Context context, getAddress3 getaddress3) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) getaddress3, "appUpdateManager");
            this.read = getaddress3;
        }

        /* renamed from: o.CheckCaptureModule$KtaExceptionResponseDeserializer$write */
        public static final class write {
            public MobileNumberService IconCompatParcelizer;

            private write() {
            }

            @HmlPinActivity
            public write(MobileNumberService mobileNumberService) {
                this.IconCompatParcelizer = mobileNumberService;
            }
        }

        public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(KtaExceptionResponseDeserializer ktaExceptionResponseDeserializer, int i) {
            C6377x418fbbc1 checkCaptureModule$KtaExceptionResponseDeserializer$MediaBrowserCompat$ItemReceiver;
            if (i == 11 && (checkCaptureModule$KtaExceptionResponseDeserializer$MediaBrowserCompat$ItemReceiver = ktaExceptionResponseDeserializer.MediaBrowserCompat$ItemReceiver) != null) {
                checkCaptureModule$KtaExceptionResponseDeserializer$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
            }
        }

        public static final /* synthetic */ void read(KtaExceptionResponseDeserializer ktaExceptionResponseDeserializer, Activity activity, nIncObjDestroy nincobjdestroy, int i, int i2) {
            ktaExceptionResponseDeserializer.read.write(ktaExceptionResponseDeserializer.write);
            ktaExceptionResponseDeserializer.read.read(nincobjdestroy, i, activity, i2);
        }
    }

    @HmlPinActivity
    public CheckCaptureModule(ProfileService profileService) {
        this.IconCompatParcelizer = profileService;
    }
}
