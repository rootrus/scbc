package p040o;

import p040o.proxyGetICheckDetector;
import p040o.writeUInt64NoTag;

/* renamed from: o.internalAdd */
public final /* synthetic */ class internalAdd implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ DefaultHeartBeatInfo$$Lambda$1 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ internalAdd(DefaultHeartBeatInfo$$Lambda$1 defaultHeartBeatInfo$$Lambda$1) {
        this.MediaBrowserCompat$ItemReceiver = defaultHeartBeatInfo$$Lambda$1;
    }

    public final void IconCompatParcelizer(Object obj) {
        DefaultHeartBeatInfo$$Lambda$1 defaultHeartBeatInfo$$Lambda$1 = this.MediaBrowserCompat$ItemReceiver;
        ((proxyGetICheckDetector.IconCompatParcelizer) obj).read(defaultHeartBeatInfo$$Lambda$1.write, defaultHeartBeatInfo$$Lambda$1.read);
    }
}
