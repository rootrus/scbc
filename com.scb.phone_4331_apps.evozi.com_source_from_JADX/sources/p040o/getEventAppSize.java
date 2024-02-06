package p040o;

/* renamed from: o.getEventAppSize */
public class getEventAppSize extends writeUInt64NoTag<ICheckExtractionServer> {
    public final UrlTileProvider IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final Chars MediaBrowserCompat$ItemReceiver;
    public final doGoAsync read;

    @HmlPinActivity
    public getEventAppSize(UrlTileProvider urlTileProvider, RegularImmutableBiMap regularImmutableBiMap, doGoAsync dogoasync, Chars chars) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = urlTileProvider;
        this.read = dogoasync;
        this.MediaBrowserCompat$ItemReceiver = chars;
    }

    public final void write() {
        zzwo zzwo;
        UrlTileProvider urlTileProvider = this.IconCompatParcelizer;
        if (urlTileProvider.write.write() == null) {
            zzwo = null;
        } else {
            zzwo = urlTileProvider.write.write().Keep;
        }
        if (zzwo != null) {
            getAllFilesInDirectory getallfilesindirectory = new getAllFilesInDirectory(zzwo);
            if (this.RatingCompat != null) {
                getallfilesindirectory.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }
}
