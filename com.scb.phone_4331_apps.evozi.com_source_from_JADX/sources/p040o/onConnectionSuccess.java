package p040o;

import com.scb.phone.data.network.p034di.easycash.EasycashServiceModule;
import com.scb.phone.data.network.service.easycash.EasyCashDFWYNService;

/* renamed from: o.onConnectionSuccess */
public final class onConnectionSuccess implements OPRStatusRewardsLandingActivity_ViewBinding<EasyCashDFWYNService> {
    private final EasycashServiceModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<zaaa> write;

    private onConnectionSuccess(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = easycashServiceModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static onConnectionSuccess MediaBrowserCompat$ItemReceiver(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new onConnectionSuccess(easycashServiceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        EasyCashDFWYNService IconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.write.get());
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
