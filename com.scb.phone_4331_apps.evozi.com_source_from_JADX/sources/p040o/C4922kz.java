package p040o;

import p040o.C10100p;
import p040o.getBottomEdgeTearHeight;
import p040o.writeUInt64NoTag;

/* renamed from: o.kz */
public final /* synthetic */ class C4922kz implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C10100p.C5120a write;

    public /* synthetic */ C4922kz(C10100p.C5120a aVar, boolean z) {
        this.write = aVar;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        C10100p.C5120a aVar = this.write;
        ((getBottomEdgeTearHeight.write) obj).read(aVar.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, aVar.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, aVar.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
