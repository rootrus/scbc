package p040o;

import p040o.IdParameters;
import p040o.writeUInt64NoTag;

/* renamed from: o.BoundaryType$MediaBrowserCompat$ItemReceiver */
final class BoundaryType$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<IdParameters.IdSide> {
    private /* synthetic */ Throwable IconCompatParcelizer;

    BoundaryType$MediaBrowserCompat$ItemReceiver(Throwable th) {
        this.IconCompatParcelizer = th;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((IdParameters.IdSide) obj).write(this.IconCompatParcelizer);
    }
}
