package p040o;

import p040o.StandardTable;
import p040o.access$2300;

/* renamed from: o.getCenterMessage */
public class getCenterMessage extends writeUInt64NoTag<IImageProcessor> {
    public C4131c MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public StandardTable.ColumnMap read;
    /* access modifiers changed from: private */
    public getEulerY write;

    @HmlPinActivity
    public getCenterMessage(C4131c cVar, getEulerY geteulery, StandardTable.ColumnMap columnMap, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = cVar;
        this.write = geteulery;
        this.read = columnMap;
    }

    public void onDestroy() {
        super.onDestroy();
        C4131c cVar = this.MediaBrowserCompat$ItemReceiver;
        if (!cVar.MediaBrowserCompat$MediaItem.isDisposed()) {
            cVar.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    /* renamed from: o.getCenterMessage$IconCompatParcelizer */
    public class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getAutocompletePredictions> {
        public IconCompatParcelizer() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            getAutocompletePredictions getautocompletepredictions = (getAutocompletePredictions) obj;
            getCenterMessage.MediaBrowserCompat$ItemReceiver(getCenterMessage.this);
            boolean z = true;
            processNativeSessions IconCompatParcelizer = getCenterMessage.this.read.IconCompatParcelizer(getautocompletepredictions, getCenterMessage.this.write.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView().MediaSessionCompat$ResultReceiverWrapper > 0);
            getCenterMessage getcentermessage = getCenterMessage.this;
            getPageShortEdgeThreshold getpageshortedgethreshold = new getPageShortEdgeThreshold(IconCompatParcelizer);
            if (getcentermessage.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getpageshortedgethreshold.IconCompatParcelizer(getcentermessage.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            getCenterMessage.this.MediaBrowserCompat$ItemReceiver(getCenterMessage.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getCenterMessage getcentermessage) {
        if (getcentermessage.RatingCompat != null) {
            getcentermessage.RatingCompat.aj_();
        }
    }
}
