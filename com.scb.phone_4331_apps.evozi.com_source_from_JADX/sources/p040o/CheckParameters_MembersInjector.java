package p040o;

import android.graphics.Bitmap;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import p040o.CrashlyticsReport;

/* renamed from: o.CheckParameters_MembersInjector */
public interface CheckParameters_MembersInjector {

    /* renamed from: o.CheckParameters_MembersInjector$ParcelableVolumeInfo */
    public interface ParcelableVolumeInfo extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void aF_();

        void aG_();

        void write(List<AutoValue_CrashlyticsReport_Session_User> list);
    }

    /* renamed from: o.CheckParameters_MembersInjector$write */
    public interface write extends C1163x1ce8468d {
        void read(AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User);
    }

    /* renamed from: o.CheckParameters_MembersInjector$IconCompatParcelizer */
    public interface IconCompatParcelizer extends RatingCompat {
        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$ItemReceiver(List<CrashlyticsReport.Session.Event.Application.Builder> list);
    }

    /* renamed from: o.CheckParameters_MembersInjector$MediaDescriptionCompat */
    public interface MediaDescriptionCompat extends RatingCompat {
        void MediaBrowserCompat$CustomActionResultReceiver(int i);

        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$ItemReceiver(int i);

        void MediaBrowserCompat$ItemReceiver(boolean z);

        void write();

        void write(int i);
    }

    /* renamed from: o.CheckParameters_MembersInjector$MediaMetadataCompat */
    public interface MediaMetadataCompat extends RatingCompat {
    }

    /* renamed from: o.CheckParameters_MembersInjector$RatingCompat */
    public interface RatingCompat extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void MediaBrowserCompat$ItemReceiver(AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder builder);
    }

    /* renamed from: o.CheckParameters_MembersInjector$read */
    public interface read extends C6399x149707a6 {
        void read(setCurrentSession setcurrentsession);
    }

    Bitmap IconCompatParcelizer(int i, int i2, Bitmap.Config config);

    Bitmap MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, Bitmap.Config config);

    void MediaBrowserCompat$ItemReceiver();

    void read(int i);

    void write(Bitmap bitmap);
}
