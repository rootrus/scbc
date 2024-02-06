package p040o;

import p040o.setCvv;
import p040o.writeUInt64NoTag;

/* renamed from: o.setSettings */
public final /* synthetic */ class setSettings implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ defaultReportUploader MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setSettings(defaultReportUploader defaultreportuploader) {
        this.MediaBrowserCompat$ItemReceiver = defaultreportuploader;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((setCvv.write) obj).read(this.MediaBrowserCompat$ItemReceiver);
    }
}
