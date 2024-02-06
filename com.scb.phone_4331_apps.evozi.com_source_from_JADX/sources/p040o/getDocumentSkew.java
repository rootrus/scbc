package p040o;

import java.util.List;
import p040o.CrashlyticsReport;

/* renamed from: o.getDocumentSkew */
public interface getDocumentSkew extends CheckCaptureModule_GetICheckDeserializerRttiFactory {

    /* renamed from: o.getDocumentSkew$IconCompatParcelizer */
    public interface IconCompatParcelizer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void MediaBrowserCompat$CustomActionResultReceiver(parseEventLog parseeventlog);

        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$ItemReceiver(List<Integer> list);

        void read(String str);

        void read(String str, String str2, String str3);

        void read(List<CrashlyticsReport.Session.Builder> list);

        void read(setUuidFromUtf8Bytes setuuidfromutf8bytes, boolean z);
    }

    /* renamed from: o.getDocumentSkew$read */
    public interface read extends IconCompatParcelizer {
        void read();

        void write(String str);
    }

    /* renamed from: o.getDocumentSkew$write */
    public interface write extends IconCompatParcelizer {
        void MediaBrowserCompat$CustomActionResultReceiver();
    }

    void read();
}
