package p040o;

import android.net.Uri;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeIsTargetRectangleFilled$MediaBrowserCompat$CustomActionResultReceiver */
final class C5039x7434a30c<V> implements writeUInt64NoTag.IconCompatParcelizer<IdExtractor> {
    private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ discardOldLogFiles$MediaBrowserCompat$ItemReceiver read;

    C5039x7434a30c(String str, discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = discardoldlogfiles_mediabrowsercompat_itemreceiver;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        Uri parse = Uri.parse(this.MediaBrowserCompat$CustomActionResultReceiver);
        onGetStartedClick.IconCompatParcelizer((Object) parse, "Uri.parse(uri)");
        ((IdExtractor) obj).MediaBrowserCompat$CustomActionResultReceiver(parse, this.read);
    }
}
