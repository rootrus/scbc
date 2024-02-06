package p040o;

import p040o.nativeConfigureFromFile;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeGrabVideoFrame */
public final /* synthetic */ class nativeGrabVideoFrame implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nativeConfigureFromFile write;

    public /* synthetic */ nativeGrabVideoFrame(nativeConfigureFromFile nativeconfigurefromfile) {
        this.write = nativeconfigurefromfile;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeConfigureFromFile nativeconfigurefromfile = this.write;
        whenAll whenall = nativeconfigurefromfile.MediaBrowserCompat$SearchResultReceiver;
        whenall.write(whenall.MediaBrowserCompat$ItemReceiver.write(whenall.write.setCheckable()), new nativeConfigureFromFile.IconCompatParcelizer());
    }
}
