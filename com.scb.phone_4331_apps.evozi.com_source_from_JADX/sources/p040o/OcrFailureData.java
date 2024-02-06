package p040o;

import com.scb.phone.domain.errors.RetrofitException;

/* renamed from: o.OcrFailureData */
public class OcrFailureData extends writeUInt64NoTag<getDocumentState> {
    public final NativeFaceDetectorV2Impl write;

    @HmlPinActivity
    public OcrFailureData(RegularImmutableBiMap regularImmutableBiMap, NativeFaceDetectorV2Impl nativeFaceDetectorV2Impl) {
        super(regularImmutableBiMap);
        this.write = nativeFaceDetectorV2Impl;
    }

    public void onDestroy() {
        super.onDestroy();
        NativeFaceDetectorV2Impl nativeFaceDetectorV2Impl = this.write;
        if (!nativeFaceDetectorV2Impl.MediaBrowserCompat$MediaItem.isDisposed()) {
            nativeFaceDetectorV2Impl.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    /* renamed from: o.OcrFailureData$write */
    public class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private write() {
        }

        public /* synthetic */ write(OcrFailureData ocrFailureData, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            Boolean bool = (Boolean) obj;
            super.onNext(bool);
            if (bool.booleanValue()) {
                OcrFailureData ocrFailureData = OcrFailureData.this;
                writeTiffImage writetiffimage = writeTiffImage.read;
                if (ocrFailureData.RatingCompat != null) {
                    writetiffimage.IconCompatParcelizer(ocrFailureData.RatingCompat);
                }
            }
        }

        static /* synthetic */ void read(getDocumentState getdocumentstate) {
            getdocumentstate.aj_();
            getdocumentstate.mo13720K_();
        }

        public final void onError(Throwable th) {
            super.onError(th);
            OcrFailureData.MediaBrowserCompat$CustomActionResultReceiver(OcrFailureData.this);
            boolean z = false;
            if (th instanceof RetrofitException ? ((RetrofitException) th).write.equals(RetrofitException.read.SESSION_EXPIRED) : false) {
                OcrFailureData ocrFailureData = OcrFailureData.this;
                setQuickAnalysisMode setquickanalysismode = setQuickAnalysisMode.MediaBrowserCompat$CustomActionResultReceiver;
                if (ocrFailureData.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    setquickanalysismode.IconCompatParcelizer(ocrFailureData.RatingCompat);
                    return;
                }
                return;
            }
            OcrFailureData ocrFailureData2 = OcrFailureData.this;
            setImageRep setimagerep = new setImageRep(this, th);
            if (ocrFailureData2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                setimagerep.IconCompatParcelizer(ocrFailureData2.RatingCompat);
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(OcrFailureData ocrFailureData) {
        if (ocrFailureData.RatingCompat != null) {
            ocrFailureData.RatingCompat.aj_();
        }
    }
}
