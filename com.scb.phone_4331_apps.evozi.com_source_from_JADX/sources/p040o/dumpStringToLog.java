package p040o;

/* renamed from: o.dumpStringToLog */
public final /* synthetic */ class dumpStringToLog implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ cancelJob read;

    public /* synthetic */ dumpStringToLog(cancelJob canceljob) {
        this.read = canceljob;
    }

    public final boolean write(Object obj) {
        cancelJob canceljob = this.read;
        CrashlyticsReportDataCapture crashlyticsReportDataCapture = (CrashlyticsReportDataCapture) obj;
        boolean z = crashlyticsReportDataCapture.MediaBrowserCompat$ItemReceiver;
        if (z) {
            canceljob.write.add(crashlyticsReportDataCapture);
        }
        return z;
    }
}
