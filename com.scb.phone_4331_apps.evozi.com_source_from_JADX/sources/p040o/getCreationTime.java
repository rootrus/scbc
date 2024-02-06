package p040o;

import android.graphics.Bitmap;
import p040o.IIdExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.getCreationTime */
public final /* synthetic */ class getCreationTime implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPropTypeDescrip MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ scrollBy MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ Bitmap write;

    public /* synthetic */ getCreationTime(getPropTypeDescrip getproptypedescrip, Bitmap bitmap, scrollBy scrollby) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getproptypedescrip;
        this.write = bitmap;
        this.MediaBrowserCompat$ItemReceiver = scrollby;
    }

    public final void IconCompatParcelizer(Object obj) {
        getPropTypeDescrip getproptypedescrip = this.MediaBrowserCompat$CustomActionResultReceiver;
        Bitmap bitmap = this.write;
        scrollBy scrollby = this.MediaBrowserCompat$ItemReceiver;
        IIdExtractor.write write2 = (IIdExtractor.write) obj;
        write2.read(bitmap);
        write2.write((String) null);
        write2.MediaBrowserCompat$SearchResultReceiver((String) null);
        write2.MediaBrowserCompat$CustomActionResultReceiver(true);
        if (getproptypedescrip.write.MediaBrowserCompat$MediaItem() && scrollby.MediaBrowserCompat$CustomActionResultReceiver != null) {
            write2.read(scrollby.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }
}
