package p040o;

import com.scb.phone.data.network.service.CustomerService;
import com.scb.phone.data.p033di.DataModule;

/* renamed from: o.hasFaces */
public final class hasFaces implements OPRStatusRewardsLandingActivity_ViewBinding<eH$MediaBrowserCompat$CustomActionResultReceiver> {
    private final DataModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CustomerService> MediaBrowserCompat$CustomActionResultReceiver;

    private hasFaces(DataModule dataModule, HmlReviewDocumentActivity<CustomerService> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = dataModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static hasFaces MediaBrowserCompat$ItemReceiver(DataModule dataModule, HmlReviewDocumentActivity<CustomerService> hmlReviewDocumentActivity) {
        return new hasFaces(dataModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        eH$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer2 = this.IconCompatParcelizer.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
