package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setupButtonBarView */
public final /* synthetic */ class setupButtonBarView implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ parseEventBinaryImage MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ getImageByBitmapId write;

    public /* synthetic */ setupButtonBarView(getImageByBitmapId getimagebybitmapid, parseEventBinaryImage parseeventbinaryimage) {
        this.write = getimagebybitmapid;
        this.MediaBrowserCompat$CustomActionResultReceiver = parseeventbinaryimage;
    }

    public final void IconCompatParcelizer(Object obj) {
        getImageByBitmapId getimagebybitmapid = this.write;
        parseEventBinaryImage parseeventbinaryimage = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getBottomRightCornerHeight) obj).AlertController$RecycleListView();
        newWeakInterner IconCompatParcelizer = newWeakInterner.IconCompatParcelizer();
        IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = getimagebybitmapid.write.MediaDescriptionCompat;
        IconCompatParcelizer.read = parseeventbinaryimage.read;
        IconCompatParcelizer.write = parseeventbinaryimage.MediaBrowserCompat$ItemReceiver;
        IconCompatParcelizer.IconCompatParcelizer = getimagebybitmapid.write.MediaBrowserCompat$MediaItem;
        getimagebybitmapid.read.write(IconCompatParcelizer);
        getimagebybitmapid.read.IconCompatParcelizer(new getImageByBitmapId$MediaBrowserCompat$ItemReceiver(getimagebybitmapid, IconCompatParcelizer, getimagebybitmapid.write));
    }
}
