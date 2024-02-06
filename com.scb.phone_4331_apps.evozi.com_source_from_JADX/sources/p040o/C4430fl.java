package p040o;

import p040o.C4433fn;
import p040o.getBottomRightCornerHeight;
import p040o.writeUInt64NoTag;

/* renamed from: o.fl */
public final /* synthetic */ class C4430fl implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ zzsj MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ C4433fn.read read;

    public /* synthetic */ C4430fl(C4433fn.read read2, zzsj zzsj) {
        this.read = read2;
        this.MediaBrowserCompat$ItemReceiver = zzsj;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.read.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, (getBottomRightCornerHeight.write) obj);
    }
}
