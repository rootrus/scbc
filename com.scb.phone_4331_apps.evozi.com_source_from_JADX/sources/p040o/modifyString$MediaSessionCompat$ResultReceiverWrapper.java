package p040o;

import p040o.getFirstName;
import p040o.writeUInt64NoTag;

/* renamed from: o.modifyString$MediaSessionCompat$ResultReceiverWrapper */
final class modifyString$MediaSessionCompat$ResultReceiverWrapper<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.IconCompatParcelizer> {
    private /* synthetic */ boolean write;

    modifyString$MediaSessionCompat$ResultReceiverWrapper(boolean z) {
        this.write = z;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getFirstName.IconCompatParcelizer iconCompatParcelizer = (getFirstName.IconCompatParcelizer) obj;
        iconCompatParcelizer.aj_();
        iconCompatParcelizer.IconCompatParcelizer();
        if (this.write) {
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        } else {
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        }
    }
}
