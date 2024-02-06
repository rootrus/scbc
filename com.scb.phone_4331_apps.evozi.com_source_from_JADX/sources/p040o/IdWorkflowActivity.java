package p040o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import java.util.List;
import p040o.CheckCaptureModule;
import p040o.CrashlyticsReport;

/* renamed from: o.IdWorkflowActivity */
public interface IdWorkflowActivity {

    /* renamed from: o.IdWorkflowActivity$a */
    public interface C1222a extends CheckCaptureModule.C1151b {
        void read(standardStartAndWait standardstartandwait);
    }

    /* renamed from: o.IdWorkflowActivity$1 */
    public interface C69161 {

        /* renamed from: o.IdWorkflowActivity$1$write */
        public interface write extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
            void IconCompatParcelizer(CrashlyticsReport.Session.Event.Application.Execution execution);

            void MediaBrowserCompat$CustomActionResultReceiver();

            /* renamed from: a_ */
            void mo36953a_(CrashlyticsReport.FilesPayload.File.Builder builder);
        }

        boolean IconCompatParcelizer();

        Bitmap MediaBrowserCompat$CustomActionResultReceiver(Rect rect, int i);

        Point MediaBrowserCompat$ItemReceiver(Context context, Uri uri) throws Exception;

        void MediaBrowserCompat$ItemReceiver();
    }

    /* renamed from: o.IdWorkflowActivity$read */
    public interface read extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void IconCompatParcelizer(List<? extends CrashlyticsReport.Session.Builder> list);

        void MediaBrowserCompat$CustomActionResultReceiver();
    }

    Bitmap IconCompatParcelizer(Context context, Uri uri) throws Exception;
}
