package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsBackgroundWorker;
import p040o.writeUInt64NoTag;

/* renamed from: o.barcodeReadComplete */
public final /* synthetic */ class barcodeReadComplete implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsBackgroundWorker.C32142 write;

    public /* synthetic */ barcodeReadComplete(CrashlyticsBackgroundWorker.C32142 r1) {
        this.write = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractActivity_MembersInjector.setTitle) obj).MediaBrowserCompat$ItemReceiver(this.write);
    }
}
