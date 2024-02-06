package p040o;

import p040o.Futures;
import p040o.IdParameters;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeInitializeFromFile */
public final /* synthetic */ class nativeInitializeFromFile implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Futures.C34104 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ nativeInitializeFromFile(Futures.C34104 r1) {
        this.MediaBrowserCompat$ItemReceiver = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IdParameters.IdState.IconCompatParcelizer) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
    }
}
