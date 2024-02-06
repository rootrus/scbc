package p040o;

import p040o.withKeyValueSeparator;
import p040o.writeUInt64NoTag;

/* renamed from: o.gq */
public final /* synthetic */ class C4708gq implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ isSimulator read;
    private final /* synthetic */ C4746he write;

    public /* synthetic */ C4708gq(C4746he heVar, isSimulator issimulator, int i) {
        this.write = heVar;
        this.read = issimulator;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4746he heVar = this.write;
        isSimulator issimulator = this.read;
        int i = this.MediaBrowserCompat$ItemReceiver;
        tX$MediaBrowserCompat$CustomActionResultReceiver tx_mediabrowsercompat_customactionresultreceiver = (tX$MediaBrowserCompat$CustomActionResultReceiver) obj;
        boolean z = true;
        if (issimulator.MediaBrowserCompat$CustomActionResultReceiver.contains("SHOW_TRAVEL_DETAILS")) {
            tx_mediabrowsercompat_customactionresultreceiver.MediaMetadataCompat();
            if (i == 0) {
                tx_mediabrowsercompat_customactionresultreceiver.write(heVar.MediaBrowserCompat$ItemReceiver);
            } else if (i == 1) {
                tx_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(heVar.MediaBrowserCompat$ItemReceiver);
            } else if (i == 2) {
                tx_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver(heVar.MediaBrowserCompat$ItemReceiver);
            }
        } else {
            String str = issimulator.RatingCompat;
            if (heVar.MediaBrowserCompat$MediaItem.get(str) != null) {
                heVar.MediaBrowserCompat$MediaItem.get(str).clear();
                C4459gQ gQVar = C4459gQ.read;
                if (heVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    gQVar.IconCompatParcelizer(heVar.RatingCompat);
                }
            }
            tx_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver(heVar.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(heVar.read.read, heVar.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat));
            withKeyValueSeparator.IconCompatParcelizer iconCompatParcelizer = heVar.MediaBrowserCompat$SearchResultReceiver.get(issimulator.RatingCompat);
            if (iconCompatParcelizer != null) {
                tx_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(issimulator, iconCompatParcelizer);
            }
        }
    }
}
