package p040o;

import p040o.AppStatsSqLiteDs;
import p040o.ICheckExtractorListener;
import p040o.writeUInt64NoTag;

/* renamed from: o.AppStatsJsonExportHandler */
public final /* synthetic */ class AppStatsJsonExportHandler implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AppStatsSqLiteDs.C30381 MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ getLogBytes write;

    public /* synthetic */ AppStatsJsonExportHandler(AppStatsSqLiteDs.C30381 r1, getLogBytes getlogbytes) {
        this.MediaBrowserCompat$ItemReceiver = r1;
        this.write = getlogbytes;
    }

    public final void IconCompatParcelizer(Object obj) {
        AppStatsSqLiteDs.C30381 r0 = this.MediaBrowserCompat$ItemReceiver;
        getLogBytes getlogbytes = this.write;
        ICheckExtractorListener.IconCompatParcelizer iconCompatParcelizer = (ICheckExtractorListener.IconCompatParcelizer) obj;
        if (getlogbytes.IconCompatParcelizer != null) {
            int unused = AppStatsSqLiteDs.this.IconCompatParcelizer = getlogbytes.IconCompatParcelizer.read;
            if (AppStatsSqLiteDs.this.IconCompatParcelizer <= 1) {
                iconCompatParcelizer.write();
            }
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(getlogbytes, getlogbytes.IconCompatParcelizer.write);
            return;
        }
        iconCompatParcelizer.IconCompatParcelizer();
    }
}
