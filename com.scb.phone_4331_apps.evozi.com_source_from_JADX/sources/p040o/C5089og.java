package p040o;

import p040o.getDocumentFramingError;
import p040o.writeUInt64NoTag;

/* renamed from: o.og */
public final /* synthetic */ class C5089og implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ onExitAmbient MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ mX$MediaBrowserCompat$ItemReceiver write;

    public /* synthetic */ C5089og(mX$MediaBrowserCompat$ItemReceiver mx_mediabrowsercompat_itemreceiver, onExitAmbient onexitambient) {
        this.write = mx_mediabrowsercompat_itemreceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = onexitambient;
    }

    public final void IconCompatParcelizer(Object obj) {
        mX$MediaBrowserCompat$ItemReceiver mx_mediabrowsercompat_itemreceiver = this.write;
        onExitAmbient onexitambient = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getDocumentFramingError.read) obj).write(false, constrainedSortedSetMultimap.MediaBrowserCompat$ItemReceiver(onexitambient.read, new constrainedMap(mx_mediabrowsercompat_itemreceiver.write.IconCompatParcelizer, mx_mediabrowsercompat_itemreceiver.write.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.setItemInvoker())), onexitambient.write);
    }
}
