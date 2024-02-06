package p040o;

import com.scb.phone.domain.errors.RetrofitException;

/* renamed from: o.nativeClassify$MediaBrowserCompat$ItemReceiver */
public class nativeClassify$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<clearTileCache> {
    final /* synthetic */ nativeClassify write;

    private nativeClassify$MediaBrowserCompat$ItemReceiver(nativeClassify nativeclassify) {
        this.write = nativeclassify;
    }

    public /* synthetic */ nativeClassify$MediaBrowserCompat$ItemReceiver(nativeClassify nativeclassify, byte b) {
        this(nativeclassify);
    }

    public final void onError(Throwable th) {
        nativeClassify.IconCompatParcelizer(this.write);
        boolean z = false;
        if (removeIfFromRandomAccessList.IconCompatParcelizer(th, RetrofitException.read.OTP_FAILED, RetrofitException.read.OTP_REACH_MAX_LIMIT, RetrofitException.read.OTP_EXPIRED)) {
            nativeClassify nativeclassify = this.write;
            DocumentConsolidator documentConsolidator = new DocumentConsolidator(this, th);
            if (nativeclassify.RatingCompat != null) {
                z = true;
            }
            if (z) {
                documentConsolidator.IconCompatParcelizer(nativeclassify.RatingCompat);
            }
        } else if (!this.write.MediaBrowserCompat$SearchResultReceiver(th)) {
            nativeClassify nativeclassify2 = this.write;
            nativeMergeFields nativemergefields = new nativeMergeFields(this, th);
            if (nativeclassify2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                nativemergefields.IconCompatParcelizer(nativeclassify2.RatingCompat);
            }
        }
        boolean unused = this.write.write = false;
    }

    public final /* synthetic */ void onNext(Object obj) {
        nativeClassify.MediaBrowserCompat$CustomActionResultReceiver(this.write);
        nativeClassify nativeclassify = this.write;
        Serializer serializer = Serializer.write;
        if (nativeclassify.RatingCompat != null) {
            serializer.IconCompatParcelizer(nativeclassify.RatingCompat);
        }
        boolean unused = this.write.write = false;
    }
}
