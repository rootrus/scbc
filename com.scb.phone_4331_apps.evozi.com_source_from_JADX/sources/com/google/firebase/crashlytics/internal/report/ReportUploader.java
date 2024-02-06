package com.google.firebase.crashlytics.internal.report;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable;
import com.google.firebase.crashlytics.internal.common.DataTransportState;
import com.google.firebase.crashlytics.internal.report.model.Report;
import com.google.firebase.crashlytics.internal.report.network.CreateReportSpiCall;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReportUploader {
    /* access modifiers changed from: private */
    public static final short[] RETRY_INTERVALS = {10, 20, 30, 60, 120, 300};
    private final CreateReportSpiCall createReportCall;
    private final DataTransportState dataTransportState;
    private final String googleAppId;
    /* access modifiers changed from: private */
    public final HandlingExceptionCheck handlingExceptionCheck;
    private final String organizationId;
    private final ReportManager reportManager;
    /* access modifiers changed from: private */
    public Thread uploadThread;

    public interface HandlingExceptionCheck {
        boolean isHandlingException();
    }

    public interface Provider {
        ReportUploader createReportUploader(AppSettingsData appSettingsData);
    }

    public interface ReportFilesProvider {
        File[] getCompleteSessionFiles();

        File[] getNativeReportFiles();
    }

    public ReportUploader(String str, String str2, DataTransportState dataTransportState2, ReportManager reportManager2, CreateReportSpiCall createReportSpiCall, HandlingExceptionCheck handlingExceptionCheck2) {
        if (createReportSpiCall != null) {
            this.createReportCall = createReportSpiCall;
            this.organizationId = str;
            this.googleAppId = str2;
            this.dataTransportState = dataTransportState2;
            this.reportManager = reportManager2;
            this.handlingExceptionCheck = handlingExceptionCheck2;
            return;
        }
        throw new IllegalArgumentException("createReportCall must not be null.");
    }

    public void uploadReportsAsync(List<Report> list, boolean z, float f) {
        synchronized (this) {
            if (this.uploadThread != null) {
                Logger.getLogger().mo8866d("Report upload has already been started.");
                return;
            }
            Thread thread = new Thread(new Worker(list, z, f), "Crashlytics Report Uploader");
            this.uploadThread = thread;
            thread.start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062 A[Catch:{ Exception -> 0x0068 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean uploadReport(com.google.firebase.crashlytics.internal.report.model.Report r6, boolean r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.google.firebase.crashlytics.internal.report.model.CreateReportRequest r2 = new com.google.firebase.crashlytics.internal.report.model.CreateReportRequest     // Catch:{ Exception -> 0x0068 }
            java.lang.String r3 = r5.organizationId     // Catch:{ Exception -> 0x0068 }
            java.lang.String r4 = r5.googleAppId     // Catch:{ Exception -> 0x0068 }
            r2.<init>(r3, r4, r6)     // Catch:{ Exception -> 0x0068 }
            com.google.firebase.crashlytics.internal.common.DataTransportState r3 = r5.dataTransportState     // Catch:{ Exception -> 0x0068 }
            com.google.firebase.crashlytics.internal.common.DataTransportState r4 = com.google.firebase.crashlytics.internal.common.DataTransportState.ALL     // Catch:{ Exception -> 0x0068 }
            if (r3 != r4) goto L_0x001b
            com.google.firebase.crashlytics.internal.Logger r7 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = "Send to Reports Endpoint disabled. Removing Reports Endpoint report."
            r7.mo8866d(r2)     // Catch:{ Exception -> 0x0068 }
            goto L_0x0032
        L_0x001b:
            com.google.firebase.crashlytics.internal.common.DataTransportState r3 = r5.dataTransportState     // Catch:{ Exception -> 0x0068 }
            com.google.firebase.crashlytics.internal.common.DataTransportState r4 = com.google.firebase.crashlytics.internal.common.DataTransportState.JAVA_ONLY     // Catch:{ Exception -> 0x0068 }
            if (r3 != r4) goto L_0x0034
            com.google.firebase.crashlytics.internal.report.model.Report$Type r3 = r6.getType()     // Catch:{ Exception -> 0x0068 }
            com.google.firebase.crashlytics.internal.report.model.Report$Type r4 = com.google.firebase.crashlytics.internal.report.model.Report.Type.JAVA     // Catch:{ Exception -> 0x0068 }
            if (r3 != r4) goto L_0x0034
            com.google.firebase.crashlytics.internal.Logger r7 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = "Send to Reports Endpoint for non-native reports disabled. Removing Reports Uploader report."
            r7.mo8866d(r2)     // Catch:{ Exception -> 0x0068 }
        L_0x0032:
            r7 = r0
            goto L_0x0060
        L_0x0034:
            com.google.firebase.crashlytics.internal.report.network.CreateReportSpiCall r3 = r5.createReportCall     // Catch:{ Exception -> 0x0068 }
            boolean r7 = r3.invoke(r2, r7)     // Catch:{ Exception -> 0x0068 }
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch:{ Exception -> 0x0068 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0068 }
            r3.<init>()     // Catch:{ Exception -> 0x0068 }
            java.lang.String r4 = "Crashlytics Reports Endpoint upload "
            r3.append(r4)     // Catch:{ Exception -> 0x0068 }
            if (r7 == 0) goto L_0x004d
            java.lang.String r4 = "complete: "
            goto L_0x004f
        L_0x004d:
            java.lang.String r4 = "FAILED: "
        L_0x004f:
            r3.append(r4)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r4 = r6.getIdentifier()     // Catch:{ Exception -> 0x0068 }
            r3.append(r4)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0068 }
            r2.mo8870i(r3)     // Catch:{ Exception -> 0x0068 }
        L_0x0060:
            if (r7 == 0) goto L_0x0081
            com.google.firebase.crashlytics.internal.report.ReportManager r7 = r5.reportManager     // Catch:{ Exception -> 0x0068 }
            r7.deleteReport(r6)     // Catch:{ Exception -> 0x0068 }
            goto L_0x0082
        L_0x0068:
            r7 = move-exception
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error occurred sending report "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r0.mo8869e(r6, r7)
        L_0x0081:
            r0 = r1
        L_0x0082:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.report.ReportUploader.uploadReport(com.google.firebase.crashlytics.internal.report.model.Report, boolean):boolean");
    }

    class Worker extends BackgroundPriorityRunnable {
        private final boolean dataCollectionToken;
        private final float delay;
        private final List<Report> reports;

        Worker(List<Report> list, boolean z, float f) {
            this.reports = list;
            this.dataCollectionToken = z;
            this.delay = f;
        }

        public void onRun() {
            try {
                attemptUploadWithRetry(this.reports, this.dataCollectionToken);
            } catch (Exception e) {
                Logger.getLogger().mo8869e("An unexpected error occurred while attempting to upload crash reports.", e);
            }
            Thread unused = ReportUploader.this.uploadThread = null;
        }

        private void attemptUploadWithRetry(List<Report> list, boolean z) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Starting report processing in ");
            sb.append(this.delay);
            sb.append(" second(s)...");
            logger.mo8866d(sb.toString());
            float f = this.delay;
            if (f > BitmapDescriptorFactory.HUE_RED) {
                try {
                    Thread.sleep((long) (f * 1000.0f));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (!ReportUploader.this.handlingExceptionCheck.isHandlingException()) {
                int i = 0;
                while (list.size() > 0 && !ReportUploader.this.handlingExceptionCheck.isHandlingException()) {
                    Logger logger2 = Logger.getLogger();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Attempting to send ");
                    sb2.append(list.size());
                    sb2.append(" report(s)");
                    logger2.mo8866d(sb2.toString());
                    ArrayList arrayList = new ArrayList();
                    for (Report next : list) {
                        if (!ReportUploader.this.uploadReport(next, z)) {
                            arrayList.add(next);
                        }
                    }
                    if (arrayList.size() > 0) {
                        long j = (long) ReportUploader.RETRY_INTERVALS[Math.min(i, ReportUploader.RETRY_INTERVALS.length - 1)];
                        Logger logger3 = Logger.getLogger();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Report submission: scheduling delayed retry in ");
                        sb3.append(j);
                        sb3.append(" seconds");
                        logger3.mo8866d(sb3.toString());
                        try {
                            Thread.sleep(j * 1000);
                            i++;
                        } catch (InterruptedException unused2) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    list = arrayList;
                }
            }
        }
    }
}
