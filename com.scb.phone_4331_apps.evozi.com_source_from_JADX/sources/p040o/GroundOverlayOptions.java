package p040o;

/* renamed from: o.GroundOverlayOptions */
public final /* synthetic */ class GroundOverlayOptions implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ doGoAsync IconCompatParcelizer;

    public /* synthetic */ GroundOverlayOptions(doGoAsync dogoasync) {
        this.IconCompatParcelizer = dogoasync;
    }

    public final Object write(Object obj) {
        doGoAsync dogoasync = this.IconCompatParcelizer;
        BScanCNotificationDeepLinkActivity list = DebitCardResetOtpActivity.just((OnStreetViewPanoramaReadyCallback) obj).map(BitmapDescriptorFactory.MediaBrowserCompat$ItemReceiver).flatMapIterable(Dot.read).flatMap(new GroundOverlay(dogoasync), new setImage(dogoasync)).concatMap(Gap.read).toList();
        IMapFragmentDelegate iMapFragmentDelegate = IMapFragmentDelegate.write;
        HmlLatestPersonalInformationDeepLinkActivity.write(iMapFragmentDelegate, "mapper is null");
        return new FriendsLandingActivity_ViewBinding(new onCopy(list, iMapFragmentDelegate));
    }
}
