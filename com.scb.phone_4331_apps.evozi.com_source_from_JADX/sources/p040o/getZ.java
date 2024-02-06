package p040o;

import com.scb.phone.data.network.service.DepositService;
import com.scb.phone.data.p033di.DataModule;
import p040o.C4773hl;

/* renamed from: o.getZ */
public final class getZ implements OPRStatusRewardsLandingActivity_ViewBinding<C4773hl.read> {
    private final DataModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<DepositService> MediaBrowserCompat$CustomActionResultReceiver;

    private getZ(DataModule dataModule, HmlReviewDocumentActivity<DepositService> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = dataModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static getZ write(DataModule dataModule, HmlReviewDocumentActivity<DepositService> hmlReviewDocumentActivity) {
        return new getZ(dataModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        C4773hl.read write = this.IconCompatParcelizer.write(this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (write != null) {
            return write;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
