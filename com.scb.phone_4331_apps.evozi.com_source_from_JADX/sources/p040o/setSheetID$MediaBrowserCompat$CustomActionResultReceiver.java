package p040o;

import p040o.setSheetID;
import p040o.writeUInt64NoTag;

/* renamed from: o.setSheetID$MediaBrowserCompat$CustomActionResultReceiver */
final class setSheetID$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<setExtractionType> {
    private /* synthetic */ setSheetID.write IconCompatParcelizer;

    setSheetID$MediaBrowserCompat$CustomActionResultReceiver(setSheetID.write write) {
        this.IconCompatParcelizer = write;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((setExtractionType) obj).MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
    }
}
