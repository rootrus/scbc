package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.go */
public final /* synthetic */ class C4706go implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4746he write;

    public /* synthetic */ C4706go(C4746he heVar) {
        this.write = heVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4746he heVar = this.write;
        tX$MediaBrowserCompat$CustomActionResultReceiver tx_mediabrowsercompat_customactionresultreceiver = (tX$MediaBrowserCompat$CustomActionResultReceiver) obj;
        tx_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver(heVar.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(heVar.read.read, heVar.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat));
        tx_mediabrowsercompat_customactionresultreceiver.write(heVar.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem);
    }
}
