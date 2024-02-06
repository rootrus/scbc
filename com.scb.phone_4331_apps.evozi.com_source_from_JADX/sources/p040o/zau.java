package p040o;

import com.scb.phone.data.network.service.BulkTransferService;
import p040o.C4093bd;

/* renamed from: o.zau */
public final class zau implements OPRStatusRewardsLandingActivity_ViewBinding<C4093bd.write> {
    private final HmlReviewDocumentActivity<BulkTransferService> MediaBrowserCompat$ItemReceiver;

    private zau(HmlReviewDocumentActivity<BulkTransferService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static zau write(HmlReviewDocumentActivity<BulkTransferService> hmlReviewDocumentActivity) {
        return new zau(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new C4093bd.write(this.MediaBrowserCompat$ItemReceiver.get());
    }
}
