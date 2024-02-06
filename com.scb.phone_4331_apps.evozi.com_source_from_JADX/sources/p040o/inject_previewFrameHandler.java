package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.inject_previewFrameHandler */
public final /* synthetic */ class inject_previewFrameHandler implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List IconCompatParcelizer;
    private final /* synthetic */ clearGlobalBitmap write;

    public /* synthetic */ inject_previewFrameHandler(clearGlobalBitmap clearglobalbitmap, List list) {
        this.write = clearglobalbitmap;
        this.IconCompatParcelizer = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        clearGlobalBitmap clearglobalbitmap = this.write;
        ((C6397xabb2c88d) obj).MediaBrowserCompat$ItemReceiver(clearglobalbitmap.ParcelableVolumeInfo, this.IconCompatParcelizer);
    }
}
