package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import com.scb.phone.view.activity.deeplink.PurchasesPaymentDeepLinkActivity$MediaBrowserCompat$ItemReceiver;
import p040o.CcSofHybridActivity_ViewBinding;
import p040o.GoogleApiManager;

/* renamed from: o.dispatchPopulateAccessibilityEvent */
public final class dispatchPopulateAccessibilityEvent implements OPRStatusRewardsLandingActivity_ViewBinding<CcSofHybridActivity_ViewBinding.read> {
    private final HmlReviewDocumentActivity<zabj> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<PurchasesPaymentDeepLinkActivity$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$CustomActionResultReceiver;
    private final RepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<GoogleApiManager.zab> write;

    private dispatchPopulateAccessibilityEvent(RepositoryModule repositoryModule, HmlReviewDocumentActivity<PurchasesPaymentDeepLinkActivity$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity, HmlReviewDocumentActivity<zabj> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<GoogleApiManager.zab> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = repositoryModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static dispatchPopulateAccessibilityEvent IconCompatParcelizer(RepositoryModule repositoryModule, HmlReviewDocumentActivity<PurchasesPaymentDeepLinkActivity$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity, HmlReviewDocumentActivity<zabj> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<GoogleApiManager.zab> hmlReviewDocumentActivity3) {
        return new dispatchPopulateAccessibilityEvent(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        CcSofHybridActivity_ViewBinding.read read = this.MediaBrowserCompat$ItemReceiver.read(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.IconCompatParcelizer.get(), this.write.get());
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
