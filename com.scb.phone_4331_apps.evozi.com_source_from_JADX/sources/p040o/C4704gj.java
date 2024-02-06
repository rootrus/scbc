package p040o;

import java.util.List;
import p040o.C7513tX;
import p040o.writeUInt64NoTag;

/* renamed from: o.gj */
public final /* synthetic */ class C4704gj implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C4704gj(List list) {
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        List list = this.MediaBrowserCompat$ItemReceiver;
        tX$MediaBrowserCompat$CustomActionResultReceiver tx_mediabrowsercompat_customactionresultreceiver = (tX$MediaBrowserCompat$CustomActionResultReceiver) obj;
        tx_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver();
        tx_mediabrowsercompat_customactionresultreceiver.write();
        tx_mediabrowsercompat_customactionresultreceiver.read((List<C7513tX.IconCompatParcelizer>) list);
    }
}
