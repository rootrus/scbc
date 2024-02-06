package p040o;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule;

/* renamed from: o.nAllocationCreateBitmapBackedAllocation */
public final class nAllocationCreateBitmapBackedAllocation implements OPRStatusRewardsLandingActivity_ViewBinding<CreditCardCaptureModule> {
    private final HmlReviewDocumentActivity<nAllocationCreateFromBitmap> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CreditCardCaptureModule_GetIParametersFactory> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<Context> read;
    private final HmlReviewDocumentActivity<C7507tQ> write;

    public nAllocationCreateBitmapBackedAllocation(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7507tQ> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<nAllocationCreateFromBitmap> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<CreditCardCaptureModule_GetIParametersFactory> hmlReviewDocumentActivity4) {
        this.read = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity4;
    }

    public final /* synthetic */ Object get() {
        CreditCardCaptureModule IconCompatParcelizer2 = SchedulingModule.IconCompatParcelizer(this.read.get(), this.write.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
