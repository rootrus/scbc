package p040o;

import p040o.TypeAdapters;
import p040o.writeUInt64NoTag;

/* renamed from: o.TypeAdapters$10$MediaSessionCompat$QueueItem */
final class TypeAdapters$10$MediaSessionCompat$QueueItem<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopEdgeTearHeight> {
    private /* synthetic */ standardStartAndWait MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ TypeAdapters.C388010 write;

    TypeAdapters$10$MediaSessionCompat$QueueItem(TypeAdapters.C388010 r1, standardStartAndWait standardstartandwait) {
        this.write = r1;
        this.MediaBrowserCompat$CustomActionResultReceiver = standardstartandwait;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getTopEdgeTearHeight gettopedgetearheight = (getTopEdgeTearHeight) obj;
        gettopedgetearheight.aj_();
        gettopedgetearheight.read(this.MediaBrowserCompat$CustomActionResultReceiver);
        gettopedgetearheight.write(!this.write.write.MediaBrowserCompat$CustomActionResultReceiver.setShortcut());
        gettopedgetearheight.MediaBrowserCompat$ItemReceiver(true);
        gettopedgetearheight.MediaBrowserCompat$CustomActionResultReceiver(true);
    }
}
