package p040o;

import p040o.access$2300;
import p040o.writeUInt32;
import p040o.writeUInt64NoTag;

/* renamed from: o.IDocumentBaseOverlayView */
public final class IDocumentBaseOverlayView extends writeUInt32<C7135hI> {
    public final isUpperCase IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public IDocumentBaseOverlayView(isUpperCase isuppercase, RegularImmutableBiMap regularImmutableBiMap, performActionWithResponse performactionwithresponse, FileBackedOutputStream fileBackedOutputStream) {
        super(performactionwithresponse, regularImmutableBiMap, fileBackedOutputStream);
        onGetStartedClick.write((Object) isuppercase, "juristicValidatePinCase");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.IconCompatParcelizer = isuppercase;
    }

    /* renamed from: o.IDocumentBaseOverlayView$write */
    public static final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private /* synthetic */ IDocumentBaseOverlayView MediaBrowserCompat$ItemReceiver;

        /* renamed from: o.IDocumentBaseOverlayView$write$write  reason: collision with other inner class name */
        static final class C10810write<V> implements writeUInt64NoTag.IconCompatParcelizer<C7135hI> {
            public static final C10810write read = new C10810write();

            C10810write() {
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((C7135hI) obj).MediaBrowserCompat$MediaItem();
            }
        }

        public write(IDocumentBaseOverlayView iDocumentBaseOverlayView) {
            this.MediaBrowserCompat$ItemReceiver = iDocumentBaseOverlayView;
        }

        public final /* synthetic */ void onNext(Object obj) {
            super.onNext(Boolean.valueOf(((Boolean) obj).booleanValue()));
            IDocumentBaseOverlayView.read(this.MediaBrowserCompat$ItemReceiver);
            IDocumentBaseOverlayView iDocumentBaseOverlayView = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C10810write.read;
            if (iDocumentBaseOverlayView.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(iDocumentBaseOverlayView.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            IDocumentBaseOverlayView.read(this.MediaBrowserCompat$ItemReceiver);
            this.MediaBrowserCompat$ItemReceiver.write();
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        isUpperCase isuppercase = this.IconCompatParcelizer;
        if (!isuppercase.MediaBrowserCompat$MediaItem.isDisposed()) {
            isuppercase.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    public static final /* synthetic */ void read(IDocumentBaseOverlayView iDocumentBaseOverlayView) {
        if (iDocumentBaseOverlayView.RatingCompat != null) {
            iDocumentBaseOverlayView.RatingCompat.aj_();
        }
    }

    public final void write(String str) {
        boolean z = true;
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        writeUInt64NoTag.IconCompatParcelizer iDocumentBaseOverlayView$MediaBrowserCompat$CustomActionResultReceiver = new C9759x557b7aed(str);
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iDocumentBaseOverlayView$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final boolean read() {
        return this.read == writeUInt32.read.NEW;
    }
}
