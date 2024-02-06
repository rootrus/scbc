package p040o;

import p040o.AutoCrashlyticsReportEncoder;

/* renamed from: o.getStartTime */
public final /* synthetic */ class getStartTime implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getStartTime(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final boolean write(Object obj) {
        return ((AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder) ((setStyle) obj).IconCompatParcelizer).write.equals(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
