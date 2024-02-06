package p040o;

import android.view.View;
import java.util.List;
import p040o.CrashlyticsReport;

/* renamed from: o.CheckCaptureModule_RttiExceptionResponseDeserializer_Factory */
public interface CheckCaptureModule_RttiExceptionResponseDeserializer_Factory {

    /* renamed from: o.CheckCaptureModule_RttiExceptionResponseDeserializer_Factory$IconCompatParcelizer */
    public interface IconCompatParcelizer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void write(MapFragment mapFragment, List<access$1600> list, boolean z);
    }

    /* renamed from: o.CheckCaptureModule_RttiExceptionResponseDeserializer_Factory$write */
    public interface write extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void write(getUuidUtf8Bytes getuuidutf8bytes, CrashlyticsReport.Session.Event.Application.Execution execution);
    }

    void IconCompatParcelizer(View view);

    void MediaBrowserCompat$CustomActionResultReceiver(View view);
}
