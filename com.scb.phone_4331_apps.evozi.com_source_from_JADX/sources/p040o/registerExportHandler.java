package p040o;

import p040o.Futures;
import p040o.getTransit;
import p040o.writeUInt64NoTag;

/* renamed from: o.registerExportHandler */
public final /* synthetic */ class registerExportHandler implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Futures.C34051 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ registerExportHandler(Futures.C34051 r1) {
        this.MediaBrowserCompat$ItemReceiver = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTransit.IconCompatParcelizer) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
    }
}
