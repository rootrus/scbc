package p040o;

import p040o.setSheetID;
import p040o.writeUInt64NoTag;

/* renamed from: o.setSheetID$MediaBrowserCompat$ItemReceiver */
final class setSheetID$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<setExtractionType> {
    private /* synthetic */ setSheetID.write read;

    setSheetID$MediaBrowserCompat$ItemReceiver(setSheetID.write write) {
        this.read = write;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((setExtractionType) obj).MediaBrowserCompat$CustomActionResultReceiver(this.read, false);
    }
}
