package p040o;

import p040o.nativeConfigureFromFile;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeReset */
public final /* synthetic */ class nativeReset implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nativeConfigureFromFile IconCompatParcelizer;

    public /* synthetic */ nativeReset(nativeConfigureFromFile nativeconfigurefromfile) {
        this.IconCompatParcelizer = nativeconfigurefromfile;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeConfigureFromFile nativeconfigurefromfile = this.IconCompatParcelizer;
        whenAll whenall = nativeconfigurefromfile.MediaBrowserCompat$SearchResultReceiver;
        whenall.write(whenall.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(whenall.write.setCheckable()), new nativeConfigureFromFile.IconCompatParcelizer());
    }
}
