package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.AnalyticsConnectorImpl;

/* renamed from: o.ExtractorResponse */
public interface ExtractorResponse {

    /* renamed from: o.ExtractorResponse$IconCompatParcelizer */
    public interface IconCompatParcelizer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void IconCompatParcelizer(chain chain, ArrayList<chain> arrayList, String str);

        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$ItemReceiver(ExtractorResponse$MediaBrowserCompat$ItemReceiver extractorResponse$MediaBrowserCompat$ItemReceiver);

        void MediaBrowserCompat$ItemReceiver(boolean z, String str);

        void MediaMetadataCompat();

        void read();

        void write();
    }

    /* renamed from: o.ExtractorResponse$read */
    public interface read extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(String str);

        void MediaBrowserCompat$ItemReceiver();

        void MediaDescriptionCompat(String str);

        void MediaMetadataCompat(String str);

        void read();

        void read(String str);

        void read(chain chain, ArrayList<chain> arrayList, String str, String str2, ArrayList<String> arrayList2);

        void write();

        void write(String str);

        void write(chain chain, ArrayList<chain> arrayList, String str, String str2);
    }

    /* renamed from: o.ExtractorResponse$write */
    public interface write extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void IconCompatParcelizer(String str);

        void IconCompatParcelizer(boolean z);

        void MediaBrowserCompat$CustomActionResultReceiver(boolean z);

        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$ItemReceiver(String str, chain chain, ArrayList<chain> arrayList);

        void MediaBrowserCompat$ItemReceiver(boolean z);

        void read();

        void read(String str);

        void read(String str, chain chain, ArrayList<chain> arrayList, String str2);

        void read(boolean z);

        void write(String str);

        void write(List<AnalyticsConnectorImpl.C30121> list);

        void write(boolean z);
    }

    void IconCompatParcelizer();

    void write();
}
