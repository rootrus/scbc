package p040o;

import p040o.Suppliers;
import p040o.writeUInt64NoTag;

/* renamed from: o.OcrParameters */
public class OcrParameters extends C4353eU<getMRZ1> {
    public final supplierFunction IconCompatParcelizer;
    public final Suppliers.MemoizingSupplier MediaBrowserCompat$ItemReceiver;
    public final Suppliers read;
    public final ChequeInquiryDeepLinkActivity write = new ChequeInquiryDeepLinkActivity();

    /* renamed from: o.OcrParameters$Font */
    public final /* synthetic */ class Font implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ Font write = new Font();

        private /* synthetic */ Font() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getExtractionType) obj).MediaBrowserCompat$MediaItem();
        }
    }

    @HmlPinActivity
    public OcrParameters(RegularImmutableBiMap regularImmutableBiMap, TaskCompletionSource$MediaBrowserCompat$ItemReceiver taskCompletionSource$MediaBrowserCompat$ItemReceiver, initDetectorJni initdetectorjni, trackSingleFaceJni tracksinglefacejni, finalizeDetectorJni finalizedetectorjni, NativeFaceDetectorV2Creator nativeFaceDetectorV2Creator, Suppliers suppliers, supplierFunction supplierfunction, Suppliers.MemoizingSupplier memoizingSupplier) {
        super(regularImmutableBiMap, taskCompletionSource$MediaBrowserCompat$ItemReceiver, initdetectorjni, tracksinglefacejni, finalizedetectorjni, nativeFaceDetectorV2Creator);
        this.read = suppliers;
        this.IconCompatParcelizer = supplierfunction;
        this.MediaBrowserCompat$ItemReceiver = memoizingSupplier;
    }

    public void onDestroy() {
        this.write.dispose();
        super.onDestroy();
    }

    static /* synthetic */ void IconCompatParcelizer(OcrParameters ocrParameters) {
        if (ocrParameters.RatingCompat != null) {
            ocrParameters.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void read(OcrParameters ocrParameters) {
        if (ocrParameters.RatingCompat != null) {
            ocrParameters.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(OcrParameters ocrParameters) {
        if (ocrParameters.RatingCompat != null) {
            ocrParameters.RatingCompat.aj_();
        }
    }
}
