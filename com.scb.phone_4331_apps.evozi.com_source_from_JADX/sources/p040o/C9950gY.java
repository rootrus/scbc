package p040o;

import java.util.List;
import p040o.C7513tX;
import p040o.writeUInt64NoTag;

/* renamed from: o.gY */
public final /* synthetic */ class C9950gY implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4746he MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ List write;

    public /* synthetic */ C9950gY(C4746he heVar, List list) {
        this.MediaBrowserCompat$ItemReceiver = heVar;
        this.write = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4746he heVar = this.MediaBrowserCompat$ItemReceiver;
        List list = this.write;
        tX$MediaBrowserCompat$CustomActionResultReceiver tx_mediabrowsercompat_customactionresultreceiver = (tX$MediaBrowserCompat$CustomActionResultReceiver) obj;
        tx_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$MediaItem(heVar.MediaBrowserCompat$ItemReceiver);
        tx_mediabrowsercompat_customactionresultreceiver.read((List<C7513tX.IconCompatParcelizer>) list);
    }
}
