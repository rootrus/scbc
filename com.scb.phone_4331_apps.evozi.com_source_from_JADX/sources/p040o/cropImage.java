package p040o;

import p040o.nativeConfigureFromFile;
import p040o.writeUInt64NoTag;

/* renamed from: o.cropImage */
public final /* synthetic */ class cropImage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nativeConfigureFromFile IconCompatParcelizer;

    public /* synthetic */ cropImage(nativeConfigureFromFile nativeconfigurefromfile) {
        this.IconCompatParcelizer = nativeconfigurefromfile;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeConfigureFromFile nativeconfigurefromfile = this.IconCompatParcelizer;
        whenAll whenall = nativeconfigurefromfile.MediaBrowserCompat$SearchResultReceiver;
        whenall.write(whenall.read(), new nativeConfigureFromFile.IconCompatParcelizer());
    }
}
