package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.lambda$deleteFinalizedReport$2 */
public final /* synthetic */ class lambda$deleteFinalizedReport$2 implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ getEventAppSize MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ lambda$deleteFinalizedReport$2(getEventAppSize geteventappsize, String str) {
        this.MediaBrowserCompat$ItemReceiver = geteventappsize;
        this.IconCompatParcelizer = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        String str;
        getEventAppSize geteventappsize = this.MediaBrowserCompat$ItemReceiver;
        ICheckExtractionServer iCheckExtractionServer = (ICheckExtractionServer) obj;
        zzwl zzwl = null;
        if ("th".equals(this.IconCompatParcelizer)) {
            UrlTileProvider urlTileProvider = geteventappsize.IconCompatParcelizer;
            if (urlTileProvider.write.write() != null) {
                zzwl = urlTileProvider.write.write().IconCompatParcelizer;
            }
            str = zzwl.IconCompatParcelizer;
        } else {
            UrlTileProvider urlTileProvider2 = geteventappsize.IconCompatParcelizer;
            if (urlTileProvider2.write.write() != null) {
                zzwl = urlTileProvider2.write.write().IconCompatParcelizer;
            }
            str = zzwl.read;
        }
        iCheckExtractionServer.read(str);
    }
}
