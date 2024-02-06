package p040o;

import p040o.C1160x44733d2;
import p040o.writeUInt64NoTag;

/* renamed from: o.getImageDPI */
public final /* synthetic */ class getImageDPI implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setImageID MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ CrashlyticsReportJsonTransform$$Lambda$7 write;

    public /* synthetic */ getImageDPI(setImageID setimageid, CrashlyticsReportJsonTransform$$Lambda$7 crashlyticsReportJsonTransform$$Lambda$7) {
        this.MediaBrowserCompat$ItemReceiver = setimageid;
        this.write = crashlyticsReportJsonTransform$$Lambda$7;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C1160x44733d2.IconCompatParcelizer) obj).IconCompatParcelizer(setImageID.IconCompatParcelizer(this.write.read));
    }
}
