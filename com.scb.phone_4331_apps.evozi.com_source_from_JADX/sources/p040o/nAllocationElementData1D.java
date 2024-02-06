package p040o;

import java.util.concurrent.Executor;

/* renamed from: o.nAllocationElementData1D */
public final class nAllocationElementData1D implements OPRStatusRewardsLandingActivity_ViewBinding<ZHPR2> {
    private final HmlReviewDocumentActivity<nAllocationRead2D> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<C7507tQ> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CreditCardCaptureModule> read;
    private final HmlReviewDocumentActivity<Executor> write;

    public nAllocationElementData1D(HmlReviewDocumentActivity<Executor> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7507tQ> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<CreditCardCaptureModule> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<nAllocationRead2D> hmlReviewDocumentActivity4) {
        this.write = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity4;
    }

    public final /* synthetic */ Object get() {
        return new ZHPR2(this.write.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
    }
}
