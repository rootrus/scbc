package p040o;

/* renamed from: o.getStreetViewPanoramaLocation */
public final /* synthetic */ class getStreetViewPanoramaLocation implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ getInfoWindowAnchorU MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getStreetViewPanoramaLocation(getInfoWindowAnchorU getinfowindowanchoru) {
        this.MediaBrowserCompat$ItemReceiver = getinfowindowanchoru;
    }

    public final Object write(Object obj) {
        getStreetNamesEnabled getstreetnamesenabled = (getStreetNamesEnabled) obj;
        return this.MediaBrowserCompat$ItemReceiver.write.MediaBrowserCompat$ItemReceiver(getstreetnamesenabled.IconCompatParcelizer).map(new enableUserNavigation(getstreetnamesenabled));
    }
}
