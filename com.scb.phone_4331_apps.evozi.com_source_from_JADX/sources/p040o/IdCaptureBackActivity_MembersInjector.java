package p040o;

import com.google.android.gms.maps.model.LatLng;
import p040o.CrashlyticsReport;
import p040o.StreetViewPanoramaFragment;

/* renamed from: o.IdCaptureBackActivity_MembersInjector */
public interface IdCaptureBackActivity_MembersInjector {

    /* renamed from: o.IdCaptureBackActivity_MembersInjector$IconCompatParcelizer */
    public interface IconCompatParcelizer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(CrashlyticsReport.Session.Event.Application.Execution execution, StreetViewPanoramaFragment.zzb zzb, String str, String str2, jsonFromMapEntryString jsonfrommapentrystring);

        void MediaBrowserCompat$ItemReceiver();

        void read(CrashlyticsReport.FilesPayload.File.Builder builder);
    }

    String IconCompatParcelizer();

    String MediaBrowserCompat$CustomActionResultReceiver();

    LatLng MediaBrowserCompat$ItemReceiver();
}
