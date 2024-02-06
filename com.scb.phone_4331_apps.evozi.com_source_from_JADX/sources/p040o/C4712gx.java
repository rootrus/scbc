package p040o;

import java.util.List;
import p040o.C7513tX;
import p040o.withKeyValueSeparator;
import p040o.writeUInt64NoTag;

/* renamed from: o.gx */
public final /* synthetic */ class C4712gx implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List IconCompatParcelizer;
    private final /* synthetic */ C4746he MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ withKeyValueSeparator.IconCompatParcelizer read;

    public /* synthetic */ C4712gx(C4746he heVar, List list, withKeyValueSeparator.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = heVar;
        this.IconCompatParcelizer = list;
        this.read = iconCompatParcelizer;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4746he heVar = this.MediaBrowserCompat$ItemReceiver;
        List list = this.IconCompatParcelizer;
        withKeyValueSeparator.IconCompatParcelizer iconCompatParcelizer = this.read;
        tX$MediaBrowserCompat$CustomActionResultReceiver tx_mediabrowsercompat_customactionresultreceiver = (tX$MediaBrowserCompat$CustomActionResultReceiver) obj;
        tx_mediabrowsercompat_customactionresultreceiver.read((List<C7513tX.IconCompatParcelizer>) list);
        tx_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(heVar.MediaBrowserCompat$ItemReceiver, iconCompatParcelizer);
    }
}
