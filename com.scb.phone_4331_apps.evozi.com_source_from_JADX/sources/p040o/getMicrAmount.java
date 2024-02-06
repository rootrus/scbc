package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.CrashlyticsCore;
import p040o.CrashlyticsReport;
import p040o.Utils;

/* renamed from: o.getMicrAmount */
public interface getMicrAmount {

    /* renamed from: o.getMicrAmount$IconCompatParcelizer */
    public interface IconCompatParcelizer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void IconCompatParcelizer(String str);

        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$CustomActionResultReceiver(int i);

        void MediaBrowserCompat$ItemReceiver(ArrayList<Utils.C39334> arrayList);

        void read();

        void read(int i);

        void read(String str);

        void read(CrashlyticsCore.C32441 r1);

        void read(markInitializationComplete markinitializationcomplete);
    }

    /* renamed from: o.getMicrAmount$RatingCompat */
    public interface RatingCompat extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void MediaBrowserCompat$ItemReceiver();

        void read();

        void read(String str);

        void read(List<CrashlyticsCore.C32473> list);

        void write();
    }

    /* renamed from: o.getMicrAmount$read */
    public interface read extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(String str);

        void IconCompatParcelizer(String str, String str2);

        void IconCompatParcelizer(List<getMarkerFile> list);

        void IconCompatParcelizer(boolean z);

        void MediaBrowserCompat$CustomActionResultReceiver(jsonToUserData jsontouserdata);

        void MediaBrowserCompat$CustomActionResultReceiver(boolean z);

        void MediaBrowserCompat$ItemReceiver(valueOrNull valueornull);

        void MediaBrowserCompat$ItemReceiver(boolean z);

        void MediaBrowserCompat$MediaItem(String str);

        void RatingCompat(String str);

        void read(String str);

        void read(String str, String str2);

        void read(boolean z);

        void write(String str);

        void write(CrashlyticsReport.Session.Event.Application.Execution execution);

        void write(boolean z);
    }

    /* renamed from: o.getMicrAmount$write */
    public interface write extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(String str);
    }

    void MediaBrowserCompat$ItemReceiver();
}
