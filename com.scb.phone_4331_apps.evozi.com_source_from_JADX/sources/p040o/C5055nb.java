package p040o;

import p040o.proxyGetICheckDeserializerRtti;

/* renamed from: o.nb */
public class C5055nb extends writeUInt64NoTag<proxyGetICheckDeserializerRtti.ParcelableVolumeInfo> {
    public final update write;

    @HmlPinActivity
    public C5055nb(RegularImmutableBiMap regularImmutableBiMap, update update) {
        super(regularImmutableBiMap);
        this.write = update;
    }

    public void onDestroy() {
        super.onDestroy();
        update update = this.write;
        if (!update.MediaBrowserCompat$MediaItem.isDisposed()) {
            update.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    /* renamed from: o.nb$IconCompatParcelizer */
    public class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(C5055nb nbVar, byte b) {
            this();
        }

        public final void onError(Throwable th) {
            if (!C5055nb.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                C5055nb.this.MediaBrowserCompat$ItemReceiver(C5055nb.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new C10113qc(this)));
            }
        }

        public final /* synthetic */ void onNext(Object obj) {
            C5055nb.MediaBrowserCompat$ItemReceiver(C5055nb.this);
            C5055nb nbVar = C5055nb.this;
            C10114qd qdVar = C10114qd.MediaBrowserCompat$CustomActionResultReceiver;
            if (nbVar.RatingCompat != null) {
                qdVar.IconCompatParcelizer(nbVar.RatingCompat);
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(C5055nb nbVar) {
        if (nbVar.RatingCompat != null) {
            nbVar.RatingCompat.aj_();
        }
    }
}
