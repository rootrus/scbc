package p040o;

import p040o.CrashlyticsReport;
import p040o.LogFileManager;
import p040o.StreetViewPanoramaFragment;

/* renamed from: o.newCheckExtractor */
public interface newCheckExtractor {

    /* renamed from: o.newCheckExtractor$IconCompatParcelizer */
    public interface IconCompatParcelizer extends C7126xb23daf18 {
        void IconCompatParcelizer();

        void IconCompatParcelizer(String str);

        void IconCompatParcelizer(String str, int i);

        void IconCompatParcelizer(CrashlyticsReport.Session.Event.Application.Execution execution);

        void IconCompatParcelizer(setUuidFromUtf8Bytes setuuidfromutf8bytes);

        void IconCompatParcelizer(setUuidFromUtf8Bytes setuuidfromutf8bytes, String str);

        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.Session.Event.Application.Execution execution, StreetViewPanoramaFragment.zzb zzb, String str, LogFileManager.C35981 r4);

        void MediaBrowserCompat$CustomActionResultReceiver(StreetViewPanoramaFragment.zzb zzb, String str);

        void MediaBrowserCompat$CustomActionResultReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes);

        void MediaBrowserCompat$CustomActionResultReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes, IGoogleMapDelegate iGoogleMapDelegate, String str);

        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Event.Application.Execution execution);

        void MediaBrowserCompat$MediaItem();

        void MediaBrowserCompat$SearchResultReceiver();

        void read();

        void read(String str);

        void read(CrashlyticsReport.Session.Event.Application.Execution execution);

        void read(setUuidFromUtf8Bytes setuuidfromutf8bytes, IGoogleMapDelegate iGoogleMapDelegate);

        void write();

        void write(String str);

        void write(setUuidFromUtf8Bytes setuuidfromutf8bytes, String str);
    }

    void IconCompatParcelizer(int i);
}
