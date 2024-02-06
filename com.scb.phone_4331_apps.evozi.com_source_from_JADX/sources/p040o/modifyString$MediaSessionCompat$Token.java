package p040o;

import p040o.getFirstName;
import p040o.writeUInt64NoTag;

/* renamed from: o.modifyString$MediaSessionCompat$Token */
final class modifyString$MediaSessionCompat$Token<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.IconCompatParcelizer> {
    private /* synthetic */ modifyString MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ isValue MediaBrowserCompat$ItemReceiver;

    modifyString$MediaSessionCompat$Token(modifyString modifystring, isValue isvalue) {
        this.MediaBrowserCompat$CustomActionResultReceiver = modifystring;
        this.MediaBrowserCompat$ItemReceiver = isvalue;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getFirstName.IconCompatParcelizer iconCompatParcelizer = (getFirstName.IconCompatParcelizer) obj;
        if (modifyString.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver.read) > 0.0d) {
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(modifyString.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver.read));
            iconCompatParcelizer.IconCompatParcelizer(1.0f);
            return;
        }
        iconCompatParcelizer.RatingCompat();
    }
}
