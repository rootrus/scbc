package p040o;

import p040o.Synchronized;
import p040o.writeUInt64NoTag;

/* renamed from: o.qH */
public final /* synthetic */ class C5163qH implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C5166qL MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C5163qH(C5166qL qLVar) {
        this.MediaBrowserCompat$CustomActionResultReceiver = qLVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        C5166qL qLVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        Synchronized.SynchronizedAsMapValues.C38371 r1 = qLVar.MediaBrowserCompat$ItemReceiver;
        String str = qLVar.write.read.MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$ItemReceiver;
        String string = r1.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.deals_buy_purchase_history);
        setCurrentSession write = setCurrentSession.write();
        write.MediaBrowserCompat$MediaItem = string;
        write.MediaMetadataCompat = str;
        ((proxyGetIIdDeserializerKta) obj).MediaBrowserCompat$CustomActionResultReceiver(write);
    }
}
