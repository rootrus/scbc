package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.getSerializeNulls */
public final /* synthetic */ class getSerializeNulls implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getSerializeNulls(List list) {
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        List list = this.MediaBrowserCompat$ItemReceiver;
        C1423x2520faf1 proxygetiiddeserializerondevice_mediabrowsercompat_customactionresultreceiver = (C1423x2520faf1) obj;
        proxygetiiddeserializerondevice_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver((List<Lazy>) list);
        proxygetiiddeserializerondevice_mediabrowsercompat_customactionresultreceiver.write((Lazy) list.get(0));
    }
}
