package p040o;

import p040o.Futures;
import p040o.IdParameters;
import p040o.writeUInt64NoTag;

/* renamed from: o.getInternalImage */
public final /* synthetic */ class getInternalImage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Futures.C34104 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getInternalImage(Futures.C34104 r1) {
        this.MediaBrowserCompat$ItemReceiver = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IdParameters.C6915a) obj).read(this.MediaBrowserCompat$ItemReceiver);
    }
}
