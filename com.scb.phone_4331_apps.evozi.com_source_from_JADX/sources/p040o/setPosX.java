package p040o;

import p040o.StandardTable;

/* renamed from: o.setPosX */
public class setPosX extends writeUInt64NoTag<getMicrAmount$MediaBrowserCompat$CustomActionResultReceiver> {
    public setHintEnabled IconCompatParcelizer;
    /* access modifiers changed from: private */
    public StandardTable.Column.KeySet.C38211 write;

    @HmlPinActivity
    public setPosX(RegularImmutableBiMap regularImmutableBiMap, setHintEnabled sethintenabled, StandardTable.Column.KeySet.C38211 r3) {
        super(regularImmutableBiMap);
        this.write = r3;
        this.IconCompatParcelizer = sethintenabled;
    }

    public void onDestroy() {
        super.onDestroy();
        setHintEnabled sethintenabled = this.IconCompatParcelizer;
        if (!sethintenabled.MediaBrowserCompat$MediaItem.isDisposed()) {
            sethintenabled.MediaBrowserCompat$MediaItem.dispose();
        }
    }
}
