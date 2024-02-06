package p040o;

/* renamed from: o.enableZoom */
public final /* synthetic */ class enableZoom implements dump {
    private final /* synthetic */ FundSwitchLandingActivity write;

    public /* synthetic */ enableZoom(FundSwitchLandingActivity fundSwitchLandingActivity) {
        this.write = fundSwitchLandingActivity;
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        FundSwitchLandingActivity fundSwitchLandingActivity = this.write;
        StreetViewPanoramaFragment streetViewPanoramaFragment = (StreetViewPanoramaFragment) obj;
        fundSwitchLandingActivity.MediaBrowserCompat$CustomActionResultReceiver = streetViewPanoramaFragment.write;
        fundSwitchLandingActivity.read = streetViewPanoramaFragment.read;
    }
}
