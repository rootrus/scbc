package p040o;

import p040o.Floats;
import p040o.access$2300;
import p040o.getTopLeftCornerWidth;

/* renamed from: o.showIndicators */
public abstract class showIndicators extends writeUInt64NoTag<getTopLeftCornerWidth.AppCompatActivity> {
    protected boolean MediaBrowserCompat$ItemReceiver;
    protected Floats.LexicographicalComparator read;
    protected SquareCap write;

    public showIndicators(RegularImmutableBiMap regularImmutableBiMap, SquareCap squareCap, Floats.LexicographicalComparator lexicographicalComparator) {
        super(regularImmutableBiMap);
        this.write = squareCap;
        this.read = lexicographicalComparator;
    }

    /* renamed from: o.showIndicators$IconCompatParcelizer */
    public final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setZoomGesturesEnabled> {
        private setUuidFromUtf8Bytes MediaBrowserCompat$ItemReceiver;

        public final void onComplete() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            setZoomGesturesEnabled setzoomgesturesenabled = (setZoomGesturesEnabled) obj;
            boolean z = true;
            if (showIndicators.this.RatingCompat != null) {
                showIndicators showindicators = showIndicators.this;
                C10003hQ hQVar = new C10003hQ(this, setzoomgesturesenabled);
                if (showindicators.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    hQVar.IconCompatParcelizer(showindicators.RatingCompat);
                }
            }
            showIndicators.this.MediaBrowserCompat$ItemReceiver = false;
        }

        public IconCompatParcelizer(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
            this.MediaBrowserCompat$ItemReceiver = setuuidfromutf8bytes;
        }

        public final void onError(Throwable th) {
            showIndicators showindicators = showIndicators.this;
            showindicators.MediaBrowserCompat$ItemReceiver(showindicators.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.NAVIGATE_BACK));
            showIndicators.this.MediaBrowserCompat$ItemReceiver = false;
        }

        public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(setZoomGesturesEnabled setzoomgesturesenabled, getTopLeftCornerWidth.AppCompatActivity appCompatActivity) {
            appCompatActivity.IconCompatParcelizer(showIndicators.this.read.IconCompatParcelizer(setzoomgesturesenabled, this.MediaBrowserCompat$ItemReceiver));
        }
    }
}
