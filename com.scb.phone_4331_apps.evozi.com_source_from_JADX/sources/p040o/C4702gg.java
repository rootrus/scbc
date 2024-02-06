package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.gg */
public final /* synthetic */ class C4702gg implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4746he read;

    public /* synthetic */ C4702gg(C4746he heVar) {
        this.read = heVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4746he heVar = this.read;
        tX$MediaBrowserCompat$CustomActionResultReceiver tx_mediabrowsercompat_customactionresultreceiver = (tX$MediaBrowserCompat$CustomActionResultReceiver) obj;
        tx_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver(heVar.write);
        if (heVar.write.MediaBrowserCompat$CustomActionResultReceiver != null && heVar.write.MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
            tx_mediabrowsercompat_customactionresultreceiver.read();
        }
    }
}
