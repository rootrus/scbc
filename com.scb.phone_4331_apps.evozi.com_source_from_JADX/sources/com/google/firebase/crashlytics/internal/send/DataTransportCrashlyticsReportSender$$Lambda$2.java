package com.google.firebase.crashlytics.internal.send;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.nio.charset.Charset;
import p040o.Int3;

final /* synthetic */ class DataTransportCrashlyticsReportSender$$Lambda$2 implements Int3 {
    private static final DataTransportCrashlyticsReportSender$$Lambda$2 instance = new DataTransportCrashlyticsReportSender$$Lambda$2();

    private DataTransportCrashlyticsReportSender$$Lambda$2() {
    }

    public static Int3 lambdaFactory$() {
        return instance;
    }

    public final Object apply(Object obj) {
        return DataTransportCrashlyticsReportSender.TRANSFORM.reportToJson((CrashlyticsReport) obj).getBytes(Charset.forName("UTF-8"));
    }
}
