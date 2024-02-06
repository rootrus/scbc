package p040o;

import p040o.getFirstName;
import p040o.writeUInt64NoTag;

/* renamed from: o.modifyString$MediaBrowserCompat$SearchResultReceiver */
final class modifyString$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.IconCompatParcelizer> {
    private /* synthetic */ modifyString IconCompatParcelizer;
    private /* synthetic */ isValue write;

    modifyString$MediaBrowserCompat$SearchResultReceiver(modifyString modifystring, isValue isvalue) {
        this.IconCompatParcelizer = modifystring;
        this.write = isvalue;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getFirstName.IconCompatParcelizer iconCompatParcelizer = (getFirstName.IconCompatParcelizer) obj;
        iconCompatParcelizer.IconCompatParcelizer(this.write.MediaBrowserCompat$CustomActionResultReceiver);
        iconCompatParcelizer.MediaMetadataCompat(this.write.MediaBrowserCompat$CustomActionResultReceiver);
        String str = this.write.MediaBrowserCompat$CustomActionResultReceiver;
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(!(str == null || str.equals("")));
        iconCompatParcelizer.read(this.write.MediaBrowserCompat$MediaItem);
        iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver();
        modifyString.read(this.IconCompatParcelizer, this.write);
    }
}
