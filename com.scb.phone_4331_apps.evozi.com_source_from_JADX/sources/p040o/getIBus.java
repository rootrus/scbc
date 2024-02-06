package p040o;

import p040o.KtaJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.getIBus */
public final /* synthetic */ class getIBus implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4178cf read;

    public /* synthetic */ getIBus(C4178cf cfVar) {
        this.read = cfVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4178cf cfVar = this.read;
        ((KtaJsonCheck.write) obj).write(cfVar.MediaBrowserCompat$ItemReceiver, cfVar.write);
    }
}
