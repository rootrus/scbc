package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.TransferService;

/* renamed from: o.disableCallbacks */
public final class disableCallbacks implements OPRStatusRewardsLandingActivity_ViewBinding<TransferService> {
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$CustomActionResultReceiver;
    private final ServiceModule read;

    private disableCallbacks(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.read = serviceModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static disableCallbacks MediaBrowserCompat$ItemReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new disableCallbacks(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        TransferService customSelectionActionModeCallback = this.read.setCustomSelectionActionModeCallback(this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (customSelectionActionModeCallback != null) {
            return customSelectionActionModeCallback;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
