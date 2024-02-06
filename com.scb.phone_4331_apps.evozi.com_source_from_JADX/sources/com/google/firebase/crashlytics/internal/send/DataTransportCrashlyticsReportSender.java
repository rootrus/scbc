package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import p040o.C7236load;
import p040o.Float4;
import p040o.Int3;
import p040o.Int4;
import p040o.Long2;
import p040o.createMultiContext;
import p040o.getArray;
import p040o.getPointerSize;

public class DataTransportCrashlyticsReportSender {
    private static final String CRASHLYTICS_API_KEY = mergeStrings("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    private static final String CRASHLYTICS_ENDPOINT = mergeStrings("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    private static final Int3<CrashlyticsReport, byte[]> DEFAULT_TRANSFORM = DataTransportCrashlyticsReportSender$$Lambda$2.lambdaFactory$();
    private static final CrashlyticsReportJsonTransform TRANSFORM = new CrashlyticsReportJsonTransform();
    private final getArray<CrashlyticsReport> transport;
    private final Int3<CrashlyticsReport, byte[]> transportTransform;

    public static DataTransportCrashlyticsReportSender create(Context context) {
        getPointerSize.write(context);
        createMultiContext createmulticontext = getPointerSize.MediaBrowserCompat$CustomActionResultReceiver;
        if (createmulticontext != null) {
            return new DataTransportCrashlyticsReportSender(createmulticontext.write().MediaBrowserCompat$ItemReceiver(new C7236load(CRASHLYTICS_ENDPOINT, CRASHLYTICS_API_KEY)).getTransport("FIREBASE_CRASHLYTICS_REPORT", CrashlyticsReport.class, new Float4("json"), DEFAULT_TRANSFORM), DEFAULT_TRANSFORM);
        }
        throw new IllegalStateException("Not initialized!");
    }

    DataTransportCrashlyticsReportSender(getArray<CrashlyticsReport> getarray, Int3<CrashlyticsReport, byte[]> int3) {
        this.transport = getarray;
        this.transportTransform = int3;
    }

    public Task<CrashlyticsReportWithSessionId> sendReport(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        CrashlyticsReport report = crashlyticsReportWithSessionId.getReport();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.transport.schedule(new Long2(report, Int4.HIGHEST), DataTransportCrashlyticsReportSender$$Lambda$1.lambdaFactory$(taskCompletionSource, crashlyticsReportWithSessionId));
        return taskCompletionSource.getTask();
    }

    static /* synthetic */ void lambda$sendReport$1(TaskCompletionSource taskCompletionSource, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
        } else {
            taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
        }
    }

    private static String mergeStrings(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
