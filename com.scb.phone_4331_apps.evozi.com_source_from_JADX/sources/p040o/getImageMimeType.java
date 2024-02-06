package p040o;

import p040o.C1160x44733d2;
import p040o.writeUInt64NoTag;

/* renamed from: o.getImageMimeType */
public final /* synthetic */ class getImageMimeType implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setImageID IconCompatParcelizer;
    private final /* synthetic */ CrashlyticsReportJsonTransform$$Lambda$7 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getImageMimeType(setImageID setimageid, CrashlyticsReportJsonTransform$$Lambda$7 crashlyticsReportJsonTransform$$Lambda$7) {
        this.IconCompatParcelizer = setimageid;
        this.MediaBrowserCompat$ItemReceiver = crashlyticsReportJsonTransform$$Lambda$7;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C1160x44733d2.IconCompatParcelizer) obj).read(setImageID.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.read));
    }
}
