package p040o;

import android.net.Uri;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeIsTargetRectangleFilled$MediaBrowserCompat$ItemReceiver */
final class nativeIsTargetRectangleFilled$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<IdExtractor> {
    private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ discardOldLogFiles$MediaBrowserCompat$ItemReceiver read;

    nativeIsTargetRectangleFilled$MediaBrowserCompat$ItemReceiver(String str, discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = discardoldlogfiles_mediabrowsercompat_itemreceiver;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        Uri parse = Uri.parse(this.MediaBrowserCompat$CustomActionResultReceiver);
        onGetStartedClick.IconCompatParcelizer((Object) parse, "Uri.parse(uri)");
        ((IdExtractor) obj).write(parse, this.read);
    }
}
