package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nativeIsTargetRectangleFilled$MediaBrowserCompat$MediaItem */
final class nativeIsTargetRectangleFilled$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<IdExtractor> {
    private /* synthetic */ nativeIsTargetRectangleFilled IconCompatParcelizer;
    private /* synthetic */ discardOldLogFiles$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;

    nativeIsTargetRectangleFilled$MediaBrowserCompat$MediaItem(nativeIsTargetRectangleFilled nativeistargetrectanglefilled, discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        this.IconCompatParcelizer = nativeistargetrectanglefilled;
        this.MediaBrowserCompat$CustomActionResultReceiver = discardoldlogfiles_mediabrowsercompat_itemreceiver;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        IdExtractor idExtractor = (IdExtractor) obj;
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver || this.IconCompatParcelizer.read.write.setShortcut()) {
            idExtractor.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        } else {
            idExtractor.setCheckable();
        }
    }
}
