package p040o;

import p040o.DefaultHeartBeatInfo;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.TransportRegistrar$$Lambda$1 */
public final /* synthetic */ class TransportRegistrar$$Lambda$1 implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ DefaultHeartBeatInfo.IconCompatParcelizer IconCompatParcelizer;
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ TransportRegistrar$$Lambda$1(DefaultHeartBeatInfo.IconCompatParcelizer iconCompatParcelizer, Throwable th) {
        this.IconCompatParcelizer = iconCompatParcelizer;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        DefaultHeartBeatInfo.IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
        DefaultHeartBeatInfo.this.MediaBrowserCompat$ItemReceiver(DefaultHeartBeatInfo.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, access$2300.write.JUST_DISMISS));
    }
}
