package p040o;

import java.util.List;

/* renamed from: o.getMap */
public final /* synthetic */ class getMap implements dump {
    private final /* synthetic */ MapStyleOptions MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ List write;

    public /* synthetic */ getMap(MapStyleOptions mapStyleOptions, List list) {
        this.MediaBrowserCompat$ItemReceiver = mapStyleOptions;
        this.write = list;
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        MapStyleOptions.read((FundSwitchLandingActivity) obj, this.write);
    }
}
