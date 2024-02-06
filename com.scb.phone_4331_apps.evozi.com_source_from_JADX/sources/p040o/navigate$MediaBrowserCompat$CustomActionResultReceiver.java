package p040o;

import java.util.List;

/* renamed from: o.navigate$MediaBrowserCompat$CustomActionResultReceiver */
public final class navigate$MediaBrowserCompat$CustomActionResultReceiver implements dump {
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ MapStyleOptions read;

    private navigate$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ navigate$MediaBrowserCompat$CustomActionResultReceiver(MapStyleOptions mapStyleOptions, List list) {
        this.read = mapStyleOptions;
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public void MediaBrowserCompat$ItemReceiver(Object obj) {
        MapStyleOptions.read((FundSwitchLandingActivity) obj, this.MediaBrowserCompat$ItemReceiver);
    }
}
