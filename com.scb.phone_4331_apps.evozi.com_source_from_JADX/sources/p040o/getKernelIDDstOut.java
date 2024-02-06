package p040o;

import android.content.Context;
import p040o.Longs;

/* renamed from: o.getKernelIDDstOut */
public final class getKernelIDDstOut implements OPRStatusRewardsLandingActivity_ViewBinding<getKernelIDDst> {
    private final HmlReviewDocumentActivity<notNull> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<Longs.LongArrayAsList> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<Context> read;
    private final HmlReviewDocumentActivity<createElementSet> write;

    private getKernelIDDstOut(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<createElementSet> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<Longs.LongArrayAsList> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<notNull> hmlReviewDocumentActivity4) {
        this.read = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
        this.IconCompatParcelizer = hmlReviewDocumentActivity4;
    }

    public static getKernelIDDstOut read(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<createElementSet> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<Longs.LongArrayAsList> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<notNull> hmlReviewDocumentActivity4) {
        return new getKernelIDDstOut(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        return new getKernelIDDst(this.read.get(), this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.IconCompatParcelizer.get());
    }
}
