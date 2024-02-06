package p040o;

/* renamed from: o.setContentType */
public final /* synthetic */ class setContentType implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ zzjv read;
    private final /* synthetic */ String write;

    public /* synthetic */ setContentType(zzjv zzjv, String str) {
        this.read = zzjv;
        this.write = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        String str;
        zzjv zzjv = this.read;
        String str2 = this.write;
        getMatrixForRepeater getmatrixforrepeater = (getMatrixForRepeater) obj;
        if (!(getmatrixforrepeater.IconCompatParcelizer == null || (str = getmatrixforrepeater.IconCompatParcelizer.read) == null)) {
            zzjv.ParcelableVolumeInfo.write = str;
        }
        zzjv.ParcelableVolumeInfo.AppCompatDelegateImpl$ListMenuDecorView = str2;
        zzjv.ParcelableVolumeInfo.AppCompatDialogFragment = getmatrixforrepeater.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver.write;
    }
}
