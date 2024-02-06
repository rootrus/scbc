package p040o;

import p040o.CrashlyticsReport;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.BillCaptureModule_GetIJsonExactionHelperKtaFactory */
public final /* synthetic */ class BillCaptureModule_GetIJsonExactionHelperKtaFactory implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ CrashlyticsReport.FilesPayload.File MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ boolean write;

    public /* synthetic */ BillCaptureModule_GetIJsonExactionHelperKtaFactory(CrashlyticsReport.FilesPayload.File file, String str, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = file;
        this.IconCompatParcelizer = str;
        this.write = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.ListMenuItemView) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer, this.write);
    }
}
