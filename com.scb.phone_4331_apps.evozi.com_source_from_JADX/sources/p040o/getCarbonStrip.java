package p040o;

import android.content.DialogInterface;
import java.util.List;
import p040o.CrashlyticsReport;
import p040o.getTopLeftCornerWidth;

/* renamed from: o.getCarbonStrip */
public interface getCarbonStrip {

    /* renamed from: o.getCarbonStrip$MediaDescriptionCompat */
    public interface MediaDescriptionCompat extends getTopLeftCornerWidth.AppCompatActivity {
    }

    /* renamed from: o.getCarbonStrip$IconCompatParcelizer */
    public interface IconCompatParcelizer extends write {
        void IconCompatParcelizer();

        void IconCompatParcelizer(String str);

        void IconCompatParcelizer(CrashlyticsReport.Session.Event.Application.Execution.Signal signal, boolean z);

        void IconCompatParcelizer(parseEventLog parseeventlog, parseEventSignal parseeventsignal);

        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$CustomActionResultReceiver(List<Integer> list);

        void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.Session.Event.Application.Execution execution);

        void MediaBrowserCompat$CustomActionResultReceiver(parseEventLog parseeventlog, parseEventSignal parseeventsignal);

        void MediaBrowserCompat$CustomActionResultReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes, boolean z);

        void MediaBrowserCompat$ItemReceiver(String str, String str2, int i);

        void MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Event.Application.Execution execution);

        void read(String str);

        void read(String str, String str2, DialogInterface.OnClickListener onClickListener);

        void read(CrashlyticsReport.Session.Event.Application.Execution execution);

        void read(setUuidFromUtf8Bytes setuuidfromutf8bytes, IGoogleMapDelegate iGoogleMapDelegate);

        void read(boolean z);

        void write();

        void write(List<Integer> list, String str);

        void write(CrashlyticsReport.Session.Event.Application.Execution.Signal signal, boolean z);
    }

    /* renamed from: o.getCarbonStrip$read */
    public interface read extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(String str, String str2, setUuidFromUtf8Bytes setuuidfromutf8bytes);

        void IconCompatParcelizer(setUuidFromUtf8Bytes setuuidfromutf8bytes);

        void write();
    }

    /* renamed from: o.getCarbonStrip$write */
    public interface write extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$SearchResultReceiver(String str);

        void MediaDescriptionCompat(String str);

        void RatingCompat(String str);

        void write(String str);
    }

    void IconCompatParcelizer(Iterable<byte[]> iterable, getSubElementOffsetBytes getsubelementoffsetbytes, setItemAnimator setitemanimator);

    Iterable<setItemAnimator> MediaBrowserCompat$ItemReceiver();
}
