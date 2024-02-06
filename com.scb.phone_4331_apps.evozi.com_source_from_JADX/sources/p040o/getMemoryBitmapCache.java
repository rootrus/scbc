package p040o;

import p040o.CheckExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.getMemoryBitmapCache */
public final /* synthetic */ class getMemoryBitmapCache implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4180ch IconCompatParcelizer;

    public /* synthetic */ getMemoryBitmapCache(C4180ch chVar) {
        this.IconCompatParcelizer = chVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4180ch chVar = this.IconCompatParcelizer;
        ((CheckExtractor.C63961) obj).write(chVar.ParcelableVolumeInfo, chVar.MediaMetadataCompat);
    }
}
