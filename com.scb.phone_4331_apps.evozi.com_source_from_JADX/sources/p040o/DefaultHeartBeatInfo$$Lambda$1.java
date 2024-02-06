package p040o;

import p040o.C7039x355e6121;
import p040o.proxyGetICheckDetector;

/* renamed from: o.DefaultHeartBeatInfo$$Lambda$1 */
public class DefaultHeartBeatInfo$$Lambda$1 extends writeUInt64NoTag<proxyGetICheckDetector.IconCompatParcelizer> {
    public final getLocalSocketAddress IconCompatParcelizer;
    /* access modifiers changed from: package-private */
    public final privateKeyEquivalence MediaBrowserCompat$ItemReceiver;
    public C7039x355e6121.read read = C7039x355e6121.read.SCB;
    public Service write;

    @HmlPinActivity
    public DefaultHeartBeatInfo$$Lambda$1(privateKeyEquivalence privatekeyequivalence, RegularImmutableBiMap regularImmutableBiMap, getLocalSocketAddress getlocalsocketaddress) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = privatekeyequivalence;
        this.IconCompatParcelizer = getlocalsocketaddress;
    }

    public void onDestroy() {
        getLocalSocketAddress getlocalsocketaddress = this.IconCompatParcelizer;
        if (!getlocalsocketaddress.MediaBrowserCompat$MediaItem.isDisposed()) {
            getlocalsocketaddress.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(DefaultHeartBeatInfo$$Lambda$1 defaultHeartBeatInfo$$Lambda$1) {
        if (defaultHeartBeatInfo$$Lambda$1.RatingCompat != null) {
            defaultHeartBeatInfo$$Lambda$1.RatingCompat.aj_();
        }
    }
}
