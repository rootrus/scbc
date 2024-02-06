package p040o;

import p040o.C1160x44733d2;
import p040o.writeUInt64NoTag;

/* renamed from: o.getImageJpegQuality */
public final /* synthetic */ class getImageJpegQuality implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsReportJsonTransform$$Lambda$7 MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ setImageID write;

    public /* synthetic */ getImageJpegQuality(setImageID setimageid, CrashlyticsReportJsonTransform$$Lambda$7 crashlyticsReportJsonTransform$$Lambda$7) {
        this.write = setimageid;
        this.MediaBrowserCompat$CustomActionResultReceiver = crashlyticsReportJsonTransform$$Lambda$7;
    }

    public final void IconCompatParcelizer(Object obj) {
        CrashlyticsReportJsonTransform$$Lambda$7 crashlyticsReportJsonTransform$$Lambda$7 = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((C1160x44733d2.IconCompatParcelizer) obj).MediaBrowserCompat$ItemReceiver(setImageID.IconCompatParcelizer(crashlyticsReportJsonTransform$$Lambda$7.read), setImageID.IconCompatParcelizer(crashlyticsReportJsonTransform$$Lambda$7.write));
    }
}
