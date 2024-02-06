package p040o;

import com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule;

/* renamed from: o.isAlive */
public final class isAlive implements OPRStatusRewardsLandingActivity_ViewBinding<nAllocationCreateFromBitmap> {
    private final HmlReviewDocumentActivity<CreditCardCaptureModule_GetIParametersFactory> MediaBrowserCompat$ItemReceiver;

    public isAlive(HmlReviewDocumentActivity<CreditCardCaptureModule_GetIParametersFactory> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public final /* synthetic */ Object get() {
        nAllocationCreateFromBitmap MediaBrowserCompat$CustomActionResultReceiver = SchedulingConfigModule.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.get());
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
