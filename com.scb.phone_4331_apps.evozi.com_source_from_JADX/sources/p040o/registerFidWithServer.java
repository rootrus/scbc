package p040o;

import p040o.setTvRemark;
import p040o.withRegisteredFid;
import p040o.writeUInt64NoTag;

/* renamed from: o.registerFidWithServer */
public final /* synthetic */ class registerFidWithServer implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setTvRemark.read IconCompatParcelizer;
    private final /* synthetic */ withRegisteredFid.read MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ registerFidWithServer(withRegisteredFid.read read, setTvRemark.read read2) {
        this.MediaBrowserCompat$ItemReceiver = read;
        this.IconCompatParcelizer = read2;
    }

    public final void IconCompatParcelizer(Object obj) {
        withRegisteredFid.read read = this.MediaBrowserCompat$ItemReceiver;
        ((proxyGetICheckDeserializerRtti$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$ItemReceiver(withRegisteredFid.this.f2976x50fd9e4a.MediaBrowserCompat$ItemReceiver(withRegisteredFid.this.write, withRegisteredFid.this.MediaSessionCompat$ResultReceiverWrapper, read.IconCompatParcelizer, this.IconCompatParcelizer, withRegisteredFid.this.MediaBrowserCompat$ItemReceiver.read.setItemInvoker()));
    }
}
