package p040o;

import p040o.writeUInt64NoTag;
import p040o.zziu;

/* renamed from: o.setSheetID$MediaSessionCompat$QueueItem */
public final class setSheetID$MediaSessionCompat$QueueItem<V> implements writeUInt64NoTag.IconCompatParcelizer<setExtractionType> {
    private /* synthetic */ setSheetID IconCompatParcelizer;
    private /* synthetic */ zziu.zzc write;

    public setSheetID$MediaSessionCompat$QueueItem(setSheetID setsheetid, zziu.zzc zzc) {
        this.IconCompatParcelizer = setsheetid;
        this.write = zzc;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        setExtractionType setextractiontype = (setExtractionType) obj;
        setextractiontype.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver(this.write));
        setextractiontype.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaDescriptionCompat);
    }
}
