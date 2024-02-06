package p040o;

import p040o.Ints;
import p040o.Longs;

/* renamed from: o.showTextMessage */
public class showTextMessage extends writeUInt64NoTag<C6398x266504ee> {
    /* access modifiers changed from: private */
    public final Ints.IntArrayAsList IconCompatParcelizer;
    public final SquareCap MediaBrowserCompat$ItemReceiver;
    final Longs.LexicographicalComparator read;

    @HmlPinActivity
    public showTextMessage(SquareCap squareCap, Ints.IntArrayAsList intArrayAsList, RegularImmutableBiMap regularImmutableBiMap, Longs.LexicographicalComparator lexicographicalComparator) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = squareCap;
        this.IconCompatParcelizer = intArrayAsList;
        this.read = lexicographicalComparator;
    }

    /* renamed from: o.showTextMessage$IconCompatParcelizer */
    public class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<onStreetViewPanoramaCameraChange> {
        public final void onComplete() {
        }

        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(showTextMessage showtextmessage, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            showTextMessage.read(showTextMessage.this);
            showTextMessage showtextmessage = showTextMessage.this;
            C4735hV hVVar = new C4735hV(this, (onStreetViewPanoramaCameraChange) obj);
            if (showtextmessage.RatingCompat != null) {
                hVVar.IconCompatParcelizer(showtextmessage.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            showTextMessage.this.MediaBrowserCompat$ItemReceiver(showTextMessage.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new C4737hX(this)));
        }
    }

    static /* synthetic */ void read(showTextMessage showtextmessage) {
        if (showtextmessage.RatingCompat != null) {
            showtextmessage.RatingCompat.aj_();
        }
    }
}
