package p040o;

import p040o.access$2300;

/* renamed from: o.getRow */
public class getRow extends writeUInt64NoTag<IdCaptureModule_GetIJsonExactionHelperKtaFactory> {
    public final addOnFailureListener write;

    @HmlPinActivity
    public getRow(RegularImmutableBiMap regularImmutableBiMap, addOnFailureListener addonfailurelistener) {
        super(regularImmutableBiMap);
        this.write = addonfailurelistener;
    }

    /* renamed from: o.getRow$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<String> {
        private read() {
        }

        public /* synthetic */ read(getRow getrow, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            getRow getrow = getRow.this;
            nativeGetPage nativegetpage = new nativeGetPage((String) obj);
            if (getrow.RatingCompat != null) {
                nativegetpage.IconCompatParcelizer(getrow.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            if (!getRow.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                getRow.this.MediaBrowserCompat$ItemReceiver(getRow.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
            }
        }
    }

    public void onDestroy() {
        addOnFailureListener addonfailurelistener = this.write;
        if (!addonfailurelistener.MediaBrowserCompat$MediaItem.isDisposed()) {
            addonfailurelistener.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }
}
