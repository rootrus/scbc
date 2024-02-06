package p040o;

/* renamed from: o.zzkg$MediaBrowserCompat$ItemReceiver */
final class zzkg$MediaBrowserCompat$ItemReceiver<T> implements DebitCardMarketConductDeepLinkActivity<PlaceFilter> {
    private /* synthetic */ zzkg read;

    zzkg$MediaBrowserCompat$ItemReceiver(zzkg zzkg) {
        this.read = zzkg;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        PlaceFilter placeFilter = (PlaceFilter) obj;
        this.read.IconCompatParcelizer.write = placeFilter != null ? new PlaceFilter(placeFilter.read, placeFilter.MediaBrowserCompat$CustomActionResultReceiver, true) : null;
    }
}
