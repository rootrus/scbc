package p040o;

import p040o.CrashlyticsCore;
import p040o.writeUInt64NoTag;

/* renamed from: o.isMasked */
public final /* synthetic */ class isMasked implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsCore.C32494 MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ isMasked(CrashlyticsCore.C32494 r1) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        getDestination$MediaBrowserCompat$CustomActionResultReceiver.write(this.MediaBrowserCompat$CustomActionResultReceiver, (getHorizontalStreaks) obj);
    }
}
