package p040o;

import java.util.List;
import p040o.CrashlyticsController;
import p040o.CrashlyticsReport;

/* renamed from: o.PassportCaptureModule_GetUriRttiFactory */
public interface PassportCaptureModule_GetUriRttiFactory {

    /* renamed from: o.PassportCaptureModule_GetUriRttiFactory$read */
    public interface read extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void IconCompatParcelizer(int i);

        void IconCompatParcelizer(CrashlyticsReport.Session.Event.Application.Execution.Exception exception, String str, jsonFromMapEntryString jsonfrommapentrystring);

        void IconCompatParcelizer(getLogFileDir getlogfiledir);

        void IconCompatParcelizer(lambda$processSetComponents$1 lambda_processsetcomponents_1, String str, jsonFromMapEntryString jsonfrommapentrystring);

        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$CustomActionResultReceiver(List<CrashlyticsCore> list);

        void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsController.LogFileDirectoryProvider logFileDirectoryProvider);

        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$ItemReceiver(CrashlyticsController.ReportUploaderHandlingExceptionCheck reportUploaderHandlingExceptionCheck);

        void read();

        void read(CrashlyticsController.InvalidPartFileFilter invalidPartFileFilter);

        void read(lambda$processSetComponents$1 lambda_processsetcomponents_1, jsonFromMapEntryString jsonfrommapentrystring);

        void write();

        void write(List<CrashlyticsController.SessionPartFileFilter> list);
    }

    boolean MediaBrowserCompat$ItemReceiver();
}
