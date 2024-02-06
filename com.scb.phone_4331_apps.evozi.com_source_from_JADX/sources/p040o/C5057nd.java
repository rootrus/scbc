package p040o;

import p040o.ImmutableSortedMap;

/* renamed from: o.nd */
public class C5057nd extends writeUInt64NoTag<getImageFocusScore> {
    private final update write;

    @HmlPinActivity
    public C5057nd(update update, RegularImmutableBiMap regularImmutableBiMap) {
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

    /* renamed from: o.nd$IconCompatParcelizer */
    class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(C5057nd ndVar, byte b) {
            this();
        }

        public final void onError(Throwable th) {
            if (!C5057nd.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                C5057nd.this.MediaBrowserCompat$ItemReceiver(C5057nd.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new C10116qg(this)));
            }
        }

        public final /* synthetic */ void onNext(Object obj) {
            C5057nd.write(C5057nd.this);
            C5057nd ndVar = C5057nd.this;
            C10117qj qjVar = C10117qj.write;
            if (ndVar.RatingCompat != null) {
                qjVar.IconCompatParcelizer(ndVar.RatingCompat);
            }
        }
    }

    static /* synthetic */ void write(C5057nd ndVar) {
        if (ndVar.RatingCompat != null) {
            ndVar.RatingCompat.aj_();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.write.IconCompatParcelizer(new ImmutableSortedMap.Values(str, str2));
        this.write.IconCompatParcelizer(new IconCompatParcelizer(this, (byte) 0));
    }
}
