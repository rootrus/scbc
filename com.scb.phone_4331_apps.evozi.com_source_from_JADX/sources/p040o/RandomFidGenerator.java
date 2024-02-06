package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.RandomFidGenerator */
public final /* synthetic */ class RandomFidGenerator implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getFid$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer;
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ RandomFidGenerator(getFid$MediaBrowserCompat$CustomActionResultReceiver getfid_mediabrowsercompat_customactionresultreceiver, List list) {
        this.IconCompatParcelizer = getfid_mediabrowsercompat_customactionresultreceiver;
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        getFid$MediaBrowserCompat$CustomActionResultReceiver getfid_mediabrowsercompat_customactionresultreceiver = this.IconCompatParcelizer;
        ((proxyGetICheckDeserializerRtti$MediaBrowserCompat$MediaItem) obj).read(getfid_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer.write.read(this.MediaBrowserCompat$ItemReceiver));
    }
}
