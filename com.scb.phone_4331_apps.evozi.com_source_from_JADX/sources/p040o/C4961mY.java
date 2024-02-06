package p040o;

import p040o.AppMeasurement;
import p040o.access$2300;

/* renamed from: o.mY */
public class C4961mY extends writeUInt64NoTag<getDocumentFramingError$MediaBrowserCompat$MediaItem> {
    public final AppMeasurement.EventInterceptor IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final TldPatterns MediaBrowserCompat$ItemReceiver;
    public boolean write;

    @HmlPinActivity
    public C4961mY(RegularImmutableBiMap regularImmutableBiMap, TldPatterns tldPatterns, AppMeasurement.EventInterceptor eventInterceptor) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = tldPatterns;
        this.IconCompatParcelizer = eventInterceptor;
    }

    public void onDestroy() {
        super.onDestroy();
        AppMeasurement.EventInterceptor eventInterceptor = this.IconCompatParcelizer;
        if (!eventInterceptor.MediaBrowserCompat$MediaItem.isDisposed()) {
            eventInterceptor.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    /* renamed from: o.mY$IconCompatParcelizer */
    public final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zoomGesturesEnabled> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(C4961mY mYVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            zoomGesturesEnabled zoomgesturesenabled = (zoomGesturesEnabled) obj;
            boolean z = true;
            if (C4961mY.this.RatingCompat != null) {
                getUuidUtf8Bytes write = C4961mY.this.MediaBrowserCompat$ItemReceiver.write(zoomgesturesenabled, C4961mY.this.IconCompatParcelizer.read.MediaBrowserCompat$SearchResultReceiver(), C4961mY.this.IconCompatParcelizer.read.MediaDescriptionCompat());
                C4961mY mYVar = C4961mY.this;
                C10099oo ooVar = new C10099oo(write);
                if (mYVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    ooVar.IconCompatParcelizer(mYVar.RatingCompat);
                }
                C4961mY.MediaBrowserCompat$CustomActionResultReceiver(C4961mY.this);
            }
            C4961mY.this.write = false;
        }

        public final void onError(Throwable th) {
            if (!C4961mY.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                boolean z = true;
                if (C4961mY.this.RatingCompat != null) {
                    C4961mY mYVar = C4961mY.this;
                    mYVar.MediaBrowserCompat$ItemReceiver(mYVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.NAVIGATE_BACK));
                    C4961mY mYVar2 = C4961mY.this;
                    C10090om omVar = new C10090om(this, th);
                    if (mYVar2.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        omVar.IconCompatParcelizer(mYVar2.RatingCompat);
                    }
                }
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C4961mY mYVar) {
        if (mYVar.RatingCompat != null) {
            mYVar.RatingCompat.aj_();
        }
    }
}
