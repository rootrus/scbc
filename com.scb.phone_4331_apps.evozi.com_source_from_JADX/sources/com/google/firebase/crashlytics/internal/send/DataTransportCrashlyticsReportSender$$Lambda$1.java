package com.google.firebase.crashlytics.internal.send;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import p040o.Long3;

final /* synthetic */ class DataTransportCrashlyticsReportSender$$Lambda$1 implements Long3 {
    private final TaskCompletionSource arg$1;
    private final CrashlyticsReportWithSessionId arg$2;

    private DataTransportCrashlyticsReportSender$$Lambda$1(TaskCompletionSource taskCompletionSource, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        this.arg$1 = taskCompletionSource;
        this.arg$2 = crashlyticsReportWithSessionId;
    }

    public static Long3 lambdaFactory$(TaskCompletionSource taskCompletionSource, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        return new DataTransportCrashlyticsReportSender$$Lambda$1(taskCompletionSource, crashlyticsReportWithSessionId);
    }

    public final void onSchedule(Exception exc) {
        DataTransportCrashlyticsReportSender.lambda$sendReport$1(this.arg$1, this.arg$2, exc);
    }
}
